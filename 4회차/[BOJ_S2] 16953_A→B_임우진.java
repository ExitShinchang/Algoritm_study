package 알고리즘;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        int count = 0;

        while(b != a) {
            if (b < a) {
                count = -2;
                break; 
            }

            if (b % 2 == 0) {
                b /= 2;
                count++;
            }

            else if (b % 10 == 1) {
                b /= 10;
                count++;
            }

            else {
                count = -2;
                break;                
            }
        }

        System.out.println(count + 1);
    }
}
