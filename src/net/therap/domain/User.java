package net.therap.domain;


import java.util.Date;



public class User {

    private int id;
    private String userName;
    private String password;
    private int admin;

    private String confirmPassword;
    private String fullName;
    private String phoneNumber;
    private int version;

    private Date createDate;
    private Date lastUpdateDate;
    private boolean deleted;

    public User() {
    }


    public User(String userName, String password, int admin, int id) {
        this.userName = userName;
        this.password = password;
        this.admin = admin;
        this.id = id;
    }

    public int getId() {

        return id;
    }

    private void setId(int id) {
        this.id = id;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    private int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }


    public int isAdmin() {
        return admin;
    }

    public void setAdmin(int admin) {
        this.admin = admin;
    }


    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }


    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }


    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
