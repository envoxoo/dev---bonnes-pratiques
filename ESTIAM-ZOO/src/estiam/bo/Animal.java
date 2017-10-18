package estiam.bo;

public class Animal {

    private String name;
    private int age;
    private int ageMax;
    private String shout;

    /** Creates a new instance of Animal */
    public Animal(String name, int age, int ageMax, String shout) {
        this.setName(name);
        this.setAge(age);
        this.setAgeMax(ageMax);
        this.setShout(shout);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public int getAgeMax() {
        return ageMax;
    }

    private void setAgeMax(int ageMax) {
        this.ageMax = ageMax;
    }

    public String getShout() {
        return shout;
    }

    private void setShout(String shout) {
        this.shout = shout;
    }

    public boolean getOlder(){
        boolean result = false;

        if(++age <= this.getAgeMax()){
            result = true;
        }
        else
            System.out.println(this.getName() + " is dead!!!");

        return result;
    }

    public String eat(){
        return this.getName() + " " + this.getShout();
    }
}
