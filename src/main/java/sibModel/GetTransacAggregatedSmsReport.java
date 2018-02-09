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
 * GetTransacAggregatedSmsReport
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-15T11:12:00.535+05:30")
public class GetTransacAggregatedSmsReport {
  @SerializedName("range")
  private String range = null;

  @SerializedName("requests")
  private Long requests = null;

  @SerializedName("delivered")
  private Long delivered = null;

  @SerializedName("hardBounces")
  private Long hardBounces = null;

  @SerializedName("softBounces")
  private Long softBounces = null;

  @SerializedName("blocked")
  private Long blocked = null;

  @SerializedName("unsubscribed")
  private Long unsubscribed = null;

  @SerializedName("replied")
  private Long replied = null;

  @SerializedName("accepted")
  private Long accepted = null;

  @SerializedName("rejected")
  private Long rejected = null;

  public GetTransacAggregatedSmsReport range(String range) {
    this.range = range;
    return this;
  }

   /**
   * Time frame of the report
   * @return range
  **/
  @ApiModelProperty(example = "2016-09-08|2017-04-06", required = true, value = "Time frame of the report")
  public String getRange() {
    return range;
  }

  public void setRange(String range) {
    this.range = range;
  }

  public GetTransacAggregatedSmsReport requests(Long requests) {
    this.requests = requests;
    return this;
  }

   /**
   * Number of requests for the timeframe
   * @return requests
  **/
  @ApiModelProperty(example = "263", required = true, value = "Number of requests for the timeframe")
  public Long getRequests() {
    return requests;
  }

  public void setRequests(Long requests) {
    this.requests = requests;
  }

  public GetTransacAggregatedSmsReport delivered(Long delivered) {
    this.delivered = delivered;
    return this;
  }

   /**
   * Number of delivered SMS for the timeframe
   * @return delivered
  **/
  @ApiModelProperty(example = "249", required = true, value = "Number of delivered SMS for the timeframe")
  public Long getDelivered() {
    return delivered;
  }

  public void setDelivered(Long delivered) {
    this.delivered = delivered;
  }

  public GetTransacAggregatedSmsReport hardBounces(Long hardBounces) {
    this.hardBounces = hardBounces;
    return this;
  }

   /**
   * Number of hardbounces for the timeframe
   * @return hardBounces
  **/
  @ApiModelProperty(example = "1", required = true, value = "Number of hardbounces for the timeframe")
  public Long getHardBounces() {
    return hardBounces;
  }

  public void setHardBounces(Long hardBounces) {
    this.hardBounces = hardBounces;
  }

  public GetTransacAggregatedSmsReport softBounces(Long softBounces) {
    this.softBounces = softBounces;
    return this;
  }

   /**
   * Number of softbounces for the timeframe
   * @return softBounces
  **/
  @ApiModelProperty(example = "4", required = true, value = "Number of softbounces for the timeframe")
  public Long getSoftBounces() {
    return softBounces;
  }

  public void setSoftBounces(Long softBounces) {
    this.softBounces = softBounces;
  }

  public GetTransacAggregatedSmsReport blocked(Long blocked) {
    this.blocked = blocked;
    return this;
  }

   /**
   * Number of blocked contact for the timeframe
   * @return blocked
  **/
  @ApiModelProperty(example = "2", required = true, value = "Number of blocked contact for the timeframe")
  public Long getBlocked() {
    return blocked;
  }

  public void setBlocked(Long blocked) {
    this.blocked = blocked;
  }

  public GetTransacAggregatedSmsReport unsubscribed(Long unsubscribed) {
    this.unsubscribed = unsubscribed;
    return this;
  }

   /**
   * Number of unsubscription for the timeframe
   * @return unsubscribed
  **/
  @ApiModelProperty(example = "6", required = true, value = "Number of unsubscription for the timeframe")
  public Long getUnsubscribed() {
    return unsubscribed;
  }

  public void setUnsubscribed(Long unsubscribed) {
    this.unsubscribed = unsubscribed;
  }

  public GetTransacAggregatedSmsReport replied(Long replied) {
    this.replied = replied;
    return this;
  }

   /**
   * Number of answered SMS for the timeframe
   * @return replied
  **/
  @ApiModelProperty(example = "12", required = true, value = "Number of answered SMS for the timeframe")
  public Long getReplied() {
    return replied;
  }

  public void setReplied(Long replied) {
    this.replied = replied;
  }

  public GetTransacAggregatedSmsReport accepted(Long accepted) {
    this.accepted = accepted;
    return this;
  }

   /**
   * Number of accepted for the timeframe
   * @return accepted
  **/
  @ApiModelProperty(example = "252", required = true, value = "Number of accepted for the timeframe")
  public Long getAccepted() {
    return accepted;
  }

  public void setAccepted(Long accepted) {
    this.accepted = accepted;
  }

  public GetTransacAggregatedSmsReport rejected(Long rejected) {
    this.rejected = rejected;
    return this;
  }

   /**
   * Number of rejected for the timeframe
   * @return rejected
  **/
  @ApiModelProperty(example = "8", required = true, value = "Number of rejected for the timeframe")
  public Long getRejected() {
    return rejected;
  }

  public void setRejected(Long rejected) {
    this.rejected = rejected;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    GetTransacAggregatedSmsReport getTransacAggregatedSmsReport = (GetTransacAggregatedSmsReport) o;
    return ObjectUtils.equals(this.range, getTransacAggregatedSmsReport.range) &&
    ObjectUtils.equals(this.requests, getTransacAggregatedSmsReport.requests) &&
    ObjectUtils.equals(this.delivered, getTransacAggregatedSmsReport.delivered) &&
    ObjectUtils.equals(this.hardBounces, getTransacAggregatedSmsReport.hardBounces) &&
    ObjectUtils.equals(this.softBounces, getTransacAggregatedSmsReport.softBounces) &&
    ObjectUtils.equals(this.blocked, getTransacAggregatedSmsReport.blocked) &&
    ObjectUtils.equals(this.unsubscribed, getTransacAggregatedSmsReport.unsubscribed) &&
    ObjectUtils.equals(this.replied, getTransacAggregatedSmsReport.replied) &&
    ObjectUtils.equals(this.accepted, getTransacAggregatedSmsReport.accepted) &&
    ObjectUtils.equals(this.rejected, getTransacAggregatedSmsReport.rejected);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(range, requests, delivered, hardBounces, softBounces, blocked, unsubscribed, replied, accepted, rejected);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTransacAggregatedSmsReport {\n");
    
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    delivered: ").append(toIndentedString(delivered)).append("\n");
    sb.append("    hardBounces: ").append(toIndentedString(hardBounces)).append("\n");
    sb.append("    softBounces: ").append(toIndentedString(softBounces)).append("\n");
    sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
    sb.append("    unsubscribed: ").append(toIndentedString(unsubscribed)).append("\n");
    sb.append("    replied: ").append(toIndentedString(replied)).append("\n");
    sb.append("    accepted: ").append(toIndentedString(accepted)).append("\n");
    sb.append("    rejected: ").append(toIndentedString(rejected)).append("\n");
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
