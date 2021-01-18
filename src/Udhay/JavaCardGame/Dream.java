package Udhay.JavaCardGame;

import java.util.Arrays;

public class Dream implements CardMethods {
    private float health, attack, defence;
    private final String[] descriptions = {
            "Ability 1: Speedrun block game. Dream is able to speedrun block game, and does 2 damage multiplied by its attack to all of your opponent's cards, as the speedrun was so fast that they were unable to comprehend what was going on. Has a 50% chance of finding a desert temple, and increasing the damage to 5.",
            "Ability 2: We coded a plugin. Dream is so advanced that he codes his own plugin for block game. Increases defence by 10. If Crypto is present in the team, also deals 5 damage multiplied by their combined attack to the enemy team because they complement each other by coding.",
            "Ability 3: Probability and statistics. Dream hires an astrophysicist to sweat statistics to prove that he didn't cheat. This doubles his health, as all the stans now love him even more. There is a 30% chance that he did actually cheat, reducing his health by 50, and attack and defence by 10, as the block game community now hates him"
    };
    public Dream() {
        health = 170;
        defence = 25;
        attack = 10;
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
    public String getCard() {
       return "dream";
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
    public float Ability1(CardMethods[] players, CardMethods[] enemies) {
        int chance = Utilities.getRandom(1);
        if(chance == 0) {
            System.out.println("Bruh you found a desert temple, lets goooooo!");
            for(CardMethods enemy: enemies) {
                float healthToSet = enemy.getHealth() -  ((attack * 5) - enemy.getDefence());
                enemy.setHealth(healthToSet);
            }
        }
        else {
            System.out.println("What is this seed! Nevermind, you still got the world record.");
            for(CardMethods enemy: enemies) {
                float healthToSet = (attack * 2) - enemy.getDefence();
                enemy.setHealth(healthToSet);
            }
        }
        return 0;
    }

    @Override
    public float Ability2(CardMethods[] players, CardMethods[] enemies) {
        defence += 10;
        System.out.println("The plugin works, nice");
        for(CardMethods player: players) {
            if(player.getCard().equals("crypto")) {
                System.out.println("Crypto is part of your team, lets code together!");
                for(CardMethods enemy: enemies) {
                    float combinedAttack = player.getAttack() + attack;
                    float healthToSet = enemy.getHealth() - ((combinedAttack * 5) - enemy.getDefence());
                    enemy.setHealth(healthToSet);
                }
            }
        }
        return 0;
    }

    @Override
    public float Ability3(CardMethods[] players, CardMethods[] enemies) {
        int chance = Utilities.getRandom(10);
        if(chance > 3) {
            System.out.println("According to youtube statistics only a small percentage of you are actually subscribed...");
            health *= 2;
        } else {
            System.out.println("Bruh why did you cheat.");
            health -= 50;
            defence -= 10;
            attack -= 10;
        }
        return 0;
    }


}
