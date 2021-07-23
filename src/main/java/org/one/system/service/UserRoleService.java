package org.one.system.service;


import org.one.system.entity.UserRole;

import java.util.List;

public interface UserRoleService  {
    void delete(String id);

    void save(UserRole userRole);
}
