package services;

import interfaces.Borrowable;
import models.Book;
import java.util.ArrayList;

public class BookBorrowService implements Borrowable  {


    ArrayList<Book> borrwededBook = new ArrayList<>();



    @Override
    public void borrowBook(Book book ){
     if(book.getBookCopies()> 0){
         int currentCopies = book.getBookCopies();

         currentCopies--;

         book.setBookCopies(currentCopies);
         borrwededBook.add(book);

         System.out.println(book.getTitle() + "book borrowed successfully");
         System.out.println(book.getBookCopies()+ "Remaining");

     }else{

         System.out.println(book.getTitle() + "book not available");
     }
    }



    @Override
    public void returnBook(Book book){

      if(borrwededBook.contains(book)){
          int currentCopies = book.getBookCopies();
          currentCopies++;

          book.setBookCopies(currentCopies);

          System.out.println(book.getTitle() + "book returned successfully");
          System.out.println(book.getBookCopies() + "returned sucessfully");
      }




    }

}
