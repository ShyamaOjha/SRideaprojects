public abstract class Item {
    private String title;
    private boolean checkedOut;

    public Item(String title) {
        this.title = title;
        this.checkedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void checkOut() {
        this.checkedOut = true;
    }

    public void returnItem() {
        this.checkedOut = false;
    }
}

class Book extends Item {
    private String author;
    private int numberOfPages;

    public Book(String title, String author, int numberOfPages) {
        super(title);
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}

class DVD extends Item {
    private String director;
    private int runtime;

    public DVD(String title, String director, int runtime) {
        super(title);
        this.director = director;
        this.runtime = runtime;
    }

    public String getDirector() {
        return director;
    }

    public int getRuntime() {
        return runtime;
    }
}

