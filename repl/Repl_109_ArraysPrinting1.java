package repl;

import java.util.Scanner;

public class Repl_109_ArraysPrinting1 {
    public static void main(String[] args) {

//        The code provided in your main method will take in five Strings and save them into an array called arr.
//        Print out the first three letter of each element of arr, one per line.  You can assume that every element of arr is at least 3 letters long.

//        Example:
//        arr -> ["apple", "banana"]
//        prints: app
//                ban
//


        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextLine();
        }
        //leave above alone! :)
        //assume you have String array of 5 items
        //write your code below

        for (int x = 0; x <arr.length ; x++) {


        System.out.println(arr[x].substring(0, 3));


    }
    }
        }


