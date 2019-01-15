import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList; 
/**
 * 
 * kbilak@email.uscb.edu
 * Dev status: Active (Not complete)
 */
public class Scene2 extends World
{ 
    private PlayerChoice yesButton; 
    private PlayerChoice noButton;
    private UserInfo myInfo;
    private int choice1A;
    private int choice1B;
    /**
     * Constructor for objects of class Scene2
     * 
     */
    public Scene2()
    {    
        super(600, 550, 1); 
        GreenfootImage background = new GreenfootImage("scene2.jpg");
        background.scale(getWidth(), getHeight());
        setBackground(background);
        showText("Scene 2", 300,25);
        
        showText("Due to a famine that wiped out most of the crops \ntheres only enough food to feed 80% of the kingdom", 300, 175);
        showText("Do you want to keep the food for yourself and \nupper class or evenly distribute?", 300, 250);
        yesButton = new PlayerChoice("yesbutton3.png");
        addObject(yesButton, 140,475);
        noButton = new PlayerChoice("nobutton3.jpg");
        addObject(noButton,440,475);
    } // end Scene2 

    public void act()
    {
        if ( Greenfoot.mouseClicked( yesButton ) ) 
        {
            Greenfoot.setWorld( new Scene3() ); 
            if ( UserInfo.isStorageAvailable() ) // check to see if user is logged in
            {
                UserInfo myInfo = UserInfo.getMyInfo();
                choice1A = myInfo.getInt(0);
                myInfo.setInt (0, choice1A +1);
                myInfo.store();
            } // end if statement
        } 
        else if ( Greenfoot.mouseClicked( noButton ) ) 
        {
            Greenfoot.setWorld( new Scene3() );
            if ( UserInfo.isStorageAvailable() ) // check to see if user is logged in
            {
                UserInfo myInfo = UserInfo.getMyInfo();
                choice1B = myInfo.getInt(1);
                myInfo.setInt (1, choice1B +1);
                myInfo.store();
            } // end if statement
        } // end if/else
    } // end act method
} // end scene 2 class
