import java.util.*;

// 재귀로 풀어서 VSCODE 상에서는 올바른 출력이 나오나
// 백준 상으로는 틀렸다고 나온다.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] visited = new boolean[9];

        List<Integer> input = new ArrayList<>();
        for (int i = 0; i < 9; i ++) {
            input.add(Integer.valueOf(sc.nextLine()));
        }
        Collections.sort(input);

        combination(input, visited, 9, 7, 0);
    }

    public static void combination(List<Integer> input, boolean[] visited, int n, int r, int depth) {
        if (r == 0) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    sum += input.get(i);
                }
            }
            if (sum == 100) {
                for (int i = 0; i < n; i++) {
                    if (visited[i]) {
                        System.out.println(input.get(i));
                    }
                }
            }
            return;
        }
        
        if (depth == n) {
            return;
        }
        
        visited[depth] = true;
        combination(input, visited, n, r-1, depth+1);
        
        visited[depth] = false;
        combination(input, visited, n, r, depth+1);
    }
}
