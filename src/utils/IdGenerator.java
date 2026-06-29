package utils;

public class IdGenerator {
     private int countBook = 0;
     private int countMember = 0;
     private int countLibrarian = 0;


     public String generateBookId(){
         countBook++;
         return "Book" + String.format("%03d", countBook);
     }


     public String generateMemberId(){
         countMember++;
         return "MEM" + String.format("%03d", countMember);
     }



     public String generateLibrarianId(){
         countLibrarian++;
         return "LIB" + String.format("%03d" , countLibrarian);
     }



}
