package cn.linksign.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * \u7B7E\u7F72\u65F6\u95F4\u4FE1\u606F
 **/

@ApiModel(description = "\u7B7E\u7F72\u65F6\u95F4\u4FE1\u606F")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-27T12:09:06.290+08:00")
public class SignDateTime   {
  
  private String dateTimePattern = null;
  private String documentIndex = null;
  private String fontName = null;
  private Float fontSize = null;
  private Integer pageNumber = null;
  private String recipientIndex = null;
  private String templateDateFieldId = null;
  private Integer width = null;
  private Integer xPosition = null;
  private Integer yPosition = null;

  
  /**
   * \u65F6\u95F4\u663E\u793A\u683C\u5F0F
   **/
  public SignDateTime dateTimePattern(String dateTimePattern) {
    this.dateTimePattern = dateTimePattern;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u65F6\u95F4\u663E\u793A\u683C\u5F0F")
  @JsonProperty("dateTimePattern")
  public String getDateTimePattern() {
    return dateTimePattern;
  }
  public void setDateTimePattern(String dateTimePattern) {
    this.dateTimePattern = dateTimePattern;
  }

  
  /**
   * \u6587\u6863\u7D22\u5F15
   **/
  public SignDateTime documentIndex(String documentIndex) {
    this.documentIndex = documentIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u6587\u6863\u7D22\u5F15")
  @JsonProperty("documentIndex")
  public String getDocumentIndex() {
    return documentIndex;
  }
  public void setDocumentIndex(String documentIndex) {
    this.documentIndex = documentIndex;
  }

  
  /**
   * \u5B57\u4F53\u540D\u79F0
   **/
  public SignDateTime fontName(String fontName) {
    this.fontName = fontName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u5B57\u4F53\u540D\u79F0")
  @JsonProperty("fontName")
  public String getFontName() {
    return fontName;
  }
  public void setFontName(String fontName) {
    this.fontName = fontName;
  }

  
  /**
   * \u5B57\u4F53\u5927\u5C0F
   **/
  public SignDateTime fontSize(Float fontSize) {
    this.fontSize = fontSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u5B57\u4F53\u5927\u5C0F")
  @JsonProperty("fontSize")
  public Float getFontSize() {
    return fontSize;
  }
  public void setFontSize(Float fontSize) {
    this.fontSize = fontSize;
  }

  
  /**
   * \u9875\u7801
   **/
  public SignDateTime pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u9875\u7801")
  @JsonProperty("pageNumber")
  public Integer getPageNumber() {
    return pageNumber;
  }
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  
  /**
   * \u7B7E\u7F72\u4EBA\u7D22\u5F15\u53F7
   **/
  public SignDateTime recipientIndex(String recipientIndex) {
    this.recipientIndex = recipientIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u7B7E\u7F72\u4EBA\u7D22\u5F15\u53F7")
  @JsonProperty("recipientIndex")
  public String getRecipientIndex() {
    return recipientIndex;
  }
  public void setRecipientIndex(String recipientIndex) {
    this.recipientIndex = recipientIndex;
  }

  
  /**
   * \u6A21\u677F\u65F6\u95F4\u5B57\u6BB5\u540D
   **/
  public SignDateTime templateDateFieldId(String templateDateFieldId) {
    this.templateDateFieldId = templateDateFieldId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u6A21\u677F\u65F6\u95F4\u5B57\u6BB5\u540D")
  @JsonProperty("templateDateFieldId")
  public String getTemplateDateFieldId() {
    return templateDateFieldId;
  }
  public void setTemplateDateFieldId(String templateDateFieldId) {
    this.templateDateFieldId = templateDateFieldId;
  }

  
  /**
   * \u5BBD\u5EA6
   **/
  public SignDateTime width(Integer width) {
    this.width = width;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u5BBD\u5EA6")
  @JsonProperty("width")
  public Integer getWidth() {
    return width;
  }
  public void setWidth(Integer width) {
    this.width = width;
  }

  
  /**
   * X\u5750\u6807
   **/
  public SignDateTime xPosition(Integer xPosition) {
    this.xPosition = xPosition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "X\u5750\u6807")
  @JsonProperty("xPosition")
  public Integer getXPosition() {
    return xPosition;
  }
  public void setXPosition(Integer xPosition) {
    this.xPosition = xPosition;
  }

  
  /**
   * Y\u5750\u6807
   **/
  public SignDateTime yPosition(Integer yPosition) {
    this.yPosition = yPosition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Y\u5750\u6807")
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
    SignDateTime signDateTime = (SignDateTime) o;
    return Objects.equals(this.dateTimePattern, signDateTime.dateTimePattern) &&
        Objects.equals(this.documentIndex, signDateTime.documentIndex) &&
        Objects.equals(this.fontName, signDateTime.fontName) &&
        Objects.equals(this.fontSize, signDateTime.fontSize) &&
        Objects.equals(this.pageNumber, signDateTime.pageNumber) &&
        Objects.equals(this.recipientIndex, signDateTime.recipientIndex) &&
        Objects.equals(this.templateDateFieldId, signDateTime.templateDateFieldId) &&
        Objects.equals(this.width, signDateTime.width) &&
        Objects.equals(this.xPosition, signDateTime.xPosition) &&
        Objects.equals(this.yPosition, signDateTime.yPosition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTimePattern, documentIndex, fontName, fontSize, pageNumber, recipientIndex, templateDateFieldId, width, xPosition, yPosition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignDateTime {\n");
    
    sb.append("    dateTimePattern: ").append(toIndentedString(dateTimePattern)).append("\n");
    sb.append("    documentIndex: ").append(toIndentedString(documentIndex)).append("\n");
    sb.append("    fontName: ").append(toIndentedString(fontName)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    recipientIndex: ").append(toIndentedString(recipientIndex)).append("\n");
    sb.append("    templateDateFieldId: ").append(toIndentedString(templateDateFieldId)).append("\n");
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

