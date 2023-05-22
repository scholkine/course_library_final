package ua.com.course_library.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "stored_books")
public class ReadingHall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long abonenment_id;
    @OneToMany(mappedBy = "stored")
    private List<Book> bookList;
}
