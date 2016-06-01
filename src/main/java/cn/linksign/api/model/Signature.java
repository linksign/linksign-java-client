package cn.linksign.api.model;

import java.util.Objects;
import cn.linksign.api.model.Personal;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * \u7B7E\u540D
 **/

@ApiModel(description = "\u7B7E\u540D")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-01T19:09:22.461+08:00")
public class Signature   {
  
  private Personal personal = null;
  private String redirectUri = null;
  private String relateSealId = null;

  
  /**
   * \u4E2A\u4EBA\u4FE1\u606F
   **/
  public Signature personal(Personal personal) {
    this.personal = personal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "\u4E2A\u4EBA\u4FE1\u606F")
  @JsonProperty("Personal")
  public Personal getPersonal() {
    return personal;
  }
  public void setPersonal(Personal personal) {
    this.personal = personal;
  }

  
  /**
   * \u6536\u96C6\u5B8C\u6210\u540E\u8DF3\u8F6C\u7684\u5E94\u7528URI
   **/
  public Signature redirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "\u6536\u96C6\u5B8C\u6210\u540E\u8DF3\u8F6C\u7684\u5E94\u7528URI")
  @JsonProperty("redirectUri")
  public String getRedirectUri() {
    return redirectUri;
  }
  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }

  
  /**
   * \u4E0E\u7B7E\u540D\u5173\u8054\u7684\u5370\u7AE0\u7F16\u53F7
   **/
  public Signature relateSealId(String relateSealId) {
    this.relateSealId = relateSealId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u4E0E\u7B7E\u540D\u5173\u8054\u7684\u5370\u7AE0\u7F16\u53F7")
  @JsonProperty("relateSealId")
  public String getRelateSealId() {
    return relateSealId;
  }
  public void setRelateSealId(String relateSealId) {
    this.relateSealId = relateSealId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Signature signature = (Signature) o;
    return Objects.equals(this.personal, signature.personal) &&
        Objects.equals(this.redirectUri, signature.redirectUri) &&
        Objects.equals(this.relateSealId, signature.relateSealId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personal, redirectUri, relateSealId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Signature {\n");
    
    sb.append("    personal: ").append(toIndentedString(personal)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    relateSealId: ").append(toIndentedString(relateSealId)).append("\n");
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

