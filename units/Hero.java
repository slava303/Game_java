package sem1.units;
import static java.lang.Math.*;

import java.util.List;
public abstract class Hero {

    protected String name;


   protected int maxHhealth;

   protected int currentHelth;

   protected int manaRegen;

   protected int healthReagen;

   protected int armor;

   protected int[] damage;

   protected  int moveSteps;

   boolean isMove;
   public boolean white;
   public int x;
    public int  id;

    public int y;


    
   
  

    public Hero(String name,int maxHhealth,int currentHelth, int manaRegen,int healthReagen,int armor,int[] damage,int moveSteps,
     boolean isMove){
        this.name = name;
        this.maxHhealth = maxHhealth;
        this.currentHelth = currentHelth;
        this.manaRegen = manaRegen;
        this.armor = armor;
        this.damage = damage;
        this.moveSteps = moveSteps;
        this.isMove = isMove;


    }


  

    public void heal(Hero hero)
    {
        hero.currentHelth += healthReagen;
    }

    public void critacal_damage(Hero hero)
    {
        hero.currentHelth  = hero.currentHelth  - (damage[1]  -( hero.armor / 100));
    }

    public double getDistance(Hero hero)
    {
        double distance ;
        double temp_x,temp_y;
        
       temp_x = abs(x - hero.x);
       temp_y = abs(y - hero.y);
       distance = sqrt(pow(temp_x,2)+pow(temp_y,2)) ;

        return distance;
    }




    

   




}
