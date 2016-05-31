package cn.linksign.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * \u4E2A\u4EBA\u4FE1\u606F
 **/

@ApiModel(description = "\u4E2A\u4EBA\u4FE1\u606F")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-27T12:09:06.290+08:00")
public class Personal   {
  
  private String emailNotice = null;
  private String linksignUserId = null;
  private String personEmail = null;
  private String personIdcardNumber = null;
  private String personIdcardType = null;
  private String personName = null;
  private String personOrgName = null;
  private String personPhone = null;
  private String recipientIndex = null;
  private String smsNotice = null;

  
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
    return Objects.equals(this.emailNotice, personal.emailNotice) &&
        Objects.equals(this.linksignUserId, personal.linksignUserId) &&
        Objects.equals(this.personEmail, personal.personEmail) &&
        Objects.equals(this.personIdcardNumber, personal.personIdcardNumber) &&
        Objects.equals(this.personIdcardType, personal.personIdcardType) &&
        Objects.equals(this.personName, personal.personName) &&
        Objects.equals(this.personOrgName, personal.personOrgName) &&
        Objects.equals(this.personPhone, personal.personPhone) &&
        Objects.equals(this.recipientIndex, personal.recipientIndex) &&
        Objects.equals(this.smsNotice, personal.smsNotice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailNotice, linksignUserId, personEmail, personIdcardNumber, personIdcardType, personName, personOrgName, personPhone, recipientIndex, smsNotice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Personal {\n");
    
    sb.append("    emailNotice: ").append(toIndentedString(emailNotice)).append("\n");
    sb.append("    linksignUserId: ").append(toIndentedString(linksignUserId)).append("\n");
    sb.append("    personEmail: ").append(toIndentedString(personEmail)).append("\n");
    sb.append("    personIdcardNumber: ").append(toIndentedString(personIdcardNumber)).append("\n");
    sb.append("    personIdcardType: ").append(toIndentedString(personIdcardType)).append("\n");
    sb.append("    personName: ").append(toIndentedString(personName)).append("\n");
    sb.append("    personOrgName: ").append(toIndentedString(personOrgName)).append("\n");
    sb.append("    personPhone: ").append(toIndentedString(personPhone)).append("\n");
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

