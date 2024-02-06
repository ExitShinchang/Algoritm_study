import java.util.*;

public class Main10828 {
    private static int[] stack = new int[10000];
    private static int size = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalLine = Integer.parseInt(sc.nextLine());
        
        for (int i = 0; i < totalLine; i++) {
            String[] input = sc.nextLine().split(" ");

            switch (input[0]) {
                case "push":
                    push(Integer.parseInt(input[1]));
                    break;
                case "pop":
                    System.out.println(pop());
                    break;
                case "size":
                    System.out.println(size());
                    break;
                case "empty":
                    System.out.println(empty());
                    break;
                case "top":
                    System.out.println(top());
                    break;
            }
        }
    }

    private static void push(int item) {
        stack[size++] = item;
    }

    private static int pop() {
        int num = top();
        if (num != -1) {
            size--;
        }
        return num;
    }

    private static int size() {
        return size;
    }

    private static int empty() {
        return size == 0 ? 1 : 0;
    }

    private static int top() {
        return empty() == 1 ? -1 : stack[size - 1];
    }
}
