package cn.linksign.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * \u9519\u8BEF\u4FE1\u606F
 **/

@ApiModel(description = "\u9519\u8BEF\u4FE1\u606F")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-27T12:09:06.290+08:00")
public class ApiError   {
  
  private Integer errCode = null;
  private String errMsg = null;

  
  /**
   **/
  public ApiError errCode(Integer errCode) {
    this.errCode = errCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("errCode")
  public Integer getErrCode() {
    return errCode;
  }
  public void setErrCode(Integer errCode) {
    this.errCode = errCode;
  }

  
  /**
   **/
  public ApiError errMsg(String errMsg) {
    this.errMsg = errMsg;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("errMsg")
  public String getErrMsg() {
    return errMsg;
  }
  public void setErrMsg(String errMsg) {
    this.errMsg = errMsg;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiError apiError = (ApiError) o;
    return Objects.equals(this.errCode, apiError.errCode) &&
        Objects.equals(this.errMsg, apiError.errMsg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errCode, errMsg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiError {\n");
    
    sb.append("    errCode: ").append(toIndentedString(errCode)).append("\n");
    sb.append("    errMsg: ").append(toIndentedString(errMsg)).append("\n");
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

