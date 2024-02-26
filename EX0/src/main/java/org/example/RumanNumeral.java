package org.example;
import java.util.Map;
import java.util.HashMap ;
public class RumanNumeral {
    public static  HashMap<Character, Integer > map;
    static {
        map = new HashMap<>();
        map.put('I' , 1);
        map.put('V' , 5);
        map.put('X' , 10);
        map.put('L' , 50);
        map.put('C' , 100);
        map.put('D' , 500);
        map.put('M' , 1000);
    }

    // cette methode donne une erreure dans le test du VII qui va donne 7 a la place du 5
    public int convert(String s){
        int convertedNumber  = 0 ;
        for (int i = 0 ; i < s.length() ; i++){
            int currentnumber  = map.get(s.charAt(i));
            int next = i+1 < s.length() ? map.get(s.charAt(i+1)) : 0 ;
            if(currentnumber > next )
                convertedNumber += currentnumber ;
            else
                convertedNumber-=currentnumber ;
        }
        return convertedNumber ;
    }
    public int convertModified(String s){
        int convertedNumber  = 0 ;
        for (int i = 0 ; i < s.length() ; i++){
            int currentnumber  = map.get(s.charAt(i));
            int next = i+1 < s.length() ? map.get(s.charAt(i+1)) : 0 ;
            if(currentnumber >= next )
                convertedNumber += currentnumber ;
            else
                convertedNumber-=currentnumber ;
        }
        return convertedNumber ;
    }

}
