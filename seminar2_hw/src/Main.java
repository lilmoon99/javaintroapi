import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        String QUERY = "select * from students where ";
        String PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        PARAMS = PARAMS.replace(":", "=").replace("{", "").replace("}", "").replace("\"", "").replace(" ", "");
        String[] ParamsSplitted = PARAMS.split(",");
//        System.out.println(Arrays.toString(ParamsSplitted));
        StringBuilder stringBuilder = new StringBuilder(QUERY);
        PARAMS = DeleteNullArgs(ParamsSplitted);
//        System.out.println(DeleteNullArgs(ParamsSplitted));
        stringBuilder.append(PARAMS);
        System.out.println(stringBuilder);
    }

    public static String DeleteNullArgs(String[] parameters) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < parameters.length; i++) {
            String[] tempArray = parameters[i].split("=");
            if (!Objects.equals(tempArray[1], "null")) {
                tempArray[1] = "'" + tempArray[1] + "'";
                arrayList.add(tempArray[0] + "=" + tempArray[1]);
            }
        }
        return arrayList.toString().replace("[","").replace("]","").replace(","," and");

//        public static String[] NewParams (String[]parameters){
//            ArrayList<String> arrayList = new ArrayList<>();
//            for (int i = 0; i < parameters.length; i++) {
//                if (parameters[i] != null) {
//                    arrayList.add(parameters[i]);
//                }
//            }
//            parameters = new String[arrayList.size()];
//            arrayList.toArray(parameters);
//            return parameters;
//        }
    }
}