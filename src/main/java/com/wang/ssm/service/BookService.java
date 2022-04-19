package com.wang.ssm.service;

import com.wang.ssm.pojo.Book;
import org.springframework.stereotype.Service;

/**
 * @ClassName: BookService
 * @Description
 * @Author:我自己
 * @Date: 2022/3/23  15:57
 * @Version 1.0
 */
public interface BookService {
    Book findBookById(Integer id);
}
