import java.util.HashMap;

// import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        //HashMap�̶� Key-Value�� Pair�� �����ϴ� Ŭ����, Key�� Participant,Value�� Count�̿���  String/Integer
        HashMap<String, Integer> hash = new HashMap<>(); //key�� ����� �̸�, value�� ��� ���� hashfmf ����
        
        for (String player : participant) hash.put(player, hash.getOrDefault(player, 0) + 1); //Ű�� �����ϸ� �ش� ��/������ 0 �׸��� +1 (�������ΰ��)
        
        for (String player : completion) hash.put(player, hash.get(player) - 1); //completion�� map�� �߰��� �� 1�� ���ְ�
        
        for (String key : hash.keySet()){
            if (hash.get(key) != 0){ //Ű ���� 0�� �ƴ� �� �������� ���� ����
                answer = key;
            }
        }
//key���� �̿��ؼ� �˻��� ���� value�� �ܼ��� �������ִµ� �� �� �ش� key���� ���ٸ� null�� �������ش�. ������ getOrDefalut�� key�� ������ null�� ��ȯ�������ʰ�, �ι�° �Ű������γѰ��� default���� �������ְԵȴ�.                
        
        
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