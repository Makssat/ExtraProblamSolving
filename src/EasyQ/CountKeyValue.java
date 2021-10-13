package EasyQ;

import java.util.HashMap;

public class CountKeyValue {
    public static void main(String[] args) {
//        wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
//        wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
//        wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}
        String [] str={"a", "bb", "a", "bb"};
        HashMap<String,Integer> map=new HashMap<>();
        for (int i = 0; i < str.length; i++) {
           map.put(str[i],str[i].length());
        }
        System.out.println(map);
    }
}
