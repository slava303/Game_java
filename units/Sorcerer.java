package sem1.units;

public class Sorcerer extends Hero{

    public Sorcerer(String name){
        super(name, 120, 120, 0, 0,
         25, new int[]{12,15}, 3, true);
    }

    public void Attac(Hero hero){
        hero.currentHelth  = hero.currentHelth  - (damage[0]  -( hero.armor / 100));
        
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Sorcerer "+"("+name+") ";
    }
}
