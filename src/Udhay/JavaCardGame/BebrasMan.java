package Udhay.JavaCardGame;

public class BebrasMan implements CardMethods {
    private float health, attack, defence;
    private final String[] descriptions = {
            "Ability 1: Attached is a python. Bebras Man attaches a python to the email. This can deal and output damage of 8 multiplied by his attack, but due to his bad grammar there is a chance that it won't be interpreted correctly decreasing his health by 30.",
            "Ability 2: The Microbit. Bebras Man uses the best physical component to make a self driving car. This increments his health by 20 and defence by 5.",
            "Ability 3: Coding in Notepad. Bebras Man uses the best IDE to code the next bebras exam. This increments his health by 15 and defence by 10. But since Notepad doesn't support intelli sense there is a chance that the whole project won't function decreasing his health by 20."
    };
    public BebrasMan() {
        health = 140;
        defence = 20;
        attack = 2;
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
        int chance = Utilities.getRandom(2);
        if(chance == 1) {
            System.out.println("Bruh it didn't work, fix your grammar man.");
            health -= 30;
            return 0;
        } else {
            System.out.println("It worked! Are any update on the this?");
            return 8 * attack;
        }
    }

    @Override
    public void Ability2(CardMethods[] players) {
        defence += 5;
        health += 20;
    }

    @Override
    public void Ability3(CardMethods[] players) {
        int chance = Utilities.getRandom(10);
        if(chance > 4) {
            System.out.println("It didn't work. Kid just use an IDE lmao");
            health -= 20;
        } else {
            System.out.println("It worked lmao.");
            defence += 10;
            health  += 15;
        }
    }
}
