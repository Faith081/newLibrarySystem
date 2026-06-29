package models;

import abstracts.User;
import services.LibrarySystem;


public class Librarian extends User  {

  private LibrarySystem librarySystem;

    public Librarian(String name, int age, String email){

        super(name, age, email);
    }




}
