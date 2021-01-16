package Places;

import treasure.Treasure;

import java.util.ArrayList;

public abstract class Place {


    private ArrayList<Character> enemies;
    private ArrayList<Character> adventurers;
    private ArrayList<Treasure> treasure;

    public Place(){
        this.enemies = new ArrayList<Character>();
        this.adventurers = new ArrayList<Character>();
        this.treasure = new ArrayList<Treasure>();

    }

    public ArrayList<Character> getEnemies() {
        return enemies;
    }

    public void setEnemies(ArrayList<Character> enemies) {
        this.enemies = enemies;
    }

    public ArrayList<Character> getAdventurers() {
        return adventurers;
    }

    public void setAdventurers(ArrayList<Character> adventurers) {
        this.adventurers = adventurers;
    }

    public ArrayList<Treasure> getTreasure() {
        return treasure;
    }

    public void setTreasure(ArrayList<Treasure> treasure) {
        this.treasure = treasure;
    }
}
