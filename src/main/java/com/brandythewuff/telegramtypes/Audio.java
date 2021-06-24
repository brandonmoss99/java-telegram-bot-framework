package com.brandythewuff.telegramtypes;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

@JsonDeserialize(builder = Audio.Builder.class)
public class Audio{
    private final PhotoSize Thumb;
    private final String FileName;
    private final String MimeType;
    private final String FileId;
    private final String FileUniqueId;
    private final String FileSize;
    private final Integer Duration;
    private final String Performer;
    private final String Title;

    private Audio(Builder builder){
        this.Thumb = builder.Thumb;
        this.FileName = builder.FileName;
        this.MimeType = builder.MimeType;
        this.FileId = builder.FileId;
        this.FileUniqueId = builder.FileUniqueId;
        this.FileSize = builder.FileSize;
        this.Duration = builder.Duration;
        this.Performer = builder.Performer;
        this.Title = builder.Title;
    }

    // Getter methods

    @JsonProperty("thumb")
    public PhotoSize getThumb(){return Thumb;}
    @JsonProperty("file_name")
    public String getFileName(){return FileName;}
    @JsonProperty("mime_type")
    public String getMimeType(){return MimeType;}
    @JsonProperty("file_id")
    public String getFileId(){return FileId;}
    @JsonProperty("file_unique_id")
    public String getFileUniqueId(){return FileUniqueId;}
    @JsonProperty("file_size")
    public String getFileSize(){return FileSize;}
    @JsonProperty("duration")
    public Integer getDuration(){return Duration;}
    @JsonProperty("performer")
    public String getPerformer(){return Performer;}
    @JsonProperty("title")
    public String getTitle(){return Title;}

    @JsonPOJOBuilder(withPrefix = "set")
    public static class Builder{
        private PhotoSize Thumb;
        private String FileName;
        private String MimeType;
        private String FileId;
        private String FileUniqueId;
        private String FileSize;
        private Integer Duration;
        private String Performer;
        private String Title;

        public static Builder newInstance(){
            return new Builder();
        }

        private Builder(){}
        
        @JsonProperty("thumb")
        public Builder setThumb(PhotoSize photo){
            this.Thumb = photo;
            return this;
        }

        @JsonProperty("file_name")
        public Builder setFileName(String fname){
            this.FileName = fname;
            return this;
        }

        @JsonProperty("mime_type")
        public Builder setMimeType(String mtype){
            this.MimeType = mtype;
            return this;
        }

        @JsonProperty("file_id")
        public Builder setFileId(String fileId){
            this.FileId = fileId;
            return this;
        }

        @JsonProperty("file_unique_id")
        public Builder setFileUniqueId(String uId){
            this.FileUniqueId = uId;
            return this;
        }

        @JsonProperty("file_size")
        public Builder setFileSize(String fSize){
            this.FileSize = fSize;
            return this;
        }

        @JsonProperty("duration")
        public Builder setDuration(Integer d){
            this.Duration = d;
            return this;
        }

        @JsonProperty("performer")
        public Builder setPerformer(String p){
            this.Performer = p;
            return this;
        }

        @JsonProperty("title")
        public Builder setTitle(String t){
            this.Title = t;
            return this;
        }

        // Build method to deal with outer class, return an instance
        // Of the outer class, with all the parameters set in the
        // builder returned with it
        public Audio build(){
            return new Audio(this);
        }
    }
}