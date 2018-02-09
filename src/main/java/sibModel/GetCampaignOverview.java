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
import org.threeten.bp.OffsetDateTime;

/**
 * GetCampaignOverview
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-15T11:12:00.535+05:30")
public class GetCampaignOverview {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("subject")
  private String subject = null;

  /**
   * Type of campaign
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    CLASSIC("classic"),
    
    TRIGGER("trigger");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  /**
   * Status of the campaign
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    DRAFT("draft"),
    
    SENT("sent"),
    
    ARCHIVE("archive"),
    
    QUEUED("queued"),
    
    SUSPENDED("suspended"),
    
    IN_PROCESS("in_process");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("scheduledAt")
  private OffsetDateTime scheduledAt = null;

  public GetCampaignOverview id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the campaign
   * @return id
  **/
  @ApiModelProperty(example = "12", required = true, value = "ID of the campaign")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GetCampaignOverview name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the campaign
   * @return name
  **/
  @ApiModelProperty(example = "EN - Sales Summer 2017", required = true, value = "Name of the campaign")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetCampaignOverview subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Subject of the campaign
   * @return subject
  **/
  @ApiModelProperty(example = "20% OFF for 2017 Summer Sales", required = true, value = "Subject of the campaign")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public GetCampaignOverview type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of campaign
   * @return type
  **/
  @ApiModelProperty(example = "classic", required = true, value = "Type of campaign")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public GetCampaignOverview status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the campaign
   * @return status
  **/
  @ApiModelProperty(example = "sent", required = true, value = "Status of the campaign")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public GetCampaignOverview scheduledAt(OffsetDateTime scheduledAt) {
    this.scheduledAt = scheduledAt;
    return this;
  }

   /**
   * UTC date-time on which campaign is scheduled (YYYY-MM-DDTHH:mm:ss.SSSZ)
   * @return scheduledAt
  **/
  @ApiModelProperty(example = "2017-06-01T12:30:00Z", value = "UTC date-time on which campaign is scheduled (YYYY-MM-DDTHH:mm:ss.SSSZ)")
  public OffsetDateTime getScheduledAt() {
    return scheduledAt;
  }

  public void setScheduledAt(OffsetDateTime scheduledAt) {
    this.scheduledAt = scheduledAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    GetCampaignOverview getCampaignOverview = (GetCampaignOverview) o;
    return ObjectUtils.equals(this.id, getCampaignOverview.id) &&
    ObjectUtils.equals(this.name, getCampaignOverview.name) &&
    ObjectUtils.equals(this.subject, getCampaignOverview.subject) &&
    ObjectUtils.equals(this.type, getCampaignOverview.type) &&
    ObjectUtils.equals(this.status, getCampaignOverview.status) &&
    ObjectUtils.equals(this.scheduledAt, getCampaignOverview.scheduledAt);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(id, name, subject, type, status, scheduledAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCampaignOverview {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    scheduledAt: ").append(toIndentedString(scheduledAt)).append("\n");
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

