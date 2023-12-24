package sem1;

public class Villager extends Hero{
    

    public Villager(String name){
        super(name, 100, 100, 0, 0,
         12, new int[]{5,8}, 3, true);
    }

    public void Attac(Hero hero){
        hero.currentHelth  = hero.currentHelth  - (damage[0]  -( hero.armor / 100));
        
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Villager "+"("+name+")";
    }
}
