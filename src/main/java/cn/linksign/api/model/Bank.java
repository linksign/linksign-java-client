package cn.linksign.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-13T18:34:09.191+08:00")
public class Bank   {
  
  private String verifyAmount = null;

  
  /**
   **/
  public Bank verifyAmount(String verifyAmount) {
    this.verifyAmount = verifyAmount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("verifyAmount")
  public String getVerifyAmount() {
    return verifyAmount;
  }
  public void setVerifyAmount(String verifyAmount) {
    this.verifyAmount = verifyAmount;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bank bank = (Bank) o;
    return Objects.equals(this.verifyAmount, bank.verifyAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verifyAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bank {\n");
    
    sb.append("    verifyAmount: ").append(toIndentedString(verifyAmount)).append("\n");
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

