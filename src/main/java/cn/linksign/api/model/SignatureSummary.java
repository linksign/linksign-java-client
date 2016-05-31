package cn.linksign.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-27T12:09:06.290+08:00")
public class SignatureSummary   {
  
  private String signatureFileUri = null;
  private String signatureId = null;
  private String signerRedirectUri = null;

  
  /**
   **/
  public SignatureSummary signatureFileUri(String signatureFileUri) {
    this.signatureFileUri = signatureFileUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("signatureFileUri")
  public String getSignatureFileUri() {
    return signatureFileUri;
  }
  public void setSignatureFileUri(String signatureFileUri) {
    this.signatureFileUri = signatureFileUri;
  }

  
  /**
   **/
  public SignatureSummary signatureId(String signatureId) {
    this.signatureId = signatureId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("signatureId")
  public String getSignatureId() {
    return signatureId;
  }
  public void setSignatureId(String signatureId) {
    this.signatureId = signatureId;
  }

  
  /**
   **/
  public SignatureSummary signerRedirectUri(String signerRedirectUri) {
    this.signerRedirectUri = signerRedirectUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("signerRedirectUri")
  public String getSignerRedirectUri() {
    return signerRedirectUri;
  }
  public void setSignerRedirectUri(String signerRedirectUri) {
    this.signerRedirectUri = signerRedirectUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignatureSummary signatureSummary = (SignatureSummary) o;
    return Objects.equals(this.signatureFileUri, signatureSummary.signatureFileUri) &&
        Objects.equals(this.signatureId, signatureSummary.signatureId) &&
        Objects.equals(this.signerRedirectUri, signatureSummary.signerRedirectUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signatureFileUri, signatureId, signerRedirectUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureSummary {\n");
    
    sb.append("    signatureFileUri: ").append(toIndentedString(signatureFileUri)).append("\n");
    sb.append("    signatureId: ").append(toIndentedString(signatureId)).append("\n");
    sb.append("    signerRedirectUri: ").append(toIndentedString(signerRedirectUri)).append("\n");
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

