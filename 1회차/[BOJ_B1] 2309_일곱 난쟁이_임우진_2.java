import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        List<Integer> input = new ArrayList<>();
        for (int i = 0; i < 9; i ++) {
            int num = Integer.valueOf(sc.nextLine());
            input.add(num);
            sum += num;
        }
        Collections.sort(input);

        int interval = sum - 100;

        find(input, interval);
    }

    public static void find(List<Integer> input, int interval) {
        for (Integer n : input) {
            for (Integer m : input) {
                if (n == m) { continue; }
                if (n + m == interval) {
                    input.remove(n);
                    input.remove(m);

                    for (Integer l : input) {
                        System.out.println(l);
                    }
                    return;
                }
            }
        }
    }
}
