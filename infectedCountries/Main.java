import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Country algeria = new Country("Algeria");
        algeria.addPerson(new Person("Necole", false));
        algeria.addPerson(new Person("Rose", true));
        algeria.addPerson(new Person("Aiden", false));
        algeria.addPerson(new Person("Ashwaq", true));
        algeria.transmiteVirus();
        algeria.transmiteVirus();
        algeria.transmiteVirus();
        algeria.transmiteVirus();
        algeria.transmiteVirus();
        algeria.transmiteVirus();

        for (Person person : algeria.getPeople()) {
            if (person.isInfected()){
                System.out.println(person.getName() + " is infected.");
            }
        }
    }
}

