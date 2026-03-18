package P11FlyweightPattern.Ex02_DungeonDragons;

public class creature implements Character {
    String race;
    String eyes;
    String skincolor;
    String haircolor;

    public creature(String race, String eyes, String skincolor, String haircolor) {
        this.race = race;
        this.eyes = eyes;
        this.skincolor = skincolor;
        this.haircolor = haircolor;
    }

    @Override
    public void attack(String weapon){
        System.out.println(this + ": uses weapon " + weapon);
    }

    @Override
    public String toString() {
        return race +" "+ this.hashCode() + " skin " + skincolor + " eyes " + eyes + " hair " + haircolor;
    }
}
