package sem1;

public class Archer extends Hero {
    
    int countArrows = 10;

    public Archer(String name){
        this.name = name;
        this.isMelee=false;
        this.isMilitary = false;
        this.isMove = true;
        this.maxHhealth = 100;
        this.currentHelth = maxHhealth;
        this.healthReagen = 5;
        this.damage = new int[]{10,13};
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Archer "+"("+name+")";
    }
}
