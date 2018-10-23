package com.example.client.authority.data.repository;

import com.example.client.authority.data.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 描述：
 * @author: 曾远征
 * @date: 2018-10-23
 * @time: 23:17
 */
public interface RoleRepository extends JpaRepository<Role,Long> {
}
