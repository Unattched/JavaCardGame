package Udhay.JavaCardGame;

import javax.swing.text.Caret;

public interface CardMethods {
    void setHealth(float health);
    void setDefence(float defence);
    void setAttack(float attack);
    String getCard();
    float getHealth();
    float getDefence();
    float getAttack();
    String[] getDescriptions();
    float Ability1(CardMethods[] players, CardMethods[] enemies);
    float Ability2(CardMethods[] players, CardMethods[] enemies);
    float Ability3(CardMethods[] players, CardMethods[] enemies);
}