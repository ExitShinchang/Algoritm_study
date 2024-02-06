package 알고리즘;

import java.util.*;

public class Main24480 {
    static int n;
    static int m;
    static int r;

    static int count = 1;
    static int[] visited;
    static List<List<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] input1 = sc.nextLine().split(" ");
        n = Integer.parseInt(input1[0]);
        m = Integer.parseInt(input1[1]);
        r = Integer.parseInt(input1[2]);

        visited = new int[n+1];
        for (int i = 0; i < n + 1; i ++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i ++) {
            String[] input = sc.nextLine().split(" ");

            graph.get(Integer.parseInt(input[0])).add(Integer.parseInt(input[1]));
            graph.get(Integer.parseInt(input[1])).add(Integer.parseInt(input[0]));
        }
        
        dfs(r);

        for (int i = 1; i < n + 1; i++) {
            System.out.println(visited[i]);
        }
    }

    private static void dfs(int node) {

        visited[node] = count;

        graph.get(node).sort(Comparator.reverseOrder());

        for(int num : graph.get(node)) {
            if (visited[num] != 0) continue;
            count++;
            dfs(num);
        }
    }
}
