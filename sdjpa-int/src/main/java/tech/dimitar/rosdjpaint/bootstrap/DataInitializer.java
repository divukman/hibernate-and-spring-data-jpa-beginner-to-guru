package tech.dimitar.rosdjpaint.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tech.dimitar.rosdjpaint.domain.Book;
import tech.dimitar.rosdjpaint.repositories.BookRepository;

@Component
public class DataInitializer implements CommandLineRunner {

    private final BookRepository bookRepository;

    public DataInitializer(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Book bookDDD = new Book("Domain Driven Design", "1234", "RandomHouse");
        bookDDD = bookRepository.save(bookDDD);

        Book bookSIA = new Book("Spring In Action", "234", "O'Riley");
        bookSIA = bookRepository.save(bookSIA);

        bookRepository.findAll().forEach(book -> {
            System.out.println("Book Id: " + book.getId());
            System.out.println("Book Title: " + book.getTitle());
        });
    }
}
