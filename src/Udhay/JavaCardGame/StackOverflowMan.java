package Udhay.JavaCardGame;

public class StackOverflowMan implements CardMethods {
    private float health, attack, defence;
    private final String[] descriptions = {
            "Ability 1: Water boils at 40 degrees. StackOverflowMan believes water boils at 40 degrees. This deals an output damage of 10 multiplied by his attack for the kids around him loose brain cells. However since he is an idot there is a 90 percent chance of it not working.",
            "Ability 2: Trying to learn a code. StackOverflowMan thinks he is so advanced and he is trying to learn how to program in c++. This could increase his defence by 20 and health by 30. But since he is an idot and doesn't know anything about programming, there is a 80 percent chance of it not working and decreasing his health by 20.",
            "Ability 3: Inadvanced. StackOverflowMan sweats blocc game during class and he doesn't pay attention and is just overall a very stupid person. Can increase defence by 1 and health by 1 but has a 90 percent chance of doing nothing."
    };
    public StackOverflowMan() {
        attack = 1;
        defence = 1;
        health = 100;
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
        int chance = Utilities.getRandom(10);
        if(chance > 1) {
            System.out.println("Lmao it did nothing idot.");
            return 0;
        } else {
            System.out.println("It worked! Strangely.");
            return attack * 10;
        }
    }

    @Override
    public void Ability2(CardMethods[] players) {
        int chance = Utilities.getRandom(10);
        if(chance > 7) {
            System.out.println("Lmao why were you trying to learn about pointers when you don't even know what a function is?");
            health -= 20;
        } else {
            System.out.println("Huh, that was indeed quite lucky of you.");
            defence += 20;
            health += 30;
        }
    }

    @Override
    public void Ability3(CardMethods[] players) {
        int chance = Utilities.getRandom(10);
        if(chance > 8) {
            System.out.println("That was super useful, wasn't it");
            health += 1;
            defence += 1;
        }
        else {
            System.out.println("lmao you are so dumb!");
        }
    }
}
