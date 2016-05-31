package cn.linksign.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * \u81EA\u5B9A\u4E49\u5B57\u6BB5
 **/

@ApiModel(description = "\u81EA\u5B9A\u4E49\u5B57\u6BB5")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-27T12:09:06.290+08:00")
public class TextCustomField   {
  
  private String fieldId = null;
  private String value = null;

  
  /**
   * \u7528\u6237\u81EA\u5B9A\u4E49\u7684\u5B57\u6BB5\u7F16\u53F7
   **/
  public TextCustomField fieldId(String fieldId) {
    this.fieldId = fieldId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "\u7528\u6237\u81EA\u5B9A\u4E49\u7684\u5B57\u6BB5\u7F16\u53F7")
  @JsonProperty("fieldId")
  public String getFieldId() {
    return fieldId;
  }
  public void setFieldId(String fieldId) {
    this.fieldId = fieldId;
  }

  
  /**
   * \u5185\u5BB9
   **/
  public TextCustomField value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "\u5185\u5BB9")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextCustomField textCustomField = (TextCustomField) o;
    return Objects.equals(this.fieldId, textCustomField.fieldId) &&
        Objects.equals(this.value, textCustomField.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldId, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextCustomField {\n");
    
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

