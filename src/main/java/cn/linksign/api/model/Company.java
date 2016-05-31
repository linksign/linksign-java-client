package cn.linksign.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * \u5355\u4F4D\u4FE1\u606F
 **/

@ApiModel(description = "\u5355\u4F4D\u4FE1\u606F")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-27T12:09:06.290+08:00")
public class Company   {
  
  private String emailNotice = null;
  private String linksignUserId = null;
  private String orgAuthorizerEmail = null;
  private String orgAuthorizerIdcardNumber = null;
  private String orgAuthorizerIdcardType = null;
  private String orgAuthorizerName = null;
  private String orgAuthorizerPhone = null;
  private String orgIdcardNumber = null;
  private String orgIdcardType = null;
  private String orgName = null;
  private String recipientIndex = null;
  private String smsNotice = null;

  
  /**
   * \u662F\u5426\u90AE\u4EF6\u901A\u77E5\u7B7E\u7F72\u4EBA(y/n)
   **/
  public Company emailNotice(String emailNotice) {
    this.emailNotice = emailNotice;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u662F\u5426\u90AE\u4EF6\u901A\u77E5\u7B7E\u7F72\u4EBA(y/n)")
  @JsonProperty("emailNotice")
  public String getEmailNotice() {
    return emailNotice;
  }
  public void setEmailNotice(String emailNotice) {
    this.emailNotice = emailNotice;
  }

  
  /**
   * \u9886\u7B7E\u7CFB\u7EDF\u7528\u6237\u7F16\u53F7
   **/
  public Company linksignUserId(String linksignUserId) {
    this.linksignUserId = linksignUserId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u9886\u7B7E\u7CFB\u7EDF\u7528\u6237\u7F16\u53F7")
  @JsonProperty("linksignUserId")
  public String getLinksignUserId() {
    return linksignUserId;
  }
  public void setLinksignUserId(String linksignUserId) {
    this.linksignUserId = linksignUserId;
  }

  
  /**
   * \u5355\u4F4D\u6388\u6743\u4EBA\u90AE\u7BB1
   **/
  public Company orgAuthorizerEmail(String orgAuthorizerEmail) {
    this.orgAuthorizerEmail = orgAuthorizerEmail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u5355\u4F4D\u6388\u6743\u4EBA\u90AE\u7BB1")
  @JsonProperty("orgAuthorizerEmail")
  public String getOrgAuthorizerEmail() {
    return orgAuthorizerEmail;
  }
  public void setOrgAuthorizerEmail(String orgAuthorizerEmail) {
    this.orgAuthorizerEmail = orgAuthorizerEmail;
  }

  
  /**
   * \u5355\u4F4D\u6388\u6743\u4EBA\u8BC1\u4EF6\u53F7\u7801
   **/
  public Company orgAuthorizerIdcardNumber(String orgAuthorizerIdcardNumber) {
    this.orgAuthorizerIdcardNumber = orgAuthorizerIdcardNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u5355\u4F4D\u6388\u6743\u4EBA\u8BC1\u4EF6\u53F7\u7801")
  @JsonProperty("orgAuthorizerIdcardNumber")
  public String getOrgAuthorizerIdcardNumber() {
    return orgAuthorizerIdcardNumber;
  }
  public void setOrgAuthorizerIdcardNumber(String orgAuthorizerIdcardNumber) {
    this.orgAuthorizerIdcardNumber = orgAuthorizerIdcardNumber;
  }

  
  /**
   * \u5355\u4F4D\u6388\u6743\u4EBA\u8BC1\u4EF6\u7C7B\u578B
   **/
  public Company orgAuthorizerIdcardType(String orgAuthorizerIdcardType) {
    this.orgAuthorizerIdcardType = orgAuthorizerIdcardType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u5355\u4F4D\u6388\u6743\u4EBA\u8BC1\u4EF6\u7C7B\u578B")
  @JsonProperty("orgAuthorizerIdcardType")
  public String getOrgAuthorizerIdcardType() {
    return orgAuthorizerIdcardType;
  }
  public void setOrgAuthorizerIdcardType(String orgAuthorizerIdcardType) {
    this.orgAuthorizerIdcardType = orgAuthorizerIdcardType;
  }

  
  /**
   * \u5355\u4F4D\u6388\u6743\u4EBA\u59D3\u540D
   **/
  public Company orgAuthorizerName(String orgAuthorizerName) {
    this.orgAuthorizerName = orgAuthorizerName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u5355\u4F4D\u6388\u6743\u4EBA\u59D3\u540D")
  @JsonProperty("orgAuthorizerName")
  public String getOrgAuthorizerName() {
    return orgAuthorizerName;
  }
  public void setOrgAuthorizerName(String orgAuthorizerName) {
    this.orgAuthorizerName = orgAuthorizerName;
  }

  
  /**
   **/
  public Company orgAuthorizerPhone(String orgAuthorizerPhone) {
    this.orgAuthorizerPhone = orgAuthorizerPhone;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("orgAuthorizerPhone")
  public String getOrgAuthorizerPhone() {
    return orgAuthorizerPhone;
  }
  public void setOrgAuthorizerPhone(String orgAuthorizerPhone) {
    this.orgAuthorizerPhone = orgAuthorizerPhone;
  }

  
  /**
   * \u5355\u4F4D\u8BC1\u4EF6\u7F16\u53F7
   **/
  public Company orgIdcardNumber(String orgIdcardNumber) {
    this.orgIdcardNumber = orgIdcardNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u5355\u4F4D\u8BC1\u4EF6\u7F16\u53F7")
  @JsonProperty("orgIdcardNumber")
  public String getOrgIdcardNumber() {
    return orgIdcardNumber;
  }
  public void setOrgIdcardNumber(String orgIdcardNumber) {
    this.orgIdcardNumber = orgIdcardNumber;
  }

  
  /**
   * \u5355\u4F4D\u8BC1\u4EF6\u7C7B\u578B
   **/
  public Company orgIdcardType(String orgIdcardType) {
    this.orgIdcardType = orgIdcardType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u5355\u4F4D\u8BC1\u4EF6\u7C7B\u578B")
  @JsonProperty("orgIdcardType")
  public String getOrgIdcardType() {
    return orgIdcardType;
  }
  public void setOrgIdcardType(String orgIdcardType) {
    this.orgIdcardType = orgIdcardType;
  }

  
  /**
   * \u5355\u4F4D\u540D\u79F0
   **/
  public Company orgName(String orgName) {
    this.orgName = orgName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "\u5355\u4F4D\u540D\u79F0")
  @JsonProperty("orgName")
  public String getOrgName() {
    return orgName;
  }
  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }

  
  /**
   * \u516C\u53F8\u7D22\u5F15
   **/
  public Company recipientIndex(String recipientIndex) {
    this.recipientIndex = recipientIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u516C\u53F8\u7D22\u5F15")
  @JsonProperty("recipientIndex")
  public String getRecipientIndex() {
    return recipientIndex;
  }
  public void setRecipientIndex(String recipientIndex) {
    this.recipientIndex = recipientIndex;
  }

  
  /**
   * \u662F\u5426\u77ED\u4FE1\u901A\u77E5\u7B7E\u7F72\u4EBA(y/n)
   **/
  public Company smsNotice(String smsNotice) {
    this.smsNotice = smsNotice;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u662F\u5426\u77ED\u4FE1\u901A\u77E5\u7B7E\u7F72\u4EBA(y/n)")
  @JsonProperty("smsNotice")
  public String getSmsNotice() {
    return smsNotice;
  }
  public void setSmsNotice(String smsNotice) {
    this.smsNotice = smsNotice;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Company company = (Company) o;
    return Objects.equals(this.emailNotice, company.emailNotice) &&
        Objects.equals(this.linksignUserId, company.linksignUserId) &&
        Objects.equals(this.orgAuthorizerEmail, company.orgAuthorizerEmail) &&
        Objects.equals(this.orgAuthorizerIdcardNumber, company.orgAuthorizerIdcardNumber) &&
        Objects.equals(this.orgAuthorizerIdcardType, company.orgAuthorizerIdcardType) &&
        Objects.equals(this.orgAuthorizerName, company.orgAuthorizerName) &&
        Objects.equals(this.orgAuthorizerPhone, company.orgAuthorizerPhone) &&
        Objects.equals(this.orgIdcardNumber, company.orgIdcardNumber) &&
        Objects.equals(this.orgIdcardType, company.orgIdcardType) &&
        Objects.equals(this.orgName, company.orgName) &&
        Objects.equals(this.recipientIndex, company.recipientIndex) &&
        Objects.equals(this.smsNotice, company.smsNotice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailNotice, linksignUserId, orgAuthorizerEmail, orgAuthorizerIdcardNumber, orgAuthorizerIdcardType, orgAuthorizerName, orgAuthorizerPhone, orgIdcardNumber, orgIdcardType, orgName, recipientIndex, smsNotice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Company {\n");
    
    sb.append("    emailNotice: ").append(toIndentedString(emailNotice)).append("\n");
    sb.append("    linksignUserId: ").append(toIndentedString(linksignUserId)).append("\n");
    sb.append("    orgAuthorizerEmail: ").append(toIndentedString(orgAuthorizerEmail)).append("\n");
    sb.append("    orgAuthorizerIdcardNumber: ").append(toIndentedString(orgAuthorizerIdcardNumber)).append("\n");
    sb.append("    orgAuthorizerIdcardType: ").append(toIndentedString(orgAuthorizerIdcardType)).append("\n");
    sb.append("    orgAuthorizerName: ").append(toIndentedString(orgAuthorizerName)).append("\n");
    sb.append("    orgAuthorizerPhone: ").append(toIndentedString(orgAuthorizerPhone)).append("\n");
    sb.append("    orgIdcardNumber: ").append(toIndentedString(orgIdcardNumber)).append("\n");
    sb.append("    orgIdcardType: ").append(toIndentedString(orgIdcardType)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    recipientIndex: ").append(toIndentedString(recipientIndex)).append("\n");
    sb.append("    smsNotice: ").append(toIndentedString(smsNotice)).append("\n");
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

