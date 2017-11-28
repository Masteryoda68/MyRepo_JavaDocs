import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Math; // Math (round)

/**
 * Write a description of class MassActor here.
 * 
 * @author Philipp
 * @version 1.0_2017-11-20
 */
abstract class MassActor extends Actor
{
    /*
     * Probleme:
     * - Instanz für "Welt" (myWorld) kann nicht erzeugt werden, da abstract
     * ...
     */
    
    protected double posX, posY; // Position 1 & 2
    protected double speedX, speedY; // Geschwindigkeit 1 & 2
    protected double frictionX, frictionY; // Reibungskoeffizienten
    
    /*
     * Alternative:
     * 
     * protected double posX; // Position 1
     * protected double posY; // Position 2
     * protected double speedX; // Geschwindigkeit 1
     * protected double speedY; // Geschwindigkeit 2
     * protected double frictionX; // Reibung 1
     * protected double frictionY; // Reibung 2
     */
    
   /*
    * Getter- und Setter-Methoden
    */
    public double getPosX() {
        return posX;
    }
    
    public void setPosX(double posX) {
        this.posX = posX;
    }
    
    public double getPosY() {
        return posY;
    }
    
    public void setPosY(double posY) {
        this.posY = posY;
    }
    
    public double getSpeedX() {
        return speedX;
    }
    
    public void setSpeedX(double speedX) {
        this.speedX = speedX;
    }
    
    public double getSpeedY() {
        return speedY;
    }
    
    public void setSpeedY(double speedY) {
        this.speedY = speedY;
    }
    
    public double getFrictionX() {
        return frictionX;
    }
    
    public void setFrictionX(double frictionX) {
        this.frictionX = frictionX;
    }
    
    public double getFrictionY() {
        return frictionY;
    }
    
    public void setFrictionY(double frictionY) {
        this.frictionY = frictionY;
    }
    
    
    /*
     * zeitliches Verhalten
     */
    @Override
    public void act() {
        /*
         * Addition der Position mit dem 
         * entsprechenden Geschwindigkeitswert, zur Realisierung der Bewegung
         */ 
        double moveX = posX + speedX;
        double moveY = posY + speedY;
        
        double speedX_frictionX = speedX - frictionX;
        double speedY_frictionY = speedY - frictionY;
        
        int moveX_int = (int) Math.round(moveX);
        int moveY_int = (int) Math.round(moveY);
        
        setLocation(moveX_int, moveY_int);
    }
    
    /* Schlussendlich muss die neue Position noch 
     * der Greenfoot-Umgebung mitgeteilt werden.
     * 
     * Beachten!: Beachte, dass du die Fließkommazahlen zu Ganzzahlen umwandeln musst.
     * Nutze dafür die Rundungsfunkion von "java.lang.Math".
       */
    public void setLocation(int x, int y) {
        // TODO
        /*
         * int x2 = Math.round(x);
         * int y2 = Math.round(y);
         */
    }
    
    /*
     * zum Setzen der Position und Geschwindigkeit
     * Aufruf von setLocation(setLocation(int x, int y)
     */
    public void setPose(double paramA, double paramB, double paramC, double paramD /* paramList */) {
        // setLocation(x, y);
        //TODO
    }
    
    /*
     * Aufgabe: den MassActor in Richtung seiner Ausrichtung 
     * beschleunigen (nützlich bei der Rakete, die nur ein Triebwerk besitzt)
     */
    public void accelerate(double acc) {
        // TODO
    }
    
    /* 
     * Aufgabe: Beschleunigung in X- und Y-Richtung festlegen
     */
    public void accelerate(double accX, double accY) {
        // TODO
    }
    
    /*
     * Um die Beschleunigung in Richtung der aktuellen Ausrichtung zu realisieren, 
     * musst du mit trigonometrischen Funktionen die X- und Y-Komponente errechnen.
     * Die Actor-Methode getRotation() gibt dir die Ausrichtung in Grad
     * zurück.
     */    
    public int getRotation() {
        // TODO: return int
        return 1;
    }
    
    /*
     * Schlussendlich musst du noch die Methode addedToWorld(World world) 
     * implementieren. Diese wird aufgerufen, sobald eine Instanziierung zur Welt hinzugefügt
     * wurde. Hier speichern wir uns die übergebene Welt ab, indem wir sie
     * der anfänglich erstellten Variable zuweisen. Wichtig ist hier auch, dass wir die
     * initialen Koordinaten aus der Greenfoot-Umgebung in unserer doppelten Buchführung
     * übernehmen. Diese bekommen wir mit den Actor-Methoden getX()
     * und getY(). Auch hier ist wieder Vorsicht geboten, da wir Fließkommazahlen
     * benötigen.
     */
    protected void addedToWorld(World world) {
        // TODO
        /* Hier speichern wir uns die übergebene Welt ab, indem wir sie der anfänglich 
         * erstellten Variable zuweisen
         */
        
        int origX = getX();
        int origY = getY();
    }
}