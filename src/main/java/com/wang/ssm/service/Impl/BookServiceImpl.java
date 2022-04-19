package com.wang.ssm.service.Impl;

import com.wang.ssm.mapper.BookMapper;
import com.wang.ssm.pojo.Book;
import com.wang.ssm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: BookServiceImpl
 * @Description
 * @Author:我自己
 * @Date: 2022/3/23  15:57
 * @Version 1.0
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    public Book findBookById(Integer id) {
        return bookMapper.findBookById(id);
    }
}
