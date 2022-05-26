import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flower extends Actor
{
    public Flower()
    {
        turn(90);
    }
    public void act()
    {
        setLocation(getX(), getY() +1);
    }
}
