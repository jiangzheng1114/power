package org.one.system.service;


import org.one.system.entity.Role;
import org.one.system.entity.RoleMenu;

import java.util.List;
import java.util.Map;

public interface RoleMenuService  {

    List<String> getRoleMenu(Map<String, Object> param);

    void delete(RoleMenu roleMenu);

    void save(List<RoleMenu> roleMenuList);

}
