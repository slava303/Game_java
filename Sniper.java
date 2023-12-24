package sem1;

public class Sniper extends Hero {
     
    public Sniper(String name){
        super(name, 100, 100, 0, 0,
         30, new int[]{12,15}, 3, true);
    }
    

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Sniper "+"("+name+")";
    }
}
