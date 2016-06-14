package cn.linksign.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-13T18:34:09.191+08:00")
public class CompanyAuthSummary   {
  
  private String companyId = null;
  private String redirectUri = null;
  private String status = null;

  
  /**
   **/
  public CompanyAuthSummary companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("companyId")
  public String getCompanyId() {
    return companyId;
  }
  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  
  /**
   **/
  public CompanyAuthSummary redirectUri(String redirectUri) {
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
   * 1000/1001/1002/2000/...
   **/
  public CompanyAuthSummary status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "1000/1001/1002/2000/...")
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
    CompanyAuthSummary companyAuthSummary = (CompanyAuthSummary) o;
    return Objects.equals(this.companyId, companyAuthSummary.companyId) &&
        Objects.equals(this.redirectUri, companyAuthSummary.redirectUri) &&
        Objects.equals(this.status, companyAuthSummary.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, redirectUri, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyAuthSummary {\n");
    
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
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

