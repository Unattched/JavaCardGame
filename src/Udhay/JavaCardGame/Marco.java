package Udhay.JavaCardGame;

public class Marco implements CardMethods {
    private float health, attack, defence;
    private int usesOfAbility = 1;
    private final String[] descriptions = {
            "Ability 1: Gaming. He plays all the games in existence, deals 50 output damage multiplied by the attack, can only be used once.",
            "Ability 2: I only know Python and C#. Since he can only program slow applications and games using unity his attack is decreased by 2 but defence is increased by 15 due to specialization",
            "Ability 3: 1660 super. He has a relatively good gpu but it can't ray trace so attack increased by 1 and health increased by 5"};
    public Marco() {
        health = 90;
        defence = 20;
        attack = 4;
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
        return "marco";
    }

    @Override
    public float Ability1(CardMethods[] players, CardMethods[] enemies) {
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
    public float Ability2(CardMethods[] players, CardMethods[] enemies) {
        System.out.println("lmao imagine being a coder.");
        attack -= 2;
        defence += 15;
        return 0;
    }

    @Override
    public float Ability3(CardMethods[] players, CardMethods[] enemies) {
        System.out.println("lmao imagine having a gpu from 3 years ago");
        attack += 1;
        health += 5;
        return 0;
    }

}