package sem1;

public class Wizard  extends Hero{

     public Wizard(String name){
        super(name, 100, 100, 0, 0,
         30, new int[]{12,15}, 3, true);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Wizard "+"("+name+")";
    }
}
