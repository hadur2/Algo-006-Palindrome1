package hbcu.stay.ready;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public String isPalindrome(String input) {

        Map<Character,Integer> palindrome = new HashMap<Character, Integer>();

        for(char a : input.toCharArray()){

            if(!palindrome.containsKey(a)){

                palindrome.put(a,1);

            }
            else{int currentValue = palindrome.get(a);
                currentValue++;
                palindrome.put(a,currentValue);


            }

        }
        int odd = 0;
        int even = 0;
        for(Integer occurrence: palindrome.values()){
            if(occurrence % 2 == 1){
                odd++;
                continue;
            }
            if(occurrence % 2 ==0){
                even++;
            }

        }
        if(odd > 1){
            return "NO";
        }
        else {
            return "YES";
        }
    }

}
