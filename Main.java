package sem1;
import java.util.*;

import sem1.units.Archer;
import sem1.units.Coords;
import sem1.units.Hero;
import sem1.units.Monk;
import sem1.units.Names;
import sem1.units.Rober;
import sem1.units.Sniper;
import sem1.units.Sorcerer;
import sem1.units.Villager;
import sem1.units.Wizard;

public class Main {
    
    public static void main(String[] args) {
      
        List<Hero> whiteteam = getTeam(10,"white");
        List<Hero> blackteam = getTeam(10,"black");

        System.out.println("team white\n");
        for (Hero hero : whiteteam) {
            System.out.println(hero.toString());
        }
        System.out.println("\n");
        System.out.println("team black\n");
        for (Hero hero : blackteam) {
            System.out.println(hero.toString());

        }

        coords(whiteteam);
        System.out.println();
        coords(blackteam);
        System.out.println();
        infoDistanse(whiteteam.get(0), blackteam);
        System.out.println();
        System.out.println(whiteteam.get(whiteteam.size()-1).getDistance(blackteam.get(5)));

        Archer arch = new Archer("test_name");
        arch.x = 7;
        arch.y = 4;
            arch.whoNext(whiteteam);
        
      

       

        
     
    }

    static  List<Hero> FillArray(int num)
    {   List<Hero> gameHeroeList = new ArrayList<>();
        Random rand  = new Random();
        
        for (int i = 0; i < num; i++) {
            
            int number = rand.nextInt(0,7);

            switch (number) {
                case 0:
                    gameHeroeList.add(new Archer(Names.values()[new Random().nextInt(0,Names.values().length-1)].toString()));
                    break;
                case 1:
                    gameHeroeList.add(new Monk(Names.values()[new Random().nextInt(0,Names.values().length-1)].toString()));
                    break;
                case 2:
                    gameHeroeList.add(new Rober(Names.values()[new Random().nextInt(0,Names.values().length-1)].toString()));
                    break;
                case 3:
                    gameHeroeList.add(new Sniper(Names.values()[new Random().nextInt(0,Names.values().length-1)].toString()));
                    break;

                case 4:
                    gameHeroeList.add( new Sorcerer(Names.values()[new Random().nextInt(0,Names.values().length-1)].toString()));
                    break;
                case 5:
                    gameHeroeList.add(new Wizard(Names.values()[new Random().nextInt(0,Names.values().length-1)].toString()));
                    break;
                case 6:
                    gameHeroeList.add( new Villager(Names.values()[new Random().nextInt(0,Names.values().length-1)].toString()));
                    break;
                default:
                    break;
            }

    }

    return gameHeroeList;

   }


   static List<Hero> getTeam(int number,String mod)
   {     List<Hero> list = FillArray( number);
        List <Hero> team = new ArrayList<>(number);
        if (mod == "white") {
            for (int i = 0; i < list.size(); i++) {
                team.add(list.get(i));
                team.get(i).x = 0;
                team.get(i).y = i;
                team.get(i).white = true;
            }
        }
        else
        {
            for (int i = 0; i < list.size(); i++) {
                team.add(list.get(i));
                team.get(i).x = Coords.max_x;
                team.get(i).y = i;
                 team.get(i).white = false;
            }
        }
        return team;
   }

   
   static void infoDistanse(Hero whiteteam,List<Hero> blackteam)
   {
    for (int i = 0; i <blackteam.size(); i++) {

            System.out.println("рaстояние от "+whiteteam+" до "+blackteam.get(i)+" = "+whiteteam.getDistance(blackteam.get(i)));
       }
   }

   static void coords(List<Hero> whiteteam)
   {
    for (int i = 0; i <whiteteam.size(); i++) {

            System.out.println("позиция "+whiteteam.get(i)+" ( "+whiteteam.get(i).x+","+whiteteam.get(i).y+")");
       }
   }

}
