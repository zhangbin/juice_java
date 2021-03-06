package cn.wufan.juice.mapper;

import cn.wufan.juice.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * Created by zhangbin on 2017/7/21.
 */
@Mapper
public interface UserRoleMapper {

    public List<Role> findRolesByUser(Long userId);

    public int saveRole(Role role);

    public int save(@Param("userId") Long userId, @Param("roleId") Long roleId);

}
