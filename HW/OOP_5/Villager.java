package HW.OOP_5;

public class Villager extends Creature {

    public Villager() {

        super("Noname", 1, 1, 0, 1, 1, 1, 3, 1, 0, 0, 0);

    }

    public Villager(String name, int x, int y) {

        super(name, 1, 1, 0, 1, 1, 1, 3, 1, 0, x, y);

    }

    @Override
    public void step(List<Creature> Team_B, List<Creature> Team_A) {
        if (!state.equals("Die")) state = "Stand";
    }

    public String getInfo() {
        return "Я крестьянин " + getName();
    }

}



