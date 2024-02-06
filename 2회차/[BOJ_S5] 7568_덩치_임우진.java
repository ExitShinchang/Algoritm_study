import java.util.*;

public class Main7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = Integer.parseInt(sc.nextLine());
        List<Integer> weight = new ArrayList<>();
        List<Integer> height = new ArrayList<>();
        List<Integer> rank = new ArrayList<>();
 
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            weight.add(Integer.parseInt(input[0]));
            height.add(Integer.parseInt(input[1]));
            rank.add(0);
        }
 
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = 0; j < n; j++) {
                if(i == j) continue;
 
                if(weight.get(i) < weight.get(j) && height.get(i) < height.get(j)) {
                    count += 1;
                }
            }
            rank.set(i, count);
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(rank.get(i) + " ");
        }
    }
}
