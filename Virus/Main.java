public class Main {
    public static void main(String[] args){
        Virus[] virusArray = {new Virus("Poliomyelitis", 1949),
                new Virus("Epstein–Barr virus", 1911),
                new Virus("Ebola", 1967),
                new Virus("HIV", 1980),
                new Virus("Hantavirus", 1993)};
        int newestVirus = virusArray[0].getDiscoveryYear();
        int temp;
        for (int i = virusArray.length - 1; i > 1; i--){
            if(Virus.isOlder(virusArray[i], virusArray[i-1])){
                temp = virusArray[i-1].getDiscoveryYear();
                if (temp > newestVirus) {
                    newestVirus = temp;
                }
            } else if (Virus.isOlder(virusArray[i-1], virusArray[i])){
                temp = virusArray[i].getDiscoveryYear();
                if (temp > newestVirus) {
                    newestVirus = temp;
                }
            }

        }
        System.out.println(newestVirus);
    }
}

