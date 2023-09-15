import java.util.HashMap;
import java.util.List;

public class CatShelter {
     HashMap<Integer,Cat> cats = new HashMap<>();

     int id;
     void acceptTheCat(Cat cat){
        cats.put(id++,cat);
    }

     void printCats(){
        System.out.println(cats.toString());
    }
}
