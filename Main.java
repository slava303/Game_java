package sem1;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
      
        List<Hero> whiteteam = FillArray();
        List<Hero> blackteam = FillArray();

        System.out.println("team white\n");
        for (Hero hero : whiteteam) {
            System.out.println(hero.toString());
        }
        System.out.println("\n");
        System.out.println("team black\n");
        for (Hero hero : blackteam) {
            System.out.println(hero.toString());
        }

       

        
     
    }

    static  List<Hero> FillArray()
    {   List<Hero> gameHeroeList = new ArrayList<>();
        Random rand  = new Random();
        Hero archer = new Archer(Names.values()[new Random().nextInt(0,Names.values().length-1)].toString());
        Hero monk = new Monk(Names.values()[new Random().nextInt(0,Names.values().length-1)].toString());
        Hero rober = new Rober(Names.values()[new Random().nextInt(0,Names.values().length-1)].toString());
        Hero sniper = new Sniper(Names.values()[new Random().nextInt(0,Names.values().length-1)].toString());
        Hero sorcerer = new Sorcerer(Names.values()[new Random().nextInt(0,Names.values().length-1)].toString());
        Hero wizard = new Wizard(Names.values()[new Random().nextInt(0,Names.values().length-1)].toString());
        Hero villager = new Villager(Names.values()[new Random().nextInt(0,Names.values().length-1)].toString());
        
      
        for (int i = 0; i < 10; i++) {
            
            int number = rand.nextInt(0,7);

            switch (number) {
                case 0:
                    gameHeroeList.add(archer);
                    break;
                case 1:
                    gameHeroeList.add(monk);
                    break;
                case 2:
                    gameHeroeList.add(rober);
                    break;
                case 3:
                    gameHeroeList.add(sniper);
                    break;

                case 4:
                    gameHeroeList.add(sorcerer);
                    break;
                case 5:
                    gameHeroeList.add(wizard);
                    break;
                case 6:
                    gameHeroeList.add(villager);
                    break;
                default:
                    break;
            }

    }

    return gameHeroeList;

   }

}
