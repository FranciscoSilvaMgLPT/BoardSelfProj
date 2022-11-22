package Game.ExtraGameMonsters;

import Game.Collors;

public class Vampire extends Monster {
    int bite = 5;

    public Vampire() {
        this.position = 1;
        this.name = "Vampire 🧛🏼";
        this.bite = 5;
        this.damage = 10;
        this.info = "When a Vampire attacks, it always inflicts the same amount of damage. However, there is a chance(50% chance) that, when it attacks,\n" +
                " the vampire 🦷bites🦷 its enemy. When that happens, the vampire's health will increase a certain amount.\n " +
                "When a vampire is hit, it always loses health.";
    }

    public void attack(Monster monster) {
        int biteChance = (int) (Math.random() * 3) + 1;
        System.out.println(this.name + " attacks and deals " + this.damage + "💥damage to " + monster.name + ".");
        monster.health = monster.health - this.damage;
        switch (biteChance) {
            case 1:
                bite(monster);
                break;
            case 2:
            case 3:
                break;
        }
        System.out.println(name + " health:" + health);
        System.out.println(monster.name + " health:" + monster.health);
    }

    public void bite(Monster monster) {
        System.out.println("Seems like " + name + " got lucky and bites " + monster.name + "! " + name + " heals for " + this.bite);
        health = health + bite;
    }

    @Override
    public String toString() {
        return "Monster nº [" + position + "]-> " + Collors.redCollor + name + Collors.resetCollor + "\n" +
                "Health❤️: " + health + "\n" +
                "Damage💥: " + damage + "\n" +
                "Bite🦷(heal): " + bite + "\n" +
                "Info📜: " + info + "\n" +
                "\n";
    }
}
