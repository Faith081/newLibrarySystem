package app;

import models.Book;
import models.Librarian;
import models.Member;
import services.LibrarianSystem;
import services.LibrarySystem;
import services.MemberService;

public class main {

    public  static void main(String[] args){


        MemberService memberService = new MemberService();

        LibrarySystem librarySystem = new LibrarySystem();

        LibrarianSystem librarianSystem = new LibrarianSystem();

        Book book = new Book("Kenny", "kk",  89);

        librarySystem.addBooks(book);

//        librarySystem.viewBooks();


        Member member = new Member("Habib", 34, "gfgghaj");

        memberService.addMember(member);
        memberService.viewMembers();


        Librarian librarian = new Librarian("jjj", 24, "uuiiii");


        librarianSystem.addLibrarian(librarian);

//        librarySystem.viewBooks();





    }

}
