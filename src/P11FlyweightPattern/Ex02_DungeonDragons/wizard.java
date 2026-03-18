package P11FlyweightPattern.Ex02_DungeonDragons;

public class wizard implements Character {
    @Override
    public void attack (String weapon){
        System.out.println(this + " Finalizes battle and uses weapon " + weapon);
    }

    @Override
    public String  toString(){
        return "wizard " + this.hashCode();
    }
}
