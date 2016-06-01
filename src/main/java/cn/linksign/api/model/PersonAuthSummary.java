package cn.linksign.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-01T19:09:22.461+08:00")
public class PersonAuthSummary   {
  
  private String personId = null;
  private String redirectUri = null;
  private String status = null;

  
  /**
   **/
  public PersonAuthSummary personId(String personId) {
    this.personId = personId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("personId")
  public String getPersonId() {
    return personId;
  }
  public void setPersonId(String personId) {
    this.personId = personId;
  }

  
  /**
   **/
  public PersonAuthSummary redirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("redirectUri")
  public String getRedirectUri() {
    return redirectUri;
  }
  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }

  
  /**
   * 4000/4001/4002/5000/...
   **/
  public PersonAuthSummary status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "4000/4001/4002/5000/...")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonAuthSummary personAuthSummary = (PersonAuthSummary) o;
    return Objects.equals(this.personId, personAuthSummary.personId) &&
        Objects.equals(this.redirectUri, personAuthSummary.redirectUri) &&
        Objects.equals(this.status, personAuthSummary.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personId, redirectUri, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonAuthSummary {\n");
    
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

