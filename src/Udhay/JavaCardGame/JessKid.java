package Udhay.JavaCardGame;

public class JessKid implements CardMethods {
    private float health, defence, attack;
    private int numberOfTimesBeingCaught = 3;
    private final String[] descriptions = {
            "Ability 1: Throws Objects around the class. The Jess Kid thinks that they are so advanced so they decide to throw things around the classroom, this can deal 30 output damage multiplied by their attack, but they have a chance of being caught!",
            "Ability 2: Rugby Rugby. The Jess Kid sweats games and rugby. They gain 2 attack and 5 defence.",
            "Ability 3: Use phone during class. The Jess Kid loves social media especially snapchat and instagram so they use their phones during class. Can increase health by 15, attack by 2 and defence by 10, but they have a chance of getting caught!"
    };
    public JessKid() {
        health = 80;
        defence = 20;
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
        return "jesskid";
    }

    @Override
    public float Ability1(CardMethods[] players, CardMethods[] enemies) {
        if(numberOfTimesBeingCaught > 0) {
            int chance = Utilities.getRandom(10);
            if(chance > 1) {
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
    public float Ability2(CardMethods[] players, CardMethods[] enemies) {
        if (numberOfTimesBeingCaught > 0) {
            attack += 2;
            defence += 5;
        } else {
            System.out.println("The teacher gives you a level one and send you back to class! You can use Ability one and Ability three again.");
            numberOfTimesBeingCaught = 3;
        }
        return 0;

    }

    @Override
    public float Ability3(CardMethods[] players, CardMethods[] enemies) {
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
        return 0;

    }

}
