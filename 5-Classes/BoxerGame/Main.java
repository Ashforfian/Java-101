package Class.BoxerGame;

public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Alperen" , 25 , 75, 92, 20);
        Fighter alex = new Fighter("Kerem" , 20 , 70, 93, 30);
        Match r = new Match(marc,alex , 90 , 100);
        r.run();

    }
}
