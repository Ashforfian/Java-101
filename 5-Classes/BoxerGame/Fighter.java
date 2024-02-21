package Class.BoxerGame;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;
    Fighter(String name, int damage, int health, int weight, double dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }
    int hit(Fighter foe){
        System.out.println(this.name+" => "+ foe.name+" hasar vurdu." );
        if (foe.calculateDodge()){
            System.out.println(foe.name+" bu saldırıdan kaçtı!!");
            return foe.health;
        }
        if (foe.health - this.damage < 0){
            return 0;
        }
        return foe.health - this.damage;
    }
    boolean calculateDodge(){
        double randomValue = Math.random() * 100;
        return randomValue <= this.dodge;
    }

}
