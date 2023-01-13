import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Dictionary;
import java.util.Hashtable;

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
     *
    **/
    public MyWorld()
    {    
        super(1000, 1000, 1);
        Dictionary x = new Hashtable();
    
        x.put(150,"a");
        x.put(250,"b");
        x.put(350,"c");
        x.put(450,"d");
        x.put(550,"e");
        x.put(650,"f");
        x.put(750,"g");
        x.put(850,"h");
        
        x.put(150,"1");
        x.put(250,"2");
        x.put(350,"3");
        x.put(450,"4");
        x.put(550,"5");
        x.put(650,"6");
        x.put(750,"7");
        x.put(850,"8");
        
        x.put("a",150);
        x.put("b",250);
        x.put("c",350);
        x.put("d",450);
        x.put("e",550);
        x.put("f",650);
        x.put("g",750);
        x.put("h",850);
        
        x.put("1",150);
        x.put("2",250);
        x.put("3",350);
        x.put("4",450);
        x.put("5",550);
        x.put("6",650);
        x.put("7",750);
        x.put("8",850);
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        for(int i = 150;i<851;i=i+200)
        {
            for(int j = 150;j<851;j=j+200)
            { 
                square obj = new square("green",i,j);
                addObject(obj,i,j);
            }
        }
        
        for(int i = 250;i<851;i=i+200)
        {
            for(int j = 250;j<851;j=j+200)
            { 
                square obj = new square("green",i,j);
                addObject(obj,i,j);
            }
        }
        
        for(int i = 250;i<851;i=i+200)
        {
            for(int j = 150;j<851;j=j+200)
            { 
                square obj = new square("white",i,j);
                addObject(obj,i,j);
            }
        }
        
        for(int i = 150;i<851;i=i+200)
        {
            for(int j = 250;j<851;j=j+200)
            { 
                square obj = new square("white",i,j);
                addObject(obj,i,j);
            }
        }
        
        for(int i = 1;i<9;i++)
        {
            String k = Integer.toString(i);
            pieces test = new pawn("black","a",k);
            addObject(test,(int)x.get(k),(int)x.get("g"));
        }
        
        for(int i = 1;i<9;i++)
        {
            String k = Integer.toString(i);
            pieces test = new pawn("white","a",k);
            addObject(test,(int)x.get(k),(int)x.get("b"));
        }
    }
}
