package com.wang.ssm.pojo;

/**
 * @ClassName: Book
 * @Description
 * @Author:我自己
 * @Date: 2022/3/23  15:40
 * @Version 1.0
 */
public class Book {
    private Integer id;//图书编号
    private String name;//图书名字
    private String press;//图书出版社
    private String author;//作者

    public Book() {
    }

    public Book(Integer id, String name, String press, String author) {
        this.id = id;
        this.name = name;
        this.press = press;
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", press='" + press + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
