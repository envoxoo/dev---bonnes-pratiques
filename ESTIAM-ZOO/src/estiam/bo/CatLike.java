package estiam.bo;

public class CatLike extends Animal{
    private String race;
    private static final int AGE_MAX = 15;
    /** Creates a new instance of CatLike */
    public CatLike(String name, int age, String shout, String race) {
        super(name, age, AGE_MAX, shout);
        this.setRace(race);
    }

    public String getRace() {
        return race;
    }

    private void setRace(String race) {
        this.race = race;
    }

    public String toString(){
        return "Hi, I'm " + this.getName() + " I'm a cat and I'm " + this.getAge();
    }

}
