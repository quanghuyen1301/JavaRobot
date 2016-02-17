
import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URL;

import org.sikuli.api.DesktopScreenRegion;
import org.sikuli.api.ImageTarget;
import org.sikuli.api.ScreenRegion;
import org.sikuli.api.Target;
import org.sikuli.api.visual.Canvas;
import org.sikuli.api.visual.DesktopCanvas;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

import javax.imageio.ImageIO;

import org.sikuli.api.*;
import org.sikuli.api.robot.Mouse;
import org.sikuli.api.robot.desktop.DesktopMouse;
import org.sikuli.api.visual.Canvas;
import org.sikuli.api.visual.DesktopCanvas;

import static org.sikuli.api.API.*;
public class robot {
	public static String PathImageSeach ;
	public static ScreenRegion s;
	public static URL imageURL;
	public static Target imageTarget;
	public static  ScreenRegion r;
	public static void main(String[] args) throws Exception  {
		Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		LoginFacebook(robot);
//RegisterFacebook(robot);
//		SeachGroupFacebook(robot);
//		
		//while(true) {
		//Thread.sleep(1000);
//		GetGroupID(robot);
//		JoinGroup(robot);
		//GetGroupID(robot);
		int timegetsample = 3000;
		MinEclipse(robot);
//		for (int tx_cn1_inv = 0; tx_cn1_inv <= 0; tx_cn1_inv++) 
//		for (int tx_cn1 = 0; tx_cn1 <= 13; tx_cn1++) {
//			String str = "tx_cn1."+tx_cn1 + " tx_cn1_inv."+tx_cn1_inv;
//			xDiag(robot, "phy tune pcie 0 0 " + str);
//			Thread.sleep(1000);
//			CleanSC(robot);
//			Thread.sleep(timegetsample);
//
//			BufferedImage screencapture = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
//
//			// Save as JPEG
//			File file = new File(str+".jpg");
//			ImageIO.write(screencapture, "jpg", file);
//			System.gc();
//		}
//		for (int tx_cn2_inv = 0; tx_cn2_inv <= 0; tx_cn2_inv++) 
//		for (int tx_cn2 = 0; tx_cn2 <= 6; tx_cn2++) {
//			String str = "tx_cn2."+tx_cn2+ " tx_cn2_inv."+tx_cn2_inv+" tx_cn1.0";
//			xDiag(robot, "phy tune pcie 0 0 " + str);
//
//			Thread.sleep(1000);
//			CleanSC(robot);
//			Thread.sleep(timegetsample);
//
//
//			BufferedImage screencapture = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
//
//			// Save as JPEG
//			File file = new File(str+".jpg");
//			ImageIO.write(screencapture, "jpg", file);
//			System.gc();
//		}
//		for (int tx_cp1_inv = 0; tx_cp1_inv <= 0; tx_cp1_inv++)
//		for (int tx_cp1 = 0; tx_cp1 <= 19; tx_cp1++) {
//			String str = "tx_cp1."+tx_cp1+" tx_cp1_inv."+tx_cp1_inv +" tx_cn2.0";
//			xDiag(robot, "phy tune pcie 0 0 " + str);
//
//			Thread.sleep(1000);
//			CleanSC(robot);
//			Thread.sleep(timegetsample);
//
//
//			BufferedImage screencapture = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
//
//			// Save as JPEG
//			File file = new File(str+".jpg");
//			ImageIO.write(screencapture, "jpg", file);
//			System.gc();
//		}
//		for (int txamp_cntl = 0; txamp_cntl <= 0xf; txamp_cntl++) {
//		String str = "txamp_cntl."+txamp_cntl;
//		xDiag(robot, "phy tune pcie 0 0 " + str);
//
//		Thread.sleep(1000);
//		CleanSC(robot);
//		Thread.sleep(timegetsample);
//
//
//		BufferedImage screencapture = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
//
//		// Save as JPEG
//		File file = new File(str+".jpg");
//		ImageIO.write(screencapture, "jpg", file);
//		System.gc();
//	}
	for(int ctle_eq_ac = 0x0;ctle_eq_ac <= 0x1f;ctle_eq_ac++)
		for(int rxdfebuf_vcm = 0x0;rxdfebuf_vcm <= 0x3;rxdfebuf_vcm++)
			for(int rxvreg1p2 = 0x0;rxvreg1p2 <= 0x3;rxvreg1p2++)
				for(int rxiref_adj = 0x0;rxiref_adj <= 0x3;rxiref_adj++)
		
	{
		int ctle_eq = ctle_eq_ac;
		String str = "eye ctle_eq." + ctle_eq + " ctle_eq_hr." + ctle_eq + " ctle_eq_qr." + ctle_eq+ " ctle_eq_fr." + ctle_eq +" rxdfebuf_vcm."+rxdfebuf_vcm+" rxvreg1p2."+rxvreg1p2 + " rxiref_adj." + rxiref_adj;
		xDiag(robot, "phy tune pcie 0 0 " + str);
		//typeCharacterEnter(robot, "phy tune pcie 0 0 " + str);
		typeCharacterEnter(robot, "phy eyed pcie 0 0");
		Thread.sleep(60000);
		BufferedImage screencapture = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		// Save as JPEGphy eyed pcie 0 0
		
		File file = new File(str+".jpg");
		ImageIO.write(screencapture, "jpg", file);
		file.exists();
	}
//	int ctle_eq = 1;
//	String str2 = "eye ctle_eq." + ctle_eq + " ctle_eq_hr." + ctle_eq + " ctle_eq_qr." + ctle_eq+ " ctle_eq_fr." + ctle_eq;
//	xDiag(robot, "phy tune pcie 0 0 " + str2);
//		for(int pq_reg = 13;pq_reg <= 0x1f;pq_reg++)
//		{
//			String str = "eye pq_reg." + pq_reg;
//			xDiag(robot, "phy tune pcie 0 0 " + str);
//			//typeCharacterEnter(robot, "phy tune pcie 0 0 " + str);
//			Thread.sleep(500);
//			typeCharacterEnter(robot, "phy eyed pcie 0 0");
//			Thread.sleep(60000);
//			BufferedImage screencapture = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
//			// Save as JPEG
//			File file = new File(str+".jpg");
//			ImageIO.write(screencapture, "jpg", file);
//			file.exists();
//		}
//		for (int tx_cn1 = 0; tx_cn1 <= 13; tx_cn1=tx_cn1+2) {
//				for (int tx_cn2 = 6; tx_cn2 <= 6; tx_cn2=tx_cn2+2) {
//					for (int tx_cp1 = 0; tx_cp1 <= 0; tx_cp1=tx_cp1+2) {
//					String str = "tx_cn1."+tx_cn1 +" tx_cn2."+tx_cn2 + " tx_cp1."+tx_cp1;
//					xDiag(robot, "phy tune pcie 0 0 " + str);
//
//					Thread.sleep(1000);
//					CleanSC(robot);
//					Thread.sleep(timegetsample);
//
//
//					BufferedImage screencapture = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
//
//					// Save as JPEG
//					File file = new File(str+".jpg");
//					ImageIO.write(screencapture, "jpg", file);
//					file.exists();
//					
//					System.gc();
//				}
//				
//			}
//		}
		     // Save as PNG
		     // File file = new File("screencapture.png");
		     // ImageIO.write(screencapture, "png", file);
		//}
//		
//		TextTransfer textTransfer = new TextTransfer();
//		System.out.println("Clipboard contains:" + textTransfer.getClipboardContents());
//		 textTransfer.setClipboardContents("blah, blah, blah");
//		while(true){
//		Thread.sleep(2000);
//		Date todayDate = new Date();
//		int hours = todayDate.getHours();
//		int minutes = todayDate.getMinutes();
//		int senconds = todayDate.getSeconds();
//		debug("hours "+hours+":" + minutes+":"+senconds);
//		LoginFacebook(robot);
//		Thread.sleep(5000);
//		}
//		SeachGroupFacebook(robot);
//		while(true) {
//		GetGroupID(robot);
//		}
//		System.exit(0);
	}
	public static String getpublicip() throws IOException
	{
        URL whatismyip = new URL("http://checkip.amazonaws.com");
        BufferedReader in = null;
        try {
            in = new BufferedReader(new InputStreamReader(
                    whatismyip.openStream()));
            String ip = in.readLine();
            System.out.println(ip);
            return ip;
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
	}
	
	public static void LoginFacebook(Robot robot) throws IOException, InterruptedException
	{
		 browse(new URL("http://facebook.com/"));
		 Thread.sleep(2000);
		 ChromePrivateMode(robot);
		 typeCharacterEnter(robot,"facebook.com");
		String SeachImage[] = { 
				/*"/img/login/english.png","null",*/
				"/img/login/email.png","bevang@bevang.vn",
				"/img/login/password.png","Nothing@88",
				"/img/login/login.png","null",
				"/img/login/fb.png","null",
				"/img/login/updatestatus.png","hello",
				"/img/login/post.png","null",
				};

//		ALT_TAB(robot);
//		 browse(new URL("http://facebook.com/"));
//		 ChromePrivateMode(robot);
//		 typeCharacterEnter(robot,"http://facebook.com/");
//		 typeCharacter(robot,"facebook.com");
//        int a =0;
		
//        do{
//        	s = new DesktopScreenRegion();
//        	imageURL = new URL(PathURL(SeachImage[0]));
//        	
//        	imageTarget = new ImageTarget(imageURL);
//	        r = s.wait(imageTarget,0);
//        } while(r ==null);
        
        int forseach = 0;
        for(forseach = 0; forseach < SeachImage.length;forseach=forseach+2)
        {
        	int timeout = 10;
            do{
            	timeout --;
            s = new DesktopScreenRegion();
        	imageURL = new URL(PathURL(SeachImage[forseach])); 
        	
        	imageTarget = new ImageTarget(imageURL);
	        r = s.wait(imageTarget,0);
	       
		        if(r==null){
		        	debug("Seach "+SeachImage[forseach]+"Not found\n");
		        }else{
			        int pointx = r.getCenter().getX();
			        int pointy = r.getCenter().getY();
			        System.out.println("x,y = " + pointx +" "+pointy);    
			        click(robot,pointx,pointy);
			        if(SeachImage[forseach].endsWith("/img/login/updatestatus.png"))
			        {
			        	Date todayDate = new Date();
//			        	SeachImage[forseach+1]=getpublicip()+"-"+todayDate.getHours()+"-"+todayDate.getMinutes()+"-"+todayDate.getSeconds();
			        }
			        typeCharacter(robot,SeachImage[forseach+1]);
			        
			        Canvas canvas = new DesktopCanvas();
			        canvas.addLabel(r, SeachImage[forseach]).display(1);
		        }
		        Thread.sleep(100);
		        System.out.println("" + Runtime.getRuntime().freeMemory());
		        if(timeout == 0)
		        	break;
		        System.gc();
            } while(r ==null);
            System.out.println("" + Runtime.getRuntime().freeMemory());   
        }
        ALT_F4(robot);
        Thread.sleep(1000);
        ALT_F4(robot);
        System.gc();
//        System.exit(0);
	}
	public static void SeachGroupFacebook(Robot robot) throws MalformedURLException, InterruptedException
	{
		String fileseach;
		 browse(new URL("https://www.facebook.com/VoHoaiLinh"));
		 fileseach = "/img/seach/"+"logo.png";
		 int timeout = 20;
        do{
        	s = new DesktopScreenRegion();
        	imageURL = new URL(PathURL(fileseach));
        	imageTarget = new ImageTarget(imageURL);
	        r = s.wait(imageTarget,0);
	        if(r ==null)
	        	System.gc();
	        debug("Seach file " + fileseach);
	        timeout --;if(timeout ==0) break;
        } while(r ==null); /*check logo facebook*/
        Canvas canvas = new DesktopCanvas();
        canvas.addLabel(r, fileseach).display(1);
        delay(1);

int countout = 50;        
while(true){           
		fileseach = "/img/seach/"+"like.png";
        timeout = 20;
	countout--;if(countout==0) break;   
        do{
        	timeout --;if(timeout ==0) break;
        	//if(r == null){
        	delay(1);
        		typeCharacter(robot," ");
        		delay(1);
        	//}
        	s = new DesktopScreenRegion();
        	imageURL = new URL(PathURL(fileseach));
        	imageTarget = new ImageTarget(imageURL);
	        r = s.wait(imageTarget,0);
	        if(r ==null){
	        	System.gc();
	        	
	        }
	        debug("Seach file "+fileseach);
        }while(r == null);
        canvas = new DesktopCanvas();
        canvas.addLabel(r, fileseach).display(1);
    
        click(robot, r.getCenter().getX(),r.getCenter().getY());
        delay(1);
        click(robot, r.getCenter().getX(),r.getCenter().getY());
        
		 fileseach = "/img/seach/"+"likethis.png";
		 timeout = 20;
	        do{
	        	timeout --;if(timeout ==0) break;
	        	s = new DesktopScreenRegion();
	        	imageURL = new URL(PathURL(fileseach));
	        	imageTarget = new ImageTarget(imageURL);
		        r = s.wait(imageTarget,0);
		        if(r ==null)
		        	System.gc();
		        debug("Seach file " + fileseach);
	        } while(r ==null); /*check logo facebook*/
	        canvas = new DesktopCanvas();
	        canvas.addLabel(r, fileseach).display(1);
	        click(robot, r.getCenter().getX()-30,r.getCenter().getY());
	        GetLikeUser(robot);
}	        
	        
	}
	public static void GetGroupID(Robot robot) throws Exception
	{
		  db mdb = new db();
		  mdb.open();
		  String username =  mdb.getuser();
		  String [] username2 = username.split( "\\?" );
		  debug(username2[0]+"/groups?pnref=lhc");
		  browse(new URL(username2[0]+"/groups?pnref=lhc"));
		  String fileseach;
		 fileseach = "/img/group/"+"join.png";
		 int timeout = 20;
        do{
        	timeout --;if(timeout ==0) break;
        	s = new DesktopScreenRegion();
        	imageURL = new URL(PathURL(fileseach));
        	imageTarget = new ImageTarget(imageURL);
	        r = s.wait(imageTarget,0);
	        if(r ==null)
	        	System.gc();
	        debug("Seach file " + fileseach);
        } while(r ==null); /*check logo facebook*/
        if(r !=null){
        Canvas canvas = new DesktopCanvas();
        canvas.addLabel(r, fileseach).display(1);

		 CTRL_S(robot);
		 delay(2);
		 typeCharacterEnter(robot, "group.txt");
		 delay(1);
		
		 File2DB mfile2db = new File2DB();
		 mfile2db.SeachGroup2DB(username);
		 CTRL_W(robot);
        }else {
        	CTRL_W(robot);
      	  
      	mdb.updateuserp1(username,"NoName");
        }
		  
	}
	public static void MinEclipse(Robot robot) throws Exception
	{
		 //ALT_TAB(robot);
		 String fileseach;
		 fileseach = "/img/min.PNG";
		 int timeout = 20;
        do{
        	timeout --;if(timeout ==0) break;
        	s = new DesktopScreenRegion();
        	imageURL = new URL(PathURL(fileseach));
        	imageTarget = new ImageTarget(imageURL);
	        r = s.wait(imageTarget,0);
	        if(r ==null)
	        	System.gc();
	        debug("Seach file " + fileseach);
        } while(r ==null); /*check logo facebook*/
        if(r !=null){
        Canvas canvas = new DesktopCanvas();
        canvas.addLabel(r, fileseach).display(1);
        
        int pointx = r.getCenter().getX();
        int pointy = r.getCenter().getY();
        System.out.println("x,y = " + pointx +" "+pointy);    
        click(robot,pointx,pointy);
		// CTRL_S(robot);
		 //delay(2);
		 //typeCharacterEnter(robot, "group.txt");
		// delay(1);
		
		// CTRL_W(robot);
        } 
		  
	}
	public static void xDiag(Robot robot,String str) throws Exception
	{
		 //ALT_TAB(robot);
		 String fileseach;
		 fileseach = "/img/xdiag.PNG";
		 int timeout = 20;
        do{
        	timeout --;if(timeout ==0) break;
        	s = new DesktopScreenRegion();
        	imageURL = new URL(PathURL(fileseach));
        	imageTarget = new ImageTarget(imageURL);
	        r = s.wait(imageTarget,0);
	        if(r ==null)
	        	System.gc();
	        debug("Seach file " + fileseach);
	        
        } while(r ==null); /*check logo facebook*/
        if(r !=null){
        Canvas canvas = new DesktopCanvas();
        canvas.addLabel(r, fileseach).display(1);
        
        int pointx = r.getCenter().getX();
        int pointy = r.getCenter().getY();
        System.out.println("x,y = " + pointx +" "+pointy);    
        click(robot,pointx,pointy);
		// CTRL_S(robot);
		 //delay(2);
		 typeCharacterEnter(robot, str);
		// delay(1);
		
		// CTRL_W(robot);
        } 
		  
	}
	public static void CleanSC(Robot robot) throws Exception
	{
		 //ALT_TAB(robot);
		 String fileseach;
		 fileseach = "/img/clean.PNG";
		 int timeout = 20;
        do{
        	timeout --;if(timeout ==0) break;
        	s = new DesktopScreenRegion();
        	imageURL = new URL(PathURL(fileseach));
        	imageTarget = new ImageTarget(imageURL);
	        r = s.wait(imageTarget,0);
	        if(r ==null)
	        	System.gc();
	        debug("Seach file " + fileseach);
        } while(r ==null); /*check logo facebook*/
        if(r !=null){
        Canvas canvas = new DesktopCanvas();
        canvas.addLabel(r, fileseach).display(1);
        
        int pointx = r.getCenter().getX();
        int pointy = r.getCenter().getY();
        System.out.println("x,y = " + pointx +" "+pointy);    
        click(robot,pointx,pointy);
		// CTRL_S(robot);
		 //delay(2);
		 //typeCharacterEnter(robot, "group.txt");
		// delay(1);
		
		// CTRL_W(robot);
        } 
		  
	}
	public static void GetLikeUser(Robot robot) throws MalformedURLException, InterruptedException
	{
		String fileseach;
		// browse(new URL("https://www.facebook.com/ba.tung.7"));
		//while(true) 
		
		{
		 fileseach = "/img/seach/"+"adduser.png";
		 int timeout = 20;
        do{
        	timeout --;if(timeout ==0) break;
        	s = new DesktopScreenRegion();
        	imageURL = new URL(PathURL(fileseach));
        	imageTarget = new ImageTarget(imageURL);
	        r = s.wait(imageTarget,0);
	        if(r ==null)
	        	System.gc();
	        debug("Seach file " + fileseach);
        } while(r ==null); /*check logo facebook*/
        if(r !=null){
        Canvas canvas = new DesktopCanvas();
        canvas.addLabel(r, fileseach).display(1);
        }
        int count = 2;
		 fileseach = "/img/seach/"+"seemore.png";
		 timeout = 20;
		 while(true)
		 {
	        do{
	        	timeout --;if(timeout ==0) break;
	        	robot.mouseWheel(10);
	        	s = new DesktopScreenRegion();
	        	imageURL = new URL(PathURL(fileseach));
	        	imageTarget = new ImageTarget(imageURL);
		        r = s.wait(imageTarget,0);
		        if(r ==null)
		        	System.gc();
		        debug("Seach file " + fileseach);
		        System.gc();
	        } while(r ==null); /*check logo facebook*/
	        if(r != null){
	        	Canvas canvas = new DesktopCanvas();
		        canvas.addLabel(r, fileseach).display(1);
		        click(robot, r.getCenter().getX(),r.getCenter().getY());
	        }
        	count --;
	        if(count == 0 )
	        	break;
	        
		 }
		 
		 try{
			 
	    		File file = new File("D:/Users/hqbui/Desktop/user.txt");
	 
	    		if(file.delete()){
	    			System.out.println(file.getName() + " is deleted!");
	    		}else{
	    			System.out.println("Delete operation is failed.");
	    		}
	 
	    	}catch(Exception e){
	 
	    		e.printStackTrace();
	 
	    	}
		 CTRL_S(robot);
		 delay(5);
		 typeCharacterEnter(robot, "user.txt");
		 delay(1);
		 
		 File2DB mfile2db = new File2DB();
		 mfile2db.CopyFile2DB();
		 ROBOOT_ESC(robot);
       // click(robot, r.getCenter().getX()-250,r.getCenter().getY());
		 
		}
		
//        System.exit(0);
	}
	public static void copylink(Robot robot)
	{
		
	}
	public static void delay(int s) throws InterruptedException
	{
		Thread.sleep(s*1000);
	}
	public static void JoinGroup(Robot robot) throws Exception
	{
		  db mdb = new db();
		  mdb.open();
		  String username =  mdb.getgroup();
//		  String [] username2 = username.split( "\\?" );
//		  String [] username3 = username2[0].split( "/" );
//		  String [] username4 = username3[3].split( "\\." );
		  debug(username);
		  mdb.updategroupp1(username, "Joned");
		  browse(new URL(username));
		  RKFindScreen mRKFindScreen = new RKFindScreen();
		  mRKFindScreen.FindImage("/img/group/joingroup.png", 5);
		  RKmouse mRKmouse = new RKmouse();
		  mRKmouse.click(robot, mRKFindScreen.x, mRKFindScreen.y);
//		  C:\hqbui\Dropbox\Project\android\Java\rktool\src\RKFindScreen.java
		  Thread.sleep(500);
		  CTRL_W(robot);
	}
	public static void RegisterFacebook(Robot robot) throws Exception
	{
		String SeachImage[] = { 
/*				"/img/logo.png","null",
				"/img/Email&phone.png","null",
				"/img/JoinGroup.png","null",
				"/img/groups.png","null",
				"/img/apps.png","null",*/
				"/img/lastname.png","Nguyen",
				"/img/name.png","Caoky Duyen",
				"/img/email.png","nguyencao220@gmail.com",
				"/img/email2.png","nguyencao220@gmail.com",
				"/img/newpassword.png","nothingforall",
				"/img/ngay.png","11",
				"/img/thang.png","t",
				"/img/nam.png","1988",	
				"/img/nam-nu.png","null",
				"/img/dk.png","null",
				};
		  db mdb = new db();
		  mdb.open();
		  String username =  mdb.getuser();
		  mdb.updateuserp1(username, "OK");
		  String [] username2 = username.split( "\\?" );
		  String [] username3 = username2[0].split( "/" );
		  String [] username4 = username3[3].split( "\\." );
		  debug(username4[0] + " " + username4[1] );
		  SeachImage[1] = username4[0];
		  SeachImage[3] = username4[1];
		  SeachImage[5] = username4[0] + username4[1] + "@yahoo.com";
		  SeachImage[7] = username4[0] + username4[1] + "@yahoo.com";
//		ALT_TAB(robot);
		 browse(new URL("https://vi-vn.facebook.com/"));
        s = new DesktopScreenRegion();
//        int a =0;
        do{
        	imageURL = new URL(PathURL(SeachImage[0]));
        	
        	imageTarget = new ImageTarget(imageURL);
	        r = s.wait(imageTarget,0);
        } while(r ==null);
        int forseach = 0;
        for(forseach = 0; forseach < SeachImage.length;forseach=forseach+2)
        {
        	imageURL = new URL(PathURL(SeachImage[forseach]));
        	
        	imageTarget = new ImageTarget(imageURL);
	        r = s.wait(imageTarget,0);
	        
	        if(r==null){
	        	debug("Seach "+SeachImage[forseach]+"Not found\n");
	        }else{
	        int pointx = r.getCenter().getX();
	        int pointy = r.getCenter().getY();
	        System.out.println("x,y = " + pointx +" "+pointy);    
	        click(robot,pointx,pointy);
	        typeCharacter(robot,SeachImage[forseach+1]);
	        
	        Canvas canvas = new DesktopCanvas();
	        canvas.addLabel(r, SeachImage[forseach]).display(1);
	        }
        }
        System.exit(0);
	}
	public static void ChromePrivateMode(Robot robot)
	{
		int delay = 10;
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_N);robot.delay(delay);
		robot.keyRelease(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_SHIFT);
	}
	public static String PathURL(String str)
	{
		return "file:///" + System.getProperty("user.dir").replace('\\', '/') +str;
	}
	public static void debug(String str)
	{
		System.out.println(str);
	}
	public static void ALT_TAB(Robot robot)
	{

	          robot.keyPress(KeyEvent.VK_ALT);
	          robot.delay(100);
			  robot.keyPress(KeyEvent.VK_TAB);
			  robot.delay(100);
			  robot.keyRelease(KeyEvent.VK_TAB);
			  robot.delay(100);
//			  robot.keyPress(KeyEvent.VK_TAB);
//			  robot.delay(100);
//			  robot.keyRelease(KeyEvent.VK_TAB);
//			  robot.delay(100);
//			  robot.keyPress(KeyEvent.VK_TAB);
//			  robot.delay(100);
//			  robot.keyRelease(KeyEvent.VK_TAB);
			  robot.delay(100);
	          robot.keyRelease(KeyEvent.VK_ALT);
			  
	}
	public static void CTRL_W(Robot robot)
	{

	          robot.keyPress(KeyEvent.VK_CONTROL);
			  robot.keyPress(KeyEvent.VK_W);
			  robot.delay(100);
			  robot.keyRelease(KeyEvent.VK_W);
	          robot.keyRelease(KeyEvent.VK_CONTROL);
			  
	}
	public static void CTRL_S(Robot robot)
	{

	          robot.keyPress(KeyEvent.VK_CONTROL);
			  robot.keyPress(KeyEvent.VK_S);
			  robot.delay(100);
			  robot.keyRelease(KeyEvent.VK_S);
	          robot.keyRelease(KeyEvent.VK_CONTROL);
			  
	}
	public static void ROBOOT_ENTER(Robot robot)
	{

	          robot.keyPress(KeyEvent.VK_ENTER);
			  robot.delay(100);
			  robot.keyRelease(KeyEvent.VK_ENTER);
			  
	}
	public static void ROBOOT_ESC(Robot robot)
	{

	          robot.keyPress(KeyEvent.VK_ESCAPE);
			  robot.delay(100);
			  robot.keyRelease(KeyEvent.VK_ESCAPE);
			  
	}
	public static void ALT_F4(Robot robot)
	{

	          robot.keyPress(KeyEvent.VK_ALT);
	          robot.delay(100);
			  robot.keyPress(KeyEvent.VK_F4);
			  robot.delay(100);
			  robot.keyRelease(KeyEvent.VK_F4);
			  robot.delay(100);
//			  robot.keyPress(KeyEvent.VK_TAB);
//			  robot.delay(100);
//			  robot.keyRelease(KeyEvent.VK_TAB);
//			  robot.delay(100);
//			  robot.keyPress(KeyEvent.VK_TAB);
//			  robot.delay(100);
//			  robot.keyRelease(KeyEvent.VK_TAB);
			  robot.delay(100);
	          robot.keyRelease(KeyEvent.VK_ALT);
			  
	}
	public static void mouseMove(Robot robot, int x ,int y)
	{
//			 System.out.println("px " + px + " py " + py);
//		  Dimension screenDim = Toolkit.getDefaultToolkit().getScreenSize();
//		  int pwx = (int)screenDim.getWidth();
//		  int pwy = (int)screenDim.getHeight();
//		if(  pwx== 	 1280)
//			if( pwy == 800)
//			{
//			 px = 323;
//			 py = 89;
//				
//			}
		  
	    	   //robot.mouseMove(px -pxfix+ x, py -pyfiy + y);
			   robot.mouseMove( x,  y);
	}
	public static void click(Robot robot, int x ,int y)
	{
		debug("click :"+x+":"+y);
		mouseMove(robot,x,y);
		click(robot);
	}
	public static void click(Robot robot)
	{
	           robot.mousePress(InputEvent.BUTTON1_MASK);
	           robot.mouseRelease(InputEvent.BUTTON1_MASK);
	}
	public static void typeCharacterEnter(Robot robot, String letter)
    {
		int delay = 10;
		typeCharacter(robot,letter);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(delay);
        robot.keyRelease(KeyEvent.VK_ENTER );
		
    }
	public static void typeCharacter(Robot robot, String letter)
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
	          if(KeyVal.endsWith("_")){
			  		robot.keyPress(KeyEvent.VK_SHIFT);robot.delay(delay);
			  		robot.keyPress(KeyEvent.VK_MINUS);robot.delay(delay);
					robot.keyRelease(KeyEvent.VK_MINUS);robot.delay(delay);
					robot.keyRelease(KeyEvent.VK_SHIFT);robot.delay(delay);
					
			          continue;
		          }
	          if(KeyVal.endsWith("@")){
		  		robot.keyPress(KeyEvent.VK_SHIFT);robot.delay(delay);
				robot.keyPress(KeyEvent.VK_2);robot.delay(delay);
				robot.keyRelease(KeyEvent.VK_2);robot.delay(delay);
				robot.keyRelease(KeyEvent.VK_SHIFT);robot.delay(delay);
		          continue;
	          }
	          if(KeyVal.endsWith(" ")){
		  		robot.keyPress(KeyEvent.VK_SPACE); 
				robot.keyRelease(KeyEvent.VK_SPACE); 
		          continue;
	          }	          
	          if(KeyVal.endsWith(":")){
				robot.keyPress(KeyEvent.VK_COLON);robot.delay(delay);
				robot.keyRelease(KeyEvent.VK_COLON);robot.delay(delay);
		          continue;
	          }
	          if(KeyVal.endsWith("/")){
				robot.keyPress(KeyEvent.VK_DIVIDE);robot.delay(delay);
				robot.keyRelease(KeyEvent.VK_DIVIDE);robot.delay(delay);
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
