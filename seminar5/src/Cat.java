public class Cat {
    String breed;
    String name;
    int age;
    String color;

    public Cat(String breed, String name, int age, String color) {
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Cat() {

    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
