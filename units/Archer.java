package sem1.units;

import static java.lang.Math.negateExact;

import java.util.*;
import java.util.Random;

public class Archer extends Hero {
    
    int countArrows = 15;
    public int id = 1;

    public Archer(String name){

        super( name,100, 100, 0, 0,
         30, new int[]{12,17}, 3, true);
         countArrows = 10;
    }

    public double attac(Hero hero)
    {   
        Random random = new Random();
        boolean critDamage = random.nextInt(100) % 7 == 0;
        double allDamage;
         double dm ;
        if(this.countArrows > 0){
            if (critDamage) {
            
              allDamage = damage[1] ; /// 30 ; // 42  - максимальное расстояние на карте
               dm = allDamage ;
            hero.currentHelth -= (dm - (hero.armor * 0.5)); 
           }
         else{
            allDamage = damage[0]; /// 30 ; // 42  - максимальное расстояние на карте
               dm = allDamage ;
            hero.currentHelth -= ( dm - (hero.armor * 0.5)); 

             }
         this.countArrows --;

        }
        else
        {
            //this.givArrows
            return 0;
        }
         
         return dm;

    }

     public void whoNext(List <Hero> lst)
    {   
       double distance_min = this.getDistance(lst.get(0));
       Hero hero = lst.get(0);
       for (Hero next : lst) {

            if ( distance_min > this.getDistance(next)) {
                
                distance_min = this.getDistance(next);
                hero = next;
            }

       }

       double damage = this.attac(hero);
       System.out.println("Лучник исходя из здравго смысла атакует "+hero+" растояние между ними равно "+this.getDistance(hero));
       System.err.println();
        System.out.println(" И наносит урон "+damage+" Текущие здоровье "+hero+" = "+ hero.currentHelth);
        System.err.println();

    }

    


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Archer "+"("+name+") ";
    }
}
