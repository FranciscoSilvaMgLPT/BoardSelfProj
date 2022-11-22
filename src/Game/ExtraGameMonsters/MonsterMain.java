package Game.ExtraGameMonsters;

import Game.Collors;
import player.Icons;
import player.Player;

import java.util.ArrayList;
import java.util.Scanner;

import static Game.TextEditor.MonstersIntroText;
import static Game.TextEditor.separatorText;

public class MonsterMain {
    static ArrayList<Player> monsterPlayers = new ArrayList<>();

    static ArrayList<Monster> monstersTeam0 = new ArrayList<>();
    static ArrayList<Monster> monstersTeam1 = new ArrayList<>();

    static ArrayList<Monster> monsters = new ArrayList();
    static Werewolf werewolf = new Werewolf();
    static Vampire vampire = new Vampire();
    static Mummy mummy = new Mummy();

    static int numberOfMonsters = 0;

    static Scanner sc = new Scanner(System.in);
    static Player winner;


    public static void main(String[] args) {
        Player ze = new Player("Ze", Icons.Pig);
        Player ze1 = new Player("Ze1", Icons.Duck);
        Player ze2 = new Player("Ze2", Icons.Rabbit);
        Player ze3 = new Player("Ze3", Icons.Snake);
        Player.players.add(ze);
        Player.players.add(ze1);
        Player.players.add(ze2);
        Player.players.add(ze3);
        playMonsters(ze);
    }

    public static Player playMonsters(Player player0) {
        String passEnter1 = " ";
        monsters.add(werewolf);
        monsters.add(vampire);
        monsters.add(mummy);

        int option;
        boolean win = false;
        Player player1;
        MonstersIntroText();
        separatorText();
        System.out.println(Collors.redBCollor + "Hello " + player0 + ", choose a player number you want to fight/delay!(if you win)" + Collors.resetCollor);
        for (int i = 0; i < Player.players.size(); i++) {
            if (Player.players.get(i) != player0) {
                System.out.println(i + " -" + Player.players.get(i).getName() + Player.players.get(i).icons.icon);
            }
        }
        System.out.print("Player number:");
        option = sc.nextInt();
        player1 = Player.players.get(option);
        separatorText();
        System.out.println(Collors.redBCollor + ">>>> " + player0 + " VS " + player1 + " <<<<" + Collors.resetCollor);
        monsterPlayers.add(player0);
        monsterPlayers.add(player1);
        System.out.println("How many monsters you want each team to have? (max 3)");
        System.out.print("Number of monsters:");
        numberOfMonsters = sc.nextInt();

        for (int i = 0; i < monsterPlayers.size(); i++) {                      //Monsters choose
            for (int j = 1; j <= numberOfMonsters; j++) {
                System.out.println(monsters);
                System.out.println(Collors.blueCollor + monsterPlayers.get(i) + "choose your monsters:" + Collors.resetCollor);
                System.out.println("Monster (" + j + " of " + numberOfMonsters + ")");
                System.out.print("Option:");
                int optionMonster = sc.nextInt();
                switch (optionMonster) {
                    case 0:
                        if (i == 0) {
                            Werewolf werewolf0 = new Werewolf();
                            monstersTeam0.add(werewolf0);
                            System.out.println("Werewolf added to " + player0 + " team.");
                            toStringTeams(monstersTeam0);
                            separatorText();
                            break;
                        }
                        if (i == 1) {
                            Werewolf werewolf1 = new Werewolf();
                            monstersTeam1.add(werewolf1);
                            System.out.println("Werewolf added to " + player1 + " team.");
                            toStringTeams(monstersTeam1);
                            separatorText();
                            break;
                        }
                    case 1:
                        if (i == 0) {
                            Vampire vampire0 = new Vampire();
                            monstersTeam0.add(vampire0);
                            System.out.println("Vampire added to " + player0 + " team.");
                            toStringTeams(monstersTeam0);
                            separatorText();
                            break;
                        }
                        if (i == 1) {
                            Vampire vampire1 = new Vampire();
                            monstersTeam1.add(vampire1);
                            System.out.println("Vampire added to " + player1 + " team.");
                            toStringTeams(monstersTeam1);
                            separatorText();
                            break;
                        }
                    case 2:
                        if (i == 0) {
                            Mummy mummy0 = new Mummy();
                            monstersTeam0.add(mummy0);
                            System.out.println("Mummy added to " + player0 + " team.");
                            toStringTeams(monstersTeam0);
                            separatorText();
                            break;
                        }
                        if (i == 1) {
                            Mummy mummy1 = new Mummy();
                            monstersTeam1.add(mummy1);
                            System.out.println("Mummy added to " + player1 + " team.");
                            toStringTeams(monstersTeam1);
                            separatorText();
                            break;
                        }
                }
            }
            System.out.println("Press any number to continue.");
            passEnter1 = sc.next();
        }
        System.out.println("Teams complete. Good luck!");
        System.out.println(player0 + " team:");
        toStringTeams(monstersTeam0);
        System.out.println();
        System.out.println(player1 + " team:");
        toStringTeams(monstersTeam1);
        System.out.println("Enter any key to continue. Good luck! May the best win!");
        passEnter1 = sc.next();

        startMonsters(player0, player1);
        return winner;
    }

    public static void startMonsters(Player player0, Player player1) {
        String passEnter = " ";
        boolean win = false;
        while (!win) {
            for (int i = 0; i < 2; i++) {
                if (i == 0) {
                    int monsterAttack = (int) (Math.random() * monstersTeam0.size() - 1);
                    int monsterDef = (int) (Math.random() * monstersTeam1.size() - 1);

                    System.out.println(monstersTeam0.get(monsterAttack).name + " from " + player0 + " attacks " + monstersTeam1.get(monsterDef).name + "!");
                    monstersTeam0.get(monsterAttack).attack(monstersTeam1.get(monsterDef));

                    if (monstersTeam1.get(monsterDef).health <= 0) {
                        System.out.println(Collors.redCollor + monstersTeam1.get(monsterDef).name + " from " + player1 + " got killed! He has been removed from enemy team!" + Collors.resetCollor);
                        monstersTeam1.remove(monsterDef);
                        System.out.println("Enter any key to continue.");
                        passEnter = sc.next();
                    }
                    if (monstersTeam1.size() == 0) {
                        win = true;
                        System.out.println(player0 + " wins!");
                        winner = player0;
                        break;
                    }
                }
                if (i == 1) {
                    int monsterAttack = (int) (Math.random() * monstersTeam1.size() - 1);
                    int monsterDef = (int) (Math.random() * monstersTeam0.size() - 1);

                    System.out.println(monstersTeam1.get(monsterAttack).name + " from " + player1 + " attacks " + monstersTeam0.get(monsterDef).name + "!");
                    monstersTeam1.get(monsterAttack).attack(monstersTeam0.get(monsterDef));

                    if (monstersTeam0.get(monsterDef).health <= 0) {
                        System.out.println(Collors.redCollor + monstersTeam0.get(monsterDef).name + "from " + player0 + " got killed! He has been removed from enemy team!" + Collors.resetCollor);
                        monstersTeam0.remove(monsterDef);
                        System.out.println("Enter any key to continue.");
                        passEnter = sc.next();
                    }
                    if (monstersTeam0.size() == 0) {
                        win = true;
                        System.out.println(player1 + " wins!");
                        winner = player1;
                        break;
                    }
                }
            }
        }
    }

    public static void toStringTeams(ArrayList<Monster> arraylist) {
        for (int i = 0; i < arraylist.size(); i++) {
            System.out.println("[" + arraylist.get(i).position + "]: " + arraylist.get(i).name);
        }
    }
}







