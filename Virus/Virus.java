public class Virus {
    private String name;
    private int discoveryYear;

    public Virus(String name, int discoveryYear){
        this.name = name;
        this.discoveryYear = discoveryYear;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setDiscoveryYear(int discoveryYear) {
        this.discoveryYear = discoveryYear;
    }

    public String getName() {
        return name;
    }

    public int getDiscoveryYear() {
        return discoveryYear;
    }

    public boolean isOlder(Virus v){
        return v != null && this.discoveryYear < v.discoveryYear;
    }

    public static boolean  isOlder(Virus v1, Virus v2){
        return v1 != null && v2 != null && v1.discoveryYear < v2.discoveryYear;
    }

    @Override
    public String toString() {
        return name + " " + discoveryYear;
    }


}

