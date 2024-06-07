package jp.te4a.spring.boot.myapp8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//getter・setter自動生成
@AllArgsConstructor
@NoArgsConstructor//引数なしコンストラクタ自動生成
public class BookBean {
    Integer id ;
    String title;
    String writter;
    String publisher;
    Integer price;
}