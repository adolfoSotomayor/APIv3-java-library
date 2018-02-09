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

/**
 * GetCampaignStats
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-15T11:12:00.535+05:30")
public class GetCampaignStats {
  @SerializedName("listId")
  private Long listId = null;

  @SerializedName("uniqueClicks")
  private Long uniqueClicks = null;

  @SerializedName("clickers")
  private Long clickers = null;

  @SerializedName("complaints")
  private Long complaints = null;

  @SerializedName("delivered")
  private Long delivered = null;

  @SerializedName("sent")
  private Long sent = null;

  @SerializedName("softBounces")
  private Long softBounces = null;

  @SerializedName("hardBounces")
  private Long hardBounces = null;

  @SerializedName("uniqueViews")
  private Long uniqueViews = null;

  @SerializedName("unsubscriptions")
  private Long unsubscriptions = null;

  @SerializedName("viewed")
  private Long viewed = null;

  @SerializedName("deferred")
  private Long deferred = null;

  public GetCampaignStats listId(Long listId) {
    this.listId = listId;
    return this;
  }

   /**
   * List Id of email campaign (only in case of get email campaign(s))
   * @return listId
  **/
  @ApiModelProperty(example = "2", value = "List Id of email campaign (only in case of get email campaign(s))")
  public Long getListId() {
    return listId;
  }

  public void setListId(Long listId) {
    this.listId = listId;
  }

  public GetCampaignStats uniqueClicks(Long uniqueClicks) {
    this.uniqueClicks = uniqueClicks;
    return this;
  }

   /**
   * Number of unique clicks for the campaign
   * @return uniqueClicks
  **/
  @ApiModelProperty(example = "2300", required = true, value = "Number of unique clicks for the campaign")
  public Long getUniqueClicks() {
    return uniqueClicks;
  }

  public void setUniqueClicks(Long uniqueClicks) {
    this.uniqueClicks = uniqueClicks;
  }

  public GetCampaignStats clickers(Long clickers) {
    this.clickers = clickers;
    return this;
  }

   /**
   * Number of clicks for the campaign
   * @return clickers
  **/
  @ApiModelProperty(example = "2665", required = true, value = "Number of clicks for the campaign")
  public Long getClickers() {
    return clickers;
  }

  public void setClickers(Long clickers) {
    this.clickers = clickers;
  }

  public GetCampaignStats complaints(Long complaints) {
    this.complaints = complaints;
    return this;
  }

   /**
   * Number of complaints (Spam reports) for the campaign
   * @return complaints
  **/
  @ApiModelProperty(example = "1", required = true, value = "Number of complaints (Spam reports) for the campaign")
  public Long getComplaints() {
    return complaints;
  }

  public void setComplaints(Long complaints) {
    this.complaints = complaints;
  }

  public GetCampaignStats delivered(Long delivered) {
    this.delivered = delivered;
    return this;
  }

   /**
   * Number of delivered emails for the campaign
   * @return delivered
  **/
  @ApiModelProperty(example = "19765", required = true, value = "Number of delivered emails for the campaign")
  public Long getDelivered() {
    return delivered;
  }

  public void setDelivered(Long delivered) {
    this.delivered = delivered;
  }

  public GetCampaignStats sent(Long sent) {
    this.sent = sent;
    return this;
  }

   /**
   * Number of sent emails for the campaign
   * @return sent
  **/
  @ApiModelProperty(example = "19887", required = true, value = "Number of sent emails for the campaign")
  public Long getSent() {
    return sent;
  }

  public void setSent(Long sent) {
    this.sent = sent;
  }

  public GetCampaignStats softBounces(Long softBounces) {
    this.softBounces = softBounces;
    return this;
  }

   /**
   * Number of softbounce for the campaign
   * @return softBounces
  **/
  @ApiModelProperty(example = "100", required = true, value = "Number of softbounce for the campaign")
  public Long getSoftBounces() {
    return softBounces;
  }

  public void setSoftBounces(Long softBounces) {
    this.softBounces = softBounces;
  }

  public GetCampaignStats hardBounces(Long hardBounces) {
    this.hardBounces = hardBounces;
    return this;
  }

   /**
   * Number of harbounce for the campaign
   * @return hardBounces
  **/
  @ApiModelProperty(example = "87", required = true, value = "Number of harbounce for the campaign")
  public Long getHardBounces() {
    return hardBounces;
  }

  public void setHardBounces(Long hardBounces) {
    this.hardBounces = hardBounces;
  }

  public GetCampaignStats uniqueViews(Long uniqueViews) {
    this.uniqueViews = uniqueViews;
    return this;
  }

   /**
   * Number of unique openings for the campaign
   * @return uniqueViews
  **/
  @ApiModelProperty(example = "7779", required = true, value = "Number of unique openings for the campaign")
  public Long getUniqueViews() {
    return uniqueViews;
  }

  public void setUniqueViews(Long uniqueViews) {
    this.uniqueViews = uniqueViews;
  }

  public GetCampaignStats unsubscriptions(Long unsubscriptions) {
    this.unsubscriptions = unsubscriptions;
    return this;
  }

   /**
   * Number of unsubscription for the campaign
   * @return unsubscriptions
  **/
  @ApiModelProperty(example = "2", required = true, value = "Number of unsubscription for the campaign")
  public Long getUnsubscriptions() {
    return unsubscriptions;
  }

  public void setUnsubscriptions(Long unsubscriptions) {
    this.unsubscriptions = unsubscriptions;
  }

  public GetCampaignStats viewed(Long viewed) {
    this.viewed = viewed;
    return this;
  }

   /**
   * Number of openings for the campaign
   * @return viewed
  **/
  @ApiModelProperty(example = "8999", required = true, value = "Number of openings for the campaign")
  public Long getViewed() {
    return viewed;
  }

  public void setViewed(Long viewed) {
    this.viewed = viewed;
  }

  public GetCampaignStats deferred(Long deferred) {
    this.deferred = deferred;
    return this;
  }

   /**
   * Number of deferred emails for the campaign
   * @return deferred
  **/
  @ApiModelProperty(example = "30", required = true, value = "Number of deferred emails for the campaign")
  public Long getDeferred() {
    return deferred;
  }

  public void setDeferred(Long deferred) {
    this.deferred = deferred;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    GetCampaignStats getCampaignStats = (GetCampaignStats) o;
    return ObjectUtils.equals(this.listId, getCampaignStats.listId) &&
    ObjectUtils.equals(this.uniqueClicks, getCampaignStats.uniqueClicks) &&
    ObjectUtils.equals(this.clickers, getCampaignStats.clickers) &&
    ObjectUtils.equals(this.complaints, getCampaignStats.complaints) &&
    ObjectUtils.equals(this.delivered, getCampaignStats.delivered) &&
    ObjectUtils.equals(this.sent, getCampaignStats.sent) &&
    ObjectUtils.equals(this.softBounces, getCampaignStats.softBounces) &&
    ObjectUtils.equals(this.hardBounces, getCampaignStats.hardBounces) &&
    ObjectUtils.equals(this.uniqueViews, getCampaignStats.uniqueViews) &&
    ObjectUtils.equals(this.unsubscriptions, getCampaignStats.unsubscriptions) &&
    ObjectUtils.equals(this.viewed, getCampaignStats.viewed) &&
    ObjectUtils.equals(this.deferred, getCampaignStats.deferred);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(listId, uniqueClicks, clickers, complaints, delivered, sent, softBounces, hardBounces, uniqueViews, unsubscriptions, viewed, deferred);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCampaignStats {\n");
    
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    uniqueClicks: ").append(toIndentedString(uniqueClicks)).append("\n");
    sb.append("    clickers: ").append(toIndentedString(clickers)).append("\n");
    sb.append("    complaints: ").append(toIndentedString(complaints)).append("\n");
    sb.append("    delivered: ").append(toIndentedString(delivered)).append("\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
    sb.append("    softBounces: ").append(toIndentedString(softBounces)).append("\n");
    sb.append("    hardBounces: ").append(toIndentedString(hardBounces)).append("\n");
    sb.append("    uniqueViews: ").append(toIndentedString(uniqueViews)).append("\n");
    sb.append("    unsubscriptions: ").append(toIndentedString(unsubscriptions)).append("\n");
    sb.append("    viewed: ").append(toIndentedString(viewed)).append("\n");
    sb.append("    deferred: ").append(toIndentedString(deferred)).append("\n");
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

