package estiam.bo;

public class Manager {
    private String name;
    private int ysSeniority;

    /** Creates a new instance of Manager */
    public Manager(String name, int ysSeniority) {
        this.setName(name);
        this.setYsSeniority(ysSeniority);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getYsSeniority() {
        return ysSeniority;
    }

    public void setYsSeniority(int ysSeniority) {
        this.ysSeniority = ysSeniority;
    }

    public String toString(){
        return "Hi I'm the manager, and my name is " + name;
    }
}