import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList; 
/**
 * 
 * kbilak@email.uscb.edu
 * Dev status: Active (Not complete)
 */
public class Scene3 extends World
{ 
    private PlayerChoice yesButton; 
    private PlayerChoice noButton;
    private UserInfo myInfo;
    private int choice1A;
    private int choice1B;
    /**
     * Constructor for objects of class Scene3
     * 
     */
    public Scene3()
    {    
        super(600, 550, 1); 
        GreenfootImage background = new GreenfootImage("scene3.jpg");
        background.scale(getWidth(), getHeight());
        setBackground(background);
        showText("Scene 3", 300,25);
        
        showText("As a result of low crops and taxes the Kingdom can't survive \n Do you want to go to war with the neighboring Kingdom?", 300, 175);
        yesButton = new PlayerChoice("yesbutton3.png");
        addObject(yesButton, 140,475);
        noButton = new PlayerChoice("nobutton3.jpg");
        addObject(noButton,440,475);
    }

    public void act()
    {
        if ( Greenfoot.mouseClicked( yesButton ) ) 
        {
            Greenfoot.setWorld( new ResultScreen() ); 
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
            Greenfoot.setWorld( new ResultScreen() );
            if ( UserInfo.isStorageAvailable() ) // check to see if user is logged in
            {
                UserInfo myInfo = UserInfo.getMyInfo();
                choice1B = myInfo.getInt(1);
                myInfo.setInt (1, choice1B +1);
                myInfo.store();
            } // end if statement
        } // end if/else
    } // end act method
} // end scene 3 class
