public class Main {
    public static void main(String[] args) {
        String QUERY = "select * from students where ";
        String PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        StringBuilder stringBuilder = new StringBuilder(QUERY);
        char c = 34;

        PARAMS = PARAMS.replace(":","=").replace(c, ' ');
        System.out.println(PARAMS);
        System.out.println(stringBuilder);
        System.out.println(c);
    }
}