package Games.ExtraGameBattleship;

import Games.Collors;
import Games.TextEditor;
import player.Icons;
import player.Player;

import java.util.ArrayList;
import java.util.Scanner;

import static Games.ExtraGameBattleship.BattleshipBoard.*;

public class BattleshipMain {

    static String water = " 💧";
    static String fire = " 🔥";
    static String killed = " ☠️";

    static Scanner sc = new Scanner(System.in);

    static int option;
    static int positionX;
    static int numX;
    static String headDirection;
    static int positionY;
    static int numY;

    static ArrayList<Boat> teamBoat = new ArrayList<>();
    static ArrayList<Boat> teamEnemyBoat = new ArrayList<>();
    static Boat2 boat2 = new Boat2();
    static Boat2 boat2Enemy = new Boat2();
    static Boat3 boat3 = new Boat3();
    static Boat3 boat3Enemy = new Boat3();
    static Boat4 boat4 = new Boat4();
    static Boat4 boat4Enemy = new Boat4();
    static boolean win = false;
    static boolean playerWin;

    public static void main(String[] args) {

        Player chico = new Player("chico", Icons.Pig);
        playBattleship(chico);

    }

    public static boolean playBattleship(Player player) {
        teamBoat.add(boat2);
        teamBoat.add(boat3);
        teamBoat.add(boat4);

        teamEnemyBoat.add(boat2Enemy);
        teamEnemyBoat.add(boat3Enemy);
        teamEnemyBoat.add(boat4Enemy);

        TextEditor.battleshipIntro();
        setSeaBoard();
        BattleshipBoard.seeSeaBoard();
        gameInfo();
        placePlayerBoats();
        placeBotBoats();
        startPlay();

        return playerWin;

    }


    public static void gameInfo() {

        System.out.println("Game info: \nYou have 3 boats each, find enemy's boats before he finds yours!");
        System.out.println();
        System.out.println("Small boat(2slots):" + Boat2.icon.repeat(2));
        System.out.println("Medium boat(3slots):" + Boat3.icon.repeat(3));
        System.out.println("Big boat(4slots):" + Boat4.icon.repeat(4));

    }


    public static void placePlayerBoats() {

        System.out.println();
        System.out.println("Place your boats.");
        for (int i = 0; i < 3; i++) {
            positionY = 0;
            positionX = 0;
            switch (i) {
                case 0:
                    System.out.println("Small boat: \n[first X, then Y]");
                    System.out.print("Position X:");
                    positionX = sc.nextInt();
                    System.out.print("Position Y:");
                    positionY = sc.nextInt();
                    BattleshipBoard.seaBoard.get(positionX).set(positionY, Boat2.icon);
                    break;
                case 1:
                    System.out.println("Medium boat: \n[first X, then Y]");
                    System.out.print("Position X:");
                    positionX = sc.nextInt();
                    System.out.print("Position Y:");
                    positionY = sc.nextInt();
                    BattleshipBoard.seaBoard.get(positionX).set(positionY, Boat3.icon);
                    break;
                case 2:
                    System.out.println("Big boat: \n[first X, then Y]");
                    System.out.print("Position X:");
                    positionX = sc.nextInt();
                    System.out.print("Position Y:");
                    positionY = sc.nextInt();
                    BattleshipBoard.seaBoard.get(positionX).set(positionY, Boat4.icon);
                    break;
            }
            System.out.println("Place the head of the boat:\n[U for up, D for down, R for right, L for left]");
            System.out.print("Head direction(U,D,R,L):");
            headDirection = sc.next().toUpperCase();
            switch (i) {
                case 0:
                    switch (headDirection) {
                        case "U":
                            BattleshipBoard.seaBoard.get(positionX).set(positionY - 1, Boat2.icon);
                            System.out.println("(" + Boat2.icon.repeat(2) + ")" + " added to sea!");
                            seeSeaBoard();
                            break;
                        case "D":
                            BattleshipBoard.seaBoard.get(positionX).set(positionY + 1, Boat2.icon);
                            System.out.println("(" + Boat2.icon.repeat(2) + ")" + " added to sea!");
                            seeSeaBoard();
                            break;
                        case "R":
                            BattleshipBoard.seaBoard.get(positionX + 1).set(positionY, Boat2.icon);
                            System.out.println("(" + Boat2.icon.repeat(2) + ")" + " added to sea!");
                            seeSeaBoard();
                            break;
                        case "L":
                            BattleshipBoard.seaBoard.get(positionX - 1).set(positionY, Boat2.icon);
                            System.out.println("(" + Boat2.icon.repeat(2) + ")" + " added to sea!");
                            seeSeaBoard();
                            break;
                    }
                    break;
                case 1:
                    switch (headDirection) {
                        case "U":
                            BattleshipBoard.seaBoard.get(positionX).set(positionY - 1, Boat3.icon);
                            BattleshipBoard.seaBoard.get(positionX).set(positionY - 2, Boat3.icon);
                            System.out.println("(" + Boat3.icon.repeat(3) + ")" + " added to sea!");
                            seeSeaBoard();
                            break;
                        case "D":
                            BattleshipBoard.seaBoard.get(positionX).set(positionY + 1, Boat3.icon);
                            BattleshipBoard.seaBoard.get(positionX).set(positionY + 2, Boat3.icon);
                            System.out.println("(" + Boat3.icon.repeat(3) + ")" + " added to sea!");
                            seeSeaBoard();
                            break;
                        case "R":
                            BattleshipBoard.seaBoard.get(positionX + 1).set(positionY, Boat3.icon);
                            BattleshipBoard.seaBoard.get(positionX + 2).set(positionY, Boat3.icon);
                            System.out.println("(" + Boat3.icon.repeat(3) + ")" + " added to sea!");
                            seeSeaBoard();
                            break;
                        case "L":
                            BattleshipBoard.seaBoard.get(positionX - 1).set(positionY, Boat3.icon);
                            BattleshipBoard.seaBoard.get(positionX - 2).set(positionY, Boat3.icon);
                            System.out.println("(" + Boat3.icon.repeat(3) + ")" + " added to sea!");
                            seeSeaBoard();
                            break;
                    }
                    break;
                case 2:
                    switch (headDirection) {
                        case "U":
                            BattleshipBoard.seaBoard.get(positionX).set(positionY - 1, Boat4.icon);
                            BattleshipBoard.seaBoard.get(positionX).set(positionY - 2, Boat4.icon);
                            BattleshipBoard.seaBoard.get(positionX).set(positionY - 3, Boat4.icon);
                            System.out.println("(" + Boat4.icon.repeat(4) + ")" + " added to sea!");
                            seeSeaBoard();
                            break;
                        case "D":
                            BattleshipBoard.seaBoard.get(positionX).set(positionY + 1, Boat4.icon);
                            BattleshipBoard.seaBoard.get(positionX).set(positionY + 2, Boat4.icon);
                            BattleshipBoard.seaBoard.get(positionX).set(positionY + 3, Boat4.icon);
                            System.out.println("(" + Boat4.icon.repeat(4) + ")" + " added to sea!");
                            seeSeaBoard();
                            break;
                        case "R":
                            BattleshipBoard.seaBoard.get(positionX + 1).set(positionY, Boat4.icon);
                            BattleshipBoard.seaBoard.get(positionX + 2).set(positionY, Boat4.icon);
                            BattleshipBoard.seaBoard.get(positionX + 3).set(positionY, Boat4.icon);
                            System.out.println("(" + Boat4.icon.repeat(4) + ")" + " added to sea!");
                            seeSeaBoard();
                            break;
                        case "L":
                            BattleshipBoard.seaBoard.get(positionX - 1).set(positionY, Boat4.icon);
                            BattleshipBoard.seaBoard.get(positionX - 2).set(positionY, Boat4.icon);
                            BattleshipBoard.seaBoard.get(positionX - 3).set(positionY, Boat4.icon);
                            System.out.println("(" + Boat4.icon.repeat(4) + ")" + " added to sea!");
                            seeSeaBoard();
                            break;
                    }
                    break;
            }
        }
    }

    public static void placeBotBoats() {
        int limit = 8;
        for (int i = 0; i < 3; i++) {
            int numDirection = (int) Math.floor(Math.random() * 2);  // Spawn to 0=Down /  1=Right
            int numX = (int) (Math.random() * limit);
            int numY = (int) (Math.random() * limit);
            switch (i) {
                case 0:
                    BattleshipBoard.enemyBoardHidden.get(numX).set(numY, Boat2.icon);
                    if (numDirection == 0) {
                        BattleshipBoard.enemyBoardHidden.get(numX).set(numY + 1, Boat2.icon);
                    } else {
                        BattleshipBoard.enemyBoardHidden.get(numX + 1).set(numY, Boat2.icon);
                    }
                    limit--;
                    break;
                case 1:
                    if (numDirection == 0) {
                        if (BattleshipBoard.enemyBoardHidden.get(numX).get(numY).contains("   ") && BattleshipBoard.enemyBoardHidden.get(numX).get(numY + 1).contains("   ") && BattleshipBoard.enemyBoardHidden.get(numX).get(numY + 2).contains("   ")) {
                            BattleshipBoard.enemyBoardHidden.get(numX).set(numY, Boat3.icon);
                            BattleshipBoard.enemyBoardHidden.get(numX).set(numY + 1, Boat3.icon);
                            BattleshipBoard.enemyBoardHidden.get(numX).set(numY + 2, Boat3.icon);
                        } else {
                            i--;
                        }
                    }
                    if (numDirection == 1) {
                        if (BattleshipBoard.enemyBoardHidden.get(numX).get(numY).contains("   ") && BattleshipBoard.enemyBoardHidden.get(numX + 1).get(numY).contains("   ") && BattleshipBoard.enemyBoardHidden.get(numX + 2).get(numY).contains("   ")) {
                            BattleshipBoard.enemyBoardHidden.get(numX).set(numY, Boat3.icon);
                            BattleshipBoard.enemyBoardHidden.get(numX + 1).set(numY, Boat3.icon);
                            BattleshipBoard.enemyBoardHidden.get(numX + 2).set(numY, Boat3.icon);
                        } else {
                            i--;
                        }
                    }
                    limit--;
                    break;
                case 2:
                    if (numDirection == 0) {
                        if (BattleshipBoard.enemyBoardHidden.get(numX).get(numY).contains("   ") && BattleshipBoard.enemyBoardHidden.get(numX).get(numY + 1).contains("   ") && BattleshipBoard.enemyBoardHidden.get(numX).get(numY + 2).contains("   ") && BattleshipBoard.enemyBoardHidden.get(numX).get(numY + 3).contains("   ")) {
                            BattleshipBoard.enemyBoardHidden.get(numX).set(numY, Boat4.icon);
                            BattleshipBoard.enemyBoardHidden.get(numX).set(numY + 1, Boat4.icon);
                            BattleshipBoard.enemyBoardHidden.get(numX).set(numY + 2, Boat4.icon);
                            BattleshipBoard.enemyBoardHidden.get(numX).set(numY + 3, Boat4.icon);
                        } else {
                            i--;
                        }
                    }
                    if (numDirection == 1) {
                        if (BattleshipBoard.enemyBoardHidden.get(numX).get(numY).contains("   ") && BattleshipBoard.enemyBoardHidden.get(numX + 1).get(numY).contains("   ") && BattleshipBoard.enemyBoardHidden.get(numX + 2).get(numY).contains("   ") && BattleshipBoard.enemyBoardHidden.get(numX + 3).get(numY).contains("   ")) {

                            BattleshipBoard.enemyBoardHidden.get(numX).set(numY, Boat4.icon);
                            BattleshipBoard.enemyBoardHidden.get(numX + 1).set(numY, Boat4.icon);
                            BattleshipBoard.enemyBoardHidden.get(numX + 2).set(numY, Boat4.icon);
                            BattleshipBoard.enemyBoardHidden.get(numX + 3).set(numY, Boat4.icon);
                        } else {
                            i--;
                        }
                    }
                    break;
            }
        }
        System.out.println("Enemy boats placed!");

    }

    public static void startPlay() {
        System.out.println("Lets play! Good luck!");
        boolean botShot;
        while (!win) {
            for (int i = 0; i < 2; i++) {
                botShot = false;
                switch (i) {
                    case 0:        //Player turn
                        System.out.println("Place coordinates to order the attack! [first X, then Y]");
                        System.out.print("Position X:");
                        positionX = sc.nextInt();
                        System.out.print("Position Y:");
                        positionY = sc.nextInt();
                        if (BattleshipBoard.enemyBoardHidden.get(positionX).get(positionY).contains("   ")) {
                            BattleshipBoard.enemyBoard.get(positionX).set(positionY, water);
                            System.out.println("Water!💦");
                        }
                        if (BattleshipBoard.enemyBoardHidden.get(positionX).get(positionY).contains(Boat2.icon)) {
                            BattleshipBoard.enemyBoard.get(positionX).set(positionY, fire);
                            System.out.println("Fire!🔥 A ship  has been hit!!💥💥");
                            teamEnemyBoat.get(teamEnemyBoat.indexOf(boat2Enemy)).life--;

                        }
                        if (BattleshipBoard.enemyBoardHidden.get(positionX).get(positionY).contains(Boat3.icon)) {
                            BattleshipBoard.enemyBoard.get(positionX).set(positionY, fire);
                            System.out.println("Fire!🔥 A ship  has been hit!!💥💥");
                            teamEnemyBoat.get(teamEnemyBoat.indexOf(boat3Enemy)).life--;

                        }
                        if (BattleshipBoard.enemyBoardHidden.get(positionX).get(positionY).contains(Boat4.icon)) {
                            BattleshipBoard.enemyBoard.get(positionX).set(positionY, fire);
                            System.out.println("Fire!🔥 A ship  has been hit!!💥💥");
                            teamEnemyBoat.get(teamEnemyBoat.indexOf(boat4Enemy)).life--;

                        }
                        seeSeaBoard();
                        if (teamEnemyBoat.get(teamEnemyBoat.indexOf(boat2Enemy)).life == 0) {
                            for (int j = 0; j < enemyBoardHidden.size(); j++) {
                                for (int k = 0; k < 10; k++) {
                                    if (enemyBoardHidden.get(j).get(k).contains(Boat2.icon)) {
                                        enemyBoard.get(j).set(k, killed);
                                    }
                                }
                            }
                            teamEnemyBoat.get(teamEnemyBoat.indexOf(boat2Enemy)).life = -1;
                            System.out.println("Enemy " + Boat2.icon.repeat(2) + " has been shot down!");
                            seeSeaBoard();
                        }
                        if (teamEnemyBoat.get(teamEnemyBoat.indexOf(boat3Enemy)).life == 0) {
                            for (int j = 0; j < enemyBoardHidden.size(); j++) {
                                for (int k = 0; k < 10; k++) {
                                    if (enemyBoardHidden.get(j).get(k).contains(Boat3.icon)) {
                                        enemyBoard.get(j).set(k, killed);
                                    }
                                }
                            }
                            teamEnemyBoat.get(teamEnemyBoat.indexOf(boat3Enemy)).life = -1;
                            System.out.println("Enemy " + Boat3.icon.repeat(3) + " has been shot down!");
                            seeSeaBoard();
                        }
                        if (teamEnemyBoat.get(teamEnemyBoat.indexOf(boat4Enemy)).life == 0) {
                            for (int j = 0; j < enemyBoardHidden.size(); j++) {
                                for (int k = 0; k < 10; k++) {
                                    if (enemyBoardHidden.get(j).get(k).contains(Boat4.icon)) {
                                        enemyBoard.get(j).set(k, killed);
                                    }
                                }
                            }
                            teamEnemyBoat.get(teamEnemyBoat.indexOf(boat4Enemy)).life = -1;
                            System.out.println("Enemy " + Boat4.icon.repeat(4) + " has been shot down!");
                            seeSeaBoard();
                        }
                        if (teamEnemyBoat.get(teamEnemyBoat.indexOf(boat2Enemy)).life + teamEnemyBoat.get(teamEnemyBoat.indexOf(boat3Enemy)).life + teamEnemyBoat.get(teamEnemyBoat.indexOf(boat4Enemy)).life == -3) {
                            win = true;
                            playerWin = true;
                            i = 3;
                            System.out.println("YOU WIN!!!");
                        }
                        break;
                    case 1:     //Bot turn
                        System.out.println(Collors.redCollor + "Enemies are firing up! Watch out!" + Collors.resetCollor);
                        while (botShot == false) {
                            numX = (int) (Math.random() * 9);
                            numY = (int) (Math.random() * 9);

                            if (seaBoard.get(numX).get(numY) == water || seaBoard.get(numX).get(numY) == fire || seaBoard.get(numX).get(numY) == killed) {

                            } else {
                                botShot = true;
                                if (seaBoard.get(numX).get(numY) == "   ") {
                                    seaBoard.get(numX).set(numY, water);
                                    System.out.println("The enemy has shot your sea but missed your ships." + water + "[" + numX + "," + numY + "]");
                                }
                                if (seaBoard.get(numX).get(numY) == Boat2.icon) {
                                    seaBoard.get(numX).set(numY, fire);
                                    System.out.println("The enemy has shot your " + Boat2.icon.repeat(2) + "." + "[" + numX + "," + numY + "]");
                                    teamBoat.get(teamBoat.indexOf(boat2)).life--;
                                }
                                if (seaBoard.get(numX).get(numY) == Boat3.icon) {
                                    seaBoard.get(numX).set(numY, fire);
                                    System.out.println("The enemy has shot your " + Boat3.icon.repeat(3) + "." + "[" + numX + "," + numY + "]");
                                    teamBoat.get(teamBoat.indexOf(boat3)).life--;
                                }
                                if (seaBoard.get(numX).get(numY) == Boat4.icon) {
                                    seaBoard.get(numX).set(numY, fire);
                                    System.out.println("The enemy has shot your " + Boat4.icon.repeat(4) + "." + "[" + numX + "," + numY + "]");
                                    teamBoat.get(teamBoat.indexOf(boat4)).life--;
                                }
                            }
                            System.out.println();

                            if (teamBoat.get(teamBoat.indexOf(boat2)).life == 0) {
                                for (int j = 0; j < seaBoard.size(); j++) {
                                    for (int k = 0; k < 10; k++) {
                                        if (seaBoard.get(j).get(k).contains(Boat2.icon)) {
                                            seaBoard.get(j).set(k, killed);
                                        }
                                    }
                                }
                                teamBoat.get(teamBoat.indexOf(boat2)).life = -1;
                                System.out.println("Enemy " + Boat2.icon.repeat(2) + " has been shot down!");
                                seeSeaBoard();
                            }
                            if (teamBoat.get(teamBoat.indexOf(boat3)).life == 0) {
                                for (int j = 0; j < seaBoard.size(); j++) {
                                    for (int k = 0; k < 10; k++) {
                                        if (seaBoard.get(j).get(k).contains(Boat3.icon)) {
                                            seaBoard.get(j).set(k, killed);
                                        }
                                    }
                                }
                                teamBoat.get(teamBoat.indexOf(boat3)).life = -1;
                                System.out.println("Enemy " + Boat3.icon.repeat(3) + " has been shot down!");
                                seeSeaBoard();
                            }
                            if (teamBoat.get(teamBoat.indexOf(boat4)).life == 0) {
                                for (int j = 0; j < seaBoard.size(); j++) {
                                    for (int k = 0; k < 10; k++) {
                                        if (seaBoard.get(j).get(k).contains(Boat4.icon)) {
                                            seaBoard.get(j).set(k, killed);
                                        }
                                    }
                                }
                                teamBoat.get(teamBoat.indexOf(boat4)).life = -1;
                                System.out.println("Enemy " + Boat4.icon.repeat(4) + " has been shot down!");
                                seeSeaBoard();
                            }
                            if (teamBoat.get(teamBoat.indexOf(boat2)).life + teamBoat.get(teamBoat.indexOf(boat3)).life + teamBoat.get(teamBoat.indexOf(boat4)).life == -3) {
                                win = true;
                                playerWin = false;
                                i = 3;
                                System.out.println("YOU LOOSE! THE ENEMY SUNK ALL YOUR SHIPS!!");
                            }

                        }
                }

            }
        }
    }
}



