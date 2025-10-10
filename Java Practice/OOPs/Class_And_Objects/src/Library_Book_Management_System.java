import java.util.Scanner;

class Library{
    String name;
    int year;
    int copies;
    String author;

    void details(){
        System.out.println("Name : "+name+"\nAuthor : "+author+"\nYear : "+year+"\nCopies Remaining : "+copies);
    }

    void borrow(){
        if (copies > 0){
            copies-=1;
            System.out.println("Successfully borrowed.\nCopies remaining : "+copies);
        }else {
            System.out.println("No book left. !sorry");
        }
    }

    void return_book(){
        copies+=1;
        System.out.println("Thanks for returning.\nCopies remaining : "+copies);
    }
}

public class Library_Book_Management_System {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Library book_1 = new Library();
        Library book_2 = new Library();
        Library book_3 = new Library();


        book_1.name = "Rich dad Poor dad";
        book_1.author = "Robert T. Kiyosaki";
        book_1.year = 1997;
        book_1.copies = 5;

        book_2.name = "Secrets";
        book_2.author = "Sanjay";
        book_2.year = 2020;
        book_2.copies = 10;

        book_3.name = "The scares";
        book_3.author = "Sriram";
        book_3.year = 2015;
        book_3.copies = 8;

        int op;

        do {
            System.out.println("----- Welcome to Library -----");

            System.out.println("Choose your option : ");
            System.out.println();
            System.out.println("1.Book details\n2.Borrow a book\n3.Return a book\n4.Exit");
            op = in.nextInt();
            in.nextLine();

            switch (op){
                case 1:
                    System.out.println("Search the book : ");
                    String book = in.nextLine();

                    if (book.equalsIgnoreCase(book_1.name)){
                        book_1.details();
                    } else if (book.equalsIgnoreCase(book_2.name)) {
                        book_2.details();
                    } else if (book.equalsIgnoreCase(book_3.name)) {
                        book_3.details();
                    }else {
                        System.out.println("We don't have that book.");
                    }
                    break;
                case 2:
                    System.out.println("Book name : ");
                    String br_book = in.nextLine();

                    if (br_book.equalsIgnoreCase(book_1.name)) {
                        book_1.borrow();
                    } else if (br_book.equalsIgnoreCase(book_2.name)) {
                        book_2.borrow();
                    } else if (br_book.equalsIgnoreCase(book_3.name)) {
                        book_3.borrow();
                    }else {
                        System.out.println("We don't have that book.");
                    }
                    break;
                case 3:
                    System.out.println("Book name : ");
                    String re_book = in.nextLine();

                    if (re_book.equalsIgnoreCase(book_1.name)) {
                        book_1.return_book();
                    } else if (re_book.equalsIgnoreCase(book_2.name)) {
                        book_2.return_book();
                    } else if (re_book.equalsIgnoreCase(book_3.name)) {
                        book_3.return_book();
                    }else {
                        System.out.println("We don't have that book.");
                    }
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;


            }
        }while (op != 4);
    }
}
