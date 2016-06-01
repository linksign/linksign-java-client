package cn.linksign.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * \u5FAE\u4FE1\u63A5\u6536\u8005\u4FE1\u606F
 **/

@ApiModel(description = "\u5FAE\u4FE1\u63A5\u6536\u8005\u4FE1\u606F")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-01T19:09:22.461+08:00")
public class WechatRecipient   {
  
  private String name = null;
  private String openId = null;

  
  /**
   * \u59D3\u540D
   **/
  public WechatRecipient name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u59D3\u540D")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * \u516C\u4F17\u53F7\u552F\u4E00\u6807\u8BC6
   **/
  public WechatRecipient openId(String openId) {
    this.openId = openId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u516C\u4F17\u53F7\u552F\u4E00\u6807\u8BC6")
  @JsonProperty("openId")
  public String getOpenId() {
    return openId;
  }
  public void setOpenId(String openId) {
    this.openId = openId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WechatRecipient wechatRecipient = (WechatRecipient) o;
    return Objects.equals(this.name, wechatRecipient.name) &&
        Objects.equals(this.openId, wechatRecipient.openId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, openId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WechatRecipient {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
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

