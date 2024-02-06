package 알고리즘;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long s = sc.nextLong();
        long num = 0;
        long n = 1;

        while(true) {
            num += n++;
            if (num + n > s) {
                break;
            }
        }

        System.out.println(n-1);
    }
}
