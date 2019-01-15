import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList; 
/**
 * World class for Final Project game 
 * 
 * kbilak@email.uscb.edu 
 * Dev status: Active (Not complete)
 * received help from Jonathan Himmelsbach with User Info
 */
public class MyWorld extends World
{ 
    private PlayerChoice YesButton; 
    private PlayerChoice NoButton;
    private PlayerChoice PlayButton;
    private UserInfo myInfo;
    private int choice1A;
    private int choice1B;
    /**
     * Constructor for objects of class MyWorld
     * 
     */

    public MyWorld()
    {
        super(600, 550, 1);
        GreenfootImage background = new GreenfootImage("background.jpg");
        background.scale(getWidth(), getHeight());
        setBackground(background); // sets bacckground image 
        showText("Welcome to Aegis", 300,25); // displays welcome message
        PlayButton = new PlayerChoice("play1.jpeg"); // play button to begin
        addObject(PlayButton, 300,500);

    } // end MyWorld

    public void act()
    {

        if ( Greenfoot.mouseClicked( PlayButton ) ) 
        {
            Greenfoot.setWorld( new welcome() ); // when clicked moves to scene 1
        } 
        // end if statement
    } // end act method
} // World class
