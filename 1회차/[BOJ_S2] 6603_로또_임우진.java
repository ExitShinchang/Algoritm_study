import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> inputList = new ArrayList<>();

        while(true) {
            String s = sc.nextLine();
            if (s.equals("0")) break;

            inputList.add(s);
        }

        for (String str : inputList) {
            String[] input = str.split(" ");
            int k = Integer.valueOf(input[0]);
            boolean[] visited = new boolean[k];
            String[] s = Arrays.copyOfRange(input, 1, input.length);
            combination(s, visited, k, 6, 0);
            System.out.println("");
        }
    }

    public static void combination(String[] s, boolean[] visited, int n, int r, int depth) {        
        if (r == 0) {
            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    System.out.print(s[i] + " ");
                }
            }
            System.out.print("\n");
            return;
        }

        if (depth == n) {
            return;
        }

        visited[depth] = true;
        combination(s, visited, n, r-1, depth+1);

        visited[depth] = false;
        combination(s, visited, n, r, depth+1);
    }
}
