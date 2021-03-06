import greenfoot.*;

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bullet(int r)
    {
        setRotation(r);
    }
    
    public void act() 
    {
        move(5);
        checkAtEdge();
    }    
    
    public void checkAtEdge()
    {
        if(getX() >= getWorld().getWidth() - 1) {
            getWorld().removeObject(this);
        }
        else if(getX() <= 1) {
            getWorld().removeObject(this);
        }
        else if(getY() >= getWorld().getHeight() - 1) {
            getWorld().removeObject(this);            
        }
        else if(getY() <= 1) {
            getWorld().removeObject(this);
        }
    }
}
