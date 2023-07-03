package challengePoo;

public class Wilder{

     private String firstName;
     private boolean aware;

     public Wilder(String firstName, boolean aware ){
        this.firstName = firstName;
        this.aware = aware;

     }
public String getfirstName() {
        return this.firstName;
    }
    public boolean isAware() {
        return this.aware;
    }
    
public void setfirstName(String firstName) {
    this.firstName = firstName;
}

public void setAware(boolean aware){
    this.aware = aware;

}

public String whoAmI() {
        if (aware) {
            return "Je m'appelle " + firstName + " et je suis aware.";
        } else {
            return "Je m'appelle " + firstName + " et je ne suis pas aware.";
        }
    }

}
 
    class Classroom {
    public static void main(String[] args) {
        Wilder wilder1 = new Wilder("Aurelie", true);
        Wilder wilder2 = new Wilder("Steeve", false);
        Wilder wilder3 = new Wilder("Caroline", true);

        System.out.println(wilder1.whoAmI());
        System.out.println(wilder2.whoAmI());
        System.out.println(wilder3.whoAmI());
    }

    }






