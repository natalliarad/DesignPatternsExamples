package structural.flyweight.antTermes;

import java.io.Serializable;

/**
 * Flyweight (приспособленец). Main task - divide internal and external states. Termes themselves
 * are practical identical, but every of them is in the concrete point.
 */
public class EuTermes implements Serializable {

    private Termes ant; //internal part
    private int health;
    private float xCoord;
    private float yCoord;
    //external state: end of the description

    public EuTermes(final String type, final float xCoord, final float yCoord) {
        this.ant = TermesFactory.getClassFromFactory(type);
        this.health = 180;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(final int health) {
        this.health = health;
    }

    public float getxCoord() {
        return xCoord;
    }

    public void setxCoord(final float xCoord) {
        this.xCoord = xCoord;
    }

    public float getyCoord() {
        return yCoord;
    }

    public void setyCoord(final float yCoord) {
        this.yCoord = yCoord;
    }

    public void go() {
        //more code here
    }

    public void fight() {
        //more code here
    }
}
