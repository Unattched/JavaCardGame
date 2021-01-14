package Udhay.JavaCardGame;

public class Bebras implements CardMethods {
    private float health, attack, defence;
    public final String[] descriptions = {
            "Ability 1: Coding in python. The bebras uses python to code an if statement game. Uses 10 health but deals 10 damage multiplied by its attack.",
            "Ability 2: Computational thinking. The bebras uses computational thinking to get full marks on teh bebras exam. Increases health by 10 and defence by 5.",
            "Ability 3: Bebranoses. The bebras calls multiple bebrases to help him solve a bebras question. Increases defence by 10 and health by 1."
    };
    public Bebras() {
        health = 100;
        defence = 30;
        attack = 3;
    }


    @Override
    public void setHealth(float health) {
        this.health = health;
    }

    @Override
    public void setDefence(float defence) {
        this.defence = defence;
    }

    @Override
    public void setAttack(float attack) {
        this.attack = attack;
    }

    @Override
    public float getHealth() {
        return health;
    }

    @Override
    public float getDefence() {
        return defence;
    }

    @Override
    public float getAttack() {
        return attack;
    }

    @Override
    public String[] getDescriptions() {
        return descriptions;
    }

    @Override
    public float Ability1(CardMethods[] players) {
        System.out.println("Python is a good coding language.");
        health -= 10;
        return attack * 10;
    }

    @Override
    public void Ability2(CardMethods[] players) {
        System.out.println("Computational thinking is very important in computer science.");
        health += 10;
        defence += 5;
    }

    @Override
    public void Ability3(CardMethods[] players) {
        System.out.println("This is so advanced.");
        health += 1;
        defence += 10;
    }

}