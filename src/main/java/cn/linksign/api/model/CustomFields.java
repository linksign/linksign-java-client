package cn.linksign.api.model;

import java.util.Objects;
import cn.linksign.api.model.ImageCustomField;
import cn.linksign.api.model.TextCustomField;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * Custom Fields PDF form
 **/

@ApiModel(description = "Custom Fields PDF form")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-27T12:09:06.290+08:00")
public class CustomFields   {
  
  private List<ImageCustomField> imageCustomFields = new ArrayList<ImageCustomField>();
  private List<TextCustomField> textCustomFields = new ArrayList<TextCustomField>();

  
  /**
   * Custom picture field
   **/
  public CustomFields imageCustomFields(List<ImageCustomField> imageCustomFields) {
    this.imageCustomFields = imageCustomFields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Custom picture field")
  @JsonProperty("imageCustomFields")
  public List<ImageCustomField> getImageCustomFields() {
    return imageCustomFields;
  }
  public void setImageCustomFields(List<ImageCustomField> imageCustomFields) {
    this.imageCustomFields = imageCustomFields;
  }

  
  /**
   * \u5B57\u6BB5\u4E32\u5B57\u6BB5
   **/
  public CustomFields textCustomFields(List<TextCustomField> textCustomFields) {
    this.textCustomFields = textCustomFields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u5B57\u6BB5\u4E32\u5B57\u6BB5")
  @JsonProperty("textCustomFields")
  public List<TextCustomField> getTextCustomFields() {
    return textCustomFields;
  }
  public void setTextCustomFields(List<TextCustomField> textCustomFields) {
    this.textCustomFields = textCustomFields;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFields customFields = (CustomFields) o;
    return Objects.equals(this.imageCustomFields, customFields.imageCustomFields) &&
        Objects.equals(this.textCustomFields, customFields.textCustomFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageCustomFields, textCustomFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFields {\n");
    
    sb.append("    imageCustomFields: ").append(toIndentedString(imageCustomFields)).append("\n");
    sb.append("    textCustomFields: ").append(toIndentedString(textCustomFields)).append("\n");
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

