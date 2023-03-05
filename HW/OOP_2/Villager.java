package HW.OOP_2;

public class Villager extends Creature {

    public Villager() {

        super("Noname", 14, 1, 0, 2, 5, 70, 4, 0);

    }

    public Villager(String name) {

        super(name, 14, 1, 0, 2, 5, 70, 4, 0);

    }

    @Override
    public void step() {

    }

    public String getInfo() {
        return "Я крестьянин " + getName();
    }

}



