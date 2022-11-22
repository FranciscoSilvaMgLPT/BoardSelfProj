package Game;

import Game.ExtraGameMonsters.MonsterMain;
import player.Player;

import java.util.Scanner;

public class Game {


    private static Scanner sc = new Scanner(System.in);
    private static int option;

    private static String name;

    private static String passEnter = "";

    private static boolean win;

    public static void gameStart() {
        Board.setBoardSpots();
        Player.addInitialIcons();
        TextEditor.diceMagicText();
        numberOfPlayersIconChoose();
        Board.setPlayersStart();
        Board.boardGame();
        rollDice();

    }


    public static void numberOfPlayersIconChoose() {
        TextEditor.numberOfPlayersText();
        System.out.print("Players:");
        option = sc.nextInt();
        System.out.println();
        for (int numberCase = 1; numberCase <= option; numberCase++) {
            TextEditor.playerText();
            System.out.println(numberCase + ":");
            System.out.print("Name:");
            name = sc.next();
            System.out.println();
            TextEditor.iconNumberText();
            System.out.println(Player.avaiableIcons);
            System.out.print("Character number:");
            int option1 = sc.nextInt();
            Player p1 = new Player(name, Player.avaiableIcons.get(option1 - 1));
            Player.players.add(p1);
            Player.avaiableIcons.remove(option1 - 1);
            System.out.println();
            System.out.println(Collors.blueCollor + "Player " + p1 + " has been added. Welcome and good luck!" + Collors.resetCollor);
        }
    }


    public static void rollDice() {
        int winner = 0;
        System.out.println("Good luck!");
        passEnter = sc.nextLine();
        while (!win) {
            for (int i = 0; i < Player.players.size(); i++) {
                TextEditor.separatorText();
                System.out.println("Player " + " [" + Player.players.get(i) + "] turn!");
                System.out.println("Press enter to roll the dice");
                passEnter = sc.nextLine();
                int dice = (int) (Math.random() * 6) + 1;
                for (int j = 0; j < Board.aSpots.size(); j++) {
                    if (Board.aSpots.get(j).contains(Player.players.get(i).icons.icon)) {//Find player in board
                        if (j + dice >= 47) {
                            System.out.println(Collors.redCollor + Player.players.get(i) + " reaches the end!!" + Collors.resetCollor);
                            Board.aSpots.get(j).set(0, "   ");
                            Board.aSpots.get(47).set(winner, Player.players.get(i).icons.icon);
                            Player.players.remove(i);
                            winner++;
                            Board.boardGame();
                            break;
                        }
                        if (j == 0) {                                                        //if first play
                            int posit = Board.aSpots.get(0).indexOf(Player.players.get(i).icons.icon);
                            if (Board.aSpots.get(j + dice).get(0).contains("   ")) {         //No player on spot?
                                Board.aSpots.get(j).set(posit, "   ");
                                Board.aSpots.get(j + dice).set(0, Player.players.get(i).icons.icon);
                                Board.boardGame();
                                System.out.println(Player.players.get(i) + " " + Collors.redBCollor + "Dice number:" + Collors.resetCollor + " " + dice);
                            } else {
                                Board.aSpots.get(j).set(posit, "   ");
                                Board.aSpots.get(j + dice).set(1, Player.players.get(i).icons.icon);
                                Board.boardGame();
                                System.out.println(Player.players.get(i) + " " + Collors.redBCollor + "Dice number:" + Collors.resetCollor + " " + dice);
                                playersFight(j + dice);
                                Board.boardGame();
                            }
                        } else {                                                            //if after first play
                            if (Board.aSpots.get(j + dice).get(0).contains("   ")) {
                                Board.aSpots.get(j).set(0, "   ");                          //no players on spot?
                                Board.aSpots.get(j + dice).set(0, Player.players.get(i).icons.icon);
                                Board.boardGame();
                                System.out.println(Player.players.get(i) + " " + Collors.redBCollor + "Dice number:" + Collors.resetCollor + " " + dice);
                            } else {
                                Board.aSpots.get(j).set(0, "   ");
                                Board.aSpots.get(j + dice).set(1, Player.players.get(i).icons.icon);
                                Board.boardGame();
                                System.out.println(Player.players.get(i) + " " + Collors.redBCollor + "Dice number:" + Collors.resetCollor + " " + dice);
                                playersFight(j + dice);
                                Board.boardGame();
                            }
                        }

                        //Enter "mini"Games
                        if(Board.aSpots.get(j+dice).get(1).contains(" ⭐")){
                            int game = (int) (Math.random() * 3) + 1;
                            System.out.println("You entered at a mini game spot! Prepare to play!");
                            System.out.println("Press enter to continue.");
                            passEnter = sc.nextLine();
                            switch (game){
                                case 1:
                                    System.out.println("Mini Game: "+Collors.redCollor+"MONSTERS GAME"+Collors.resetCollor);
                                    System.out.println(MonsterMain.playMonsters(Player.players.get(i))+" TESTIIIING");
                                    break;
                                case 2:
                                    System.out.println("Mini Game: "+Collors.redCollor+"MONSTERS GAME"+Collors.resetCollor);
                                    System.out.println(MonsterMain.playMonsters(Player.players.get(i))+" TESTIIIING");
                                    break;
                                case 3:
                                    System.out.println("Mini Game: "+Collors.redCollor+"MONSTERS GAME"+Collors.resetCollor);
                                    System.out.println(MonsterMain.playMonsters(Player.players.get(i))+" TESTIIIING");
                                    break;
                            }

                        }
                        break;
                    }
                }
            }
        }
    }


    public static void playersFight(int spotnumber) {
        int counter = 0;
        int player0Posit = 0;
        int player1Posit = 0;
        int dice0 = 0;
        int dice1 = 0;
        for (int i = 0; i < Player.players.size(); i++) {
            if (Board.aSpots.get(spotnumber).get(0).contains(Player.players.get(i).icons.icon)) {
                player0Posit = i;
            }
            if (Board.aSpots.get(spotnumber).get(1).contains(Player.players.get(i).icons.icon)) {
                player1Posit = i;
            }
        }
        System.out.println(Collors.redBCollor + "Seems like we have two players that don't like to share in the same spot, they want to win the race and now they fight for it!");
        System.out.println(Collors.resetCollor + "Press enter to start the fight! " + Collors.redCollor + ">>>>> " + Player.players.get(player0Posit) + " VS " + Player.players.get(player1Posit) + " <<<<<" + Collors.resetCollor);
        passEnter = sc.nextLine();
        while (dice0 == dice1) {
            dice0 = (int) (Math.random() * 6) + 1;
            dice1 = (int) (Math.random() * 6) + 1;
            System.out.println(Player.players.get(player0Posit) + " rolled the dice and got: " + dice0);
            System.out.println(Player.players.get(player1Posit) + " rolled the dice and got: " + dice1);
            if (dice0 > dice1) {
                System.out.println("Congratz! " + Player.players.get(player0Posit) + " won the fight!");
                System.out.println("Sadly for " + Player.players.get(player1Posit) + " means he will have to back the number of houses of his dice (" + dice1 + ").");
                Board.aSpots.get(spotnumber).set(1, "   ");

                if (Board.aSpots.get(spotnumber - dice1).get(0).contains("   ")) {
                    Board.aSpots.get(spotnumber - dice1).set(0, Player.players.get(player1Posit).icons.icon);
                    Board.aSpots.get(spotnumber).set(0, Player.players.get(player0Posit).icons.icon);
                } else {
                    Board.aSpots.get(spotnumber - dice1).set(1, Player.players.get(player1Posit).icons.icon);
                    Board.boardGame();
                    playersFight(spotnumber - dice1);
                }
            }
            if (dice0 < dice1) {
                System.out.println("Congratz! " + Player.players.get(player1Posit) + " won the fight!");
                System.out.println("Sadly for " + Player.players.get(player0Posit) + " means he will have to back the number of houses of his dice (" + dice0 + ").");
                Board.aSpots.get(spotnumber).set(1, "   ");

                if (Board.aSpots.get(spotnumber - dice0).get(0).contains("   ")) {
                    Board.aSpots.get(spotnumber - dice0).set(0, Player.players.get(player0Posit).icons.icon);
                    Board.aSpots.get(spotnumber).set(0, Player.players.get(player1Posit).icons.icon);
                } else {
                    Board.aSpots.get(spotnumber).set(0, Player.players.get(player1Posit).icons.icon);
                    Board.aSpots.get(spotnumber - dice0).set(1, Player.players.get(player0Posit).icons.icon);
                    Board.boardGame();
                    playersFight(spotnumber - dice0);
                }
            }
            if (dice0 == dice1) {
                System.out.println("Its a draw!");
                System.out.println("Press enter to reroll/fight again.");
            }
            passEnter = sc.nextLine();
        }
    }
}














