package 알고리즘;

import java.util.*;

public class Main24479 {
    static int n;
    static int m;
    static int r;

    static int count = 1;
    static List<Integer> visited = new ArrayList<>();
    static List<List<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] input1 = sc.nextLine().split(" ");
        n = Integer.parseInt(input1[0]);
        m = Integer.parseInt(input1[1]);
        r = Integer.parseInt(input1[2]);

        for (int i = 0; i < n + 1; i ++) {
            graph.add(new ArrayList<>());
            visited.add(0);
        }

        for (int i = 0; i < m; i ++) {
            String[] input = sc.nextLine().split(" ");

            graph.get(Integer.parseInt(input[0])).add(Integer.parseInt(input[1]));
            graph.get(Integer.parseInt(input[1])).add(Integer.parseInt(input[0]));
        }
        
        for (int i = 1; i < n + 1; i++) {
            graph.get(i).sort(Comparator.naturalOrder());
        }
        
        
        dfs(r);

        for (int i = 1; i < n + 1; i++) {
            System.out.println(visited.get(i));
        }
    }

    private static void dfs(int node) {

        visited.set(node, count);

        for(int num : graph.get(node)) {
            if (visited.get(num) != 0) continue;
            count++;
            dfs(num);
        }
    }
}
