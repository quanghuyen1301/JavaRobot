
import java.net.MalformedURLException;
import java.net.URL;

import org.sikuli.api.DesktopScreenRegion;
import org.sikuli.api.ImageTarget;
import org.sikuli.api.ScreenRegion;
import org.sikuli.api.Target;
import org.sikuli.api.visual.Canvas;
import org.sikuli.api.visual.DesktopCanvas;

public class RKFindScreen {
	public int RE_FINDIMAGE_TIMEOUT = -1;
	public int RE_FINDIMAGE_DONE = 0;
	public int x;
	public int y;
	
	public  int FindImage(String PathImage,int timeout)
	{
		return FindImage(PathImage,timeout,2000);
	}
	public  int FindImage(String PathImage,int timeout,int sleep)
	{
		int timeoutcount = 0;//timeout;
		ScreenRegion rScreen;
		ScreenRegion fScreen;
		URL imageURL = null;
		Target imageTarget;
		do {
			//System.gc();
			fScreen = new DesktopScreenRegion();
			try {
				imageURL = new URL(PathURL(PathImage));
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			imageTarget = new ImageTarget(imageURL);
			rScreen = fScreen.wait(imageTarget, 0);
			if(rScreen ==null)
			{
				rScreen =null;
				fScreen = null;
				imageURL = null;
				imageTarget = null;
				debug("Seach "+PathImage + " Retry " + timeoutcount );
				try {
					Thread.sleep(sleep);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else{
				debug("Found "+PathImage + " at " + timeoutcount );
			}
			System.gc();
			
	        if(timeoutcount == timeout){
	        	debug("Seach "+ PathImage + " time out");
	        	return RE_FINDIMAGE_TIMEOUT;
	        }
	        timeoutcount ++;
		} while (rScreen == null);
		
//		Canvas canvas = new DesktopCanvas();
//		canvas.addLabel(rScreen, PathImage).display(3);
		this.x =  rScreen.getCenter().getX();
		this.y =  rScreen.getCenter().getY();
		return RE_FINDIMAGE_DONE;
		
	}
	public int getx(){
		return x;
		
	}
	public int gety(){
		return y;
		
	}
	public void displayxy(){
		debug("x="+ this.x +" y=" + this.y);;
		
	}
	public void debug(String str)
	{
		 System.out.println(str);
	}
	public  String PathURL(String str)
	{
		return "file:///" + System.getProperty("user.dir").replace('\\', '/') +str;
	}
}
