package com.example.common.base.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.io.Serializable;

/**
 * 描述：
 * @author: 曾远征
 * @date: 2018-10-21
 * @time: 0:25
 */
@Data
public class PagingBean implements Serializable {

    /**
     * 正序
     */
    public static final String ASC="ASC";
    /**
     * 倒序
     */
    public static final String DESC="DESC";

    /**
     * 当前页,分页从0开始，当前页是0就会查询第一页
     */
    protected Integer curPage = 0;

    /**
     * 每页数量
     */
    protected Integer pageSize = 10;

    /**
     * 排序字段
     */
    protected String orderBy = "id";

    /**
     * 升序 ASC / 降序 DESC
     */
    protected String xsc;

    @JsonIgnore
    public Pageable getPage() {
        Sort sort;

        if (PagingBean.ASC.equalsIgnoreCase(xsc)) {
            sort = new Sort(Sort.Direction.ASC, orderBy);
        } else {
            sort = new Sort(Sort.Direction.DESC, orderBy);
        }
        return PageRequest.of(curPage, pageSize, sort);
    }
}
