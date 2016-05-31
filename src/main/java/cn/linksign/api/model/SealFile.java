package cn.linksign.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-27T12:09:06.290+08:00")
public class SealFile   {
  
  private String imagePngBase64 = null;

  
  /**
   **/
  public SealFile imagePngBase64(String imagePngBase64) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SealFile sealFile = (SealFile) o;
    return Objects.equals(this.imagePngBase64, sealFile.imagePngBase64);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imagePngBase64);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SealFile {\n");
    
    sb.append("    imagePngBase64: ").append(toIndentedString(imagePngBase64)).append("\n");
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

