package HW.OOP_4;

public class Monk extends Creature {

    public Monk() {

        super("Noname", 12, 7, 0, -4, -4, 30, 5, 0, 1, 0, 0);

    }

    public Monk(String name, int x, int y) {

        super(name,  12, 7, 0, -4, -4, 30, 5, 0, 1, x, y);

    }

    @Override
    public void step() {

    }

    public String getInfo() {
        return "Я монах " + getName();
    }

}



