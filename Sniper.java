package sem1;

public class Sniper extends Hero {
     
    public Sniper(String name){
        this.name = name;
        this.isMove = true;
        this.maxHhealth = 120;
        this.currentHelth = maxHhealth;
        this.damage = new int[]{12,15};
        this.healthReagen = 0;
        
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Sniper "+"("+name+")";
    }
}
