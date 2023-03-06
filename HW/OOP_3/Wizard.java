package HW.OOP_3;

public class Wizard extends Creature {

    public Wizard() {

        super("Noname", 12, 7, 0, -5, -5, 30, 5, 0, 1);

    }

    public Wizard(String name) {

        super(name, 12, 7, 0, -5, -5, 30, 5, 0, 1);

    }

    @Override
    public void step() {

    }

    public String getInfo() {
        return "Я маг " + getName();
    }

}



