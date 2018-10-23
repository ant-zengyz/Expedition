package com.example.client.authority.web.service.specification;


import com.example.client.authority.data.entity.User;
import com.example.common.domain.dto.authority.ReqUserDto;
import org.apache.commons.lang.StringUtils;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;

/**
 * 描述：
 * User: 曾远征
 * Date: 2018-10-21
 * Time: 10:39
 */
public class UserSpecification {

    public static Specification<User> buildFromDTO(ReqUserDto dto) {
        return (root, query, builder) -> {

            ArrayList<Predicate> list = new ArrayList<>();

            if (StringUtils.isNotBlank(dto.getUsername())) {
                list.add(builder.like(root.get("username"), "%" + dto.getUsername()+ "%"));
            }

            Predicate[] predicates = new Predicate[list.size()];
            predicates = list.toArray(predicates);

            return builder.and(predicates);
        };
    }
}
