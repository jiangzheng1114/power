package org.one.system.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.one.system.entity.RoleMenu;

import java.util.List;
import java.util.Map;

@Mapper
public interface RoleMenuMapper {

    List<String> getRoleMenu(Map<String, Object> param);

    void deleteByRoleId(String id);

    void insert(RoleMenu roleMenu);
}
