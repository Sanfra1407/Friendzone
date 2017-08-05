/* Just for fun! Maybe... */

import java.util.Scanner;

public class Friendzone {
    static Scanner input = new Scanner(System.in);

    public static void main(String [] a)
    {
        System.out.println("\nWhat does she think about you?\n");
        friendzoneREPL();
        System.out.println("\nGoodbye mate!");
    }

    private static void friendzoneREPL()
    {
        int answer;

        System.out.println("1) I love you like a brother.");
        System.out.println("2) You are my best friend.");
        System.out.println("3) I don't want to ruin our friendship...");
        System.out.println("4) Other...");
        System.out.println("5) Better ragequit!");
        System.out.print("Insert number: ");
        answer = input.nextInt();
        checkFriendzone(answer);
    }

    public static void checkFriendzone(int answer)
    {
        if(answer < 1 || answer > 5){
            System.out.println("\nPlease insert a correct number!\n");
            friendzoneREPL();
        }
        else{
            switch (answer){
                case 1:
                    friendzoned("YOU HAVE BEEN VERY FRIENDZONED!");
                    break;
                case 2:
                    friendzoned("YOU HAVE BEEN FRIENDZONED!");
                    break;
                case 3:
                    friendzoned("You have been friendzoned.");
                    break;
                case 4:
                    System.out.println("\nI'm not sure, but it is possible that you've been friendzoned!");
                    break;
                case 5:
                    System.out.println("\nYes, this is the most correct approach! Don't hurt yourself.");
                    break;
            }
        }
    }

    private static void friendzoned(String friendzone)
    {
        boolean ok = false;
        while(ok != true){
            System.out.println("\n" + friendzone);
            System.out.println("\nDid you understand?");
            System.out.println("1) Yes");
            System.out.print("Enter your answer: ");
            int understood = input.nextInt();

            if(understood == 1) {
                ok = true;
            }
        }
    }
}

/* I really hope you'll never be friendzoned. */