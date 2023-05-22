package ua.com.course_library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.course_library.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
