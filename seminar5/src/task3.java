import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class task3 {
    public static void main(String[] args) {
    String line = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed eget libero auctor, varius felis in, faucibus tortor. Integer eget leo vitae justo auctor facilisis. Pellentesque ac urna in libero cursus bibendum. Maecenas auctor est nec arcu tincidunt, eget hendrerit metus bibendum. Ut vestibulum ligula a nulla pellentesque, sit amet tristique neque aliquet. Curabitur euismod aliquet lorem, in lacinia nunc viverra a. Sed vitae tincidunt ipsum. Nullam eget aliquam libero. Donec fringilla a lorem vel feugiat. Sed eu nisl nec justo laoreet euismod. Morbi non massa id turpis posuere placerat.";

    line = line.toLowerCase();
    line = line.replace("\"","").replace(",","").replace(".","");
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(line.split(" ")));
//        System.out.println(arrayList);
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (map.containsKey(arrayList.get(i))){
                int temp = map.get(arrayList.get(i)) + 1;
                map.put(arrayList.get(i),temp);
            }else {
                map.put(arrayList.get(i),1);
            }
        }
        System.out.println(map.toString());
        System.out.println("Thanks");
    }
}
