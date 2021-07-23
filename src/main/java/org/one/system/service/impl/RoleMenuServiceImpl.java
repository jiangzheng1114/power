package org.one.system.service.impl;


import org.apache.commons.lang3.StringUtils;
import org.one.system.entity.Role;
import org.one.system.entity.RoleMenu;
import org.one.system.mapper.RoleMapper;
import org.one.system.mapper.RoleMenuMapper;
import org.one.system.service.RoleMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class RoleMenuServiceImpl  implements RoleMenuService {

    @Autowired
    private RoleMenuMapper roleMenuMapper;

    @Override
    public List<String> getRoleMenu(Map<String, Object> param) {
        return roleMenuMapper.getRoleMenu(param);
    }

    @Override
    public void delete(RoleMenu roleMenu) {
        roleMenuMapper.deleteByRoleId(roleMenu.getRoleId());
    }

    @Override
    public void save(List<RoleMenu> roleMenuList) {
        RoleMenu roleMenu=new RoleMenu();
        for(int i=0;i<roleMenuList.size();i++){
            roleMenu=roleMenuList.get(i);
            roleMenu.setId(UUID.randomUUID().toString().replaceAll("-",""));
            roleMenuMapper.insert(roleMenu);
        }
    }

}
