package ua.klymenko.bookreviewer.entity;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "Book")
public class Book {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;
    private String bookName;
    private String bookAuthor;
    private String bookDescr;
    private int pagesNum;
}
