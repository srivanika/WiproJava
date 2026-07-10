package abstractClasses.Packages.automobile.Interfaces.music;

public class Test {

    public static void main(String[] args) {

        // a. Create an instance of Veena
        Veena veena = new Veena();
        veena.play();

        // b. Create an instance of Saxophone
        Saxophone saxophone = new Saxophone();
        saxophone.play();

        // c. Using Playable reference
        Playable p;

        p = new Veena();
        p.play();

        p = new Saxophone();
        p.play();
    }
}