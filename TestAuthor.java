package com.company;

public class TestAuthor {
    public static void main(String[] args){
        TestAuthor ahTeck = new Author("Tan Ah Teck","teck@nowhere.com",'m');
    System.out.println(ahTeck);
    ahTeck.setEmail("teck@somewhere.com");
    System.out.println(ahTeck);
    System.out.println("name is: "+ ahTeck.getClass());
    System.out.println("email is: " + ahTeck.getClass());
    }
}
