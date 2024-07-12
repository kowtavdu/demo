package com.example.demo;

class Animal {
    private String makeSound(){
        return "wof wof";
    }
}
class Cat extends Animal {
    private String makeSound(){
        return "meow meow";
    }
}
public class MyTest {

    public static void main(String[] args) {

        Animal m = new Animal();

        //System.out.println("Hello this testing "+m.);
    }
}
