import java.util.*;

class Solution {
    public int[] solution(int[] sequence, int k) {
        int minRange = Integer.MAX_VALUE;
        
        int sum = 0;
        int indexL = 0;
        int indexR = -1;
        
        int[] answer = new int[] { 0, sequence.length };
        
        while(true) {
            if (sum <= k) {
                if (sum == k && answer[1] - answer[0] > indexR - indexL) {
                    answer[0] = indexL;
                    answer[1] = indexR;
                }
                indexR++;
                if (indexR == sequence.length) {
                    break;
                }
                sum += sequence[indexR];
            }
            else {
                sum -= sequence[indexL];
                indexL++;
            }
        } 
        return answer;
    }
}