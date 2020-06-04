
import java.util.Arrays;
import java.util.Random;

public class Country {
    private String name;
    private Person[] people = new Person[100];
    private int personCount;

    public Country(String name){
        this.name = name;
        this.personCount = 0;
    }

    public String getName() {
        return name;
    }

    public Person[] getPeople() {
        return Arrays.copyOfRange(people, 0, personCount);

    }

    public int getPersonCount() {
        return personCount;
    }

    public void addPerson(Person p){
        people[personCount] = p;
        personCount++;
    }
    public void transmiteVirus(){
        Random rand = new Random();
        int personNumber = rand.nextInt(personCount);
        Person p = people[personNumber];
        if (!p.isStayAtHome()){
            p.setInfected(true);
            System.out.println("Person number " + personNumber +" ("+ p.getName()+ ")" +" has been infected with the virus");
        }

    }
}

