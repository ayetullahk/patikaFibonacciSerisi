package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisi eleman sayısını girin: ");
        int n = input.nextInt();

        int k1 = 0;
        int k2 = 1;

        System.out.print("Fibonacci Serisi: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(k1 + " ");

            int k3 = k1 + k2;
            k1 = k2;
            k2 = k3;
        }
    }
}