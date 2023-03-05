package HW.OOP_2;

public class Archer extends Creature {

    public Archer() {

        super("Noname", 11, 4, 10, 5, 10, 90, 12, 0);

    }

    public Archer(String name) {

        super(name, 11, 4, 10, 5, 10, 90, 12, 0);

    }

    @Override
    public void step() {

    }

    public String getInfo() {
        return "Я лучник " + getName();
    }

}



