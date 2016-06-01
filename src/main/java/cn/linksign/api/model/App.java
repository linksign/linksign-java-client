package cn.linksign.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-01T19:09:22.461+08:00")
public class App   {
  
  private String emailTemplateId = null;
  private String redirectUri = null;
  private String sealHtml5TemplateId = null;
  private String signatureHtml5TemplateId = null;
  private String smsTemplateId = null;

  
  /**
   * \u90AE\u4EF6\u6A21\u677F\u7F16\u53F7
   **/
  public App emailTemplateId(String emailTemplateId) {
    this.emailTemplateId = emailTemplateId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u90AE\u4EF6\u6A21\u677F\u7F16\u53F7")
  @JsonProperty("emailTemplateId")
  public String getEmailTemplateId() {
    return emailTemplateId;
  }
  public void setEmailTemplateId(String emailTemplateId) {
    this.emailTemplateId = emailTemplateId;
  }

  
  /**
   * Signature completed redirected link
   **/
  public App redirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Signature completed redirected link")
  @JsonProperty("redirectUri")
  public String getRedirectUri() {
    return redirectUri;
  }
  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }

  
  /**
   * \u5370\u7AE0\u91C7\u96C6H5\u9875\u9762\u6A21\u677F\u7F16\u53F7
   **/
  public App sealHtml5TemplateId(String sealHtml5TemplateId) {
    this.sealHtml5TemplateId = sealHtml5TemplateId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u5370\u7AE0\u91C7\u96C6H5\u9875\u9762\u6A21\u677F\u7F16\u53F7")
  @JsonProperty("sealHtml5TemplateId")
  public String getSealHtml5TemplateId() {
    return sealHtml5TemplateId;
  }
  public void setSealHtml5TemplateId(String sealHtml5TemplateId) {
    this.sealHtml5TemplateId = sealHtml5TemplateId;
  }

  
  /**
   * \u7B7E\u540D\u91C7\u96C6H5\u9875\u9762\u6A21\u677F\u7F16\u53F7
   **/
  public App signatureHtml5TemplateId(String signatureHtml5TemplateId) {
    this.signatureHtml5TemplateId = signatureHtml5TemplateId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u7B7E\u540D\u91C7\u96C6H5\u9875\u9762\u6A21\u677F\u7F16\u53F7")
  @JsonProperty("signatureHtml5TemplateId")
  public String getSignatureHtml5TemplateId() {
    return signatureHtml5TemplateId;
  }
  public void setSignatureHtml5TemplateId(String signatureHtml5TemplateId) {
    this.signatureHtml5TemplateId = signatureHtml5TemplateId;
  }

  
  /**
   * \u77ED\u4FE1\u6A21\u677F\u7F16\u53F7
   **/
  public App smsTemplateId(String smsTemplateId) {
    this.smsTemplateId = smsTemplateId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u77ED\u4FE1\u6A21\u677F\u7F16\u53F7")
  @JsonProperty("smsTemplateId")
  public String getSmsTemplateId() {
    return smsTemplateId;
  }
  public void setSmsTemplateId(String smsTemplateId) {
    this.smsTemplateId = smsTemplateId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    App app = (App) o;
    return Objects.equals(this.emailTemplateId, app.emailTemplateId) &&
        Objects.equals(this.redirectUri, app.redirectUri) &&
        Objects.equals(this.sealHtml5TemplateId, app.sealHtml5TemplateId) &&
        Objects.equals(this.signatureHtml5TemplateId, app.signatureHtml5TemplateId) &&
        Objects.equals(this.smsTemplateId, app.smsTemplateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailTemplateId, redirectUri, sealHtml5TemplateId, signatureHtml5TemplateId, smsTemplateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class App {\n");
    
    sb.append("    emailTemplateId: ").append(toIndentedString(emailTemplateId)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    sealHtml5TemplateId: ").append(toIndentedString(sealHtml5TemplateId)).append("\n");
    sb.append("    signatureHtml5TemplateId: ").append(toIndentedString(signatureHtml5TemplateId)).append("\n");
    sb.append("    smsTemplateId: ").append(toIndentedString(smsTemplateId)).append("\n");
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

