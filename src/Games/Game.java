package Games;

import Games.ExtraGameBattleship.BattleshipMain;
import Games.ExtraGameMonsters.MonsterMain;
import player.Player;

import java.util.Scanner;

public class Game {


    private static Scanner sc = new Scanner(System.in);
    private static int option;

    private static String name;

    private static String passEnter = "";

    private static boolean win;
    private static int looser;
    private static boolean winMiniGame;


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
                        int posit = Board.aSpots.get(0).indexOf(Player.players.get(i).icons.icon);
                        if (j + dice >= 47) {
                            Board.boardGame();
                            System.out.println(Collors.redCollor + Player.players.get(i) + " reaches the end!!" + Collors.resetCollor);
                            Board.aSpots.get(j).set(0, "   ");
                            Board.aSpots.get(47).set(winner, Player.players.get(i).icons.icon);
                            Player.players.remove(i);
                            winner++;
                            i++;
                            if (Player.players.size() == 0) {
                                Board.boardGame();
                                System.out.println("Game finished!");
                                for (int k = 0; k < 10; k++) {
                                    System.out.println(k + 1 + ": " + Board.aSpots.get(47).get(k));
                                }
                            }
                            break;
                        }
                        if (j == 0) {                                                        //if first play
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
                        }
                        if (j != 0 && j < 47) {                                                            //if after first play
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


                        miniGames(j, dice, i);


                        break;

                    }
                }
            }
        }
    }


    public static void playersFight(int spotnumber) {
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
                if (spotnumber - dice1 <= 0) {
                    System.out.println("Sadly for " + Player.players.get(player1Posit) + " means he will have to back the starting spot.");
                    boolean found = false;
                    int counter = 0;
                    Board.aSpots.get(spotnumber).set(1, "   ");
                    while (!found) {
                        if (Board.aSpots.get(0).get(counter).contains("   ")) {
                            Board.aSpots.get(0).set(counter, Player.players.get(player1Posit).icons.icon);
                            found = true;
                        } else {
                            counter++;
                        }
                    }
                    break;
                } else {
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
            }
            if (dice0 < dice1) {
                System.out.println("Congratz! " + Player.players.get(player1Posit) + " won the fight!");
                if (spotnumber - dice0 <= 0) {
                    System.out.println("Sadly for " + Player.players.get(player0Posit) + " means he will have to back the starting spot.");
                    boolean found = false;
                    int counter = 0;
                    Board.aSpots.get(spotnumber).set(1, "   ");
                    Board.aSpots.get(spotnumber).set(0, Player.players.get(player1Posit).icons.icon);
                    while (!found) {
                        if (Board.aSpots.get(0).get(counter).contains("   ")) {
                            Board.aSpots.get(0).set(counter, Player.players.get(player0Posit).icons.icon);

                            found = true;
                        } else {
                            counter++;
                        }
                    }
                    break;
                } else {
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
                    System.out.println("Press enter to roll/fight again.");
                }
                passEnter = sc.nextLine();
            }
        }
    }

    public static void miniGames(int j, int dice, int i) {
        if (Board.aSpots.get(j + dice).get(1).contains(" ⭐")) {
            int game = (int) (Math.random() * 3) + 1;
            System.out.println("You entered at a mini game spot! Prepare to play!");
            System.out.println("Press enter to continue.");
            passEnter = sc.nextLine();
            switch (game) {
                case 1:
                    System.out.println("Mini Game: " + Collors.redCollor + "MONSTERS GAME" + Collors.resetCollor);
                    looser = MonsterMain.playMonsters(Player.players.get(i));
                    if (looser == 0) {
                        if (Board.aSpots.get(j - dice).get(0).contains("   ")) {
                            Board.aSpots.get(j - dice).set(0, Player.players.get(i).icons.icon);
                            Board.aSpots.get(j).set(0,"   ");
                        } else {
                            Board.aSpots.get(j - dice).set(1, Player.players.get(i).icons.icon);
                            Board.aSpots.get(j).set(0,"   ");
                            playersFight(j - dice);
                        }
                        Board.boardGame();
                        System.out.println("The looser went back dice(" + dice + ") houses back.");

                    }
                    if (looser == 1) {
                        if (Board.aSpots.get(i - dice).get(0).contains("   ")) {
                            Board.aSpots.get(i - dice).set(0, Board.aSpots.get(i).get(0));
                        } else {
                            Board.aSpots.get(i - dice).set(1, Board.aSpots.get(i).get(0));
                            playersFight(i - dice);
                        }
                        Board.aSpots.get(i).set(0, "   ");
                        Board.boardGame();
                        System.out.println("The looser went back dice(" + dice + ") houses back.");
                    }
                    break;
                case 2:
                    System.out.println("Mini Game: " + Collors.redCollor + "BATTLE SHIP" + Collors.resetCollor);
                    winMiniGame = BattleshipMain.playBattleship(Player.players.get(i));
                    if (winMiniGame == true) {
                        System.out.println("You go forward the previous dice number.(" + dice + ").");
                        if (Board.aSpots.get(j + dice).get(0).contains("   ")) {
                            Board.aSpots.get(j + dice).set(0, Player.players.get(i).icons.icon);
                        } else {
                            Board.aSpots.get(j + dice).set(1, Player.players.get(i).icons.icon);
                            playersFight(j + dice);
                        }
                        Board.aSpots.get(i).set(0, "   ");
                        Board.boardGame();

                    }
                    if (winMiniGame == false) {
                        System.out.println("You go back the previous dice number.(" + dice + ").");
                        if (Board.aSpots.get(j - dice).get(0).contains("   ")) {
                            Board.aSpots.get(j - dice).set(0, Player.players.get(i).icons.icon);
                        } else {
                            Board.aSpots.get(j - dice).set(1, Player.players.get(i).icons.icon);
                            playersFight(j - dice);
                        }
                        Board.aSpots.get(i).set(0, "   ");
                        Board.boardGame();

                    }
                    break;
                case 3:
                    System.out.println("Lucky you! This game is still under construction! See this as a free chance! Good luck.");
                    break;
            }

        }
    }
}














