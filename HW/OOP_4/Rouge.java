package HW.OOP_4;

public class Rouge extends Creature {

    public Rouge() {

        super("Noname", 8, 3, 0, 2, 4, 10, 6, 0, 0, 0, 0);
        this.priorityHealerEnum = PriorityHealerEnum.HIGHT;
    }

    public Rouge(String name, int x, int y) {

        super(name, 8, 3, 0, 2, 4, 10, 6, 0, 0, x, y);
        this.priorityHealerEnum = PriorityHealerEnum.HIGHT;
    }

    @Override
    public void step() {

    }

    public String getInfo() {
        return "Я разбойник " + getName();
    }

}



