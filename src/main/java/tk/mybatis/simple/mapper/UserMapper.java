package tk.mybatis.simple.mapper;

import tk.mybatis.simple.bean.SysRole;
import tk.mybatis.simple.bean.SysUser;

import java.util.List;

public interface UserMapper {
    SysUser selectById(Long id);
    List<SysUser> selectAll();
    List<SysRole> selectRolesByUserId(Long userId);
}
