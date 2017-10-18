package estiam.bo;

public class Bird extends Animal {

    private String color;
    private static final int AGE_MAX = 8;

    /** Creates a new instance of Bird */
    public Bird(String name, int age, String shout, String color) {
        super(name, age, AGE_MAX, shout);
        this.setColor(color);
    }

    public String getColor() {
        return color;
    }

    private void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        return "Hi, I'm a bird my name is " + this.getName() + " and I'm " + this.getAge();
    }
}
