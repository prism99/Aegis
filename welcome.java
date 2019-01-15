import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * kbilak@email.uscb.edu
 * Dev status: Active (Not complete)
 */
public class welcome extends World
{
    private PlayerChoice YesButton; 
    private PlayerChoice NoButton;
    private PlayerChoice PlayButton;
    private UserInfo myInfo;
    private int choice1A;
    private int choice1B;
    /**
     * Constructor for objects of class welcome.
     * 
     */
    public welcome()
    {    
        super(600, 550, 1); 
        GreenfootImage background = new GreenfootImage("black-background.jpg");
        background.scale(getWidth(), getHeight());
        setBackground(background);
        showText("You are the King of an medieval society \n You are forced to make decisions about the fate of the kingdom", 300, 75);
        showText("The decision on what kind of ruler you want to be is up to you", 300, 125);
        PlayButton = new PlayerChoice("play1.jpeg"); // play button to begin
        addObject(PlayButton, 300,500);
    }
    public void act()
    {

        if ( Greenfoot.mouseClicked( PlayButton ) ) 
        {
            Greenfoot.setWorld( new Scene1() ); // when clicked moves to scene 1
        } 
        // end if statement
    } // end act method
} // end welcome class
