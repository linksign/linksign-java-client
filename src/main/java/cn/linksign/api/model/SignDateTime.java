package cn.linksign.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * \u7B7E\u7F72\u65F6\u95F4\u4FE1\u606F
 **/

@ApiModel(description = "\u7B7E\u7F72\u65F6\u95F4\u4FE1\u606F")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-13T18:34:09.191+08:00")
public class SignDateTime   {
  
  private String dateTimePattern = null;
  private String documentIndex = null;
  private String fontName = null;
  private Float fontSize = null;
  private Integer pageNumber = null;
  private String recipientCompanyIndex = null;
  private String recipientPersonalIndex = null;
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
   * \u5E94\u7528\u7CFB\u7EDF\u4E2D\u7684\u7B7E\u7F72\u4EBA\uFF08\u516C\u53F8\uFF09\u552F\u4E00\u7D22\u5F15\u53F7
   **/
  public SignDateTime recipientCompanyIndex(String recipientCompanyIndex) {
    this.recipientCompanyIndex = recipientCompanyIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u5E94\u7528\u7CFB\u7EDF\u4E2D\u7684\u7B7E\u7F72\u4EBA\uFF08\u516C\u53F8\uFF09\u552F\u4E00\u7D22\u5F15\u53F7")
  @JsonProperty("recipientCompanyIndex")
  public String getRecipientCompanyIndex() {
    return recipientCompanyIndex;
  }
  public void setRecipientCompanyIndex(String recipientCompanyIndex) {
    this.recipientCompanyIndex = recipientCompanyIndex;
  }

  
  /**
   * \u5E94\u7528\u7CFB\u7EDF\u4E2D\u7684\u7B7E\u7F72\u4EBA\uFF08\u4E2A\u4EBA\uFF09\u552F\u4E00\u7D22\u5F15\u53F7
   **/
  public SignDateTime recipientPersonalIndex(String recipientPersonalIndex) {
    this.recipientPersonalIndex = recipientPersonalIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u5E94\u7528\u7CFB\u7EDF\u4E2D\u7684\u7B7E\u7F72\u4EBA\uFF08\u4E2A\u4EBA\uFF09\u552F\u4E00\u7D22\u5F15\u53F7")
  @JsonProperty("recipientPersonalIndex")
  public String getRecipientPersonalIndex() {
    return recipientPersonalIndex;
  }
  public void setRecipientPersonalIndex(String recipientPersonalIndex) {
    this.recipientPersonalIndex = recipientPersonalIndex;
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
        Objects.equals(this.recipientCompanyIndex, signDateTime.recipientCompanyIndex) &&
        Objects.equals(this.recipientPersonalIndex, signDateTime.recipientPersonalIndex) &&
        Objects.equals(this.templateDateFieldId, signDateTime.templateDateFieldId) &&
        Objects.equals(this.width, signDateTime.width) &&
        Objects.equals(this.xPosition, signDateTime.xPosition) &&
        Objects.equals(this.yPosition, signDateTime.yPosition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTimePattern, documentIndex, fontName, fontSize, pageNumber, recipientCompanyIndex, recipientPersonalIndex, templateDateFieldId, width, xPosition, yPosition);
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
    sb.append("    recipientCompanyIndex: ").append(toIndentedString(recipientCompanyIndex)).append("\n");
    sb.append("    recipientPersonalIndex: ").append(toIndentedString(recipientPersonalIndex)).append("\n");
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

