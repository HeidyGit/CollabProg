package P11FlyweightPattern.Ex02_DungeonDragons;

import java.util.Random;

public class Battle {
    private  String [] race = { "Elf", "Orc"};
    private String [] eyes = {"Green", "Red"};
    private String [] skincolor = {"Green", "Red"};
    private String [] haircolor = {"Green", "Red"};
    private String [] weapon = {"bow with arrows", "axe", "sword and shield"};
    Random rand = new Random();

    public void startBattle(){
        //battle of 5000 creatures

        for (int i = 0; i < 10; i++) {
            Character creature = CharacterFactory.getCharacter(getRace(), getEyes(), getSkincolor(), getHaircolor());
            creature.attack(getWeapon());
        }

        wizard wizard = new wizard();
        wizard.attack(" magic staff");
    }

    public String getRace(){
        return race[rand.nextInt(race.length)];
    }
    public String getEyes(){
        return eyes[rand.nextInt(eyes.length)];
    }
    public String getSkincolor(){
        return skincolor[rand.nextInt(skincolor.length)];
    }
    public String getHaircolor(){
        return haircolor[rand.nextInt(haircolor.length)];
    }
    public String getWeapon (){
        return weapon[rand.nextInt(weapon.length)];
    }
}
