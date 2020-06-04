public class Person {
    private String name;
    private boolean stayAtHome;
    private boolean infected;

    public Person(String name){
        this.name = name;
        this.infected = false;
    }

    public Person(String name, boolean stayAtHome){
        this.name = name;
        this.stayAtHome = stayAtHome;
        this.infected = false;
    }

    public String getName() {
        return name;
    }

    public boolean isInfected() {
        return infected;
    }

    public boolean isStayAtHome() {
        return stayAtHome;
    }

    @Override
    public String toString() {
        return "Name : " + name + ", StayAtHome : " + stayAtHome + ", Infected : " + infected;
    }

    public void setName(String s) {
        this.name = s;
    }

    public void setInfected(boolean i) {
        this.infected = i;
    }

    public void setStayAtHome(boolean s) {
        this.stayAtHome = s;
    }
}

