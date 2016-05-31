package cn.linksign.api.model;

import java.util.Objects;
import cn.linksign.api.model.Company;
import cn.linksign.api.model.Personal;
import cn.linksign.api.model.Tabs;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-27T12:09:06.290+08:00")
public class Signers   {
  
  private List<Company> signerCompanys = new ArrayList<Company>();
  private List<Personal> signerPersons = new ArrayList<Personal>();
  private Tabs tabs = null;

  
  /**
   * \u7B7E\u7F72\u4EBA\u5217\u8868\uFF08\u516C\u53F8\uFF09
   **/
  public Signers signerCompanys(List<Company> signerCompanys) {
    this.signerCompanys = signerCompanys;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u7B7E\u7F72\u4EBA\u5217\u8868\uFF08\u516C\u53F8\uFF09")
  @JsonProperty("signerCompanys")
  public List<Company> getSignerCompanys() {
    return signerCompanys;
  }
  public void setSignerCompanys(List<Company> signerCompanys) {
    this.signerCompanys = signerCompanys;
  }

  
  /**
   * \u7B7E\u7F72\u4EBA\u5217\u8868\uFF08\u4E2A\u4EBA\uFF09
   **/
  public Signers signerPersons(List<Personal> signerPersons) {
    this.signerPersons = signerPersons;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u7B7E\u7F72\u4EBA\u5217\u8868\uFF08\u4E2A\u4EBA\uFF09")
  @JsonProperty("signerPersons")
  public List<Personal> getSignerPersons() {
    return signerPersons;
  }
  public void setSignerPersons(List<Personal> signerPersons) {
    this.signerPersons = signerPersons;
  }

  
  /**
   * \u7B7E\u7F72\u4FE1\u606F\u9762\u677F
   **/
  public Signers tabs(Tabs tabs) {
    this.tabs = tabs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u7B7E\u7F72\u4FE1\u606F\u9762\u677F")
  @JsonProperty("tabs")
  public Tabs getTabs() {
    return tabs;
  }
  public void setTabs(Tabs tabs) {
    this.tabs = tabs;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Signers signers = (Signers) o;
    return Objects.equals(this.signerCompanys, signers.signerCompanys) &&
        Objects.equals(this.signerPersons, signers.signerPersons) &&
        Objects.equals(this.tabs, signers.tabs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signerCompanys, signerPersons, tabs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Signers {\n");
    
    sb.append("    signerCompanys: ").append(toIndentedString(signerCompanys)).append("\n");
    sb.append("    signerPersons: ").append(toIndentedString(signerPersons)).append("\n");
    sb.append("    tabs: ").append(toIndentedString(tabs)).append("\n");
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

