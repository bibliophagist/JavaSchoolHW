package Lecture11;

import java.util.Optional;

public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book saveNewBook(String name, String description){
        Optional<Book> existedBook = bookRepository.findByName(name);
        if (existedBook.isPresent()) {
            throw new IllegalArgumentException("Book already exists");
        }

        return bookRepository.persist(new Book(name,description));
    }
}
