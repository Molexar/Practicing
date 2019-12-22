package classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.lang.String;

public class FrequencyMapLetters {
    public static void main(String[] args) {
        String string = "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).";
        getMap(string);
    }
    public static void getMap(String text){
        Map<Character, Integer> map = new HashMap<>();
        text = text.toLowerCase();
        for (int i=0; i<text.length(); i++){
            char letter = text.charAt(i);
            if ((letter <= 'z') && (letter >= 'a')){
                map.compute(letter, ((character, integer) -> integer == null ? 1 : integer + 1));
            }
        }
        ArrayList<Map.Entry<Character, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort((o1, o2) -> Character.compare(o1.getKey(), o2.getKey()));
        for (Map.Entry<Character, Integer> entry : entries){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}
