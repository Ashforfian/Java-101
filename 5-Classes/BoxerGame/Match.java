package Class.BoxerGame;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    Match(Fighter f1,Fighter f2,int minWeight, int maxWeight ){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }
    void run(){
        if (checkWeight()){
            int counter = 1;
            int randomValue = (int) (Math.random() * 2);
            while (f1.health>0 && f2.health>0){
                System.out.printf("\n%d. Round\n",counter);
                if (randomValue == 0){
                    f1.health = f2.hit(f1);
                    if (isWin()){
                        break;
                    }
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                } else {
                    f2.health = f1.hit(f2);
                    if (isWin()){
                        break;
                    }
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                }counter++;
                printInfo();

            }
        }else {
            System.out.println("Dövüşçlerin ağırlıkları yeterli değildir!!");
        }
    }
    boolean checkWeight(){
        if (f1.weight<=this.maxWeight && f1.weight>=minWeight &&f2.weight<= this.maxWeight && f2.weight>= this.minWeight){
            return true;
        }
        return false;
    }
    boolean isWin(){
        if (f1.health == 0){
            System.out.println("Kazanan: "+f2.name);
            return true;
        } else if (f2.health == 0) {
            System.out.println("Kazanan: "+f1.name);
            return true;
        }
        return false;
    }
    void printInfo(){
        System.out.println("--------------------------");
        System.out.println(f1.name+" Sağlığı: "+f1.health);
        System.out.println(f2.name+" Sağlığı: "+f2.health);
    }
}
