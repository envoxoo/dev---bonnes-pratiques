package estiam.bo;

public class Monkey extends Animal{
    private static final int AGE_MAX = 25;

    /** Creates a new instance of Monkey */
    public Monkey(String name, int age, String shout) {
        super(name, age, AGE_MAX, shout);
    }

    public String toString(){
        return "Hi my name is " + this.getName() + " I'm a monkey and I'm " + this.getAge();
    }
}

