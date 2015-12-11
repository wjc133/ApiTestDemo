package com.elite.api.dao.mapper;

import com.elite.api.dao.domain.News;

/**
 * Created by wjc133
 * Date: 2015/12/11
 * Time: 15:37
 */
public interface NewsMapper {
    News selectByPrimaryKey(Long id);
}
