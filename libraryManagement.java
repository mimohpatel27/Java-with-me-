
import java.util.ArrayList;
import java.util.Scanner;

class Book{
    String title;
    String author;
    String ISBN;
    boolean avilability;
    public Book(String title, String author, String ISBN,boolean avilability){
    this.author=author;
    this.title=title;
    this.ISBN=ISBN;
    this.avilability=avilability;
    }
}
class Library{
    ArrayList<Book> books;
    public Library(){
        books=new ArrayList();
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void removeBook(String ISBN){
        for(Book book:books){
            if(book.ISBN.equals(ISBN)){
                books.remove(book);
                break;
            }
        }
    }
    public void displayBooks(){
        for (Book book:books){
            System.out.println("author" + book.author);
            System.out.println("title"+book.title);
            System.out.println("ISBN"+book.ISBN);
            System.out.println("avilability"+book.avilability);
            System.out.println();
        }
    }
}  
class libraryManagement{
    public static void main(String[] args) {
        Scanner mimoh=new Scanner(System.in);
        Library library= new Library();
        while(true){
            System.out.println("1) Add Books");
            System.out.println("2) Remove Books");
            System.out.println("3) Display Books");
            System.out.println("4) Other Option");
            int choice=mimoh.nextInt();
            if(choice==1){
                mimoh.nextLine();
                System.out.print("Title :");
                String title=mimoh.nextLine();
                System.out.print("Author : ");
                String author=mimoh.nextLine();
                System.out.print("ISBN : ");
                String ISBN=mimoh.nextLine();
                System.out.print("avilability : ");
                boolean avilability=mimoh.nextBoolean();
                library.addBook(new Book(title, author, ISBN, avilability));
            } else if(choice==2){
                mimoh.nextLine();
                System.out.print("ISBN : ");
                String ISBN=mimoh.nextLine();
                library.removeBook(ISBN);
            } else if (choice==3){
                library.displayBooks();
            } else if(choice==4){
                System.out.println("Chal Nikal BSDK");
                break;
            }
        }
        mimoh.close();
    }
}  
