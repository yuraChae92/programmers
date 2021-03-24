import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        //integer로 중복 수 체크
        HashMap<String,Integer> map = new HashMap<String,Integer>();
    
        //참가자
        for(int i = 0 ; i < participant.length; i++){ 
            //getOrDefault 는 hashmap에 없으면 0으로 value값 set
            map.put(participant[i], map.getOrDefault(participant[i],0)+1);
        }
        
        //완주자 체크 
        for(int i = 0 ; i < completion.length; i++){
            //hashmap은 중복되면 나중에 put한 데이터로 update함
            //map.get은 해당 키의 value값 return 됨 
            map.put(completion[i], map.get(completion[i])-1 );
        }
        
        //미완주자
        //keyset은 hashtable에 남아있는 data를 set(key,value)으로 변환
        for(String result : map.keySet()){
            if (map.get(result) != 0) {
                answer = result ; 
                break;
            }
        }

        return answer;
    
    //해쉬 : key-value 쌍 데이터 지정
    // hashmethod를 이용해서 hashtable에 저장하는 것을 hashing
    // hashmap에서 hash는 중복 검사 담당
    // hash는 key-value 를 hashtable에 저장
    // key는 hashmethod인 hashcode() 사용해 중복없는 고유 값으로
    }
    
}