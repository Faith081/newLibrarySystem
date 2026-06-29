package abstracts;

public  abstract class User {


        private String name;
        private String id;
        private int age;
        private String email;


        public User(String name, int age, String email){
            this.name = name;
            this.age = age;
            this.email = email;
        }


        public String getName(){
            return name;
        }

        public String getId(){
            return id;
        }

        public int getAge() {
            return age;
        }

        public String getEmail() {
            return email;
        }



        public void setName(String newName){
            this.name = newName;
        }


        public void setAge(int newAge){
            this.age = newAge;
        }



        public void setEmail(String newEmail){
            this.email = newEmail;
        }


    public void setMemberId(String id){
        this.id = id;
    }




}


