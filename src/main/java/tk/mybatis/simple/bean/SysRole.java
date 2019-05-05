package tk.mybatis.simple.bean;

import javax.xml.crypto.Data;

public class SysRole {
    private Integer id;
    private String roleName;
    private Integer enabled;
    private Long createBy;
    private Data createTime;

    public Integer getId() {
        return id;
    }

    public String getRoleName() {
        return roleName;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public Data getCreateTime() {
        return createTime;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public void setCreateTime(Data createTime) {
        this.createTime = createTime;
    }
}
