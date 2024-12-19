import java.util.Scanner;

public class TreasureIsland {

    public static void main(String[] args) {
        startGame();
    }

    public static void startGame() {
        System.out.println("*******************************************************************************\r\n" + //
                        "                  |                   |                  |                     |\r\n" + //
                        "         _________|________________.=\"\"_;=.______________|_____________________|_______\r\n" + //
                        "        |                   |  ,-\"_,=\"\"     `\"=.                   |\r\n" + //
                        "        |___________________|__\"=.o`\"-._        `\"=.______________|___________________\r\n" + //
                        "                  |                `\"=.o`\"=.      _`\"=.                     |\r\n" + //
                        "         _________|_____________________:=._o \"=.\"_.-=\"'\"=.__________________|_______\r\n" + //
                        "        |                   |    __.--\" , ; `\"=.o.\" ,-\"\"\"-._ \".   |\r\n" + //
                        "        |___________________|_._\"  ,. .` ` `` ,  `\"-._\"-._   \". '__|___________________\r\n" + //
                        "                  |           |o`\"=.o`\"` , \"` `; .\" ,  \"-._\"-._; ;              |\r\n" + //
                        "         _________|___________| ;`-.o`\"=.o; .\" ` '`.\"` . \"-._ /_______________|_______\r\n" + //
                        "        |                   | |o;    `\"-.o`\"=.o``  '` \" ,__.--o;   |\r\n" + //
                        "        |___________________|_| ;     (#) `-.o `\"=.o_.--\"_o.-; ;___|___________________\r\n" + //
                        "        ____/______/______/___|o;._    \"      `\".o|o_.--\"    ;o;____/______/______/____\r\n" + //
                        "        /______/______/______/'\"=._o--._        ; | ;        ; ;/______/______/______/_\r\n" + //
                        "        ____/______/______/______/__\"=._o--._   ;o|o;     _._;o;____/______/______/____\r\n" + //
                        "        /______/______/______/______/____\"=._o._; | ;_.--\"o.--\"_/______/______/______/_\r\n" + //
                        "        ____/______/______/______/______/____\"=.o|o_.--\"\"___/______/______/______/____\r\n" + //
                        "        /______/______/______/______/______/______/______/______/______/______/_____ /\r\n" + //
                        "        *******************************************************************************\r\n" + //
                        "        ");
        System.out.println("Welcome to Treasure Island.");
        System.out.println("Your mission is to find the treasure.");
        crossRoad();
    }

    public static void crossRoad() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You're at a cross road. Where do you want to go? Type \"left\" or \"right\":");
        String choice1 = scanner.nextLine().toLowerCase();

        if (choice1.equals("left")) {
            forest();
        } else if (choice1.equals("right")) {
            System.out.println("You fell into a hole. Game Over.");
        } else {
            System.out.println("Invalid choice. Game Over.");
        }
    }

    public static void forest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You enter a dense forest. The path splits into two: one leads deeper into the forest, the other towards a clearing.");
        System.out.println("Do you want to go \"deeper\" or to the \"clearing\"?");
        String choice2 = scanner.nextLine().toLowerCase();

        if (choice2.equals("deeper")) {
            encounterAnimal();
        } else if (choice2.equals("clearing")) {
            lake();
        } else {
            System.out.println("Invalid choice. Game Over.");
        }
    }

    public static void encounterAnimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You encounter a wild animal! It seems aggressive.");
        System.out.println("Do you \"run\" away or \"stay\" and try to calm it down?");
        String choice3 = scanner.nextLine().toLowerCase();

        if (choice3.equals("run")) {
            System.out.println("You safely escape and find yourself near a lake.");
            lake();
        } else if (choice3.equals("stay")) {
            quizTime();
        } else {
            System.out.println("Invalid choice. Game Over.");
        }
    }

    public static void quizTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The animal speaks! It offers you a riddle to let you pass.");
        System.out.println("Riddle: I speak without a mouth and hear without ears. I have no body, but I come alive with the wind. What am I?");
        System.out.println("Your answer:");
        String answer = scanner.nextLine().toLowerCase();

        if (answer.equals("echo")) {
            System.out.println("Correct! The animal lets you pass.");
            lake();
        } else {
            System.out.println("Wrong answer. The animal chases you away. Game Over.");
        }
    }

    public static void lake() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You've come to a lake. There is an island in the middle of the lake. Type \"wait\" to wait for a boat. Type \"swim\" to swim across.");
        String choice4 = scanner.nextLine().toLowerCase();

        if (choice4.equals("wait")) {
            island();
        } else if (choice4.equals("swim")) {
            System.out.println("You get attacked by an angry trout. Game Over.");
        } else {
            System.out.println("Invalid choice. Game Over.");
        }
    }

    public static void island() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You arrive at the island unharmed. There is a house with 3 doors: one red, one yellow, and one blue. Which colour do you choose?");
        String choice5 = scanner.nextLine().toLowerCase();

        if (choice5.equals("red")) {
            System.out.println("It's a room full of fire. Game Over.");
        } else if (choice5.equals("yellow")) {
            treasureRoom();
        } else if (choice5.equals("blue")) {
            System.out.println("You enter a room of beasts. Game Over.");
        } else {
            System.out.println("You chose a door that doesn't exist. Game Over.");
        }
    }

    public static void treasureRoom() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Congratulations! You found the treasure room. But wait, there are 3 chests here: one gold, one silver, and one bronze.");
        System.out.println("Which chest do you open? Type \"gold\", \"silver\", or \"bronze\":");
        String chestChoice = scanner.nextLine().toLowerCase();

        if (chestChoice.equals("gold")) {
            System.out.println("The chest is full of gold coins! You are rich! You Win!");
        } else if (chestChoice.equals("silver")) {
            System.out.println("The chest contains silver, but it also releases a sleeping gas. Game Over.");
        } else if (chestChoice.equals("bronze")) {
            System.out.println("The chest contains a map to another treasure. The adventure continues... You Win!");
        } else {
            System.out.println("You chose a chest that doesn't exist. Game Over.");
        }
    }
}
