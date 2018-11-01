package model;

public class Player extends Being {

    private double t1,t2;
    private int hp;
    private String position;

    public Player(int fightStrength,int hp) {
        super(fightStrength);
        position="1,1";
        t1=(double)System.currentTimeMillis();
    }
    /**
     * Rückgabe der abgelaufenen Zeit seit dem Erstellen des Objektes
     * @return  Abgelaufenen Zeit seit dem Erstellen des Objektes
     */
    public double getElapsedTime(){
     t2=(double)System.currentTimeMillis();
        return (t2-t1);
    }

    /**
     * Rückgabe der Lebenspukte
     * @return Lebenspukte
     */

    public int getHp() {
        return hp;
    }
    /**
     * Setzen der Lebenspukte
     *
     */

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}

