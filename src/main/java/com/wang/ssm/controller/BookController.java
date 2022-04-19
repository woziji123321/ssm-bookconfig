package com.wang.ssm.controller;

import com.wang.ssm.pojo.Book;
import com.wang.ssm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


/**
 * @ClassName: BookController
 * @Description
 * @Author:我自己
 * @Date: 2022/3/23  16:03
 * @Version 1.0
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;


    @RequestMapping("/book/{id}")
    public ModelAndView findBookById(@PathVariable("id") Integer id) {
        Book book = bookService.findBookById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("book");
        modelAndView.addObject("book", book);
        return modelAndView;
    }
}
