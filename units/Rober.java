package units;

public class Rober extends Hero{

    
    public Rober(String name){
        super(name, 100, 100, 0, 0,
         12, new int[]{7,14}, 3, true);
    }

    public void Attac(Hero hero){
        hero.currentHelth  = hero.currentHelth  - (damage[0]  -( hero.armor / 100));
        
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Rober "+"("+name+") ";
    }
    
}
