import greenfoot.*;

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
    */
   
    private int rld = 0;
   
    MouseInfo mi;
   
    public Player()
    {
        setImage("turtle.png");
    }
    
    public void act() 
    {
        // Add your action code here.
        updateMouse();
        checkKeys();
        rld --;
    } 
    
    public void updateMouse()
    {
        mi = Greenfoot.getMouseInfo();
        if(mi != null){
            turnTowards();
            checkForShoot();
        }
    }
    
    public void checkForShoot()
    {
        if(mi.getButton() == 1  && rld < 1)
        {
            shoot();
        }
    }
    
    public void turnTowards()
    {
        
        
        turnTowards(mi.getX(), mi.getY());
            
        
    }
    
    public void checkKeys()
    {
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY() - 5);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY() + 5);
        }
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX() - 5, getY());
        }
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + 5, getY());
        }
        
    }
    
    public void shoot()
    {
        Bullet bullet = new Bullet (getRotation());
        getWorld().addObject (bullet, getX(), getY());
        bullet.move (5);
        rld = 20;
    }
}
