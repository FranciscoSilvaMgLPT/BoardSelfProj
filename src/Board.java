import player.Player;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class Board {


    static ArrayList<ArrayList<String>> aSpots = new ArrayList<>();


    public static void setBoardSpots() {
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ")));
        aSpots.add(new ArrayList<String>(Arrays.asList("   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ")));


    }

    public static void setPlayersStart() {
        for (int i = 0; i < Player.players.size(); i++) {
            Board.aSpots.get(0).set(i, Player.players.get(i).icons.icon);
        }


    }


    public static void boardGame() {
        TextEditor.separatorText();

        System.out.println(Game.cyanCollor + "                     🚩 ——————    ——————    ——————    ——————    ——————    ——————    ——————    ——————   ——————   ——————   ——————    ——————    ——————    ——————    ——————    ——————    ——————");
        System.out.println(" " + aSpots.get(0).get(8) + " " + aSpots.get(0).get(6) + " " + aSpots.get(0).get(4) + " " + aSpots.get(0).get(2) + " " + aSpots.get(0).get(0) + " :  |" + aSpots.get(1).get(0) + " |    |" + aSpots.get(2).get(0) + " |    |" + aSpots.get(3).get(0) + " |    |" + aSpots.get(4).get(0) + " |    |" + aSpots.get(5).get(0) + " |    |" + aSpots.get(6).get(0) + " |    |" + aSpots.get(7).get(0) + " |    |" + aSpots.get(8).get(0) + " |   |" + aSpots.get(9).get(0) + " |   |" + aSpots.get(10).get(0) + " |   |" + aSpots.get(11).get(0) + " |    |" + aSpots.get(12).get(0) + " |    |" + aSpots.get(13).get(0) + " |    |" + aSpots.get(14).get(0) + " |    |" + aSpots.get(15).get(0) + " |    |" + aSpots.get(16).get(0) + " |    |" + aSpots.get(17).get(0) + " |");
        System.out.println(" " + aSpots.get(0).get(9) + " " + aSpots.get(0).get(7) + " " + aSpots.get(0).get(5) + " " + aSpots.get(0).get(3) + " " + aSpots.get(0).get(1) + " :  |" + aSpots.get(1).get(1) + " |    |" + aSpots.get(2).get(1) + " |    |" + aSpots.get(3).get(1) + " |    |" + aSpots.get(4).get(1) + " |    |" + aSpots.get(5).get(1) + " |    |" + aSpots.get(6).get(1) + " |    |" + aSpots.get(7).get(1) + " |    |" + aSpots.get(8).get(1) + " |   |" + aSpots.get(9).get(1) + " |   |" + aSpots.get(10).get(1) + " |   |" + aSpots.get(11).get(1) + " |    |" + aSpots.get(12).get(1) + " |    |" + aSpots.get(13).get(1) + " |    |" + aSpots.get(14).get(1) + " |    |" + aSpots.get(15).get(1) + " |    |" + aSpots.get(16).get(1) + " |    |" + aSpots.get(17).get(1) + " |");
        System.out.println("                     🚩 ——————    ——————    ——————    ——————    ——————    ——————    ——————    ——————   ——————   ——————   ——————    ——————    ——————    ——————    ——————    ——————    ——————");
        System.out.println("                                                                                                                                                                                     ——————");
        System.out.println("                                                                                                                                                                                     |" + aSpots.get(18).get(0) + " |");
        System.out.println("                                                                                                                                                                                     |" + aSpots.get(18).get(1) + " |");
        System.out.println("                                                                                                                                                                                     ——————");
        System.out.println("                                         ——————    ——————    ——————                        ——————    ——————    ——————                        ——————    ——————    ——————              ——————");
        System.out.println("                                         |" + aSpots.get(45).get(0) + " |    |" + aSpots.get(44).get(0) + " |    |" + aSpots.get(43).get(0) + " |                        |" + aSpots.get(36).get(0) + " |    |" + aSpots.get(35).get(0) + " |    |" + aSpots.get(34).get(0) + " |                        |" + aSpots.get(27).get(0) + " |    |" + aSpots.get(26).get(0) + " |    |" + aSpots.get(25).get(0) + " |              |" + aSpots.get(19).get(0) + " |");
        System.out.println("                                         |" + aSpots.get(45).get(1) + " |    |" + aSpots.get(44).get(1) + " |    |" + aSpots.get(43).get(1) + " |                        |" + aSpots.get(36).get(1) + " |    |" + aSpots.get(35).get(1) + " |    |" + aSpots.get(34).get(1) + " |                        |" + aSpots.get(27).get(1) + " |    |" + aSpots.get(26).get(1) + " |    |" + aSpots.get(25).get(1) + " |              |" + aSpots.get(19).get(1) + " |");
        System.out.println("                                         ——————    ——————    ——————                        ——————    ——————    ——————                        ——————    ——————    ——————              ——————");
        System.out.println("                                         ——————              ——————                        ——————              ——————                        ——————              ——————              ——————");
        System.out.println("                                         |" + aSpots.get(46).get(0) + " |              |" + aSpots.get(42).get(0) + " |                        |" + aSpots.get(37).get(0) + " |              |" + aSpots.get(33).get(0) + " |                        |" + aSpots.get(28).get(0) + " |              |" + aSpots.get(24).get(0) + " |              |" + aSpots.get(20).get(0) + " |");
        System.out.println("                                         |" + aSpots.get(46).get(1) + " |              |" + aSpots.get(42).get(1) + " |                        |" + aSpots.get(37).get(1) + " |              |" + aSpots.get(33).get(1) + " |                        |" + aSpots.get(28).get(1) + " |              |" + aSpots.get(24).get(1) + " |              |" + aSpots.get(20).get(1) + " |");
        System.out.println("                                         ——————              ——————                        ——————              ——————                        ——————              ——————              ——————");
        System.out.println("                                 💎—————————————————— 💎     ——————    ——————    ——————    ——————              ——————    ——————    ——————    ——————              ——————    ——————    ——————");
        System.out.println("                                  |        " + aSpots.get(47).get(0) + "       |       |" + aSpots.get(41).get(0) + " |    |" + aSpots.get(40).get(0) + " |    |" + aSpots.get(39).get(0) + " |    |" + aSpots.get(38).get(0) + " |              |" + aSpots.get(32).get(0) + " |    |" + aSpots.get(31).get(0) + " |    |" + aSpots.get(30).get(0) + " |    |" + aSpots.get(29).get(0) + " |              |" + aSpots.get(23).get(0) + " |    |" + aSpots.get(22).get(0) + " |    |" + aSpots.get(21).get(0) + " |");
        System.out.println("                                  |                  |       |" + aSpots.get(41).get(1) + " |    |" + aSpots.get(40).get(1) + " |    |" + aSpots.get(39).get(1) + " |    |" + aSpots.get(38).get(1) + " |              |" + aSpots.get(32).get(1) + " |    |" + aSpots.get(31).get(1) + " |    |" + aSpots.get(30).get(1) + " |    |" + aSpots.get(29).get(1) + " |              |" + aSpots.get(23).get(1) + " |    |" + aSpots.get(22).get(1) + " |    |" + aSpots.get(21).get(1) + " |");
        System.out.println("                                 💎—————————————————— 💎     ——————    ——————    ——————    ——————              ——————    ——————    ——————    ——————              ——————    ——————    ——————" + Game.resetCollor);
        System.out.println("                                           " + aSpots.get(47).get(1) + " " + aSpots.get(47).get(2) + " " + aSpots.get(47).get(3) + " " + aSpots.get(47).get(4) + " " + aSpots.get(47).get(5) + " " + aSpots.get(47).get(6) + " " + aSpots.get(47).get(7) + " " + aSpots.get(47).get(8) + " " + aSpots.get(47).get(9));

    }


}
