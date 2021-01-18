package Udhay.JavaCardGame;

class Udhay implements CardMethods {
    private float health, attack, defence;
    private final String[] descriptions = {
        "Ability 1: Sweats Integrals. Udhay is really advanced so he sweats university integrals really easily. Can deal 10 damage multiplied by his attack, but if Jess kid is present within his team, damage is reduced to 8.",
        "Ability 2: Quantum Superposition. Udhay has mastered multiple concepts of quantum physics and now can perform them in real life. He can be within two places at once, which allows him to increase his defence by 200 but there is a 80 percent chance the technique wouldn't work.",
        "Ability 3: Linear algebra. Udhay sweats linear algebra as well so he can use some extra techniques with that. He becomes a tensor, a very large data type which can store enormous amounts of data, increasing his defence by 10, and dealing an output damage of 2 multiplied by his attack. Damage is decreased to one if Jess Kid is present within his team."
    };
    public Udhay() {
        health = 180;
        attack = 4;
        defence = 10;
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
    public String getCard() {
        return "udhay";
    }

    @Override
    public float Ability1(CardMethods[] players, CardMethods[] enemies) {
        for(CardMethods player: players) {
            if(player.getCard().equals("jesskid")) {
                System.out.println("The Jess kid is so inadvanced");
                return attack * 8;
            }
        }
        System.out.println("Thank god the Jess kids aren't in your team");
        return attack * 10;

    }

    @Override
    public float Ability2(CardMethods[] players, CardMethods[] enemies) {
        int chance = Utilities.getRandom(5);
        if(chance > 3) {
            System.out.println("Am I here, or am I there");
            defence += 200;
        }
        return 0;
    }

    @Override
    public float Ability3(CardMethods[] players, CardMethods[] enemies) {
        defence += 20;
        for(CardMethods player: players) {
            if(player.getCard().equals("jesskid")) {
                return attack;
            }
        }
        return attack * 2;
    }

}
