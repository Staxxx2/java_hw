package HW.OOP_2;

public class Wizard extends Creature {

    public Wizard() {

        super("Noname", 8, 3, 0, 8, 20, 120, 6, 100);

    }

    public Wizard(String name) {

        super(name, 8, 3, 0, 8, 20, 120, 6, 100);

    }

    @Override
    public void step() {

    }

    public String getInfo() {
        return "Я маг " + getName();
    }

}



