package jp.te4a.spring.boot.myapp10.mybootapp10;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Entity
@Table(name = "books")
@Data//getter・setter自動生成
@AllArgsConstructor
@NoArgsConstructor
public class BookBean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id ;
        private String title;
        private String writter;
        private String publisher;
        private Integer price;
}