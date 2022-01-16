public class Book {
    private String name;
    Author author;
    private double price;
    private int qtyInStock;

    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public void getAuthorDetails() {
        System.out.println("*****Author Info *****"
                + "\nAuthor: " + author.getName()
                + "\nGender: " + author.getGender()
                + "\nEmail: " + author.getEmail()
        );
    }
    public String getAuthorName() {
        return author.getName();
    }

    public char getAuthorGender() {
        return author.getGender();
    }

    public String getAuthorEmail(){
        return author.getEmail();
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    @Override
    public String toString() {
        return name + " by " + author;
    }
}


