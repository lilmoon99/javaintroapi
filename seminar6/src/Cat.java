import java.util.Date;
import java.util.List;

public class Cat {
    private String name;
    List<String> vaccines;
    private int weight;
    private String breed;
    private int age;
    private Date date;
    private String sex;
    private boolean state;

    public Cat(String name, List<String> vaccines, int weight, String breed, int age, Date date, String sex,boolean state) {
        this.name = name;
        this.vaccines = vaccines;
        this.weight = weight;
        this.breed = breed;
        this.age = age;
        this.date = date;
        this.sex = sex;
        this.state = state;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getVaccines() {
        return vaccines;
    }

    public void setVaccines(List<String> vaccines) {
        this.vaccines = vaccines;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", vaccines=" + vaccines +
                ", weight=" + weight +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", date=" + date +
                ", sex='" + sex + '\'' +
                ", state=" + state +
                '}';
    }
}
