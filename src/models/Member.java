package models;

import abstracts.User;
import services.BookBorrowService;


public class Member extends User {

    private String memberId;


    private BookBorrowService bookBorrowService;



    public Member(String name,  int age, String email) {

        super(name, age, email);
    }




}
