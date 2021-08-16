package com.statefarm;

public class Application {
    public static void main(String[] args) {
        //System.out.println("hello world");
        if(args.length < 1) {
            System.out.println("Please specify a name and email");
       } else if (args.length == 1) {
           //System.out.println(args[0].length());
           System.out.println(String.format("Please specify an email for %s", (args[0])));
        }
           else {
            //System.out.println(args[0].length());
            System.out.println(String.format("%s <%s>", args[0], args[1]));
        }
    }
}
