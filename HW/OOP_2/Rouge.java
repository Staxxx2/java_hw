package HW.OOP_2;

public class Rouge extends Creature {

    public Rouge() {

        super("Noname", 20, 7, 0, 10, 15, 180, 7, 0);

    }

    public Rouge(String name) {

        super(name, 20, 7, 0, 10, 15, 180, 7, 0);

    }

    @Override
    public void step() {

    }

    public String getInfo() {
        return "Я разбойник " + getName();
    }

}



