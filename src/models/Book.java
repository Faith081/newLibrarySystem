package models;

public class Book {

        private String author;
        private String title;
        private String bookId;
        private int bookCopies;




        public Book(String author, String title, int bookCopies)
        {
            this.author = author;
            this.title = title;
            this.bookCopies = bookCopies;
        }


        public String getAuthor(){
            return author;
        }

        public  String getTitle(){
            return title;
        }

        public String getBookId(){
            return bookId;
        }

        public int getBookCopies(){
            return bookCopies;
        }





        public void setBookCopies(int bookCopies){
            this.bookCopies = bookCopies;
        }





        public void setBookId(String bookId){
            this.bookId = bookId;
        }



}
