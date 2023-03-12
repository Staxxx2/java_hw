package HW.OOP_4;

public class Xbowman extends Creature {

    public Xbowman() {

        super("Noname", 6, 3, 16, 2, 3, 10, 4, 0, 0, 0, 0);

    }

    public Xbowman(String name, int x, int y) {

        super(name, 6, 3, 16, 2, 3, 10, 4, 0, 0, x, y);

    }

    @Override
    public void step() {

    }

    public String getInfo() {
        return "Я арбалетчик " + getName();
    }

}



