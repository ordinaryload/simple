package tk.mybatis.simple.mapper;

import java.util.Date;

public class SysUser {
    private Long id;
    private String userName;
    private String userPassword;
    private String userEmail;
    private String userInfo;
    private byte[] headImg;
    private Date createTime;

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserInfo() {
        return userInfo;
    }

    public byte[] getHeadImg() {
        return headImg;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }

    public void setHeadImg(byte[] headImg) {
        this.headImg = headImg;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
