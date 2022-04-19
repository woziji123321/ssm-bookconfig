package com.wang.ssm.mapper;

import com.wang.ssm.pojo.Book;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: BookMapper
 * @Description
 * @Author:我自己
 * @Date: 2022/3/23  15:49
 * @Version 1.0
 */
public interface BookMapper {
    Book findBookById(Integer id);
}
