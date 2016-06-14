package cn.linksign.api.model;

import java.util.Objects;
import cn.linksign.api.model.EmailRecipient;
import cn.linksign.api.model.SmsRecipient;
import cn.linksign.api.model.WechatRecipient;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * \u5176\u5B83\u63A5\u6536\u4EBA
 **/

@ApiModel(description = "\u5176\u5B83\u63A5\u6536\u4EBA")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-13T18:34:09.191+08:00")
public class ExtraRecipients   {
  
  private List<EmailRecipient> emaiRecipients = new ArrayList<EmailRecipient>();
  private List<SmsRecipient> smsRecipients = new ArrayList<SmsRecipient>();
  private List<WechatRecipient> wechatRecipients = new ArrayList<WechatRecipient>();

  
  /**
   * \u6240\u6709\u90AE\u4EF6\u63A5\u6536\u8005
   **/
  public ExtraRecipients emaiRecipients(List<EmailRecipient> emaiRecipients) {
    this.emaiRecipients = emaiRecipients;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u6240\u6709\u90AE\u4EF6\u63A5\u6536\u8005")
  @JsonProperty("emaiRecipients")
  public List<EmailRecipient> getEmaiRecipients() {
    return emaiRecipients;
  }
  public void setEmaiRecipients(List<EmailRecipient> emaiRecipients) {
    this.emaiRecipients = emaiRecipients;
  }

  
  /**
   * \u6240\u6709\u77ED\u4FE1\u63A5\u6536\u8005
   **/
  public ExtraRecipients smsRecipients(List<SmsRecipient> smsRecipients) {
    this.smsRecipients = smsRecipients;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u6240\u6709\u77ED\u4FE1\u63A5\u6536\u8005")
  @JsonProperty("smsRecipients")
  public List<SmsRecipient> getSmsRecipients() {
    return smsRecipients;
  }
  public void setSmsRecipients(List<SmsRecipient> smsRecipients) {
    this.smsRecipients = smsRecipients;
  }

  
  /**
   * \u6240\u6709\u5FAE\u4FE1\u63A5\u6536\u8005
   **/
  public ExtraRecipients wechatRecipients(List<WechatRecipient> wechatRecipients) {
    this.wechatRecipients = wechatRecipients;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u6240\u6709\u5FAE\u4FE1\u63A5\u6536\u8005")
  @JsonProperty("wechatRecipients")
  public List<WechatRecipient> getWechatRecipients() {
    return wechatRecipients;
  }
  public void setWechatRecipients(List<WechatRecipient> wechatRecipients) {
    this.wechatRecipients = wechatRecipients;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtraRecipients extraRecipients = (ExtraRecipients) o;
    return Objects.equals(this.emaiRecipients, extraRecipients.emaiRecipients) &&
        Objects.equals(this.smsRecipients, extraRecipients.smsRecipients) &&
        Objects.equals(this.wechatRecipients, extraRecipients.wechatRecipients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emaiRecipients, smsRecipients, wechatRecipients);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtraRecipients {\n");
    
    sb.append("    emaiRecipients: ").append(toIndentedString(emaiRecipients)).append("\n");
    sb.append("    smsRecipients: ").append(toIndentedString(smsRecipients)).append("\n");
    sb.append("    wechatRecipients: ").append(toIndentedString(wechatRecipients)).append("\n");
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

