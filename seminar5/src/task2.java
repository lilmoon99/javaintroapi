public class task2 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.age = 9;
        cat.name = "Барсик";
        Cat cat1 = new Cat("homeless","Felix",4,"black");
//        System.out.println(cat);
        CatShelter catShelter = new CatShelter();
        catShelter.acceptTheCat(cat);
        catShelter.printCats();
        catShelter.acceptTheCat(cat1);
        catShelter.printCats();
        SiberanCatShelter siberanCatShelter = new SiberanCatShelter();
        siberanCatShelter.printCats();
    }
}
