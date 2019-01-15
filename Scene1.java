import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList; 
/**
 * 
 * kbilak@email.uscb.edu 
 * Dev status: Active (Not complete)
 */
public class Scene1 extends World
{
    private PlayerChoice yesButton; 
    private PlayerChoice noButton;
    private UserInfo myInfo;
    private int choice1A;
    private int choice1B;
    /**
     * Constructor for objects of class Scene1
     * 
     */
    public Scene1()
    {    

        super(600,550,1);
        GreenfootImage background = new GreenfootImage("scene1.jpg");
        background.scale(getWidth(), getHeight());
        setBackground(background);
        showText("As King you set a high tax on the peasants for you\n and the noblemen and as a result of the crippling tax\n the peasants are threatening to revolt", 300, 175);
        showText("Do you want to keep the taxes the same \nor decrease them to keep the peasants happy?", 300,250); 
        yesButton = new PlayerChoice("yesbutton3.png");
        addObject(yesButton, 140,475);
        noButton = new PlayerChoice("nobutton3.jpg");
        addObject(noButton,440,475);
        showText("Scene 1", 300,25);
    } // end scene 1

    public void act()
    {
        if ( Greenfoot.mouseClicked( yesButton ) ) 
        {
            Greenfoot.setWorld( new Scene2() ); 
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
            Greenfoot.setWorld( new Scene2() );
            if ( UserInfo.isStorageAvailable() ) // check to see if user is logged in
            {
                UserInfo myInfo = UserInfo.getMyInfo();
                choice1B = myInfo.getInt(1);
                myInfo.setInt (1, choice1B +1);
                myInfo.store();
            } // end if statement
        } // end if/else
    } // end act method
} // end scene 1 class
