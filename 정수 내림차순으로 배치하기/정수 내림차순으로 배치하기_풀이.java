import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
	    // String으로 바꾸기
        String str = Long.toString(n);
        
        // String 배열로 바꿔서 내림차순 정렬
        String[] arr = str.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        
        // 다시 String으로 변환
        str = String.join("", arr);
        
        // 마지막으로 long형으로 변환
        long answer = Long.parseLong(str);
 
        return answer;
    }
}