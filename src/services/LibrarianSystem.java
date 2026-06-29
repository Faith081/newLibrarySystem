package services;

import models.Librarian;
import models.Member;
import utils.IdGenerator;

import java.util.ArrayList;

public class LibrarianSystem {


    IdGenerator idGenerator = new IdGenerator();

    ArrayList<Librarian> librarians = new ArrayList<>();



    public void viewLibrarian(Librarian librarian){

        System.out.println(
                "name: " + librarian.getName() +", " +
                        "email: " + librarian.getEmail() +  ", " +
                        "userId: " +  librarian.getId() + ", "
                        +  " Member viewed successfully");
    }




    public void addLibrarian(Librarian librarian){

        String id = idGenerator.generateLibrarianId();

        librarian.setMemberId(id);

        librarians.add(librarian);

        System.out.println("name: " + librarian.getName() +", " +
                "email: " + librarian.getEmail() +  ", " +
                "userId: " +  librarian.getId() + ", "
                +  " Member viewed successfully");

    }



    public void update(String name, String email,int age){
        for(Librarian librarian :librarians){
            if(librarian.getName().equals(name)){
                librarian.setName(name);
                librarian.setEmail(email);
                librarian.setAge(age);


                System.out.println(librarian.getName() + ","
                        + librarian.getEmail() + ", "
                        + librarian.getId() + ", "
                        + " updated successfully");

            }
        }
    }










}




