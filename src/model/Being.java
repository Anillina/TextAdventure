package model;

public class Being{
    private int fightStrength;

    public Being(int fightStrength) {
        this.fightStrength = fightStrength;
    }

    /**
     * Rückgabe der Kampfstärke
     * @return Kampfstärke
     */
    public int getFightStrength() {
        return fightStrength;
    }
}
