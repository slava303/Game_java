package sem1;

public class Spearman  extends Hero{
    public Spearman(String name){
        this.name = name;
        this.isMove = true;
        this.maxHhealth = 50;
        this.currentHelth = maxHhealth;
        this.damage = new int[]{0};
        this.healthReagen = 0;
        
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Spearman "+"("+name+")";
    }
}
