package HW.OOP_1;

// Крестьянин, разбойник, снайпер, колдун, копейщик, арбалетчик, монах.
//  Для каждого сформировать список свойств и возможных действий. 
//  Напрнимер свойство скорость, действие нанести удар. 
//  Проанализировать получившиеся свойства и действия персонажей и создать Обобщённый класс описывающий свойства и действия имеющиеся у всех персонажей. 
//  Создать этот класс.
//  Создать классы для каждого типа персонажей наследующие и расширяющие абстрактный(обобщённый) класс. 
// В основной программе создать по одному экземпляру каждого типа персонажей.
public class OOP_1 {
    public static void main(String[] args) {
        Villager villager = new Villager("villager Carington", 7, 5, 2);
        Rouge rouge = new Rouge("rouge Darkfury", 5, 7, 4);
        Archer archer = new Archer("archer Howlux", 2, 8, 5);
        Wizard wizard = new Wizard("wizard Weedle", 2, 4, 9);
        Spearman spearman = new Spearman("spearman Gadar", 5, 7, 2);
        Xbowman xbowman = new Xbowman("xbowman Spencer", 4, 6, 4);
        Monk monk = new Monk("monk Bremar", 5, 5, 5);
        System.out.println(monk.getInfo());
        System.out.println("получил удар от " + villager.getName());
        villager.attack(monk);
        System.out.println(monk.getInfo());

    }

    interface Attack {
        void attack(Creature target);
    }

}
