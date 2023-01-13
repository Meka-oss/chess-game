import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Dictionary;
import java.util.Hashtable;

/**
 * Write a description of class pieces here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pieces extends Actor
{
    /**
     * Act - do whatever the pieces wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    Dictionary x = new Hashtable();
    Dictionary y = new Hashtable();
    
    public pieces()
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
        
        x.put("a",150);
        x.put("b",250);
        x.put("c",350);
        x.put("d",450);
        x.put("e",550);
        x.put("f",650);
        x.put("g",750);
        x.put("h",850);
        
        y.put("1",150);
        y.put("2",250);
        y.put("3",350);
        y.put("4",450);
        y.put("5",550);
        y.put("6",650);
        y.put("7",750);
        y.put("8",850);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
