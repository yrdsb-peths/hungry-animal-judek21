import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Bee a = new Bee();
        addObject(a, 300, 200);
        makeFlower();

    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */

    public void makeFlower()
    {
        Flower c = new Flower();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(c, x, y);
    }
}
