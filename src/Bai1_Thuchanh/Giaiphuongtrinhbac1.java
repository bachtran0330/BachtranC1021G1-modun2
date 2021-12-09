package Bai1_Thuchanh;

import java.util.Scanner;

public class Giaiphuongtrinhbac1 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print(" nhap a:");
       int a = scanner.nextInt();
       System.out.print("nhap b:");
       int b = scanner.nextInt();
       System.out.print("nhap c:");
       int c = scanner.nextInt();
        if (a!=0){
           int nghiem = (c-b)/a;
            System.out.printf("Equation pass with x = %f!\n", nghiem);
        } else {
            if (b==c){
                System.out.print("vo so nghiem");
            }else {
                System.out.print("vô nghiệm");
            }

       }

    }
}
