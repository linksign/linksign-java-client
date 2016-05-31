package cn.linksign.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Signature identity authentication
 **/

@ApiModel(description = "Signature identity authentication")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-27T12:09:06.290+08:00")
public class IdAuth   {
  
  private String bankAccountRequred = null;
  private String emailRequred = null;
  private String faceCompareRequred = null;
  private String idNumberRequred = null;
  private String smsRequred = null;
  private String wechatRequred = null;

  
  /**
   * ***true***,***false***
   **/
  public IdAuth bankAccountRequred(String bankAccountRequred) {
    this.bankAccountRequred = bankAccountRequred;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "***true***,***false***")
  @JsonProperty("bankAccountRequred")
  public String getBankAccountRequred() {
    return bankAccountRequred;
  }
  public void setBankAccountRequred(String bankAccountRequred) {
    this.bankAccountRequred = bankAccountRequred;
  }

  
  /**
   * ***true***,***false***
   **/
  public IdAuth emailRequred(String emailRequred) {
    this.emailRequred = emailRequred;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "***true***,***false***")
  @JsonProperty("emailRequred")
  public String getEmailRequred() {
    return emailRequred;
  }
  public void setEmailRequred(String emailRequred) {
    this.emailRequred = emailRequred;
  }

  
  /**
   * ***true***,***false***
   **/
  public IdAuth faceCompareRequred(String faceCompareRequred) {
    this.faceCompareRequred = faceCompareRequred;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "***true***,***false***")
  @JsonProperty("faceCompareRequred")
  public String getFaceCompareRequred() {
    return faceCompareRequred;
  }
  public void setFaceCompareRequred(String faceCompareRequred) {
    this.faceCompareRequred = faceCompareRequred;
  }

  
  /**
   * ***true***,***false***
   **/
  public IdAuth idNumberRequred(String idNumberRequred) {
    this.idNumberRequred = idNumberRequred;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "***true***,***false***")
  @JsonProperty("idNumberRequred")
  public String getIdNumberRequred() {
    return idNumberRequred;
  }
  public void setIdNumberRequred(String idNumberRequred) {
    this.idNumberRequred = idNumberRequred;
  }

  
  /**
   * ***true***,***false***
   **/
  public IdAuth smsRequred(String smsRequred) {
    this.smsRequred = smsRequred;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "***true***,***false***")
  @JsonProperty("smsRequred")
  public String getSmsRequred() {
    return smsRequred;
  }
  public void setSmsRequred(String smsRequred) {
    this.smsRequred = smsRequred;
  }

  
  /**
   * *** true ***,***false***
   **/
  public IdAuth wechatRequred(String wechatRequred) {
    this.wechatRequred = wechatRequred;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "*** true ***,***false***")
  @JsonProperty("wechatRequred")
  public String getWechatRequred() {
    return wechatRequred;
  }
  public void setWechatRequred(String wechatRequred) {
    this.wechatRequred = wechatRequred;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdAuth idAuth = (IdAuth) o;
    return Objects.equals(this.bankAccountRequred, idAuth.bankAccountRequred) &&
        Objects.equals(this.emailRequred, idAuth.emailRequred) &&
        Objects.equals(this.faceCompareRequred, idAuth.faceCompareRequred) &&
        Objects.equals(this.idNumberRequred, idAuth.idNumberRequred) &&
        Objects.equals(this.smsRequred, idAuth.smsRequred) &&
        Objects.equals(this.wechatRequred, idAuth.wechatRequred);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankAccountRequred, emailRequred, faceCompareRequred, idNumberRequred, smsRequred, wechatRequred);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdAuth {\n");
    
    sb.append("    bankAccountRequred: ").append(toIndentedString(bankAccountRequred)).append("\n");
    sb.append("    emailRequred: ").append(toIndentedString(emailRequred)).append("\n");
    sb.append("    faceCompareRequred: ").append(toIndentedString(faceCompareRequred)).append("\n");
    sb.append("    idNumberRequred: ").append(toIndentedString(idNumberRequred)).append("\n");
    sb.append("    smsRequred: ").append(toIndentedString(smsRequred)).append("\n");
    sb.append("    wechatRequred: ").append(toIndentedString(wechatRequred)).append("\n");
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

