package estiam.bo;

public class Zoo {

    private Manager dir;
    private int nbAnimal;
    private Animal[] tabAnim;

    /** Creates a new instance of Zoo */
    public Zoo(Manager dir, int nbMax) {
        this.dir = dir;
        tabAnim = new Animal[nbMax];
    }

    public boolean add(Animal an){
        boolean result = false;

        if((nbAnimal < tabAnim.length) && (an.getAge() <= an.getAgeMax())){
            tabAnim[nbAnimal] = an;
            nbAnimal++;
            result = true;
        }

        return result;
    }

    public boolean remove(){
        boolean result = false;

        if(nbAnimal > 0){
            nbAnimal--;
            System.out.println(tabAnim[nbAnimal].getName() + " has been removed from the zoo");
            tabAnim[nbAnimal] = null;
            result = true;
        }

        return false;
    }

    public void birthZoo(){
        if (nbAnimal <= 0) {
            System.out.println("There is no animal to got older in the zoo");
        } else {
            for (int i = 0; i < nbAnimal; i++) {
                Animal an = tabAnim[i];
                if (!an.getOlder()) {
                    for (int j = i + 1; j < nbAnimal; j++) {
                        tabAnim[j - 1] = tabAnim[j];
                    }
                    tabAnim[nbAnimal] = null;
                    i--;
                    nbAnimal--;
                }
            }
        }

        dir.setYsSeniority(dir.getYsSeniority() + 1);
        System.out.println("Happy Birthday !");
    }

    public void feedAnimal(){
        for(int i = 0; i < nbAnimal; i++){
            System.out.println(tabAnim[i].eat());
        }
    }

    public void listZoo(){
        System.out.println(dir.toString());
        for(int i = 0; i < nbAnimal; i++){
            System.out.println(tabAnim[i].toString());
        }
    }

}
