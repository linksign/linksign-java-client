package cn.linksign.api.model;

import java.util.Objects;
import cn.linksign.api.model.App;
import cn.linksign.api.model.Personal;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-13T18:34:09.191+08:00")
public class PersonAuth   {
  
  private App app = null;
  private Personal personal = null;

  
  /**
   **/
  public PersonAuth app(App app) {
    this.app = app;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("app")
  public App getApp() {
    return app;
  }
  public void setApp(App app) {
    this.app = app;
  }

  
  /**
   **/
  public PersonAuth personal(Personal personal) {
    this.personal = personal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("personal")
  public Personal getPersonal() {
    return personal;
  }
  public void setPersonal(Personal personal) {
    this.personal = personal;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonAuth personAuth = (PersonAuth) o;
    return Objects.equals(this.app, personAuth.app) &&
        Objects.equals(this.personal, personAuth.personal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, personal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonAuth {\n");
    
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
    sb.append("    personal: ").append(toIndentedString(personal)).append("\n");
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

