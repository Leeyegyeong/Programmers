import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);
        for(int i=numbers.length-1; i>=0; i--);
        answer = numbers[numbers.length-1]*numbers[numbers.length-2];
        return answer;
    }
}