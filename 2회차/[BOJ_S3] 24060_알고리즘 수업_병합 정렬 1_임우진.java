package 알고리즘;

import java.util.*;

public class Main24060 {
    private static int[] a;
    private static int[] temp;
    private static int n;
    private static int k;
    private static int count = 0;
    private static int result = -1;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input1 = sc.nextLine().split(" ");
        n = Integer.parseInt(input1[0]);
        k = Integer.parseInt(input1[1]);
        temp = new int[n];

        String[] input2 = sc.nextLine().split(" ");
        a = new int[input2.length];
        for (int i = 0; i < input2.length; i++) {
            a[i] = Integer.parseInt(input2[i]);
        }

        mergeSort(a, 0, n-1);

        System.out.println(result);
    }

    private static void mergeSort(int[] a, int p, int r) {
        if (count > k) return;

        if (p < r) {
            int q = (p+r)/2;
            mergeSort(a, p, q);
            mergeSort(a, q+1, r);
            merge(a, p, q, r);
        }
    }

    private static void merge(int[] a, int p, int q, int r) {
        int i = p;
        int j = q+1;
        int index = 0;

        while (i <= q && j <= r) {
            if (a[i] < a[j]) {
                temp[index++] = a[i++];
            }
            else {
                temp[index++] = a[j++];
            }
        }

        while (i <= q) {
            temp[index++] = a[i++]; 
        }

        while (j <= r) {
            temp[index++] = a[j++];
        }
        
        i = p;
        index = 0;

        while (i <= r) {
            if (++count == k) {
                result = temp[index];
                break;
            }

            a[i++] = temp[index++];
        }
    }
}
