package Udhay.JavaCardGame;

public class Crypto implements CardMethods {
    private float health, defence, attack;
    private final String[] descriptions = {
            "Ability 1: Putting his eye in the sky. Since Crypto is a hackerman he can hack anyone with his drone so he throws it into the sky and controls it with his rubik's cube to see whether the kids hiding place is secure. This can deal an output damage of 8 multiplied by his attack, and increase his health by 10. But there is a chance that his drone can get destroyed, reducing his health by 10.",
            "Ability 2: Off the grid is the only secure way to go. Crypto is such a good hackerman that he knows a lot about encryption, and he deduces that off the grid is the only secure way to go. This could increase the team's defence by 20 and health by 20, but it has a chance to make them isolated decreasing their health by 25.",
            "Ability 3: Initiating system reboot. After DDoSing the shit out of everyone, he needs to reboot his system. Increases defence and attack of the team by 10 but decreases the team's health by 5."
    };
    public Crypto() {
        health = 160;
        attack = 5;
        defence = 30;
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
        if(chance > 6) {
            System.out.println("Your drone got destroyed, bruh");
            health -= 10;
            return 0;
        }
        else {
            System.out.println("Lmao they call this secure, launching emp");
            health += 10;
            return attack * 8;
        }
    }

    @Override
    public void Ability2(CardMethods[] players) {
        int chance = Utilities.getRandom(10);
        if(chance > 5) {
            System.out.println("Well your off the grid, and now your completely isolated from society.");
            for (CardMethods player : players) {
                player.setHealth(player.getHealth() - 25);
            }
        }
        else {
            System.out.println("Well your off the grid, and now your completely isolated from society.");
            for (CardMethods player : players) {
                player.setDefence(player.getDefence() + 20);
                player.setHealth(player.getHealth() + 20);
            }
        }
    }

    @Override
    public void Ability3(CardMethods[] players) {
        System.out.println("Initiating system reboot.");
        for(CardMethods player: players) {
            player.setDefence(player.getDefence() + 10);
            player.setAttack(player.getAttack() + 10);
            player.setHealth(player.getHealth() -5);
        }
    }
}
