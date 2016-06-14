package cn.linksign.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * \u77ED\u4FE1\u63A5\u6536\u8005\u4FE1\u606F
 **/

@ApiModel(description = "\u77ED\u4FE1\u63A5\u6536\u8005\u4FE1\u606F")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-13T18:34:09.191+08:00")
public class SmsRecipient   {
  
  private String mobile = null;
  private String name = null;

  
  /**
   * \u624B\u673A\u53F7\u7801
   **/
  public SmsRecipient mobile(String mobile) {
    this.mobile = mobile;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u624B\u673A\u53F7\u7801")
  @JsonProperty("mobile")
  public String getMobile() {
    return mobile;
  }
  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  
  /**
   * \u59D3\u540D
   **/
  public SmsRecipient name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u59D3\u540D")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmsRecipient smsRecipient = (SmsRecipient) o;
    return Objects.equals(this.mobile, smsRecipient.mobile) &&
        Objects.equals(this.name, smsRecipient.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mobile, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsRecipient {\n");
    
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

