package Udhay.JavaCardGame;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CardMethods[] Cards = {new Bebras(), new Marco(), new JessKid(), new DevelopmentIndicatorsMan(), new BebrasMan(), new StackOverflowMan(), new BlockGameSweat(), new Crypto()};
        CardMethods[] code = {new Bebras()};
        Cards[7].Ability2(code);
        System.out.println(code[0].getHealth());
    }

}