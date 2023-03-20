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

    public void step(List<Creature> Team_A) {

        Collections.sort(Team_A, new Comparator<Creature>() {
            public int compare(Creature c1, Creature c2) {
                if (c1.priorityHealerEnum.getCode() > c1.priorityHealerEnum.getCode()) {
                    return 1;
                } else {
                    return -1;

                }
            }
        });
        for (Creature friend : Team_A) {

            if (friend.getCurrentHealth() < friend.getMaxHealth() && friend.getCurrentHealth() != 0) {
                friend.setCurrentHealth(getCurrentHealth() + 5);
                if (friend.getCurrentHealth() > friend.getMaxHealth()) {
                    friend.setCurrentHealth(friend.getMaxHealth());
                }
                return;
            }

        }
    }

    

    public String getInfo() {
        return "Я маг " + getName();
    }

}



