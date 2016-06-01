package cn.linksign.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Custom fields for image type
 **/

@ApiModel(description = "Custom fields for image type")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-01T19:09:22.461+08:00")
public class ImageCustomField   {
  
  private String fieldId = null;
  private String imageBase64 = null;
  private String sealId = null;
  private String signatureId = null;

  
  /**
   * Custom field id
   **/
  public ImageCustomField fieldId(String fieldId) {
    this.fieldId = fieldId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Custom field id")
  @JsonProperty("fieldId")
  public String getFieldId() {
    return fieldId;
  }
  public void setFieldId(String fieldId) {
    this.fieldId = fieldId;
  }

  
  /**
   * Base64 image file format
   **/
  public ImageCustomField imageBase64(String imageBase64) {
    this.imageBase64 = imageBase64;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Base64 image file format")
  @JsonProperty("imageBase64")
  public String getImageBase64() {
    return imageBase64;
  }
  public void setImageBase64(String imageBase64) {
    this.imageBase64 = imageBase64;
  }

  
  /**
   * user seal ID
   **/
  public ImageCustomField sealId(String sealId) {
    this.sealId = sealId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "user seal ID")
  @JsonProperty("sealId")
  public String getSealId() {
    return sealId;
  }
  public void setSealId(String sealId) {
    this.sealId = sealId;
  }

  
  /**
   * user signature ID
   **/
  public ImageCustomField signatureId(String signatureId) {
    this.signatureId = signatureId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "user signature ID")
  @JsonProperty("signatureId")
  public String getSignatureId() {
    return signatureId;
  }
  public void setSignatureId(String signatureId) {
    this.signatureId = signatureId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageCustomField imageCustomField = (ImageCustomField) o;
    return Objects.equals(this.fieldId, imageCustomField.fieldId) &&
        Objects.equals(this.imageBase64, imageCustomField.imageBase64) &&
        Objects.equals(this.sealId, imageCustomField.sealId) &&
        Objects.equals(this.signatureId, imageCustomField.signatureId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldId, imageBase64, sealId, signatureId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageCustomField {\n");
    
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    imageBase64: ").append(toIndentedString(imageBase64)).append("\n");
    sb.append("    sealId: ").append(toIndentedString(sealId)).append("\n");
    sb.append("    signatureId: ").append(toIndentedString(signatureId)).append("\n");
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

