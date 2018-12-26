package lelab.couchdb.model;

import com.google.gson.annotations.SerializedName;

public class User {
    private String id;
    private String name;
    @SerializedName("phone_number")
    private String phoneNumber;
    @SerializedName("image_url")
    private String imageUrl;
    private String status;
    @SerializedName("is_active")
    private Boolean isActive;
    @SerializedName("Is_reported")
    private Boolean isReported;
    @SerializedName("is_blocked")
    private Boolean isBlocked;
    @SerializedName("created_at")
    private String createdAt;
    @SerializedName("updated_at")
    private String updatedAt;

    public User() {
    }

    public User(String id, String name, String phoneNumber, String imageUrl, String status, Boolean isActive, Boolean isReported, Boolean isBlocked, String createdAt, String updatedAt) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.imageUrl = imageUrl;
        this.status = status;
        this.isActive = isActive;
        this.isReported = isReported;
        this.isBlocked = isBlocked;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Boolean getReported() {
        return isReported;
    }

    public void setReported(Boolean reported) {
        isReported = reported;
    }

    public Boolean getBlocked() {
        return isBlocked;
    }

    public void setBlocked(Boolean blocked) {
        isBlocked = blocked;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
