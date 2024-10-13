

import java.util.Scanner;

import target.Solution12;

import java.io.*;

public class test_12 {
    public static void main(String[] args) throws IOException {
        Solution12 worker = new Solution12();
        String x,y;

        Scanner scanner = new Scanner(System.in);
        x = scanner.next();
        y = scanner.next();
        System.out.println( worker.multiply(x, y));
        scanner.close();
    }
}