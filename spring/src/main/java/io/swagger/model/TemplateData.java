package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TemplateData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-11-25T17:42:47.375Z")

public class TemplateData   {
  @JsonProperty("companyname")
  private String companyname = null;

  @JsonProperty("otpcode")
  private String otpcode = null;

  public TemplateData companyname(String companyname) {
    this.companyname = companyname;
    return this;
  }

  /**
   * 
   * @return companyname
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getCompanyname() {
    return companyname;
  }

  public void setCompanyname(String companyname) {
    this.companyname = companyname;
  }

  public TemplateData otpcode(String otpcode) {
    this.otpcode = otpcode;
    return this;
  }

  /**
   * 
   * @return otpcode
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getOtpcode() {
    return otpcode;
  }

  public void setOtpcode(String otpcode) {
    this.otpcode = otpcode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateData templateData = (TemplateData) o;
    return Objects.equals(this.companyname, templateData.companyname) &&
        Objects.equals(this.otpcode, templateData.otpcode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyname, otpcode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateData {\n");
    
    sb.append("    companyname: ").append(toIndentedString(companyname)).append("\n");
    sb.append("    otpcode: ").append(toIndentedString(otpcode)).append("\n");
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

