package cn.linksign.api.model;

import java.util.Objects;
import cn.linksign.api.model.SignerStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-27T12:09:06.290+08:00")
public class DocumentStatus   {
  
  private List<SignerStatus> companySignerStatus = new ArrayList<SignerStatus>();
  private List<SignerStatus> personalSignerStatus = new ArrayList<SignerStatus>();
  private String status = null;

  
  /**
   **/
  public DocumentStatus companySignerStatus(List<SignerStatus> companySignerStatus) {
    this.companySignerStatus = companySignerStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("companySignerStatus")
  public List<SignerStatus> getCompanySignerStatus() {
    return companySignerStatus;
  }
  public void setCompanySignerStatus(List<SignerStatus> companySignerStatus) {
    this.companySignerStatus = companySignerStatus;
  }

  
  /**
   **/
  public DocumentStatus personalSignerStatus(List<SignerStatus> personalSignerStatus) {
    this.personalSignerStatus = personalSignerStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("personalSignerStatus")
  public List<SignerStatus> getPersonalSignerStatus() {
    return personalSignerStatus;
  }
  public void setPersonalSignerStatus(List<SignerStatus> personalSignerStatus) {
    this.personalSignerStatus = personalSignerStatus;
  }

  
  /**
   * Document status (  signing, signed)
   **/
  public DocumentStatus status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Document status (  signing, signed)")
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
    DocumentStatus documentStatus = (DocumentStatus) o;
    return Objects.equals(this.companySignerStatus, documentStatus.companySignerStatus) &&
        Objects.equals(this.personalSignerStatus, documentStatus.personalSignerStatus) &&
        Objects.equals(this.status, documentStatus.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companySignerStatus, personalSignerStatus, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentStatus {\n");
    
    sb.append("    companySignerStatus: ").append(toIndentedString(companySignerStatus)).append("\n");
    sb.append("    personalSignerStatus: ").append(toIndentedString(personalSignerStatus)).append("\n");
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

