package cn.linksign.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * \u7B7E\u7F72\u6587\u6863\u4FE1\u606F
 **/

@ApiModel(description = "\u7B7E\u7F72\u6587\u6863\u4FE1\u606F")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-27T12:09:06.290+08:00")
public class Document   {
  
  private String documentBase64 = null;
  private String documentIndex = null;
  private String fileExtension = null;
  private String name = null;

  
  /**
   * \u6587\u6863\u5185\u5BB9\uFF08Base64\u683C\u5F0F\uFF09
   **/
  public Document documentBase64(String documentBase64) {
    this.documentBase64 = documentBase64;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "\u6587\u6863\u5185\u5BB9\uFF08Base64\u683C\u5F0F\uFF09")
  @JsonProperty("documentBase64")
  public String getDocumentBase64() {
    return documentBase64;
  }
  public void setDocumentBase64(String documentBase64) {
    this.documentBase64 = documentBase64;
  }

  
  /**
   * \u6587\u6863\u7D22\u5F15\uFF0C\u4E0ESignHere\u5BF9\u5E94
   **/
  public Document documentIndex(String documentIndex) {
    this.documentIndex = documentIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u6587\u6863\u7D22\u5F15\uFF0C\u4E0ESignHere\u5BF9\u5E94")
  @JsonProperty("documentIndex")
  public String getDocumentIndex() {
    return documentIndex;
  }
  public void setDocumentIndex(String documentIndex) {
    this.documentIndex = documentIndex;
  }

  
  /**
   * \u6587\u6863\u540E\u7F00\uFF08\u683C\u5F0F\uFF09
   **/
  public Document fileExtension(String fileExtension) {
    this.fileExtension = fileExtension;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "\u6587\u6863\u540E\u7F00\uFF08\u683C\u5F0F\uFF09")
  @JsonProperty("fileExtension")
  public String getFileExtension() {
    return fileExtension;
  }
  public void setFileExtension(String fileExtension) {
    this.fileExtension = fileExtension;
  }

  
  /**
   * \u6587\u6863\u540D\u79F0
   **/
  public Document name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "\u6587\u6863\u540D\u79F0")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Document document = (Document) o;
    return Objects.equals(this.documentBase64, document.documentBase64) &&
        Objects.equals(this.documentIndex, document.documentIndex) &&
        Objects.equals(this.fileExtension, document.fileExtension) &&
        Objects.equals(this.name, document.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentBase64, documentIndex, fileExtension, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    
    sb.append("    documentBase64: ").append(toIndentedString(documentBase64)).append("\n");
    sb.append("    documentIndex: ").append(toIndentedString(documentIndex)).append("\n");
    sb.append("    fileExtension: ").append(toIndentedString(fileExtension)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

