import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Diff21 {

    public int difference21(int n){
        Scanner sc = new Scanner(System.in);
        if(n>21){
            return (n-21)*2;
        }
        return 21-n;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = sc.nextLine();
        System.out.println("Nice to meet you, " +name + ". I am a computer hehe.");
        System.out.println("Would you like to play a game?");
        String answer = sc.nextLine();
        if(answer.equalsIgnoreCase("yes")){
            System.out.println("Great I would love to play a game!");
        } else {
            System.out.println("Aww.. That's good bad, I love games.");
        }
    }

}


