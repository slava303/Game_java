package sem1;

public class Sorcerer extends Hero{

    public Sorcerer(String name){
        super(name, 100, 100, 0, 0,
         30, new int[]{12,15}, 3, true);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Sorcerer "+"("+name+")";
    }
}
