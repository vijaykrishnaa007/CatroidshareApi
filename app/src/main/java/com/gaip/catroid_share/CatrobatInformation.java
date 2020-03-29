package com.gaip.catroid_share;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CatrobatInformation {

    @SerializedName("BaseUrl")
    @Expose
    private String baseUrl;
    @SerializedName("TotalProjects")
    @Expose
    private Integer totalProjects;
    @SerializedName("ProjectsExtension")
    @Expose
    private String projectsExtension;

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public Integer getTotalProjects() {
        return totalProjects;
    }

    public void setTotalProjects(Integer totalProjects) {
        this.totalProjects = totalProjects;
    }

    public String getProjectsExtension() {
        return projectsExtension;
    }

    public void setProjectsExtension(String projectsExtension) {
        this.projectsExtension = projectsExtension;
    }

}
class CatrobatProject {

    @SerializedName("ProjectId")
    @Expose
    private String projectId;
    @SerializedName("ProjectName")
    @Expose
    private String projectName;
    @SerializedName("ProjectNameShort")
    @Expose
    private String projectNameShort;
    @SerializedName("Author")
    @Expose
    private String author;
    @SerializedName("Description")
    @Expose
    private String description;
    @SerializedName("Version")
    @Expose
    private String version;
    @SerializedName("Views")
    @Expose
    private Integer views;
    @SerializedName("Downloads")
    @Expose
    private Integer downloads;
    @SerializedName("Private")
    @Expose
    private Boolean _private;
    @SerializedName("Uploaded")
    @Expose
    private Integer uploaded;
    @SerializedName("UploadedString")
    @Expose
    private String uploadedString;
    @SerializedName("ScreenshotBig")
    @Expose
    private String screenshotBig;
    @SerializedName("ScreenshotSmall")
    @Expose
    private String screenshotSmall;
    @SerializedName("ProjectUrl")
    @Expose
    private String projectUrl;
    @SerializedName("DownloadUrl")
    @Expose
    private String downloadUrl;
    @SerializedName("FileSize")
    @Expose
    private Double fileSize;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectNameShort() {
        return projectNameShort;
    }

    public void setProjectNameShort(String projectNameShort) {
        this.projectNameShort = projectNameShort;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getDownloads() {
        return downloads;
    }

    public void setDownloads(Integer downloads) {
        this.downloads = downloads;
    }

    public Boolean getPrivate() {
        return _private;
    }

    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    public Integer getUploaded() {
        return uploaded;
    }

    public void setUploaded(Integer uploaded) {
        this.uploaded = uploaded;
    }

    public String getUploadedString() {
        return uploadedString;
    }

    public void setUploadedString(String uploadedString) {
        this.uploadedString = uploadedString;
    }

    public String getScreenshotBig() {
        return screenshotBig;
    }

    public void setScreenshotBig(String screenshotBig) {
        this.screenshotBig = screenshotBig;
    }

    public String getScreenshotSmall() {
        return screenshotSmall;
    }

    public void setScreenshotSmall(String screenshotSmall) {
        this.screenshotSmall = screenshotSmall;
    }

    public String getProjectUrl() {
        return projectUrl;
    }

    public void setProjectUrl(String projectUrl) {
        this.projectUrl = projectUrl;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public Double getFileSize() {
        return fileSize;
    }

    public void setFileSize(Double fileSize) {
        this.fileSize = fileSize;
    }

}
class appdetails {

    @SerializedName("CatrobatProjects")
    @Expose
    private List<CatrobatProject> catrobatProjects = null;
    @SerializedName("completeTerm")
    @Expose
    private String completeTerm;
    @SerializedName("preHeaderMessages")
    @Expose
    private String preHeaderMessages;
    @SerializedName("CatrobatInformation")
    @Expose
    private CatrobatInformation catrobatInformation;

    public List<CatrobatProject> getCatrobatProjects() {
        return catrobatProjects;
    }

    public void setCatrobatProjects(List<CatrobatProject> catrobatProjects) {
        this.catrobatProjects = catrobatProjects;
    }

    public String getCompleteTerm() {
        return completeTerm;
    }

    public void setCompleteTerm(String completeTerm) {
        this.completeTerm = completeTerm;
    }

    public String getPreHeaderMessages() {
        return preHeaderMessages;
    }

    public void setPreHeaderMessages(String preHeaderMessages) {
        this.preHeaderMessages = preHeaderMessages;
    }

    public CatrobatInformation getCatrobatInformation() {
        return catrobatInformation;
    }

    public void setCatrobatInformation(CatrobatInformation catrobatInformation) {
        this.catrobatInformation = catrobatInformation;
    }

}