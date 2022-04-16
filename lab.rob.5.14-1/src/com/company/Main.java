package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String scan1, scan2, scan3, scan4, scan5;
        Scanner scanner = new Scanner(System.in);
           System.out.print("print your first world : ");
              scan1 = scanner.nextLine();
           System.out.print("print your second world : ");
              scan2 = scanner.nextLine();
           System.out.print("print your third world : ");
              scan3 = scanner.nextLine();
           System.out.print("print your fourth world : ");
              scan4 = scanner.nextLine();
           System.out.print("print your fifth world : ");
              scan5 = scanner.nextLine();
                 System.out.print(scan1.concat(' ' + scan2).concat(' ' + scan3).concat(' ' + scan4).concat(' ' + scan5));
    }
}
