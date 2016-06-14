package cn.linksign.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * \u5370\u7AE0\u7ED3\u679C
 **/

@ApiModel(description = "\u5370\u7AE0\u7ED3\u679C")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-13T18:34:09.191+08:00")
public class SealSummary   {
  
  private String imagePngBase64 = null;
  private String sealFileUri = null;
  private String sealId = null;
  private String sealerRedirectUri = null;

  
  /**
   **/
  public SealSummary imagePngBase64(String imagePngBase64) {
    this.imagePngBase64 = imagePngBase64;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("imagePngBase64")
  public String getImagePngBase64() {
    return imagePngBase64;
  }
  public void setImagePngBase64(String imagePngBase64) {
    this.imagePngBase64 = imagePngBase64;
  }

  
  /**
   * \u5370\u7AE0\u56FE\u7247\u4E0B\u8F7D\u5730\u5740
   **/
  public SealSummary sealFileUri(String sealFileUri) {
    this.sealFileUri = sealFileUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "\u5370\u7AE0\u56FE\u7247\u4E0B\u8F7D\u5730\u5740")
  @JsonProperty("sealFileUri")
  public String getSealFileUri() {
    return sealFileUri;
  }
  public void setSealFileUri(String sealFileUri) {
    this.sealFileUri = sealFileUri;
  }

  
  /**
   * \u5370\u7AE0\u7F16\u53F7
   **/
  public SealSummary sealId(String sealId) {
    this.sealId = sealId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "\u5370\u7AE0\u7F16\u53F7")
  @JsonProperty("sealId")
  public String getSealId() {
    return sealId;
  }
  public void setSealId(String sealId) {
    this.sealId = sealId;
  }

  
  /**
   * \u5370\u7AE0\u6536\u96C6\u91CD\u5B9A\u5411\u94FE\u63A5
   **/
  public SealSummary sealerRedirectUri(String sealerRedirectUri) {
    this.sealerRedirectUri = sealerRedirectUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "\u5370\u7AE0\u6536\u96C6\u91CD\u5B9A\u5411\u94FE\u63A5")
  @JsonProperty("sealerRedirectUri")
  public String getSealerRedirectUri() {
    return sealerRedirectUri;
  }
  public void setSealerRedirectUri(String sealerRedirectUri) {
    this.sealerRedirectUri = sealerRedirectUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SealSummary sealSummary = (SealSummary) o;
    return Objects.equals(this.imagePngBase64, sealSummary.imagePngBase64) &&
        Objects.equals(this.sealFileUri, sealSummary.sealFileUri) &&
        Objects.equals(this.sealId, sealSummary.sealId) &&
        Objects.equals(this.sealerRedirectUri, sealSummary.sealerRedirectUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imagePngBase64, sealFileUri, sealId, sealerRedirectUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SealSummary {\n");
    
    sb.append("    imagePngBase64: ").append(toIndentedString(imagePngBase64)).append("\n");
    sb.append("    sealFileUri: ").append(toIndentedString(sealFileUri)).append("\n");
    sb.append("    sealId: ").append(toIndentedString(sealId)).append("\n");
    sb.append("    sealerRedirectUri: ").append(toIndentedString(sealerRedirectUri)).append("\n");
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

