package HW.OOP_1;

public class Archer extends Creature {

    public Archer(String name, int body, int agility, int intelligence) {

        super(name, body, agility, intelligence);
        this.weapon = new Weapon("Bow", 12);
        this.clothes = new Cloth("Suit", 15);

    }

    @Override
    public void attack(Creature target) {
        target.health_point -= (this.weapon.dmg > 0 ? this.weapon.dmg : 1) * this.agility
                / ((target.clothes.def) > 0 ? target.clothes.def : target.body);

    }
}