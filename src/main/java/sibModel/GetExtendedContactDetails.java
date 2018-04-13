/*
 * SendinBlue API
 * SendinBlue provide a RESTFul API that can be used with any languages. With this API, you will be able to :   - Manage your campaigns and get the statistics   - Manage your contacts   - Send transactional Emails and SMS   - and much more...  You can download our wrappers at https://github.com/orgs/sendinblue  **Possible responses**   | Code | Message |   | :-------------: | ------------- |   | 200  | OK. Successful Request  |   | 201  | OK. Successful Creation |   | 202  | OK. Request accepted |   | 204  | OK. Successful Update/Deletion  |   | 400  | Error. Bad Request  |   | 401  | Error. Authentication Needed  |   | 402  | Error. Not enough credit, plan upgrade needed  |   | 403  | Error. Permission denied  |   | 404  | Error. Object does not exist |   | 405  | Error. Method not allowed  | 
 *
 * OpenAPI spec version: 3.0.0
 * Contact: contact@sendinblue.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package sibModel;

import org.apache.commons.lang3.ObjectUtils;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;
import sibModel.GetContactDetails;
import sibModel.GetExtendedContactDetailsStatistics;

/**
 * GetExtendedContactDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-13T14:27:50.128+05:30")
public class GetExtendedContactDetails {
  @SerializedName("email")
  private String email = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("emailBlacklisted")
  private Boolean emailBlacklisted = null;

  @SerializedName("smsBlacklisted")
  private Boolean smsBlacklisted = null;

  @SerializedName("modifiedAt")
  private OffsetDateTime modifiedAt = null;

  @SerializedName("listIds")
  private List<Long> listIds = new ArrayList<Long>();

  @SerializedName("listUnsubscribed")
  private List<Long> listUnsubscribed = null;

  @SerializedName("attributes")
  private Map<String, String> attributes = new HashMap<String, String>();

  @SerializedName("statistics")
  private GetExtendedContactDetailsStatistics statistics = null;

  public GetExtendedContactDetails email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email address of the contact for which you requested the details
   * @return email
  **/
  @ApiModelProperty(example = "john.smith@example.com", required = true, value = "Email address of the contact for which you requested the details")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public GetExtendedContactDetails id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the contact for which you requested the details
   * @return id
  **/
  @ApiModelProperty(example = "32", required = true, value = "ID of the contact for which you requested the details")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GetExtendedContactDetails emailBlacklisted(Boolean emailBlacklisted) {
    this.emailBlacklisted = emailBlacklisted;
    return this;
  }

   /**
   * Blacklist status for email campaigns (true&#x3D;blacklisted, false&#x3D;not blacklisted)
   * @return emailBlacklisted
  **/
  @ApiModelProperty(example = "false", required = true, value = "Blacklist status for email campaigns (true=blacklisted, false=not blacklisted)")
  public Boolean isEmailBlacklisted() {
    return emailBlacklisted;
  }

  public void setEmailBlacklisted(Boolean emailBlacklisted) {
    this.emailBlacklisted = emailBlacklisted;
  }

  public GetExtendedContactDetails smsBlacklisted(Boolean smsBlacklisted) {
    this.smsBlacklisted = smsBlacklisted;
    return this;
  }

   /**
   * Blacklist status for SMS campaigns (true&#x3D;blacklisted, false&#x3D;not blacklisted)
   * @return smsBlacklisted
  **/
  @ApiModelProperty(example = "true", required = true, value = "Blacklist status for SMS campaigns (true=blacklisted, false=not blacklisted)")
  public Boolean isSmsBlacklisted() {
    return smsBlacklisted;
  }

  public void setSmsBlacklisted(Boolean smsBlacklisted) {
    this.smsBlacklisted = smsBlacklisted;
  }

  public GetExtendedContactDetails modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

   /**
   * Last modification UTC date-time of the contact (YYYY-MM-DDTHH:mm:ss.SSSZ)
   * @return modifiedAt
  **/
  @ApiModelProperty(example = "2017-05-12T12:30:00Z", required = true, value = "Last modification UTC date-time of the contact (YYYY-MM-DDTHH:mm:ss.SSSZ)")
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public GetExtendedContactDetails listIds(List<Long> listIds) {
    this.listIds = listIds;
    return this;
  }

  public GetExtendedContactDetails addListIdsItem(Long listIdsItem) {
    this.listIds.add(listIdsItem);
    return this;
  }

   /**
   * Get listIds
   * @return listIds
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Long> getListIds() {
    return listIds;
  }

  public void setListIds(List<Long> listIds) {
    this.listIds = listIds;
  }

  public GetExtendedContactDetails listUnsubscribed(List<Long> listUnsubscribed) {
    this.listUnsubscribed = listUnsubscribed;
    return this;
  }

  public GetExtendedContactDetails addListUnsubscribedItem(Long listUnsubscribedItem) {
    if (this.listUnsubscribed == null) {
      this.listUnsubscribed = new ArrayList<Long>();
    }
    this.listUnsubscribed.add(listUnsubscribedItem);
    return this;
  }

   /**
   * Get listUnsubscribed
   * @return listUnsubscribed
  **/
  @ApiModelProperty(value = "")
  public List<Long> getListUnsubscribed() {
    return listUnsubscribed;
  }

  public void setListUnsubscribed(List<Long> listUnsubscribed) {
    this.listUnsubscribed = listUnsubscribed;
  }

  public GetExtendedContactDetails attributes(Map<String, String> attributes) {
    this.attributes = attributes;
    return this;
  }

  public GetExtendedContactDetails putAttributesItem(String key, String attributesItem) {
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(required = true, value = "")
  public Map<String, String> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, String> attributes) {
    this.attributes = attributes;
  }

  public GetExtendedContactDetails statistics(GetExtendedContactDetailsStatistics statistics) {
    this.statistics = statistics;
    return this;
  }

   /**
   * Get statistics
   * @return statistics
  **/
  @ApiModelProperty(required = true, value = "")
  public GetExtendedContactDetailsStatistics getStatistics() {
    return statistics;
  }

  public void setStatistics(GetExtendedContactDetailsStatistics statistics) {
    this.statistics = statistics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    GetExtendedContactDetails getExtendedContactDetails = (GetExtendedContactDetails) o;
    return ObjectUtils.equals(this.email, getExtendedContactDetails.email) &&
    ObjectUtils.equals(this.id, getExtendedContactDetails.id) &&
    ObjectUtils.equals(this.emailBlacklisted, getExtendedContactDetails.emailBlacklisted) &&
    ObjectUtils.equals(this.smsBlacklisted, getExtendedContactDetails.smsBlacklisted) &&
    ObjectUtils.equals(this.modifiedAt, getExtendedContactDetails.modifiedAt) &&
    ObjectUtils.equals(this.listIds, getExtendedContactDetails.listIds) &&
    ObjectUtils.equals(this.listUnsubscribed, getExtendedContactDetails.listUnsubscribed) &&
    ObjectUtils.equals(this.attributes, getExtendedContactDetails.attributes) &&
    ObjectUtils.equals(this.statistics, getExtendedContactDetails.statistics);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(email, id, emailBlacklisted, smsBlacklisted, modifiedAt, listIds, listUnsubscribed, attributes, statistics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetExtendedContactDetails {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    emailBlacklisted: ").append(toIndentedString(emailBlacklisted)).append("\n");
    sb.append("    smsBlacklisted: ").append(toIndentedString(smsBlacklisted)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    listIds: ").append(toIndentedString(listIds)).append("\n");
    sb.append("    listUnsubscribed: ").append(toIndentedString(listUnsubscribed)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
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

