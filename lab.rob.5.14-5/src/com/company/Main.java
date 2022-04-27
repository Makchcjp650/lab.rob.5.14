package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String firstLine, secondLine;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write first line : ");
        firstLine = scanner.nextLine();
        System.out.print("Write second line : ");
        secondLine = scanner.nextLine();
        if(firstLine.length() > secondLine.length()){
            System.out.print("First line has more number of characters");
        }
        if(secondLine.length() > firstLine.length()){
            System.out.print("Second line has more number of characters");
        }
        else{
            System.out.print("Line are same");
        }
    }
}
