package sem1;

public class Monk extends Hero{

    public Monk(String name){
        super(name, 75, 75, 5, 10,
         10, new int[]{5,7}, 3, true);
    }

    public void Heal(Hero hero)
    {
        hero.currentHelth += healthReagen;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Monk "+"("+name+")";
    }
}