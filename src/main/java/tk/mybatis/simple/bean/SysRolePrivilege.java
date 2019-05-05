package tk.mybatis.simple.bean;

public class SysRolePrivilege {
    private Long roleId;
    private Long privilegeId;

    public Long getRoleId() {
        return roleId;
    }

    public Long getPrivilegeId() {
        return privilegeId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public void setPrivilegeId(Long privilegeId) {
        this.privilegeId = privilegeId;
    }
}
