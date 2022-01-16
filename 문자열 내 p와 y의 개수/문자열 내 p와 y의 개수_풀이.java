class Solution {
    boolean solution(String s) {
        boolean answer;
        int p = 0;
        int y = 0;
        
        //String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환해주는 메소드
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