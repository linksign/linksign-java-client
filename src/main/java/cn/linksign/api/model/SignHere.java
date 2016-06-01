package cn.linksign.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * \u7B7E\u7F72\u4F4D\u7F6E\u4FE1\u606F
 **/

@ApiModel(description = "\u7B7E\u7F72\u4F4D\u7F6E\u4FE1\u606F")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-01T19:09:22.461+08:00")
public class SignHere   {
  
  private String documentIndex = null;
  private Integer height = null;
  private Integer pageNumber = null;
  private String recipientIndex = null;
  private Integer sealHeight = null;
  private String sealId = null;
  private Integer sealPageNumber = null;
  private Integer sealWidth = null;
  private Integer sealXPosition = null;
  private Integer sealYPosition = null;
  private String signatureId = null;
  private String templateSealFieldId = null;
  private String templateSignatureFieldId = null;
  private Integer width = null;
  private Integer xPosition = null;
  private Integer yPosition = null;

  
  /**
   * \u7B7E\u540D\u6587\u4EF6\u7D22\u5F15\uFF0C \u4E0EDocument\u5BF9\u5E94
   **/
  public SignHere documentIndex(String documentIndex) {
    this.documentIndex = documentIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u7B7E\u540D\u6587\u4EF6\u7D22\u5F15\uFF0C \u4E0EDocument\u5BF9\u5E94")
  @JsonProperty("documentIndex")
  public String getDocumentIndex() {
    return documentIndex;
  }
  public void setDocumentIndex(String documentIndex) {
    this.documentIndex = documentIndex;
  }

  
  /**
   * \u7B7E\u7F72\u533A\u57DF\u9AD8\u5EA6
   **/
  public SignHere height(Integer height) {
    this.height = height;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u7B7E\u7F72\u533A\u57DF\u9AD8\u5EA6")
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }
  public void setHeight(Integer height) {
    this.height = height;
  }

  
  /**
   **/
  public SignHere pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pageNumber")
  public Integer getPageNumber() {
    return pageNumber;
  }
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  
  /**
   * \u7B7E\u7F72\u4EBA(Company)\u7D22\u5F15
   **/
  public SignHere recipientIndex(String recipientIndex) {
    this.recipientIndex = recipientIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u7B7E\u7F72\u4EBA(Company)\u7D22\u5F15")
  @JsonProperty("recipientIndex")
  public String getRecipientIndex() {
    return recipientIndex;
  }
  public void setRecipientIndex(String recipientIndex) {
    this.recipientIndex = recipientIndex;
  }

  
  /**
   * \u5370\u7AE0\u9AD8\u5EA6
   **/
  public SignHere sealHeight(Integer sealHeight) {
    this.sealHeight = sealHeight;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u5370\u7AE0\u9AD8\u5EA6")
  @JsonProperty("sealHeight")
  public Integer getSealHeight() {
    return sealHeight;
  }
  public void setSealHeight(Integer sealHeight) {
    this.sealHeight = sealHeight;
  }

  
  /**
   * \u5370\u7AE0\u7F16\u53F7
   **/
  public SignHere sealId(String sealId) {
    this.sealId = sealId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u5370\u7AE0\u7F16\u53F7")
  @JsonProperty("sealId")
  public String getSealId() {
    return sealId;
  }
  public void setSealId(String sealId) {
    this.sealId = sealId;
  }

  
  /**
   * \u5370\u7AE0\u9875\u7801
   **/
  public SignHere sealPageNumber(Integer sealPageNumber) {
    this.sealPageNumber = sealPageNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u5370\u7AE0\u9875\u7801")
  @JsonProperty("sealPageNumber")
  public Integer getSealPageNumber() {
    return sealPageNumber;
  }
  public void setSealPageNumber(Integer sealPageNumber) {
    this.sealPageNumber = sealPageNumber;
  }

  
  /**
   * \u5370\u7AE0\u5BBD\u5EA6
   **/
  public SignHere sealWidth(Integer sealWidth) {
    this.sealWidth = sealWidth;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u5370\u7AE0\u5BBD\u5EA6")
  @JsonProperty("sealWidth")
  public Integer getSealWidth() {
    return sealWidth;
  }
  public void setSealWidth(Integer sealWidth) {
    this.sealWidth = sealWidth;
  }

  
  /**
   * \u5370\u7AE0X\u5750\u6807
   **/
  public SignHere sealXPosition(Integer sealXPosition) {
    this.sealXPosition = sealXPosition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u5370\u7AE0X\u5750\u6807")
  @JsonProperty("sealXPosition")
  public Integer getSealXPosition() {
    return sealXPosition;
  }
  public void setSealXPosition(Integer sealXPosition) {
    this.sealXPosition = sealXPosition;
  }

  
  /**
   * \u5370\u7AE0Y\u5750\u6807
   **/
  public SignHere sealYPosition(Integer sealYPosition) {
    this.sealYPosition = sealYPosition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u5370\u7AE0Y\u5750\u6807")
  @JsonProperty("sealYPosition")
  public Integer getSealYPosition() {
    return sealYPosition;
  }
  public void setSealYPosition(Integer sealYPosition) {
    this.sealYPosition = sealYPosition;
  }

  
  /**
   * \u7B7E\u540D\u7F16\u53F7
   **/
  public SignHere signatureId(String signatureId) {
    this.signatureId = signatureId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u7B7E\u540D\u7F16\u53F7")
  @JsonProperty("signatureId")
  public String getSignatureId() {
    return signatureId;
  }
  public void setSignatureId(String signatureId) {
    this.signatureId = signatureId;
  }

  
  /**
   * \u6A21\u677F\u516C\u7AE0\u5B57\u6BB5\u540D
   **/
  public SignHere templateSealFieldId(String templateSealFieldId) {
    this.templateSealFieldId = templateSealFieldId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u6A21\u677F\u516C\u7AE0\u5B57\u6BB5\u540D")
  @JsonProperty("templateSealFieldId")
  public String getTemplateSealFieldId() {
    return templateSealFieldId;
  }
  public void setTemplateSealFieldId(String templateSealFieldId) {
    this.templateSealFieldId = templateSealFieldId;
  }

  
  /**
   * \u6A21\u677F\u7B7E\u540D\u5B57\u6BB5\u540D
   **/
  public SignHere templateSignatureFieldId(String templateSignatureFieldId) {
    this.templateSignatureFieldId = templateSignatureFieldId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u6A21\u677F\u7B7E\u540D\u5B57\u6BB5\u540D")
  @JsonProperty("templateSignatureFieldId")
  public String getTemplateSignatureFieldId() {
    return templateSignatureFieldId;
  }
  public void setTemplateSignatureFieldId(String templateSignatureFieldId) {
    this.templateSignatureFieldId = templateSignatureFieldId;
  }

  
  /**
   * \u7B7E\u540D\u57DF\u5BBD\u5EA6
   **/
  public SignHere width(Integer width) {
    this.width = width;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u7B7E\u540D\u57DF\u5BBD\u5EA6")
  @JsonProperty("width")
  public Integer getWidth() {
    return width;
  }
  public void setWidth(Integer width) {
    this.width = width;
  }

  
  /**
   * x\u5750\u6807
   **/
  public SignHere xPosition(Integer xPosition) {
    this.xPosition = xPosition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "x\u5750\u6807")
  @JsonProperty("xPosition")
  public Integer getXPosition() {
    return xPosition;
  }
  public void setXPosition(Integer xPosition) {
    this.xPosition = xPosition;
  }

  
  /**
   * y\u5750\u6807
   **/
  public SignHere yPosition(Integer yPosition) {
    this.yPosition = yPosition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "y\u5750\u6807")
  @JsonProperty("yPosition")
  public Integer getYPosition() {
    return yPosition;
  }
  public void setYPosition(Integer yPosition) {
    this.yPosition = yPosition;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignHere signHere = (SignHere) o;
    return Objects.equals(this.documentIndex, signHere.documentIndex) &&
        Objects.equals(this.height, signHere.height) &&
        Objects.equals(this.pageNumber, signHere.pageNumber) &&
        Objects.equals(this.recipientIndex, signHere.recipientIndex) &&
        Objects.equals(this.sealHeight, signHere.sealHeight) &&
        Objects.equals(this.sealId, signHere.sealId) &&
        Objects.equals(this.sealPageNumber, signHere.sealPageNumber) &&
        Objects.equals(this.sealWidth, signHere.sealWidth) &&
        Objects.equals(this.sealXPosition, signHere.sealXPosition) &&
        Objects.equals(this.sealYPosition, signHere.sealYPosition) &&
        Objects.equals(this.signatureId, signHere.signatureId) &&
        Objects.equals(this.templateSealFieldId, signHere.templateSealFieldId) &&
        Objects.equals(this.templateSignatureFieldId, signHere.templateSignatureFieldId) &&
        Objects.equals(this.width, signHere.width) &&
        Objects.equals(this.xPosition, signHere.xPosition) &&
        Objects.equals(this.yPosition, signHere.yPosition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentIndex, height, pageNumber, recipientIndex, sealHeight, sealId, sealPageNumber, sealWidth, sealXPosition, sealYPosition, signatureId, templateSealFieldId, templateSignatureFieldId, width, xPosition, yPosition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignHere {\n");
    
    sb.append("    documentIndex: ").append(toIndentedString(documentIndex)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    recipientIndex: ").append(toIndentedString(recipientIndex)).append("\n");
    sb.append("    sealHeight: ").append(toIndentedString(sealHeight)).append("\n");
    sb.append("    sealId: ").append(toIndentedString(sealId)).append("\n");
    sb.append("    sealPageNumber: ").append(toIndentedString(sealPageNumber)).append("\n");
    sb.append("    sealWidth: ").append(toIndentedString(sealWidth)).append("\n");
    sb.append("    sealXPosition: ").append(toIndentedString(sealXPosition)).append("\n");
    sb.append("    sealYPosition: ").append(toIndentedString(sealYPosition)).append("\n");
    sb.append("    signatureId: ").append(toIndentedString(signatureId)).append("\n");
    sb.append("    templateSealFieldId: ").append(toIndentedString(templateSealFieldId)).append("\n");
    sb.append("    templateSignatureFieldId: ").append(toIndentedString(templateSignatureFieldId)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    xPosition: ").append(toIndentedString(xPosition)).append("\n");
    sb.append("    yPosition: ").append(toIndentedString(yPosition)).append("\n");
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

