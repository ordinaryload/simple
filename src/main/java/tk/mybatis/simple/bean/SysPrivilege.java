package tk.mybatis.simple.bean;

public class SysPrivilege {
    private Long id;
    private String privilegeName;
    private String privilegeUrl;

    public Long getId() {
        return id;
    }

    public String getPrivilegeName() {
        return privilegeName;
    }

    public String getPrivilegeUrl() {
        return privilegeUrl;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPrivilegeName(String privilegeName) {
        this.privilegeName = privilegeName;
    }

    public void setPrivilegeUrl(String privilegeUrl) {
        this.privilegeUrl = privilegeUrl;
    }

}
