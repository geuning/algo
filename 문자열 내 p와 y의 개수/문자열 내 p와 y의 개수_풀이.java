class Solution {
    boolean solution(String s) {
        boolean answer;
        int p = 0;
        int y = 0;
        
        //String���� ����� ���ڿ� �߿��� �� ���ڸ� �����ؼ� charŸ������ ��ȯ���ִ� �޼ҵ�
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P'){  
                p++;
            } else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y'){
                y++;                
            }
        }
        // if(p == y)
        //     return true;
        // else
        //     return false;
        
        return answer = (p == y)? true : false;

    }
}