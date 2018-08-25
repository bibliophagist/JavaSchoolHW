package Lecture11;

import java.util.Optional;

public interface BookRepository {
    Book loadByid(long idd);
    Optional<Book> findByName(String name);
    Book persist(Book book);
    void update(Book book);
}
