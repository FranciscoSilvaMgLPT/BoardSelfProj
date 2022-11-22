package Game.ExtraGameMonsters;

public class Mummy extends Monster {

    public Mummy() {
        this.position = 2;
        this.name = "Mummy 🧟‍";
        this.damage = 15;
        this.info = "A Mummy can only perform two consecutive attacks(50% chance). If a Mummy tries to attack a third time, it fails, unrolls, \n" +
                "and loses a certain amount of health. The attacking ability of the Mummy is then restored.\n" +
                "When a Mummy is hit, it always loses health.";
    }


    @Override
    public void attack(Monster monster) {
        int count = 0;
        boolean attackAgain = false;
        System.out.println(this.name + " attacks and deals " + this.damage + "💥damage to " + monster.name + ".");
        monster.health = monster.health - this.damage;
        while (!attackAgain) {
            int repeatAttack = (int) (Math.random() * 3) + 1;
            switch (repeatAttack) {
                case 1:
                    if (count <= 1) {
                        System.out.println(this.name + " attacks again! And deals " + this.damage + "💥damage to " + monster.name + ".");
                        monster.health = monster.health - this.damage;
                        System.out.println(this.name + " health:" + this.health);
                        System.out.println(monster.name + " health:" + monster.health);
                        count++;
                    } else {
                        System.out.println(this.name + " attacks again! But he cant do that! He can only perform two consecutive attacks.");
                        System.out.println(this.name + " auto inflicts damage.(-" + this.damage + " 💔health");
                        this.health = this.health - this.damage;
                        System.out.println(this.name + " health:" + this.health);
                        System.out.println(monster.name + " health:" + monster.health);
                        attackAgain = true;
                    }
                    break;
                case 2:
                case 3:
                    attackAgain = true;
                    break;
            }
        }
    }
}
