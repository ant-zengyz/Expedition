package com.example.client.authority.data.repository;

import com.example.client.authority.data.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 描述：
 * @author: 曾远征
 * @date: 2018-10-23
 * @time: 23:16
 */
public interface UserRepository extends JpaRepository<User,Long> {

    Page<User> findAll(Specification<User> specification, Pageable pageable);
}
