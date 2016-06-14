package cn.linksign.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * \u4E2A\u4EBA\u4FE1\u606F
 **/

@ApiModel(description = "\u4E2A\u4EBA\u4FE1\u606F")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-13T18:34:09.191+08:00")
public class Personal   {
  
  private String bankAccountNumber = null;
  private String bankLocation = null;
  private String bankName = null;
  private String emailNotice = null;
  private String linksignUserId = null;
  private String personEmail = null;
  private String personIdcardImageBase64 = null;
  private String personIdcardNumber = null;
  private String personIdcardType = null;
  private String personName = null;
  private String personOrgName = null;
  private String personPhone = null;
  private String recipientIndex = null;
  private String signatureImageBase64 = null;
  private String smsNotice = null;

  
  /**
   **/
  public Personal bankAccountNumber(String bankAccountNumber) {
    this.bankAccountNumber = bankAccountNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("bankAccountNumber")
  public String getBankAccountNumber() {
    return bankAccountNumber;
  }
  public void setBankAccountNumber(String bankAccountNumber) {
    this.bankAccountNumber = bankAccountNumber;
  }

  
  /**
   **/
  public Personal bankLocation(String bankLocation) {
    this.bankLocation = bankLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("bankLocation")
  public String getBankLocation() {
    return bankLocation;
  }
  public void setBankLocation(String bankLocation) {
    this.bankLocation = bankLocation;
  }

  
  /**
   **/
  public Personal bankName(String bankName) {
    this.bankName = bankName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("bankName")
  public String getBankName() {
    return bankName;
  }
  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  
  /**
   * \u662F\u5426\u90AE\u4EF6\u901A\u77E5\u7B7E\u7F72\u4EBA(y/n)
   **/
  public Personal emailNotice(String emailNotice) {
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
  public Personal linksignUserId(String linksignUserId) {
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
   **/
  public Personal personEmail(String personEmail) {
    this.personEmail = personEmail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("personEmail")
  public String getPersonEmail() {
    return personEmail;
  }
  public void setPersonEmail(String personEmail) {
    this.personEmail = personEmail;
  }

  
  /**
   **/
  public Personal personIdcardImageBase64(String personIdcardImageBase64) {
    this.personIdcardImageBase64 = personIdcardImageBase64;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("personIdcardImageBase64")
  public String getPersonIdcardImageBase64() {
    return personIdcardImageBase64;
  }
  public void setPersonIdcardImageBase64(String personIdcardImageBase64) {
    this.personIdcardImageBase64 = personIdcardImageBase64;
  }

  
  /**
   **/
  public Personal personIdcardNumber(String personIdcardNumber) {
    this.personIdcardNumber = personIdcardNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("personIdcardNumber")
  public String getPersonIdcardNumber() {
    return personIdcardNumber;
  }
  public void setPersonIdcardNumber(String personIdcardNumber) {
    this.personIdcardNumber = personIdcardNumber;
  }

  
  /**
   **/
  public Personal personIdcardType(String personIdcardType) {
    this.personIdcardType = personIdcardType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("personIdcardType")
  public String getPersonIdcardType() {
    return personIdcardType;
  }
  public void setPersonIdcardType(String personIdcardType) {
    this.personIdcardType = personIdcardType;
  }

  
  /**
   **/
  public Personal personName(String personName) {
    this.personName = personName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("personName")
  public String getPersonName() {
    return personName;
  }
  public void setPersonName(String personName) {
    this.personName = personName;
  }

  
  /**
   **/
  public Personal personOrgName(String personOrgName) {
    this.personOrgName = personOrgName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("personOrgName")
  public String getPersonOrgName() {
    return personOrgName;
  }
  public void setPersonOrgName(String personOrgName) {
    this.personOrgName = personOrgName;
  }

  
  /**
   **/
  public Personal personPhone(String personPhone) {
    this.personPhone = personPhone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("personPhone")
  public String getPersonPhone() {
    return personPhone;
  }
  public void setPersonPhone(String personPhone) {
    this.personPhone = personPhone;
  }

  
  /**
   * \u4E2A\u4EBA\u7D22\u5F15
   **/
  public Personal recipientIndex(String recipientIndex) {
    this.recipientIndex = recipientIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u4E2A\u4EBA\u7D22\u5F15")
  @JsonProperty("recipientIndex")
  public String getRecipientIndex() {
    return recipientIndex;
  }
  public void setRecipientIndex(String recipientIndex) {
    this.recipientIndex = recipientIndex;
  }

  
  /**
   * The original signature (scan)
   **/
  public Personal signatureImageBase64(String signatureImageBase64) {
    this.signatureImageBase64 = signatureImageBase64;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The original signature (scan)")
  @JsonProperty("signatureImageBase64")
  public String getSignatureImageBase64() {
    return signatureImageBase64;
  }
  public void setSignatureImageBase64(String signatureImageBase64) {
    this.signatureImageBase64 = signatureImageBase64;
  }

  
  /**
   * \u662F\u5426\u77ED\u4FE1\u901A\u77E5\u7B7E\u7F72\u4EBA(y/n)
   **/
  public Personal smsNotice(String smsNotice) {
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
    Personal personal = (Personal) o;
    return Objects.equals(this.bankAccountNumber, personal.bankAccountNumber) &&
        Objects.equals(this.bankLocation, personal.bankLocation) &&
        Objects.equals(this.bankName, personal.bankName) &&
        Objects.equals(this.emailNotice, personal.emailNotice) &&
        Objects.equals(this.linksignUserId, personal.linksignUserId) &&
        Objects.equals(this.personEmail, personal.personEmail) &&
        Objects.equals(this.personIdcardImageBase64, personal.personIdcardImageBase64) &&
        Objects.equals(this.personIdcardNumber, personal.personIdcardNumber) &&
        Objects.equals(this.personIdcardType, personal.personIdcardType) &&
        Objects.equals(this.personName, personal.personName) &&
        Objects.equals(this.personOrgName, personal.personOrgName) &&
        Objects.equals(this.personPhone, personal.personPhone) &&
        Objects.equals(this.recipientIndex, personal.recipientIndex) &&
        Objects.equals(this.signatureImageBase64, personal.signatureImageBase64) &&
        Objects.equals(this.smsNotice, personal.smsNotice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankAccountNumber, bankLocation, bankName, emailNotice, linksignUserId, personEmail, personIdcardImageBase64, personIdcardNumber, personIdcardType, personName, personOrgName, personPhone, recipientIndex, signatureImageBase64, smsNotice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Personal {\n");
    
    sb.append("    bankAccountNumber: ").append(toIndentedString(bankAccountNumber)).append("\n");
    sb.append("    bankLocation: ").append(toIndentedString(bankLocation)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    emailNotice: ").append(toIndentedString(emailNotice)).append("\n");
    sb.append("    linksignUserId: ").append(toIndentedString(linksignUserId)).append("\n");
    sb.append("    personEmail: ").append(toIndentedString(personEmail)).append("\n");
    sb.append("    personIdcardImageBase64: ").append(toIndentedString(personIdcardImageBase64)).append("\n");
    sb.append("    personIdcardNumber: ").append(toIndentedString(personIdcardNumber)).append("\n");
    sb.append("    personIdcardType: ").append(toIndentedString(personIdcardType)).append("\n");
    sb.append("    personName: ").append(toIndentedString(personName)).append("\n");
    sb.append("    personOrgName: ").append(toIndentedString(personOrgName)).append("\n");
    sb.append("    personPhone: ").append(toIndentedString(personPhone)).append("\n");
    sb.append("    recipientIndex: ").append(toIndentedString(recipientIndex)).append("\n");
    sb.append("    signatureImageBase64: ").append(toIndentedString(signatureImageBase64)).append("\n");
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

