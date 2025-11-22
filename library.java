
    class Book {
    
    private String title;
    private String author;
    private boolean isAvailable;

    
    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getAuthor() {
        return author;
    }


    public void setAuthor(String author) {
        this.author = author;
    }


    public boolean isAvailable() {
        return isAvailable;
    }


    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }


    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true; 
    }

    
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false; 
            System.out.println(title + " by " + author + " has been borrowed.");
        } else {
            System.out.println(title + " is not available right now");
        }
    }

    
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true; 
            System.out.println(title + " by " + author + " has been returned.");
        } else {
            System.out.println(title + " was not borrowed.");
        }
    }

    
    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Available: " + isAvailable);
    }

    
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James Gosling");

        b1.display();
        b1.borrowBook();
        b1.display();
        b1.returnBook();
        b1.display();
    }
}

    

