package units;

public class Sniper extends Hero {
     
    public Sniper(String name){
        super(name, 100, 100, 0, 0,
         15, new int[]{12,17}, 3, true);
    }

    public void Attac(Hero hero){
        hero.currentHelth  = hero.currentHelth  - (damage[0]  -( hero.armor / 100));
        
    }
    

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Sniper "+"("+name+") ";
    }
}
