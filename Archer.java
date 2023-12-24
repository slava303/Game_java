package sem1;

public class Archer extends Hero {
    
    int countArrows;

    public Archer(String name){

        super( name,100, 100, 0, 0,
         30, new int[]{12,15}, 3, true);
         countArrows = 10;
    }
    

    


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Archer "+"("+name+")";
    }
}
