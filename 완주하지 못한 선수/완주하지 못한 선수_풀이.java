import java.util.HashMap;

// import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        //HashMap이란 Key-Value의 Pair를 관리하는 클래스, Key는 Participant,Value는 Count이여서  String/Integer
        HashMap<String, Integer> hash = new HashMap<>(); //key가 사람의 이름, value가 사람 수인 hashfmf 선언
        
        for (String player : participant) hash.put(player, hash.getOrDefault(player, 0) + 1); //키가 존재하면 해당 값/없으면 0 그리고 +1 (동명이인고려)
        
        for (String player : completion) hash.put(player, hash.get(player) - 1); //completion을 map에 추가할 때 1씩 빼주고
        
        for (String key : hash.keySet()){
            if (hash.get(key) != 0){ //키 값이 0이 아닐 때 완주하지 못한 선수
                answer = key;
            }
        }
//key값을 이용해서 검색한 다음 value를 단순히 리턴해주는데 이 때 해당 key값이 없다면 null을 리턴해준다. 하지만 getOrDefalut는 key가 없을때 null을 반환해주지않고, 두번째 매개변수로넘겨준 default값을 리턴해주게된다.                
        
        
//         Arrays.sort(participant);
//         Arrays.sort(completion);
        
//         int i = 0; 
        
//         for(i = 0; i<completion.length; i++){
//             if(!completion[i].equals(participant[i])){
//                 return participant[i];
//             }
//         }
//         answer = participant[i];
    
        return answer;
    }
}