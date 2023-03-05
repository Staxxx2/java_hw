package HW.OOP_2;

public class Spearman extends Creature {

    public Spearman() {

        super("Noname", 17, 5, 0, 8, 12, 180, 7, 0);

    }

    public Spearman(String name) {

        super(name, 17, 5, 0, 8, 12, 180, 7, 0);

    }

    @Override
    public void step() {

    }

    public String getInfo() {
        return "Я копейщик " + getName();
    }

}



