package cn.linksign.api.model;

import java.util.Objects;
import cn.linksign.api.model.SignDateTime;
import cn.linksign.api.model.SignHere;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * \u7B7E\u7F72\u76F8\u5173\u4FE1\u606F
 **/

@ApiModel(description = "\u7B7E\u7F72\u76F8\u5173\u4FE1\u606F")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-27T12:09:06.290+08:00")
public class Tabs   {
  
  private List<SignDateTime> dateTabs = new ArrayList<SignDateTime>();
  private List<SignHere> signHereTabs = new ArrayList<SignHere>();

  
  /**
   * \u7B7E\u7F72\u65F6\u95F4\u4FE1\u606F
   **/
  public Tabs dateTabs(List<SignDateTime> dateTabs) {
    this.dateTabs = dateTabs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u7B7E\u7F72\u65F6\u95F4\u4FE1\u606F")
  @JsonProperty("dateTabs")
  public List<SignDateTime> getDateTabs() {
    return dateTabs;
  }
  public void setDateTabs(List<SignDateTime> dateTabs) {
    this.dateTabs = dateTabs;
  }

  
  /**
   **/
  public Tabs signHereTabs(List<SignHere> signHereTabs) {
    this.signHereTabs = signHereTabs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("signHereTabs")
  public List<SignHere> getSignHereTabs() {
    return signHereTabs;
  }
  public void setSignHereTabs(List<SignHere> signHereTabs) {
    this.signHereTabs = signHereTabs;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tabs tabs = (Tabs) o;
    return Objects.equals(this.dateTabs, tabs.dateTabs) &&
        Objects.equals(this.signHereTabs, tabs.signHereTabs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTabs, signHereTabs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tabs {\n");
    
    sb.append("    dateTabs: ").append(toIndentedString(dateTabs)).append("\n");
    sb.append("    signHereTabs: ").append(toIndentedString(signHereTabs)).append("\n");
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

