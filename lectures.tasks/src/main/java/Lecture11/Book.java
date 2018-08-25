package Lecture11;

public class Book {

    private final String name;
    private final String description;
    private Long id;

    public Book(String name, String description){
        this.name=name;
        this.description=description;
    }

    public Book(String name, String description, long id){
        this.name=name;
        this.description=description;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Long getId() {
        return id;
    }
}
