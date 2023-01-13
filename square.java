import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;
import java.util.Dictionary;
import java.util.Hashtable;

/**
 * Write a description of class square here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class square extends Actor
{
    /**
     * Act - do whatever the square wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    GreenfootImage rectangle = new GreenfootImage(100, 100);
    public String location = "";
    
    Dictionary x = new Hashtable();
    Dictionary y = new Hashtable();
    
    public square(String c,int flocationx,int flocationy)
    {
        x.put(150,"a");
        x.put(250,"b");
        x.put(350,"c");
        x.put(450,"d");
        x.put(550,"e");
        x.put(650,"f");
        x.put(750,"g");
        x.put(850,"h");
        
        y.put(150,"1");
        y.put(250,"2");
        y.put(350,"3");
        y.put(450,"4");
        y.put(550,"5");
        y.put(650,"6");
        y.put(750,"7");
        y.put(850,"8");
        
        
        if(c=="green")
        {
            rectangle.setColor(new Color(118,150,86));
        }
        if(c=="white")
        {
            rectangle.setColor(new Color(238,238,210));
        }
        rectangle.fill();
        setImage(rectangle);
        
        location += x.get(flocationx);
        location += y.get(flocationy);
        
    }
    
    
    public void act() 
    {
    }    
}
