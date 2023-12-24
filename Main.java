package sem1;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        List<Hero> gameHeroeList = new ArrayList<>();
        Random rand  = new Random();
        Hero archer = new Archer("arch");
        Hero monk = new Monk("monk");
        Hero rober = new Rober("rober");
        Hero sniper = new Sniper("sniper");
        Hero sorcerer = new Sorcerer("sorcerer");
        Hero wizard = new Wizard("Wizard");
        Hero villager = new Villager("villager");


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



        for (Hero hero : gameHeroeList) {
            System.out.println(hero.toString());
        }

        
     
    }
}
