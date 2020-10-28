package ibm.ob.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import ibm.ob.api.model.BankingProductRateCondition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Defines the sub-tier criteria and conditions for which a rate applies
 */
@ApiModel(description = "Defines the sub-tier criteria and conditions for which a rate applies")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-10-28T19:39:53.787Z[GMT]")

public class BankingProductRateTierSubTier   {
  @JsonProperty("name")
  private String name;

  /**
   * The unit of measure that applies to the tierValueMinimum and tierValueMaximum values e.g. 'DOLLAR', 'MONTH' (in the case of term deposit tiers), 'PERCENT' (in the case of loan-to-value ratio or LVR)
   */
  public enum UnitOfMeasureEnum {
    DOLLAR("DOLLAR"),
    
    PERCENT("PERCENT"),
    
    MONTH("MONTH"),
    
    DAY("DAY");

    private String value;

    UnitOfMeasureEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static UnitOfMeasureEnum fromValue(String value) {
      for (UnitOfMeasureEnum b : UnitOfMeasureEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("unitOfMeasure")
  private UnitOfMeasureEnum unitOfMeasure;

  @JsonProperty("minimumValue")
  private BigDecimal minimumValue;

  @JsonProperty("maximumValue")
  private BigDecimal maximumValue;

  /**
   * The method used to calculate the amount to be applied using one or more tiers. A single rate may be applied to the entire balance or each applicable tier rate is applied to the portion of the balance that falls into that tier (referred to as 'bands' or 'steps')
   */
  public enum RateApplicationMethodEnum {
    WHOLE_BALANCE("WHOLE_BALANCE"),
    
    PER_TIER("PER_TIER");

    private String value;

    RateApplicationMethodEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RateApplicationMethodEnum fromValue(String value) {
      for (RateApplicationMethodEnum b : RateApplicationMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("rateApplicationMethod")
  private RateApplicationMethodEnum rateApplicationMethod;

  @JsonProperty("applicabilityConditions")
  private BankingProductRateCondition applicabilityConditions = null;

  public BankingProductRateTierSubTier name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A display name for the tier
   * @return name
  */
  @ApiModelProperty(required = true, value = "A display name for the tier")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BankingProductRateTierSubTier unitOfMeasure(UnitOfMeasureEnum unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }

  /**
   * The unit of measure that applies to the tierValueMinimum and tierValueMaximum values e.g. 'DOLLAR', 'MONTH' (in the case of term deposit tiers), 'PERCENT' (in the case of loan-to-value ratio or LVR)
   * @return unitOfMeasure
  */
  @ApiModelProperty(required = true, value = "The unit of measure that applies to the tierValueMinimum and tierValueMaximum values e.g. 'DOLLAR', 'MONTH' (in the case of term deposit tiers), 'PERCENT' (in the case of loan-to-value ratio or LVR)")
  @NotNull


  public UnitOfMeasureEnum getUnitOfMeasure() {
    return unitOfMeasure;
  }

  public void setUnitOfMeasure(UnitOfMeasureEnum unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }

  public BankingProductRateTierSubTier minimumValue(BigDecimal minimumValue) {
    this.minimumValue = minimumValue;
    return this;
  }

  /**
   * The number of tierUnitOfMeasure units that form the lower bound of the tier. The tier should be inclusive of this value
   * @return minimumValue
  */
  @ApiModelProperty(required = true, value = "The number of tierUnitOfMeasure units that form the lower bound of the tier. The tier should be inclusive of this value")
  @NotNull

  @Valid

  public BigDecimal getMinimumValue() {
    return minimumValue;
  }

  public void setMinimumValue(BigDecimal minimumValue) {
    this.minimumValue = minimumValue;
  }

  public BankingProductRateTierSubTier maximumValue(BigDecimal maximumValue) {
    this.maximumValue = maximumValue;
    return this;
  }

  /**
   * The number of tierUnitOfMeasure units that form the upper bound of the tier or band. For a tier with a discrete value (as opposed to a range of values e.g. 1 month) this must be the same as tierValueMinimum. Where this is the same as the tierValueMinimum value of the next-higher tier the referenced tier should be exclusive of this value. For example a term deposit of 2 months falls into the upper tier of the following tiers: (1 â€“ 2 months, 2 â€“ 3 months)
   * @return maximumValue
  */
  @ApiModelProperty(required = true, value = "The number of tierUnitOfMeasure units that form the upper bound of the tier or band. For a tier with a discrete value (as opposed to a range of values e.g. 1 month) this must be the same as tierValueMinimum. Where this is the same as the tierValueMinimum value of the next-higher tier the referenced tier should be exclusive of this value. For example a term deposit of 2 months falls into the upper tier of the following tiers: (1 â€“ 2 months, 2 â€“ 3 months)")
  @NotNull

  @Valid

  public BigDecimal getMaximumValue() {
    return maximumValue;
  }

  public void setMaximumValue(BigDecimal maximumValue) {
    this.maximumValue = maximumValue;
  }

  public BankingProductRateTierSubTier rateApplicationMethod(RateApplicationMethodEnum rateApplicationMethod) {
    this.rateApplicationMethod = rateApplicationMethod;
    return this;
  }

  /**
   * The method used to calculate the amount to be applied using one or more tiers. A single rate may be applied to the entire balance or each applicable tier rate is applied to the portion of the balance that falls into that tier (referred to as 'bands' or 'steps')
   * @return rateApplicationMethod
  */
  @ApiModelProperty(value = "The method used to calculate the amount to be applied using one or more tiers. A single rate may be applied to the entire balance or each applicable tier rate is applied to the portion of the balance that falls into that tier (referred to as 'bands' or 'steps')")


  public RateApplicationMethodEnum getRateApplicationMethod() {
    return rateApplicationMethod;
  }

  public void setRateApplicationMethod(RateApplicationMethodEnum rateApplicationMethod) {
    this.rateApplicationMethod = rateApplicationMethod;
  }

  public BankingProductRateTierSubTier applicabilityConditions(BankingProductRateCondition applicabilityConditions) {
    this.applicabilityConditions = applicabilityConditions;
    return this;
  }

  /**
   * Get applicabilityConditions
   * @return applicabilityConditions
  */
  @ApiModelProperty(value = "")

  @Valid

  public BankingProductRateCondition getApplicabilityConditions() {
    return applicabilityConditions;
  }

  public void setApplicabilityConditions(BankingProductRateCondition applicabilityConditions) {
    this.applicabilityConditions = applicabilityConditions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankingProductRateTierSubTier bankingProductRateTierSubTier = (BankingProductRateTierSubTier) o;
    return Objects.equals(this.name, bankingProductRateTierSubTier.name) &&
        Objects.equals(this.unitOfMeasure, bankingProductRateTierSubTier.unitOfMeasure) &&
        Objects.equals(this.minimumValue, bankingProductRateTierSubTier.minimumValue) &&
        Objects.equals(this.maximumValue, bankingProductRateTierSubTier.maximumValue) &&
        Objects.equals(this.rateApplicationMethod, bankingProductRateTierSubTier.rateApplicationMethod) &&
        Objects.equals(this.applicabilityConditions, bankingProductRateTierSubTier.applicabilityConditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, unitOfMeasure, minimumValue, maximumValue, rateApplicationMethod, applicabilityConditions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankingProductRateTierSubTier {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
    sb.append("    minimumValue: ").append(toIndentedString(minimumValue)).append("\n");
    sb.append("    maximumValue: ").append(toIndentedString(maximumValue)).append("\n");
    sb.append("    rateApplicationMethod: ").append(toIndentedString(rateApplicationMethod)).append("\n");
    sb.append("    applicabilityConditions: ").append(toIndentedString(applicabilityConditions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

