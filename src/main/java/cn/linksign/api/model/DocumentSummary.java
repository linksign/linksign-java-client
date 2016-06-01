package cn.linksign.api.model;

import java.util.Objects;
import cn.linksign.api.model.DocumentStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * \u6587\u6863\u7B7E\u7F72\u7ED3\u679C
 **/

@ApiModel(description = "\u6587\u6863\u7B7E\u7F72\u7ED3\u679C")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-01T19:09:22.461+08:00")
public class DocumentSummary   {
  
  private String documentId = null;
  private DocumentStatus documentStatus = null;
  private String uri = null;

  
  /**
   * \u7B7E\u7F72\u540E\u7684\u6587\u6863\u7F16\u53F7
   **/
  public DocumentSummary documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "\u7B7E\u7F72\u540E\u7684\u6587\u6863\u7F16\u53F7")
  @JsonProperty("documentId")
  public String getDocumentId() {
    return documentId;
  }
  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  
  /**
   **/
  public DocumentSummary documentStatus(DocumentStatus documentStatus) {
    this.documentStatus = documentStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("documentStatus")
  public DocumentStatus getDocumentStatus() {
    return documentStatus;
  }
  public void setDocumentStatus(DocumentStatus documentStatus) {
    this.documentStatus = documentStatus;
  }

  
  /**
   * \u7B7E\u7F72\u540E\u7684\u6587\u6863\u4E0B\u8F7D\u94FE\u63A5
   **/
  public DocumentSummary uri(String uri) {
    this.uri = uri;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "\u7B7E\u7F72\u540E\u7684\u6587\u6863\u4E0B\u8F7D\u94FE\u63A5")
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentSummary documentSummary = (DocumentSummary) o;
    return Objects.equals(this.documentId, documentSummary.documentId) &&
        Objects.equals(this.documentStatus, documentSummary.documentStatus) &&
        Objects.equals(this.uri, documentSummary.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId, documentStatus, uri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentSummary {\n");
    
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    documentStatus: ").append(toIndentedString(documentStatus)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

