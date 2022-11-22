package player;


import java.util.ArrayList;

public class Player {

    private String name;
    public Icons icons;

    public int position;

    public static ArrayList<Icons> avaiableIcons = new ArrayList<>();
    public static ArrayList<Player> players = new ArrayList<>();


    public Player(String name, Icons icons) {
        this.name = name;
        this.icons = icons;
        this.position = 0;
    }

    @Override
    public String toString() {
        return name + " (" + icons.icon + ")";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Icons getIcons() {
        return icons;
    }

    public void setIcons(Icons icons) {
        this.icons = icons;
    }

    public static ArrayList<Icons> getAvaiableIcons() {
        return avaiableIcons;
    }

    public static void setAvaiableIcons(ArrayList<Icons> avaiableIcons) {
        Player.avaiableIcons = avaiableIcons;
    }

    public static ArrayList<Player> getPlayers() {
        return players;
    }

    public static void setPlayers(ArrayList<Player> players) {
        Player.players = players;
    }


    public static void addInitialIcons() {
        avaiableIcons.add(Icons.Rat);
        avaiableIcons.add(Icons.Pig);
        avaiableIcons.add(Icons.Giraffe);
        avaiableIcons.add(Icons.Rabbit);
        avaiableIcons.add(Icons.Monkey);
        avaiableIcons.add(Icons.Pinto);
        avaiableIcons.add(Icons.Snake);
        avaiableIcons.add(Icons.Duck);
        avaiableIcons.add(Icons.Unicorn);
        avaiableIcons.add(Icons.Turtle);


    }


}
