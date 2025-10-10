class Book {
    String title;
    String author;
    float price;

    Book() {
        title = "Rich dad poor dad";
        author = "sanjay";
        price = 4500;
    }

    void display() {
        System.out.println("Title : " + title + "\nAuthor : " + author + "\nPrice : " + price);
    }

}


public class Book_Shop {
    public static void main(String[] args) {

        Book b1 = new Book();

        b1.display();
    }
}
