package jp.te4a.spring.boot.myapp8;

import lombok.Data;
import lombok.NoArgsConstructor;

//・BookBean：DB（テーブル）と連動
//・BookForm：画面と連動

@Data
@NoArgsConstructor
public class BookForm {
private Integer id ;
private String title;
private String writter;
private String publisher;
private Integer price;
}
