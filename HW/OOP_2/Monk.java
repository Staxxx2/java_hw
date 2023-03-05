package HW.OOP_2;

public class Monk extends Creature {

    public Monk() {

        super("Noname", 15, 0, 0, 5, 10, 50, 5, 100);

    }

    public Monk(String name) {

        super(name, 15, 0, 0, 5, 10, 50, 5, 100);

    }

    @Override
    public void step() {

    }

    public String getInfo() {
        return "Я монах " + getName();
    }

}



