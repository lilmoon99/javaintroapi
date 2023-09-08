import java.util.*;

public class Main {
    public static void main(String[] args) {
//        int a = 10;
//        String b = "Hello world!";
//        String c = new String("new string");
//        Integer d = a;
//        System.out.println(d.intValue());
//
//        build_string(5,"1","2");
//        trimString("aaaabbbcdd");
        String string1 = "а роза упала на лапу азора";
        System.out.println(isPolyndrome(string1));
    }

    public static void build_string(int N, String c1, String c2) {
        StringBuilder stringBuilder = new StringBuilder();
        while (stringBuilder.length() < N) {
            stringBuilder.append(c1);
            if (stringBuilder.length() < N) {
                stringBuilder.append(c2);
            }

        }
        System.out.println(stringBuilder);
    }

    public static void trimString(String str) {
        char[] chars = str.toCharArray();
        List<char[]> characterArrayList = List.of(chars);
        List<Character> characters = new ArrayList<Character>();
        for(char c : chars){
            characters.add(c);
        }
        Set<Character> characterSet = new HashSet<>(characters);
        Iterator iter = characterSet.iterator();

        while(iter.hasNext()){
            System.out.print(iter.next());
        }
    }

    public static boolean isPolyndrome(String str){
        String temp = str.replace(" ","").toLowerCase();
        StringBuilder sb = new StringBuilder(temp);
        return sb.toString().equals(sb.reverse().toString());
    }
}