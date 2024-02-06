package 알고리즘;

import java.util.*;

public class Main24445 {
    static int n;
    static int m;
    static int r;

    static int count = 1;
    static int[] visited;
    static List<List<Integer>> graph = new ArrayList<>();
    static Queue<Integer> queue = new LinkedList<>();

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
        
        for (int i = 1; i < n + 1; i++) {
            graph.get(i).sort(Comparator.reverseOrder());
        }
        
        bfs(r);

        for (int i = 1; i < n + 1; i++) {
            System.out.println(visited[i]);
        }
    }

    private static void bfs(int node) {
        queue.offer(node);
        visited[node] = count++;

        while(!queue.isEmpty()){
            int a = queue.poll();
            for(int num : graph.get(a)) {
                if (visited[num] != 0) continue;
                queue.add(num);
                visited[num] = count++;
            }
        }
    }
}
