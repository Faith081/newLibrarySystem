package services;

import models.Member;
import utils.IdGenerator;

import java.util.ArrayList;

public class MemberService {

    IdGenerator idGenerator = new IdGenerator();

    ArrayList<Member> members = new ArrayList<>();



    public void addMember(Member member){
        String memberId = idGenerator.generateMemberId();

        member.setMemberId(memberId);

        members.add(member);

        System.out.println("name: " + member.getName() +", " +
                "email: " + member.getEmail() +  ", " +
                "userId: " +  member.getId() + ", "+  " Member added successfully");
    }


    public void removeMember(String memberId){
        for(Member member: members){
            if(member.getId().equals(memberId)){
                members.remove(member);

                System.out.println("Member removed successfully");
            }
        }

        System.out.println("Member not found");
    }



    public void viewMembers(){
        for (Member member : members){
            System.out.println(member.getName() + ", "
                    + member.getId() + ", "
                    + member.getEmail() + ", "
                    + " member retrieved successfully");

        }
    }


    public void updateMembers(String name, String email, int age){
        for(Member member : members){

            if(member.getName().equals(name)){
                member.setName(name);
                member.setEmail(email);
                member.setAge(age);


                System.out.println(member.getName() + ", "
                        + member.getEmail() + ","
                        + "member updated successfully");
            }

        }
    }


}
