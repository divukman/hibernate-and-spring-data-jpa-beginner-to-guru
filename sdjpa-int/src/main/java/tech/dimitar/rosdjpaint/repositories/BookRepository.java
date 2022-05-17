package tech.dimitar.rosdjpaint.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.dimitar.rosdjpaint.domain.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
