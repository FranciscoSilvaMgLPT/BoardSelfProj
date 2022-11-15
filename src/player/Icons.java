package player;

public enum Icons {
    Rat(" 🐁", "Rat"),
    Pig(" 🐷", "Pig"),
    Giraffe(" 🦒", "Giraffe"),
    Rabbit(" 🐰", "Rabbit"),
    Monkey(" 🙉", "Monkey"),
    Pinto(" 🐥", "Pinto"),
    Snake(" 🐍", "Snake"),
    Duck(" 🦆", "Duck"),
    Unicorn(" 🦄", "Unicorn"),
    Turtle(" 🐢", "Turtle");

    public String icon;
    public String name;


    Icons(String icon, String name) {
        this.icon = icon;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "[" + indexIcon(name) + "]" + icon + " ";
    }

    public int indexIcon(String name) {
        for (int i = 0; i < Player.avaiableIcons.size(); i++) {
            if ((Player.avaiableIcons.get(i).getName()).contains(name)) {
                return i + 1;
            }
        }
        return 0;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
