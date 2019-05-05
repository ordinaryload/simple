package tk.mybatis.simple.mapper;

import tk.mybatis.simple.bean.SysUser;

import java.util.List;

public interface UserMapper {
    SysUser selectById(Long id);
    List<SysUser> selectAll();
}
