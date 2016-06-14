package cn.linksign.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-13T18:34:09.191+08:00")
public class SignerStatus   {
  
  private String recipientIndex = null;
  private String signerUri = null;
  private String status = null;

  
  /**
   **/
  public SignerStatus recipientIndex(String recipientIndex) {
    this.recipientIndex = recipientIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("recipientIndex")
  public String getRecipientIndex() {
    return recipientIndex;
  }
  public void setRecipientIndex(String recipientIndex) {
    this.recipientIndex = recipientIndex;
  }

  
  /**
   **/
  public SignerStatus signerUri(String signerUri) {
    this.signerUri = signerUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("signerUri")
  public String getSignerUri() {
    return signerUri;
  }
  public void setSignerUri(String signerUri) {
    this.signerUri = signerUri;
  }

  
  /**
   * signature status(signing,signed)
   **/
  public SignerStatus status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "signature status(signing,signed)")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignerStatus signerStatus = (SignerStatus) o;
    return Objects.equals(this.recipientIndex, signerStatus.recipientIndex) &&
        Objects.equals(this.signerUri, signerStatus.signerUri) &&
        Objects.equals(this.status, signerStatus.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipientIndex, signerUri, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignerStatus {\n");
    
    sb.append("    recipientIndex: ").append(toIndentedString(recipientIndex)).append("\n");
    sb.append("    signerUri: ").append(toIndentedString(signerUri)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

