package 알고리즘;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution("333222111", 4));
    }

    public static String solution(String number, int k) {
        StringBuilder result = new StringBuilder();

        while(k > 0) {
            if (number.length() == k) {
                number = "";
                break;
            }
            String[] temp = number.substring(0, k+1).split("");
            Arrays.sort(temp, Collections.reverseOrder());
            int index = number.indexOf(temp[0]);
            number = number.substring(index + 1);
            result.append(temp[0]);
            k -= index;
        }

        result.append(number);
        return result.toString();
    }
}
