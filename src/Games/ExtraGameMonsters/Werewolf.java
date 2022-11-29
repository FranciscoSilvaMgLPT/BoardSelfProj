package Games.ExtraGameMonsters;

public class Werewolf extends Monster {
    public Werewolf() {
        this.position = 0;
        this.name = "Werewolf 🐺";
        this.damage = 20;
        this.info = "When a Werewolf attacks, it always inflicts the same amount of damage. When a Werewolf is hit, it always loses health.";
    }

    @Override
    public void attack(Monster monster) {
        System.out.println("🐺 Rooooaaaaar!! " + this.name + " attacks " + monster.name + " and dealt " + this.damage + "💥damage.");
        monster.health = monster.health - this.damage;
        System.out.println(name + " health:" + health);
        System.out.println(monster.name + " health:" + monster.health);

    }


}
