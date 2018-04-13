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
import java.util.List;

/**
 * GetCampaignRecipients
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-13T14:27:50.128+05:30")
public class GetCampaignRecipients {
  @SerializedName("lists")
  private List<Long> lists = new ArrayList<Long>();

  @SerializedName("exclusionLists")
  private List<Long> exclusionLists = new ArrayList<Long>();

  public GetCampaignRecipients lists(List<Long> lists) {
    this.lists = lists;
    return this;
  }

  public GetCampaignRecipients addListsItem(Long listsItem) {
    this.lists.add(listsItem);
    return this;
  }

   /**
   * Get lists
   * @return lists
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Long> getLists() {
    return lists;
  }

  public void setLists(List<Long> lists) {
    this.lists = lists;
  }

  public GetCampaignRecipients exclusionLists(List<Long> exclusionLists) {
    this.exclusionLists = exclusionLists;
    return this;
  }

  public GetCampaignRecipients addExclusionListsItem(Long exclusionListsItem) {
    this.exclusionLists.add(exclusionListsItem);
    return this;
  }

   /**
   * Get exclusionLists
   * @return exclusionLists
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Long> getExclusionLists() {
    return exclusionLists;
  }

  public void setExclusionLists(List<Long> exclusionLists) {
    this.exclusionLists = exclusionLists;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    GetCampaignRecipients getCampaignRecipients = (GetCampaignRecipients) o;
    return ObjectUtils.equals(this.lists, getCampaignRecipients.lists) &&
    ObjectUtils.equals(this.exclusionLists, getCampaignRecipients.exclusionLists);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(lists, exclusionLists);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCampaignRecipients {\n");
    
    sb.append("    lists: ").append(toIndentedString(lists)).append("\n");
    sb.append("    exclusionLists: ").append(toIndentedString(exclusionLists)).append("\n");
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

