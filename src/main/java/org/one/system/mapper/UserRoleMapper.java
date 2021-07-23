package org.one.system.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.one.system.entity.UserRole;

import java.util.List;

@Mapper
public interface UserRoleMapper {
    void delete(String id);

    void save(UserRole userRole);
}
