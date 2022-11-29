package Games.ExtraGameBattleship;

import Games.Collors;
import Games.TextEditor;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class BattleshipBoard {


    static ArrayList<ArrayList<String>> seaBoard = new ArrayList<>();
    static ArrayList<ArrayList<String>> enemyBoard = new ArrayList<>();

    static ArrayList<ArrayList<String>> enemyBoardHidden = new ArrayList<>();

    public static void setSeaBoard() {
        seaBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        seaBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        seaBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        seaBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        seaBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        seaBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        seaBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        seaBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        seaBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        seaBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        seaBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));

        enemyBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        enemyBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        enemyBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        enemyBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        enemyBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        enemyBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        enemyBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        enemyBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        enemyBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        enemyBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        enemyBoard.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));

        enemyBoardHidden.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        enemyBoardHidden.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        enemyBoardHidden.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        enemyBoardHidden.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        enemyBoardHidden.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        enemyBoardHidden.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        enemyBoardHidden.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        enemyBoardHidden.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        enemyBoardHidden.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        enemyBoardHidden.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        enemyBoardHidden.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));

    }

    public static void seeSeaBoard() {
        System.out.println();
        System.out.println("              Y");
        System.out.println("              ⬇️         "+ Collors.blueCollor+"🌊|| YOUR SEA ||🌊                                                                                                         "+Collors.redCollor+"🌊|| ENEMY SEA ||🌊"+Collors.resetCollor);
        System.out.println("         X ➡️     "+ Collors.blueCollor+"0   1   2   3   4   5   6   7   8   9"+Collors.redCollor+"                                                                                    0   1   2   3   4   5   6   7   8   9");
        System.out.println("              "+Collors.blueCollor+"0"+Collors.resetCollor+" |" + seaBoard.get(0).get(0) + "|" + seaBoard.get(1).get(0) + "|" + seaBoard.get(2).get(0) + "|" + seaBoard.get(3).get(0) + "|" + seaBoard.get(4).get(0) + "|" + seaBoard.get(5).get(0) + "|" + seaBoard.get(6).get(0) + "|" + seaBoard.get(7).get(0) + "|" + seaBoard.get(8).get(0) + "|" + seaBoard.get(9).get(0) + "|                                                                              "+ Collors.redCollor+"0"+Collors.resetCollor+" |" + enemyBoard.get(0).get(0) + "|" + enemyBoard.get(1).get(0) + "|" + enemyBoard.get(2).get(0) + "|" + enemyBoard.get(3).get(0) + "|" + enemyBoard.get(4).get(0) + "|" + enemyBoard.get(5).get(0) + "|" + enemyBoard.get(6).get(0) + "|" + enemyBoard.get(7).get(0) + "|" + enemyBoard.get(8).get(0) + "|" + enemyBoard.get(9).get(0) + "|");
        System.out.println("              "+Collors.blueCollor+"1"+Collors.resetCollor+" |" + seaBoard.get(0).get(1) + "|" + seaBoard.get(1).get(1) + "|" + seaBoard.get(2).get(1) + "|" + seaBoard.get(3).get(1) + "|" + seaBoard.get(4).get(1) + "|" + seaBoard.get(5).get(1) + "|" + seaBoard.get(6).get(1) + "|" + seaBoard.get(7).get(1) + "|" + seaBoard.get(8).get(1) + "|" + seaBoard.get(9).get(1) + "|                                                                              "+ Collors.redCollor+"1"+Collors.resetCollor+" |" + enemyBoard.get(0).get(1) + "|" + enemyBoard.get(1).get(1) + "|" + enemyBoard.get(2).get(1) + "|" + enemyBoard.get(3).get(1) + "|" + enemyBoard.get(4).get(1) + "|" + enemyBoard.get(5).get(1) + "|" + enemyBoard.get(6).get(1) + "|" + enemyBoard.get(7).get(1) + "|" + enemyBoard.get(8).get(1) + "|" + enemyBoard.get(9).get(1) + "|");
        System.out.println("              "+Collors.blueCollor+"2"+Collors.resetCollor+" |" + seaBoard.get(0).get(2) + "|" + seaBoard.get(1).get(2) + "|" + seaBoard.get(2).get(2) + "|" + seaBoard.get(3).get(2) + "|" + seaBoard.get(4).get(2) + "|" + seaBoard.get(5).get(2) + "|" + seaBoard.get(6).get(2) + "|" + seaBoard.get(7).get(2) + "|" + seaBoard.get(8).get(2) + "|" + seaBoard.get(9).get(2) + "|                                                                              "+ Collors.redCollor+"2"+Collors.resetCollor+" |" + enemyBoard.get(0).get(2) + "|" + enemyBoard.get(1).get(2) + "|" + enemyBoard.get(2).get(2) + "|" + enemyBoard.get(3).get(2) + "|" + enemyBoard.get(4).get(2) + "|" + enemyBoard.get(5).get(2) + "|" + enemyBoard.get(6).get(2) + "|" + enemyBoard.get(7).get(2) + "|" + enemyBoard.get(8).get(2) + "|" + enemyBoard.get(9).get(2) + "|");
        System.out.println("              "+Collors.blueCollor+"3"+Collors.resetCollor+" |" + seaBoard.get(0).get(3) + "|" + seaBoard.get(1).get(3) + "|" + seaBoard.get(2).get(3) + "|" + seaBoard.get(3).get(3) + "|" + seaBoard.get(4).get(3) + "|" + seaBoard.get(5).get(3) + "|" + seaBoard.get(6).get(3) + "|" + seaBoard.get(7).get(3) + "|" + seaBoard.get(8).get(3) + "|" + seaBoard.get(9).get(3) + "|                                                                              "+ Collors.redCollor+"3"+Collors.resetCollor+" |" + enemyBoard.get(0).get(3) + "|" + enemyBoard.get(1).get(3) + "|" + enemyBoard.get(2).get(3) + "|" + enemyBoard.get(3).get(3) + "|" + enemyBoard.get(4).get(3) + "|" + enemyBoard.get(5).get(3) + "|" + enemyBoard.get(6).get(3) + "|" + enemyBoard.get(7).get(3) + "|" + enemyBoard.get(8).get(3) + "|" + enemyBoard.get(9).get(3) + "|");
        System.out.println("              "+Collors.blueCollor+"4"+Collors.resetCollor+" |" + seaBoard.get(0).get(4) + "|" + seaBoard.get(1).get(4) + "|" + seaBoard.get(2).get(4) + "|" + seaBoard.get(3).get(4) + "|" + seaBoard.get(4).get(4) + "|" + seaBoard.get(5).get(4) + "|" + seaBoard.get(6).get(4) + "|" + seaBoard.get(7).get(4) + "|" + seaBoard.get(8).get(4) + "|" + seaBoard.get(9).get(4) + "|                                                                              "+ Collors.redCollor+"4"+Collors.resetCollor+" |" + enemyBoard.get(0).get(4) + "|" + enemyBoard.get(1).get(4) + "|" + enemyBoard.get(2).get(4) + "|" + enemyBoard.get(3).get(4) + "|" + enemyBoard.get(4).get(4) + "|" + enemyBoard.get(5).get(4) + "|" + enemyBoard.get(6).get(4) + "|" + enemyBoard.get(7).get(4) + "|" + enemyBoard.get(8).get(4) + "|" + enemyBoard.get(9).get(4) + "|");
        System.out.println("              "+Collors.blueCollor+"5"+Collors.resetCollor+" |" + seaBoard.get(0).get(5) + "|" + seaBoard.get(1).get(5) + "|" + seaBoard.get(2).get(5) + "|" + seaBoard.get(3).get(5) + "|" + seaBoard.get(4).get(5) + "|" + seaBoard.get(5).get(5) + "|" + seaBoard.get(6).get(5) + "|" + seaBoard.get(7).get(5) + "|" + seaBoard.get(8).get(5) + "|" + seaBoard.get(9).get(5) + "|                                                                              "+ Collors.redCollor+"5"+Collors.resetCollor+" |" + enemyBoard.get(0).get(5) + "|" + enemyBoard.get(1).get(5) + "|" + enemyBoard.get(2).get(5) + "|" + enemyBoard.get(3).get(5) + "|" + enemyBoard.get(4).get(5) + "|" + enemyBoard.get(5).get(5) + "|" + enemyBoard.get(6).get(5) + "|" + enemyBoard.get(7).get(5) + "|" + enemyBoard.get(8).get(5) + "|" + enemyBoard.get(9).get(5) + "|");
        System.out.println("              "+Collors.blueCollor+"6"+Collors.resetCollor+" |" + seaBoard.get(0).get(6) + "|" + seaBoard.get(1).get(6) + "|" + seaBoard.get(2).get(6) + "|" + seaBoard.get(3).get(6) + "|" + seaBoard.get(4).get(6) + "|" + seaBoard.get(5).get(6) + "|" + seaBoard.get(6).get(6) + "|" + seaBoard.get(7).get(6) + "|" + seaBoard.get(8).get(6) + "|" + seaBoard.get(9).get(6) + "|                                                                              "+ Collors.redCollor+"6"+Collors.resetCollor+" |" + enemyBoard.get(0).get(6) + "|" + enemyBoard.get(1).get(6) + "|" + enemyBoard.get(2).get(6) + "|" + enemyBoard.get(3).get(6) + "|" + enemyBoard.get(4).get(6) + "|" + enemyBoard.get(5).get(6) + "|" + enemyBoard.get(6).get(6) + "|" + enemyBoard.get(7).get(6) + "|" + enemyBoard.get(8).get(6) + "|" + enemyBoard.get(9).get(6) + "|");
        System.out.println("              "+Collors.blueCollor+"7"+Collors.resetCollor+" |" + seaBoard.get(0).get(7) + "|" + seaBoard.get(1).get(7) + "|" + seaBoard.get(2).get(7) + "|" + seaBoard.get(3).get(7) + "|" + seaBoard.get(4).get(7) + "|" + seaBoard.get(5).get(7) + "|" + seaBoard.get(6).get(7) + "|" + seaBoard.get(7).get(7) + "|" + seaBoard.get(8).get(7) + "|" + seaBoard.get(9).get(7) + "|                                                                              "+ Collors.redCollor+"7"+Collors.resetCollor+" |" + enemyBoard.get(0).get(7) + "|" + enemyBoard.get(1).get(7) + "|" + enemyBoard.get(2).get(7) + "|" + enemyBoard.get(3).get(7) + "|" + enemyBoard.get(4).get(7) + "|" + enemyBoard.get(5).get(7) + "|" + enemyBoard.get(6).get(7) + "|" + enemyBoard.get(7).get(7) + "|" + enemyBoard.get(8).get(7) + "|" + enemyBoard.get(9).get(7) + "|");
        System.out.println("              "+Collors.blueCollor+"8"+Collors.resetCollor+" |" + seaBoard.get(0).get(8) + "|" + seaBoard.get(1).get(8) + "|" + seaBoard.get(2).get(8) + "|" + seaBoard.get(3).get(8) + "|" + seaBoard.get(4).get(8) + "|" + seaBoard.get(5).get(8) + "|" + seaBoard.get(6).get(8) + "|" + seaBoard.get(7).get(8) + "|" + seaBoard.get(8).get(8) + "|" + seaBoard.get(9).get(8) + "|                                                                              "+ Collors.redCollor+"8"+Collors.resetCollor+" |" + enemyBoard.get(0).get(8) + "|" + enemyBoard.get(1).get(8) + "|" + enemyBoard.get(2).get(8) + "|" + enemyBoard.get(3).get(8) + "|" + enemyBoard.get(4).get(8) + "|" + enemyBoard.get(5).get(8) + "|" + enemyBoard.get(6).get(8) + "|" + enemyBoard.get(7).get(8) + "|" + enemyBoard.get(8).get(8) + "|" + enemyBoard.get(9).get(8) + "|");
        System.out.println("              "+Collors.blueCollor+"9"+Collors.resetCollor+" |" + seaBoard.get(0).get(9) + "|" + seaBoard.get(1).get(9) + "|" + seaBoard.get(2).get(9) + "|" + seaBoard.get(3).get(9) + "|" + seaBoard.get(4).get(9) + "|" + seaBoard.get(5).get(9) + "|" + seaBoard.get(6).get(9) + "|" + seaBoard.get(7).get(9) + "|" + seaBoard.get(8).get(9) + "|" + seaBoard.get(9).get(9) + "|                                                                              "+ Collors.redCollor+"9"+Collors.resetCollor+" |" + enemyBoard.get(0).get(9) + "|" + enemyBoard.get(1).get(9) + "|" + enemyBoard.get(2).get(9) + "|" + enemyBoard.get(3).get(9) + "|" + enemyBoard.get(4).get(9) + "|" + enemyBoard.get(5).get(9) + "|" + enemyBoard.get(6).get(9) + "|" + enemyBoard.get(7).get(9) + "|" + enemyBoard.get(8).get(9) + "|" + enemyBoard.get(9).get(9) + "|");
        System.out.println();
        System.out.println();
        TextEditor.separatorText();


    }



}
