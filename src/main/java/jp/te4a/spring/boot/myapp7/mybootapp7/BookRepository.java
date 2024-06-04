package jp.te4a.spring.boot.myapp7.mybootapp7;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.springframework.stereotype.Repository;

@Repository //@RepositoryはDI(@Autowired)対象
public class BookRepository {

    private final ConcurrentMap<Integer, BookBean> bookMap
                                    = new ConcurrentHashMap<>();
    //保存用メソッド
    public BookBean save(BookBean bookBean) {
        return bookMap.put(bookBean.getId(), bookBean);
    }
    //削除用メソッド
    public void delete(Integer bookId) {
        bookMap.remove(bookId);
    }
    //(全件)取得用メソッド
    public List<BookBean> findAll() {
        return new ArrayList<>(bookMap.values());
    }

}