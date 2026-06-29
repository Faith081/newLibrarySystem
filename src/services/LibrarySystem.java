package services;

import abstracts.User;
import models.Book;
import utils.IdGenerator;

import java.util.ArrayList;

public class LibrarySystem {


    IdGenerator idGenerator = new IdGenerator();




     private final ArrayList<Book> books = new ArrayList<>();



     public void addBooks(Book book){
         String bookId = idGenerator.generateBookId();


         book.setBookId(bookId);

         books.add(book);

         System.out.println("title:"  + book.getTitle() +
                        ", " + "bookId:"  + book.getBookId() + ", "
                         + "Number of bookCopies:" + book.getBookCopies() + ", "+
                         "Author:" + book.getAuthor() + ", " + " " +
                         " Book added successfully"
         );
     }




     public void updateBook(int newBookCopies, String bookId){
         for(Book book: books){
             if(book.getBookId().equals(bookId)){
                 book.setBookCopies(newBookCopies);
                 System.out.println("updated sucessfully");
                 return;
             }

         }

         System.out.println("book not found");

     }



     public  void viewBooks(){
         for(Book book: books){
             System.out.println(book.getTitle());
         }

     }




     public  void removeBook(String bookId){
         for(Book book: books){
             if(book.getBookId().equals(bookId)){

                 books.remove(book);
                 System.out.println("book removed successfully");
                 return;

             }

         }

         System.out.println("Book not found");
     }

}
