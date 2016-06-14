package cn.linksign.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * \u90AE\u4EF6\u63A5\u6536\u8005\u4FE1\u606F
 **/

@ApiModel(description = "\u90AE\u4EF6\u63A5\u6536\u8005\u4FE1\u606F")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-13T18:34:09.191+08:00")
public class EmailRecipient   {
  
  private String bcc = null;
  private String emailAddress = null;
  private String name = null;

  
  /**
   * \u79D8\u5BC6\u6284\u9001\uFF08y/n\uFF09
   **/
  public EmailRecipient bcc(String bcc) {
    this.bcc = bcc;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u79D8\u5BC6\u6284\u9001\uFF08y/n\uFF09")
  @JsonProperty("bcc")
  public String getBcc() {
    return bcc;
  }
  public void setBcc(String bcc) {
    this.bcc = bcc;
  }

  
  /**
   * \u90AE\u4EF6\u5730\u5740
   **/
  public EmailRecipient emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u90AE\u4EF6\u5730\u5740")
  @JsonProperty("emailAddress")
  public String getEmailAddress() {
    return emailAddress;
  }
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  
  /**
   * \u59D3\u540D
   **/
  public EmailRecipient name(String name) {
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
    EmailRecipient emailRecipient = (EmailRecipient) o;
    return Objects.equals(this.bcc, emailRecipient.bcc) &&
        Objects.equals(this.emailAddress, emailRecipient.emailAddress) &&
        Objects.equals(this.name, emailRecipient.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bcc, emailAddress, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailRecipient {\n");
    
    sb.append("    bcc: ").append(toIndentedString(bcc)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
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

