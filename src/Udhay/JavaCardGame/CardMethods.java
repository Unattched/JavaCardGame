package Udhay.JavaCardGame;

public interface CardMethods {
    void setHealth(float health);
    void setDefence(float defence);
    void setAttack(float attack);
    float getHealth();
    float getDefence();
    float getAttack();
    String[] getDescriptions();
    float Ability1(CardMethods[] players);
    void Ability2(CardMethods[] players);
    void Ability3(CardMethods[] players);
}