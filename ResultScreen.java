import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList; 
/**
 * 
 * kbilak@email.uscb.edu
 * Dev status: Active (Not complete)
 */
public class ResultScreen extends World
{
    private UserInfo myInfo;
    private int choice1A;
    private int choice1B;
    /**
     * Constructor for objects of class Scene4
     * 
     */
    public ResultScreen()
    {    
        super(600, 550, 1); 
        showText("Scene 4", 300,25);
        GreenfootImage background = new GreenfootImage("background.jpg");
        background.scale(getWidth(), getHeight());
        setBackground(background);
        // displayUserInfo();
        // System.out.print(choice1A);
        // System.out.print(choice1B);
        
        Greenfoot.stop();
        UserInfo(true);
        // showText("Game Over: " + choice1A + choice1B, 350,550);
    } // end scene 4
    
    public void UserInfo(boolean userFinsihGame)
    {
        if (UserInfo.isStorageAvailable() )
        {
            UserInfo myInfo = UserInfo.getMyInfo();
            
            int ChoiceA = myInfo.getInt(0);
            int ChoiceB = myInfo.getInt(1);
            
            myInfo.store();
            
            showText("Game Over\n 1st Choice: "+ myInfo.getInt(0) +
                     " \n 2nd Choice: " + myInfo.getInt(1)  , 300, 225);
            
            List<UserInfo> allUsersInfoChoice = new ArrayList( myInfo.getTop(0) );
            int choice1A = 0;
            int choice1B = 0;
            
            
        }
    }
} // end scene 4 class
