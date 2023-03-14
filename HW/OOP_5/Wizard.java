package HW.OOP_5;

public class Wizard extends Creature {

    public Wizard() {

        super("Noname", 12, 7, 0, -5, -5, 30, 5, 0, 1,0,0);
        this.priorityHealerEnum = PriorityHealerEnum.LOW;
    }

    public Wizard(String name, int x, int y) {

        super(name, 12, 7, 0, -5, -5, 30, 5, 0, 1, x, y);
        this.priorityHealerEnum = PriorityHealerEnum.LOW;
    }

    @Override
    public void step(List<Creature> Team_B, List<Creature> Team_A) {

    }

    public String getInfo() {
        return "Я маг " + getName();
    }

}



