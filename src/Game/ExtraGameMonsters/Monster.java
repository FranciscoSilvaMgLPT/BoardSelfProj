package Game.ExtraGameMonsters;

import Game.Collors;

import java.util.ArrayList;

public abstract class Monster {

    String name;
    int health = 100;
    int damage;
    int position;

    String info;


    public abstract void attack(Monster monster);

    @Override
    public String toString() {
      return "Monster nº ["+position+"]-> " + Collors.redCollor + name + Collors.resetCollor + "\n" +
                    "Health❤️: " + health + "\n" +
                    "Damage💥: " + damage + "\n" +
                    "Info📜: " + info + "\n"+
                    "\n";

    }
}
