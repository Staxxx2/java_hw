package HW.OOP_2;

public class Xbowman extends Creature {

    public Xbowman() {

        super("Noname", 30, 10, 12, 15, 20, 150, 10, 0);

    }

    public Xbowman(String name) {

        super(name, 30, 10, 12, 15, 20, 150, 10, 0);

    }

    @Override
    public void step() {

    }

    public String getInfo() {
        return "Я арбалетчик " + getName();
    }

}



