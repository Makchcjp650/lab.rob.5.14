package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String scan1, scan2, scan3, scan4, scan5;
        Scanner scanner = new Scanner(System.in);
           System.out.print("print first word : ");
              scan1 = scanner.nextLine();
           System.out.print("print second word : ");
              scan2 = scanner.nextLine();
           System.out.print("print third word : ");
              scan3 = scanner.nextLine();
           System.out.print("print fourth word : ");
              scan4 = scanner.nextLine();
           System.out.print("print fifth word : ");
              scan5 = scanner.nextLine();

              System.out.println(scan1.substring(0,1));
              System.out.println(scan2.substring(0,1));
              System.out.println(scan3.substring(0,1));
              System.out.println(scan4.substring(0,1));
              System.out.println(scan5.substring(0,1));
    }
}
