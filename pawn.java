import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pawn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pawn extends pieces
{
    /**
     * Act - do whatever the pawn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    GreenfootImage wp = new GreenfootImage("\\images\\pawn_white.png");
    GreenfootImage bp = new GreenfootImage("\\images\\pawn_black.png");
    
    public pawn(String color, String locationx,String locationy)
    {
        super();
        
        wp.scale(100,100);
        bp.scale(100,100);
        if(color =="white")
        {
            setImage(wp);
        }
        if(color =="black")
        {
            setImage(bp);
        }
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
