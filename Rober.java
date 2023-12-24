package sem1;

public class Rober extends Hero{

    
    public Rober(String name){
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
        return "Rober "+"("+name+")";
    }
    
}
