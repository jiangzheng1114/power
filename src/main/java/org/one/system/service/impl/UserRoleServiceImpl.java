package org.one.system.service.impl;

import org.one.system.entity.UserRole;
import org.one.system.mapper.UserRoleMapper;
import org.one.system.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public void delete(String id) {
        userRoleMapper.delete(id);
    }

    @Override
    public void save(UserRole userRole) {
        userRoleMapper.save(userRole);
    }
}
