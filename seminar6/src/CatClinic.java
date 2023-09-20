import java.util.ArrayList;
import java.util.List;

public class CatClinic {
    private List<Cat> clinic = new ArrayList<>();

    public void checkCat(Cat cat){
        if (cat.getState()){
            clinic.add(cat);
            System.out.println("Cat "+ cat.getName()+ " added.");
        }else System.out.println("Sorry, your cat " +cat.getName() + " is healthy.");
    }

    public List<Cat> getClinic() {
        return clinic;
    }

    @Override
    public String toString() {
        return "CatClinic{" +
                "clinic=" + clinic +
                '}';
    }
}
