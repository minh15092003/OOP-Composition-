package com.company;

public class TestBook {
    public static void main(String[] args){
     Author ahTeck = new Author("Tan Ah Teck","ahTeck@somewher.com",'m');
     System.out.println(ahTeck);
     Book dummyBook = new Book("Java for dummies", ahTeck, 9.99,99);
     System.out.println(dummyBook);
     dummyBook.setPrice(8.88);
     dummyBook.setPrice(88);
     System.out.println("name is : "+ dummyBook.getName());
        System.out.println("name is : "+ dummyBook.getPrice());
        System.out.println("name is : "+ dummyBook.getQty());
        System.out.println("author is :" +dummyBook.getClass());
        System.out.println("author's email is: " + dummyBook.getEmail());
        System.out.println("author's gender is: " + dummyBook.getAuthor().getGender());
        Book moreDummyBook = new Book("Java for more dummies",new Author("Peter Lee","peter@nowher.com",'m'),19.99,8);
        System.out.println(moreDummyBook);
    }
}
