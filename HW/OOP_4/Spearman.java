package HW.OOP_4;

public class Spearman extends Creature {

    public Spearman() {

        super("Noname", 4, 5, 0, 1, 3, 10, 4, 0, 0, 0, 0);
        this.priorityHealerEnum = PriorityHealerEnum.HIGHT;
    }

    public Spearman(String name, int x, int y) {

        super(name, 4, 5, 0, 1, 3, 10, 4, 0, 0, x, y);
        this.priorityHealerEnum = PriorityHealerEnum.HIGHT;
    }

    @Override
    public void step() {

    }

    public String getInfo() {
        return "Я копейщик " + getName();
    }

}



