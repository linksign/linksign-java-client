package cn.linksign.api.model;

import java.util.Objects;
import cn.linksign.api.model.App;
import cn.linksign.api.model.CustomFields;
import cn.linksign.api.model.Document;
import cn.linksign.api.model.ExtraRecipients;
import cn.linksign.api.model.IdAuth;
import cn.linksign.api.model.Signers;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * \u7B7E\u7F72\u6587\u6863\u5B9A\u4E49
 **/

@ApiModel(description = "\u7B7E\u7F72\u6587\u6863\u5B9A\u4E49")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-13T18:34:09.191+08:00")
public class DocumentDefinition   {
  
  private App app = null;
  private CustomFields customFields = null;
  private List<Document> documents = new ArrayList<Document>();
  private ExtraRecipients extraRecipients = null;
  private IdAuth idAuth = null;
  private Signers signers = null;
  private String templateId = null;

  
  /**
   * Application configuration
   **/
  public DocumentDefinition app(App app) {
    this.app = app;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Application configuration")
  @JsonProperty("app")
  public App getApp() {
    return app;
  }
  public void setApp(App app) {
    this.app = app;
  }

  
  /**
   * \u81EA\u5B9A\u4E49\u5B57\u6BB5
   **/
  public DocumentDefinition customFields(CustomFields customFields) {
    this.customFields = customFields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u81EA\u5B9A\u4E49\u5B57\u6BB5")
  @JsonProperty("customFields")
  public CustomFields getCustomFields() {
    return customFields;
  }
  public void setCustomFields(CustomFields customFields) {
    this.customFields = customFields;
  }

  
  /**
   * \u5F85\u7B7E\u7F72\u7684\u6587\u6863\u5217\u8868
   **/
  public DocumentDefinition documents(List<Document> documents) {
    this.documents = documents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u5F85\u7B7E\u7F72\u7684\u6587\u6863\u5217\u8868")
  @JsonProperty("documents")
  public List<Document> getDocuments() {
    return documents;
  }
  public void setDocuments(List<Document> documents) {
    this.documents = documents;
  }

  
  /**
   * \u5176\u5B83\u63A5\u6536\u4EBA
   **/
  public DocumentDefinition extraRecipients(ExtraRecipients extraRecipients) {
    this.extraRecipients = extraRecipients;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u5176\u5B83\u63A5\u6536\u4EBA")
  @JsonProperty("extraRecipients")
  public ExtraRecipients getExtraRecipients() {
    return extraRecipients;
  }
  public void setExtraRecipients(ExtraRecipients extraRecipients) {
    this.extraRecipients = extraRecipients;
  }

  
  /**
   * Signature authentication
   **/
  public DocumentDefinition idAuth(IdAuth idAuth) {
    this.idAuth = idAuth;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Signature authentication")
  @JsonProperty("idAuth")
  public IdAuth getIdAuth() {
    return idAuth;
  }
  public void setIdAuth(IdAuth idAuth) {
    this.idAuth = idAuth;
  }

  
  /**
   * \u7B7E\u7F72\u4EBA
   **/
  public DocumentDefinition signers(Signers signers) {
    this.signers = signers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u7B7E\u7F72\u4EBA")
  @JsonProperty("signers")
  public Signers getSigners() {
    return signers;
  }
  public void setSigners(Signers signers) {
    this.signers = signers;
  }

  
  /**
   * Custom template number
   **/
  public DocumentDefinition templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Custom template number")
  @JsonProperty("templateId")
  public String getTemplateId() {
    return templateId;
  }
  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentDefinition documentDefinition = (DocumentDefinition) o;
    return Objects.equals(this.app, documentDefinition.app) &&
        Objects.equals(this.customFields, documentDefinition.customFields) &&
        Objects.equals(this.documents, documentDefinition.documents) &&
        Objects.equals(this.extraRecipients, documentDefinition.extraRecipients) &&
        Objects.equals(this.idAuth, documentDefinition.idAuth) &&
        Objects.equals(this.signers, documentDefinition.signers) &&
        Objects.equals(this.templateId, documentDefinition.templateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, customFields, documents, extraRecipients, idAuth, signers, templateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentDefinition {\n");
    
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    extraRecipients: ").append(toIndentedString(extraRecipients)).append("\n");
    sb.append("    idAuth: ").append(toIndentedString(idAuth)).append("\n");
    sb.append("    signers: ").append(toIndentedString(signers)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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

