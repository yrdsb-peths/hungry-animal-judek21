import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Actor
{
    /**
     * Act - do whatever the Bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("d"))
        {
            turn(3);
        }
        if(Greenfoot.isKeyDown("a"))
        {
            turn(-3);
        }
        if(Greenfoot.isKeyDown("w"))
        {
            move(2);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            move(-1);
        }
        move(1);
        
        
    }
}
