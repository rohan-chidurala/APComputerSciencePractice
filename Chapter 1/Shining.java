/*
Write a program in a class named Shining that prints the following line of output 1000 times:

All work and no play makes Jack a dull boy.
You should not write a program whose source code is 1000 lines long. Instead, use methods to shorten the program. You must not type (or paste) more than 25 calls to System.out.println (or System.out.print), must not type a super-long line of text with lots of \n escape caharacters, and must not use any material outside of Chapter 1. Remember, you're trying to break down the work by using methods, and calling them in clever ways.

Challenge: What is the shortest program you can write that will produce the 1000 lines of output, using only the material from Chapter 1 (println, methods, etc.)?
*/

public class Shining {
    public static void main(String[] args){
        thousands();
    }
    
    public static void ten() {
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
    }
    
    public static void hundreds() {
        ten();
        ten();
        ten();
        ten();
        ten();
        ten();
        ten();
        ten();
        ten();
        ten();
    }
    
    public static void thousands(){
        hundreds();
        hundreds();
        hundreds();
        hundreds();
        hundreds();
        hundreds();
        hundreds();
        hundreds();
        hundreds();
        hundreds();
    }
}