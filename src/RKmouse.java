
import java.awt.MouseInfo;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.lang.reflect.Field;

public class RKmouse {
	public int robotdelay = 100;

	public  void ALT_F4(Robot robot)
	{
	          robot.keyPress(KeyEvent.VK_ALT);
			  robot.keyPress(KeyEvent.VK_F4);
			  robot.delay(100);
			  robot.keyRelease(KeyEvent.VK_F4);
	          robot.keyRelease(KeyEvent.VK_ALT);			  
	}
	public  void mouseMove(Robot robot, int x ,int y)
	{
		   robot.mouseMove( x,  y);
	}
	public  void click(Robot robot, int x ,int y)
	{
		mouseMove(robot,x,y);
		click(robot);
	}
	public void click(Robot robot)
	{
         robot.mousePress(InputEvent.BUTTON1_MASK);
         robot.mouseRelease(InputEvent.BUTTON1_MASK);
	}
	public int getmousex(Robot robot)
	{
		 System.out.println("get mouse ("+MouseInfo.getPointerInfo().getLocation().x+", "+MouseInfo.getPointerInfo().getLocation().y+")");
		 return MouseInfo.getPointerInfo().getLocation().x;
         
	}
	public  int getmousey(Robot robot)
	{
		 System.out.println("("+MouseInfo.getPointerInfo().getLocation().x+", "+MouseInfo.getPointerInfo().getLocation().y+")");
		 return MouseInfo.getPointerInfo().getLocation().y;
         
	}
	public  void typeCharacterEnter(Robot robot, String letter)
    {
		int delay = 10;
		typeCharacter(robot,letter);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(delay);
        robot.keyRelease(KeyEvent.VK_ENTER );
		
    }
	public  void typeCharacter(Robot robot, String letter)
	      {
		int delay = 10;
		if(letter.endsWith("null"))
		{			
			return;
		}
	     for(int i=0;i<letter.length();i++){
	      try
	      {
	          boolean upperCase = Character.isUpperCase( letter.charAt(i) );
	          String KeyVal=Character.toString(letter.charAt(i));
	          if(KeyVal.endsWith(".")){
		          robot.keyPress(KeyEvent.VK_PERIOD);
		          robot.delay(delay);
		          robot.keyRelease(KeyEvent.VK_PERIOD );
		          continue;
	          }
	          if(KeyVal.endsWith("@")){
		  		robot.keyPress(KeyEvent.VK_SHIFT);robot.delay(delay);
				robot.keyPress(KeyEvent.VK_2);robot.delay(delay);
				robot.keyRelease(KeyEvent.VK_2);robot.delay(delay);
				robot.keyRelease(KeyEvent.VK_SHIFT);robot.delay(delay);
		          continue;
	          }
	          if(KeyVal.endsWith("-")){
				robot.keyPress(KeyEvent.VK_MINUS);robot.delay(delay);
				robot.keyRelease(KeyEvent.VK_MINUS);robot.delay(delay);
		          continue;
	          }
	          String variableName = "VK_" + KeyVal.toUpperCase();
	          Class clazz = KeyEvent.class;
	          Field field = clazz.getField( variableName );
	          int keyCode = field.getInt(null);

	          robot.delay(delay);

	          if (upperCase) robot.keyPress( KeyEvent.VK_SHIFT );

	          robot.keyPress( keyCode );
	          robot.keyRelease( keyCode );

	          if (upperCase) robot.keyRelease( KeyEvent.VK_SHIFT );
	      }
	      catch(Exception e)
	      {
	          System.out.println(e);
	      }
	      }

	  }
}
