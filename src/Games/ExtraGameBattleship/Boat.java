package Games.ExtraGameBattleship;

public abstract class Boat {
    String name;
    int life;
    String icon;

    public Boat(String name, int life, String icon) {
        this.name = name;
        this.life = life;
        this.icon = icon;
    }
}
