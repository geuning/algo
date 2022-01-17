import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
	    // String���� �ٲٱ�
        String str = Long.toString(n);
        
        // String �迭�� �ٲ㼭 �������� ����
        String[] arr = str.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        
        // �ٽ� String���� ��ȯ
        str = String.join("", arr);
        
        // ���������� long������ ��ȯ
        long answer = Long.parseLong(str);
 
        return answer;
    }
}