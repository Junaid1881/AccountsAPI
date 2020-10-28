#!/usr/bin/env python
import json
import argparse
import os
import yaml
import sys

def get_inventory_data():
        TARGET_SERVER_IP = ''
        TARGET_SERVER_USER = ''
        TARGET_SERVER_PASSWORD = ''

        with open(os.path.join(sys.path[0],"external_vars.yml"), 'r') as stream:
            try:
                data = yaml.load(stream)
                for key, value in data.items():
                    if key == 'TARGET_SERVER_IP':
                        TARGET_SERVER_IP = value
                    if key == 'TARGET_SERVER_USER':
                        TARGET_SERVER_USER = value
                    if key == 'TARGET_SERVER_PASSWORD':
                        TARGET_SERVER_PASSWORD = value
            except yaml.YAMLError as exc:
                print(exc)
        data = {
            "database" : {
                "hosts" : ["targetserver"],
                "vars" : {
                    "ansible_ssh_pass": TARGET_SERVER_PASSWORD,
                    "ansible_ssh_host": TARGET_SERVER_IP,
                    "ansible_ssh_user": TARGET_SERVER_USER
                }
            }
        }
        return data

if __name__ == "__main__":
        data = get_inventory_data()
       # print(json.dumps(data))
        parser = argparse.ArgumentParser()
        parser.add_argument('--list', action='store_true')
        parser.add_argument('--host', action='store')
        arg = parser.parse_args()
        if arg and arg.list:
            print(json.dumps(data))
        elif arg.host:
            print(json.dumps({'_meta': {'hostvars':{}}}))