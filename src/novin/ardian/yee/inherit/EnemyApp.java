package novin.ardian.yee.inherit;

/**
 * @author Novin on 28/09/2022
 * @project belajar-java-oop
 */
public class EnemyApp {
    public static void main(String[] args) {
        Enemy enemy = new Enemy();
        enemy.name = "Enemy";
        enemy.hp = 999;
        enemy.attackPoin = 97;
        enemy.showProps();
        enemy.attack();
        System.out.println("----------");


        Zombie zombie = new Zombie();
        zombie.name = "Dracule";
        zombie.hp = 80;
        zombie.attackPoin = 66;
        zombie.showProps();
        zombie.attack();
        zombie.walk();
        System.out.println("----------");

        Pocong pocong = new Pocong();
        pocong.name = "novin";
        pocong.hp = 100;
        pocong.attackPoin = 99;
        pocong.showProps();
        pocong.jump();
        pocong.attack();

        System.out.println("----------");


        Burung burung = new Burung();
        burung.name = "Angry Birds";
        burung.hp = 88;
        burung.attackPoin = 77;
        burung.showProps();
        burung.attack();
        burung.fly();
        System.out.println("----------");

    }
}
