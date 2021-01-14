package Udhay.JavaCardGame;

public class BlockGameSweat implements CardMethods {
    private float health, attack, defence;
    private final String[] descriptions = {
            "Ability 1: Being Toxic. The Block Game sweat, sweats block game every second of his life and when he feels that someone might be cheating or when they combo some kid into oblivion, they get really toxic. Can deal 8 times their attack and increase their health 10, but has a 50% chance of losing 15 health as they are now banned from hypixel.",
            "Ability 2: Parabola Bridge. The Block Game sweat likes to flex on every other kid in the bedwars lobby, so he parabola bridges to person next to him. This could increase his defence by 5 and attack by 3, but he has a chance of falling off the bridge and losing all his items reducing his attack by 1.",
            "Ability 3: Jitter clicking. The block game sweat sweats pvp in order to get better at bedwars, so he learned how to jitter click fast. This has a chance to increase his defence by 5, attack by 5 and health by 5, however it could decrease his health by 5 for he has now contracted carpal tunnel."
    };
    public BlockGameSweat() {
        attack = 5;
        defence = 15;
        health = 140;
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
            System.out.println("Bruh you just roasted that kid.");
            health += 10;
            return attack * 8;
        }
        else {
            System.out.println("Lmao, you are banned of hypixel.");
            health -= 15;
            return 0;
        }
    }

    @Override
    public void Ability2(CardMethods[] players) {
        int chance = Utilities.getRandom(10);
        if(chance > 7) {
            System.out.println("bruh how did you fall of that bridge?");
            attack -= 1;
        }
        else {
            System.out.println("Nice bridge, now /shout 'It's over anakin I have the high ground'");
            attack += 3;
            defence += 5;
        }
    }

    @Override
    public void Ability3(CardMethods[] players) {
        int chance = Utilities.getRandom(10);
        if(chance > 5) {
            System.out.println("Lmao you just contracted carpal tunnel, good luck pvping now!");
            health -= 5;
        }
        else {
            System.out.println("Bruh, you got at least 17 cps nice!");
            defence+= 5;
            attack += 5;
            health += 5;
        }
    }
}