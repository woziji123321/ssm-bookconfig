import com.wang.ssm.pojo.Book;
import com.wang.ssm.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName: BookServiceTest
 * @Description
 * @Author:我自己
 * @Date: 2022/3/23  16:30
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-service.xml",
        "classpath:application-dao.xml"})
public class BookServiceTest {
    @Autowired
    private BookService bookService;

    @Test
    public void testFindBookById() {
        Book book = bookService.findBookById(1);
        System.out.println("book = " + book);
    }
}
