package jp.te4a.spring.boot.myapp9.mybootapp9;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;
    //追加処理
    public BookForm save(BookForm bookForm) {
        BookBean bookBean = new BookBean();
        BeanUtils.copyProperties(bookForm, bookBean);
        bookRepository.save(bookBean);
        return bookForm;
    }
    //更新処理
    public BookForm update(BookForm bookForm) {
        BookBean bookBean = new BookBean();
        BeanUtils.copyProperties(bookForm, bookBean);
        bookRepository.save(bookBean);
        return bookForm;
    }
       
    //削除処理
    public void delete(Integer id) { bookRepository.deleteById(id); }
    //取得処理(全件)
    public List<BookForm> findAll() {
            List<BookBean> beanList = bookRepository.findAll();
            List<BookForm> formList = new ArrayList<BookForm>();
        for(BookBean bookBean: beanList) {
                BookForm bookForm = new BookForm();
                BeanUtils.copyProperties(bookBean, bookForm);
                formList.add(bookForm);
        }
        return formList;
    }
    //取得処理(1件)
    public BookForm findOne(Integer id) {
        Optional<BookBean> opt = bookRepository.findById(id);
        BookForm bookForm = new BookForm();
        opt.ifPresent(Book ->{
            BeanUtils.copyProperties(opt.get(), bookForm);
        });
 
        return bookForm;
    }
    
    
}