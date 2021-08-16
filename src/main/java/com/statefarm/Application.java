package com.statefarm;

public class Application {
    public static void main(String[] args) {
        //System.out.println("hello world");
        if(args.length < 1) {
            System.out.println("Please provide an argument");
        } else {
            System.out.println(String.format("Arguments provided: %s %s", args[0], args[1]));
        }
    }
}
