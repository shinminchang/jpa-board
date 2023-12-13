package hello.myporject.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Board {

    @GeneratedValue
    @Id
    private Long id;

    private String text;

    private String writer;

    public Board(String text, String writer){
        this.text = text;
        this.writer = writer;
    }
}