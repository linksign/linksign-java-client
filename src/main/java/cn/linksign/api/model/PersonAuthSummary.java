package cn.linksign.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-13T18:34:09.191+08:00")
public class PersonAuthSummary   {
  
  private String bankingStatus = null;
  private String personId = null;
  private String redirectUri = null;
  private String wechatStatus = null;

  
  /**
   * pending/fail/success
   **/
  public PersonAuthSummary bankingStatus(String bankingStatus) {
    this.bankingStatus = bankingStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "pending/fail/success")
  @JsonProperty("bankingStatus")
  public String getBankingStatus() {
    return bankingStatus;
  }
  public void setBankingStatus(String bankingStatus) {
    this.bankingStatus = bankingStatus;
  }

  
  /**
   **/
  public PersonAuthSummary personId(String personId) {
    this.personId = personId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("personId")
  public String getPersonId() {
    return personId;
  }
  public void setPersonId(String personId) {
    this.personId = personId;
  }

  
  /**
   **/
  public PersonAuthSummary redirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("redirectUri")
  public String getRedirectUri() {
    return redirectUri;
  }
  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }

  
  /**
   * pending/fail/success
   **/
  public PersonAuthSummary wechatStatus(String wechatStatus) {
    this.wechatStatus = wechatStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "pending/fail/success")
  @JsonProperty("wechatStatus")
  public String getWechatStatus() {
    return wechatStatus;
  }
  public void setWechatStatus(String wechatStatus) {
    this.wechatStatus = wechatStatus;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonAuthSummary personAuthSummary = (PersonAuthSummary) o;
    return Objects.equals(this.bankingStatus, personAuthSummary.bankingStatus) &&
        Objects.equals(this.personId, personAuthSummary.personId) &&
        Objects.equals(this.redirectUri, personAuthSummary.redirectUri) &&
        Objects.equals(this.wechatStatus, personAuthSummary.wechatStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankingStatus, personId, redirectUri, wechatStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonAuthSummary {\n");
    
    sb.append("    bankingStatus: ").append(toIndentedString(bankingStatus)).append("\n");
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    wechatStatus: ").append(toIndentedString(wechatStatus)).append("\n");
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

