package estiam.go;

import estiam.bo.*;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here

        Manager myManager = new Manager("Mr Lool", 12);
        Zoo myZoo = new Zoo(myManager, 10);

        Bird b = new Bird("Titi", 2, "cuicui", "blue");
        Bird b2 = new Bird("Toto", 5, "cuicui", "red");
        Bird b3 = new Bird("Tata", 6, "cuicui", "blue");
        CatLike c = new CatLike("catttt", 8, "miaouuuuuuuu", "angora");
        Monkey m = new Monkey("monk", 12, "ahahahhohohoho");
        myZoo.add(b);
        myZoo.add(c);
        myZoo.add(b2);
        myZoo.add(b3);
        myZoo.add(m);
        myZoo.listZoo();
        myZoo.birthZoo();
        myZoo.listZoo();
        myZoo.feedAnimal();
    }

}
