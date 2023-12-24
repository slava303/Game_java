package sem1;

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

   




}
