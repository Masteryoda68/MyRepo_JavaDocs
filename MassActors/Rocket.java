import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author Philipp
 * @version 1.0_2017-11-27
 */
public class Rocket extends MassActor
{
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        turnOnKeyPress("left", -5);
        super.act();
    }
    
    /*
     * Beschreibung:
     * 
     * Reibungskoeffizienten und die Beschleunigung, sowie 
     * die anfängliche Geschwindigkeit der Rakete festgelegt. Die Beschleunigung 
     * soll als Objekt-Attribut einmal festgelegt werden, soll allerdings im späteren 
     * Spielverlauf verändert werden können.
     */
    Rocket() {
        // TODO
        
        /* Geschwindigkeitswerte */
        speedX = 1;
        speedY = 1;
        
        /* Reibungskoeffizienten */
        frictionX = 0;
        frictionY = 0;
        
        int acceleration = 5; // anfängliche Beschleunigung
    }
    
    /**
     * @param key: die Taste, die gedrückt wird
     * @param angle: der Winkel, in dem die Rakete gedreht wird
     */
    public void turnOnKeyPress(String key, int angle) {
        setRotation(angle);
    }
    
    public void accelerateOnKeyPress(String key, double acceleration) {
        int acc = (int) Math.round(acceleration);
        move(acc);
    }
    
    static void main() {
        Rocket rocket = new Rocket();
        rocket.act();
    }
}