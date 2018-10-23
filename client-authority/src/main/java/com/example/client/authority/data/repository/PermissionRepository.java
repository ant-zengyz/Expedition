package com.example.client.authority.data.repository;

import com.example.client.authority.data.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 描述：
 * @author: 曾远征
 * @date: 2018-10-23
 * @time: 23:18
 */
public interface PermissionRepository extends JpaRepository<Permission,Long> {
}
