package edu.joao.ex01;


public class App {
    public static void main(String[] args) throws Exception {

        String firstName = "Joao";
        String lastName = "Pitoli";
        String fullName = fullName(firstName, lastName);
        System.out.println(fullName);
        
    }
    public static String fullName(String firstName, String lastName){
        return firstName.concat(" ").concat(lastName);
    }




}
