public Book() {
    this.id = UUID.randomUUID();
}

public Book(String title, String author, String isbn, boolean isAvailable) {
    this.id = UUID.randomUUID();
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    this.isAvailable = isAvailable;
}

// Getters and Setters
public UUID getId() { return id; }
public void setId(UUID id) { this.id = id; }
public String getTitle() { return title; }
public void setTitle(String title) { this.title = title; }
public String getAuthor() { return author; }
public void setAuthor(String author) { this.author = author; }
public String getIsbn() { return isbn; }
public void setIsbn(String isbn) { this.isbn = isbn; }
public boolean isAvailable() { return isAvailable; }
public void setAvailable(boolean available) { isAvailable = available; }