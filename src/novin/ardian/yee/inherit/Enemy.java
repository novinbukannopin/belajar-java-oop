package novin.ardian.yee.inherit;

/**
 * @author Novin on 28/09/2022
 * @project belajar-java-oop
 */
class Enemy {
    String name;
    int hp;
    int attackPoin;

    void attack(){
        System.out.println(name + " is attacking");
    }

    void showProps(){
        System.out.println("Name            = " + name);
        System.out.println("HP              = " + hp);
        System.out.println("AttackPoin      = " + attackPoin);
    }
}

class Zombie extends Enemy{
    void walk() {
        System.out.println(name + " is walking");
    }
}

class Pocong extends Enemy{
    void jump(){
        System.out.println(name + " is jumping");
    }
}

class Burung extends Enemy {

    void fly(){
        System.out.println(name + " is flying");
    }

}
