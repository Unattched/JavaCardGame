package com.company;
import com.sun.jdi.InterfaceType;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DevelopmentIndicatorsMan developmentIndicatorsMan = new DevelopmentIndicatorsMan();
        Scanner input = new Scanner(System.in);
        CardMethods[] Cards = {new Bebras(), new Marco(), new JessKid(), developmentIndicatorsMan, new BebrasMan(), new StackOverflowMan(), new BlockGameSweat()};
        for(int i = 0; i < 10; i++) {
            System.out.println(Utilities.getRandom(2));
        }

    }

}

class Utilities {
    static int getRandom(int max){
        return (int) (Math.random()*max); // returns 0 <= n < max
    }
}

interface CardMethods {
    boolean isSupport();
    void setHealth(float health);
    void setDefence(float defence);
    void setAttack(float attack);
    float getHealth();
    float getDefence();
    float getAttack();
    String[] getDescriptions();
    float Ability1();
    void Ability2();
    void Ability3();
}

class Bebras implements CardMethods {
    private float health, attack, defence;
    public final String[] descriptions = {
            "Ability 1: Coding in python. The bebras uses python to code an if statement game. Uses 10 health but deals 10 damage multiplied by its attack.",
            "Ability 2: Computational thinking. The bebras uses computational thinking to get full marks on teh bebras exam. Increases health by 10 and defence by 5.",
            "Ability 3: Bebranoses. The bebras calls multiple bebrases to help him solve a bebras question. Increases defence by 10 and health by 1."
    };
    public Bebras() {
        setHealth(100);
        setDefence(30);
        setAttack(3);
    }

    @Override
    public boolean isSupport() {
        return false;
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
    public float Ability1() {
        System.out.println("Python is a good coding language.");
        health -= 10;
        return attack * 10;
    }

    @Override
    public void Ability2() {
        System.out.println("Computational thinking is very important in computer science.");
        health += 10;
        defence += 5;
    }

    @Override
    public void Ability3() {
        System.out.println("This is so advanced.");
        health += 1;
        defence += 10;
    }


}

class Marco implements CardMethods {
    private float health, attack, defence;
    private int usesOfAbility = 1;
    private final String[] descriptions = {
            "Ability 1: Gaming. He plays all the games in existence, deals 50 output damage multiplied by the attack, can only be used once.",
            "Ability 2: I only know Python and C#. Since he can only program slow applications and games using unity his attack is decreased by 2 but defence is increased by 15 due to specialization",
            "Ability 3: 1660 super. He has a relatively good gpu but it can't ray trace so attack increased by 1 and health increased by 5"};
    public Marco() {
        setHealth(90);
        setDefence(20);
        setAttack(4);
    }

    @Override
    public boolean isSupport() {
        return false;
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
    public float Ability1() {
        if(usesOfAbility > 0) {
            System.out.println("Jesus you love playing games don't you?");
            usesOfAbility--;
            return 50 * attack;
        }
        else {
            System.out.println("You can't use this ability anymore!");
            return 0;
        }
    }

    @Override
    public void Ability2() {
        System.out.println("lmao imagine being a coder.");
        attack -= 2;
        defence += 15;
    }

    @Override
    public void Ability3() {
        System.out.println("lmao imagine having a gpu from 3 years ago");
        attack += 1;
        health += 5;
    }


}

class JessKid implements CardMethods {
    private float health, defence, attack;
    private int numberOfTimesBeingCaught = 3;
    private final String[] descriptions = {
            "Ability 1: Throws Objects around the class. The Jess Kid thinks that they are so advanced so they decide to throw things around the classroom, this can deal 30 output damage multiplied by their attack, but they have a chance of being caught!",
            "Ability 2: Rugby Rugby. The Jess Kid sweats games and rugby. They gain 2 attack and 5 defence. ",
            "Ability 3: Use phone during class. The Jess Kid loves social media especially snapchat and instagram so they use their phones during class. Can increase health by 15, attack by 2 and defence by 10, but they have a chance of getting caught!"
    };
    public JessKid() {
        setHealth(80);
        setDefence(20);
        setAttack(2);
    }

    @Override
    public boolean isSupport() {
        return false;
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
    public float Ability1() {
        if(numberOfTimesBeingCaught > 0) {
            int chance = Utilities.getRandom(10);
            if(chance > 5) {
                health -= 20;
                System.out.println("You have been caught! You lost 20 health for the teacher reprimanded you!");
                numberOfTimesBeingCaught--;
                return 0;
            } else {
                System.out.println("You didn't get caught, nicely done lmao");
                return 30 * attack;
            }
        } else {
            System.out.println("You can't use this ability");
            System.out.println("The teacher gives you a level one and send you back to class! You can use Ability one and Ability three again.");
            numberOfTimesBeingCaught = 3;
            return 0;
        }
    }

    @Override
    public void Ability2() {
        if (numberOfTimesBeingCaught > 0) {
            attack += 2;
            defence += 5;
        } else {
            attack += 2;
            defence += 5;
            System.out.println("The teacher gives you a level one and send you back to class! You can use Ability one and Ability three again.");
            numberOfTimesBeingCaught = 3;
        }

    }

    @Override
    public void Ability3() {
        if (numberOfTimesBeingCaught > 0) {
            int chance = Utilities.getRandom(10);
            if (chance > 3) {
                health -= 20;
                defence -= 3;
                System.out.println("You have been caught! You lost 30 health and 3 defence, for the teacher reprimanded you!");
                numberOfTimesBeingCaught--;
            } else {
                System.out.println("You didn't get caught, nicely done lmao");
                health += 15;
                defence += 10;
                attack += 2;
            }
        } else {
            System.out.println("You can't use this ability");
            System.out.println("The teacher gives you a level one and send you back to class! You can use Ability one and Ability three again.");
            numberOfTimesBeingCaught = 3;
        }

    }

}

class DevelopmentIndicatorsMan implements CardMethods {
    private float health, defence, attack;
    private int usesOfAbility2 = 1;
    private final String[] descriptions = {
            "Ability 1: Fairtrade. Helps African farmers by providing fair prices for coffee and chocolate: increase health of all cards by 10, but loses 15 defence.",
            "Ability 2: High income country. This ability increases his defence by 40, since he is now a developed country. Can only be used once.",
            "Ability 3: Top-down aid. He provides financial aid to all cards, allowing them to construct dams and improve their country's infrastructure. Increases the health and defence of all cards by 30. Has a 20% chance of causing the government to become corrupt and remove 10 defence from all cards."
    };
    public DevelopmentIndicatorsMan() {
        setHealth(150);
        setDefence(30);
        setAttack(0);
    }

    @Override
    public boolean isSupport() {
        return true;
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
    public float Ability1() {
        return 0;
    }

    @Override
    public void Ability2() {
        if(usesOfAbility2 > 0) {
            System.out.println("You are now a HIC, good job!");
            this.defence += 40;
            usesOfAbility2--;
        } else {
            System.out.println("You can't use this ability anymore, you are already a developed country");
        }

    }

    @Override
    public void Ability3() {

    }

    public void Ability1(CardMethods[] cards) {
        System.out.println("Fairtrade has been initialized");
        for(CardMethods card : cards) {
            card.setDefence(card.getDefence() - 15);
            card.setAttack(card.getAttack() + 10);
        }
    }

    public void Ability3(CardMethods[] cards) {
        int chance = Utilities.getRandom(10);
        if(chance > 7) {
            System.out.println("Bruh your government is corrupt.");
            for(CardMethods card : cards) {
                card.setDefence(card.getDefence() - 10);
            }
        } else {
            System.out.println("Ayy the government worked!");
            for(CardMethods card : cards) {
                card.setAttack(card.getAttack() + 30);
                card.setDefence(card.getDefence() + 30);
            }
        }
    }
}

class BebrasMan implements CardMethods {
    private float health, attack, defence;
    private final String[] descriptions = {
            "Ability 1: Attached is a python. Bebras Man attaches a python to the email. This can deal and output damage of 8 multiplied by his attack, but due to his bad grammar there is a chance that it won't be interpreted correctly decreasing his health by 30.",
            "Ability 2: The Microbit. Bebras Man uses the best physical component to make a self driving car. This increments his health by 20 and defence by 5.",
            "Ability 3: Coding in Notepad. Bebras Man uses the best IDE to code the next bebras exam. This increments his health by 15 and defence by 10. But since Notepad doesn't support intelli sense there is a chance that the whole project won't function decreasing his health by 20."
    };
    public BebrasMan() {
        setHealth(140);
        setDefence(20);
        setAttack(2);
    }
    @Override
    public boolean isSupport() {
        return false;
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
    public float Ability1() {
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
    public void Ability2() {
        defence += 5;
        health += 20;
    }

    @Override
    public void Ability3() {
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

class StackOverflowMan implements CardMethods {
    private float health, attack, defence;
    private final String[] descriptions = {
            "Ability 1: Water boils at 40 degrees. StackOverflowMan believes water boils at 40 degrees. This deals an output damage of 10 multiplied by his attack for the kids around him loose brain cells. However since he is an idot there is a 90 percent chance of it not working.",
            "Ability 2: Trying to learn a code. StackOverflowMan thinks he is so advanced and he is trying to learn how to program in c++. This could increase his defence by 20 and health by 30. But since he is an idot and doesn't know anything about programming, there is a 80 percent chance of it not working and decreasing his health by 20.",
            "Ability 3: Inadvanced. StackOverflowMan sweats blocc game during class and he doesn't pay attention and is just overall a very stupid person. Can increase defence by 1 and health by 1 but has a 90 percent chance of doing nothing."
    };
    public StackOverflowMan() {
        setAttack(1);
        setDefence(1);
        setHealth(100);
    }
    @Override
    public boolean isSupport() {
        return false;
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
    public float Ability1() {
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
    public void Ability2() {
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
    public void Ability3() {
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


class Boris implements CardMethods {

    @Override
    public boolean isSupport() {
        return false;
    }

    @Override
    public void setHealth(float health) {

    }

    @Override
    public void setDefence(float defence) {

    }

    @Override
    public void setAttack(float attack) {

    }

    @Override
    public float getHealth() {
        return 0;
    }

    @Override
    public float getDefence() {
        return 0;
    }

    @Override
    public float getAttack() {
        return 0;
    }

    @Override
    public String[] getDescriptions() {
        return new String[0];
    }

    @Override
    public float Ability1() {
        return 0;
    }

    @Override
    public void Ability2() {

    }

    @Override
    public void Ability3() {

    }
}

class BlockGameSweat implements CardMethods {
    private float health, attack, defence;
    private final String[] descriptions = {
            "Ability 1: Being Toxic. The Block Game sweat, sweats block game every second of his life and when he feels that someone might be cheating or when they combo some kid into oblivion, they get really toxic. Can deal 8 times their attack and increase their health 10, but has a 50% chance of losing 15 health as they are now banned from hypixel.",
            "Ability 2: Parabola Bridge. The Block Game sweat likes to flex on every other kid in the bedwars lobby, so he parabola bridges to person next to him. This could increase his defence by 5 and attack by 3, but he has a chance of falling off the bridge and losing all his items reducing his attack by 1.",
            "Ability 3: Jitter clicking. The block game sweat sweats pvp in order to get better at bedwars, so he learned how to jitter click fast. This has a chance to increase his defence by 5, attack by 5 and health by 5, however it could decrease his health by 5 for he has now contracted carpal tunnel."
    };
    public BlockGameSweat() {
        setAttack(5);
        setDefence(15);
        setHealth(140);
    }
    @Override
    public boolean isSupport() {
        return false;
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
    public float Ability1() {
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
    public void Ability2() {
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
    public void Ability3() {
        int chance = Utilities.getRandom(10);
        if(chance > 5) {
            health -= 5;
        }
        else {
            defence+= 5;
            attack += 5;
            health += 5;
        }
    }
}

class Dream implements CardMethods {
    @Override
    public boolean isSupport() {
        return false;
    }

    @Override
    public void setHealth(float health) {

    }

    @Override
    public void setDefence(float defence) {

    }

    @Override
    public void setAttack(float attack) {

    }

    @Override
    public float getHealth() {
        return 0;
    }

    @Override
    public float getDefence() {
        return 0;
    }

    @Override
    public float getAttack() {
        return 0;
    }

    @Override
    public String[] getDescriptions() {
        return new String[0];
    }

    @Override
    public float Ability1() {
        return 0;
    }

    @Override
    public void Ability2() {

    }

    @Override
    public void Ability3() {

    }
}

class Udhay implements CardMethods {

    @Override
    public boolean isSupport() {
        return false;
    }

    @Override
    public void setHealth(float health) {

    }

    @Override
    public void setDefence(float defence) {

    }

    @Override
    public void setAttack(float attack) {

    }

    @Override
    public float getHealth() {
        return 0;
    }

    @Override
    public float getDefence() {
        return 0;
    }

    @Override
    public float getAttack() {
        return 0;
    }

    @Override
    public String[] getDescriptions() {
        return new String[0];
    }

    @Override
    public float Ability1() {
        return 0;
    }

    @Override
    public void Ability2() {

    }

    @Override
    public void Ability3() {

    }
}