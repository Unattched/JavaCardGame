package Udhay.JavaCardGame;


public class DevelopmentIndicatorsMan implements CardMethods {
    private float health, defence;
    private int usesOfAbility2 = 1;
    private final String[] descriptions = {
            "Ability 1: Fairtrade. Helps African farmers by providing fair prices for coffee and chocolate: increase health of all cards by 10, but loses 15 defence.",
            "Ability 2: High income country. This ability increases his defence by 40, since he is now a developed country. Can only be used once.",
            "Ability 3: Top-down aid. He provides financial aid to all cards, allowing them to construct dams and improve their country's infrastructure. Increases the health and defence of all cards by 30. Has a 20% chance of causing the government to become corrupt and remove 10 defence from all cards."
    };
    public DevelopmentIndicatorsMan() {
        health = 150;
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
        return 0;
    }

    @Override
    public String[] getDescriptions() {
        return descriptions;
    }

    @Override
    public float Ability1(CardMethods[] players) {
        System.out.println("Fairtrade has been initialized");
        for(CardMethods player : players) {
            player.setDefence(player.getDefence() - 15);
            player.setAttack(player.getAttack() + 10);
        }
        return 0;
    }

    @Override
    public void Ability2(CardMethods[] players) {
        if(usesOfAbility2 > 0) {
            System.out.println("You are now a HIC, good job!");
            this.defence += 40;
            usesOfAbility2--;
        } else {
            System.out.println("You can't use this ability anymore, you are already a developed country");
        }

    }

    @Override
    public void Ability3(CardMethods[] players) {
        int chance = Utilities.getRandom(10);
        if(chance > 7) {
            System.out.println("Bruh your government is corrupt.");
            for(CardMethods player : players) {
                player.setDefence(player.getDefence() - 10);
            }
        } else {
            System.out.println("Ayy the government worked!");
            for(CardMethods player: players) {
                player.setAttack(player.getAttack() + 30);
                player.setDefence(player.getDefence() + 30);
            }
        }
    }


}