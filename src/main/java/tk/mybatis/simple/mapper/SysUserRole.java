package tk.mybatis.simple.mapper;

public class SysUserRole {
    private Long userId;
    private Long roleId;

    public Long getUserId() {
        return userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
