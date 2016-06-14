package cn.linksign.api.model;

import java.util.Objects;
import cn.linksign.api.model.Company;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * \u5370\u7AE0\u4FE1\u606F
 **/

@ApiModel(description = "\u5370\u7AE0\u4FE1\u606F")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-13T18:34:09.191+08:00")
public class Seal   {
  
  private Company company = null;
  private String redirectUri = null;
  private String relateSignatureId = null;

  
  /**
   **/
  public Seal company(Company company) {
    this.company = company;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Company")
  public Company getCompany() {
    return company;
  }
  public void setCompany(Company company) {
    this.company = company;
  }

  
  /**
   * \u6536\u96C6\u5B8C\u6210\u540E\u8DF3\u8F6C\u7684\u5E94\u7528URI
   **/
  public Seal redirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u6536\u96C6\u5B8C\u6210\u540E\u8DF3\u8F6C\u7684\u5E94\u7528URI")
  @JsonProperty("redirectUri")
  public String getRedirectUri() {
    return redirectUri;
  }
  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }

  
  /**
   * \u4E0E\u5370\u7AE0\u5173\u8054\u7684\u7B7E\u540D\u7F16\u53F7
   **/
  public Seal relateSignatureId(String relateSignatureId) {
    this.relateSignatureId = relateSignatureId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u4E0E\u5370\u7AE0\u5173\u8054\u7684\u7B7E\u540D\u7F16\u53F7")
  @JsonProperty("relateSignatureId")
  public String getRelateSignatureId() {
    return relateSignatureId;
  }
  public void setRelateSignatureId(String relateSignatureId) {
    this.relateSignatureId = relateSignatureId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Seal seal = (Seal) o;
    return Objects.equals(this.company, seal.company) &&
        Objects.equals(this.redirectUri, seal.redirectUri) &&
        Objects.equals(this.relateSignatureId, seal.relateSignatureId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(company, redirectUri, relateSignatureId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Seal {\n");
    
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    relateSignatureId: ").append(toIndentedString(relateSignatureId)).append("\n");
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

