import java.io.*;
import java.sql.SQLException;
public class File2DB {
	 public static void CopyFile2DB( )  {
	// The name of the file to open.
    String fileName = "D:/Users/hqbui/Desktop/user.txt";
    db hi = new db();
    try {
		hi.open();
	} catch (Exception e) {
		// TODO Auto-generated catch block
        System.out.println("hi");
	}
    int timeout = 100;
    while(true){
    	timeout --;
    	if(timeout ==0)
    		break;
    	System.out.println("Wait file exit");
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	 try{
		 
 		File file = new File("D:/Users/hqbui/Desktop/user.txt");

 		if(file.exists()){
 			System.out.println(file.getName() + " is exit!");
 			break;
 		}else{
 			System.out.println("exit operation is failed.");
 		}

 	}catch(Exception e){

 		e.printStackTrace();

 	}
	 
    }
    // This will reference one line at a time
    String line = null;

    try {
        // FileReader reads text files in the default encoding.
        FileReader fileReader = 
            new FileReader(fileName);

        // Always wrap FileReader in BufferedReader.
        BufferedReader bufferedReader = 
            new BufferedReader(fileReader);

        while((line = bufferedReader.readLine()) != null) {
        	//System.out.println(line);
        	if(line.indexOf("?fref=pb&hc_location=profile_browser") > 0){
        		//System.out.println(line);
        		String [] s2 = line.split( " " );
                for( int i = 0; i < s2.length; i++)
                {
                    //System.out.print(  s2 [i] + " " );
                	if(s2[i].indexOf("?fref=pb&hc_location=profile_browser") > 0){
                		//s2 [i].replace("href=", "");
                		
                		System.out.println(  s2 [i].replace("href=", "").replace("\"", "") );
                		try {
							hi.insertuser("3", s2 [i].replace("href=", "").replace("\"", ""), "str3", "str4", "str5");
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
                	}
                }
        	}
        }    

        // Always close files.
        bufferedReader.close();            
    }
    catch(FileNotFoundException ex) {
        System.out.println(
            "Unable to open file '" + 
            fileName + "'");                
    }
    catch(IOException ex) {
        System.out.println(
            "Error reading file '" 
            + fileName + "'");                   
        // Or we could just do this: 
        // ex.printStackTrace();
    }
}
public static void SeachGroup2DB(String dbname ) throws SQLException  {
	// The name of the file to open.
    String fileName = "D:/Users/hqbui/Desktop/group.txt";
    db hi = new db();
    try {
		hi.open();
	} catch (Exception e) {
		// TODO Auto-generated catch block
        System.out.println("hi");
	}
    int timeout = 150;
    
    while(true){
    	timeout --;
    	if(timeout == 0)
    		break;
    	System.out.println("Wait file exit");
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	 try{
		 
 		File file = new File(fileName);

 		if(file.exists()){
 			System.out.println(file.getName() + " is exit!");
 			break;
 		}else{
 			System.out.println("exit operation is failed.");
 		}

 	}catch(Exception e){

 		e.printStackTrace();

 	}
	 
    }
    // This will reference one line at a time
//	BufferedReader in = new BufferedReader(
//			   new InputStreamReader(
//	                      new FileInputStream(fileDir), "UTF8"));
    String line = null;
    String fullname = null;
    int a = 0;
    try {
        // FileReader reads text files in the default encoding.
//        FileReader fileReader = 
//            new FileReader(fileName);
//
//        // Always wrap FileReader in BufferedReader.
//        BufferedReader bufferedReader = 
//            new BufferedReader(fileReader, "UTF8");
        File fileDir = new File(fileName);
    	BufferedReader bufferedReader = new BufferedReader(
		   new InputStreamReader(
                   new FileInputStream(fileDir), "UTF8"));
    	//huyện
        while((line = bufferedReader.readLine()) != null) {
        	if(a ==0){
        	if(line.indexOf("pageTitle" )>0){
        		
        		String [] fullnamearg = line.split( "/" );
        		a++;
        		int i = 0;
        		
        		for(i=0;i<fullnamearg.length;i++)
        		{
        			System.out.println("fullnamearg "+i+fullnamearg[i]);
        			if(fullnamearg[i].indexOf("pageTitle" ) > -1){
                		String [] fullnamearg1 = fullnamearg[i].split( ">" );
                		String username;
                		System.out.println("fullnamearg1[2] "+  fullnamearg1[2]);
                		if( fullnamearg1[2].indexOf("'" )>0){
                			username  = fullnamearg1[2].replace("'", "");
                		}else{
                			username  = fullnamearg1[2];
                		}
                		System.out.println(username);        	
                		hi.updateuserp1(dbname,username);
        			}
        		}

        		}
        	}
        	//System.out.println(line);
        	if(line.indexOf("https://www.facebook.com/groups/") > 0){
//        		System.out.println(line);
        		String [] s2 = line.split( " " );
                for( int i = 0; i < s2.length; i++)
                {
                    //System.out.print(  s2 [i] + " " );
                	if(s2[i].indexOf("www.facebook.com/groups/") > 0){
                		//s2 [i].replace("href=", "");
                		
                		System.out.println(  s2 [i].replace("href=", "").replace("\"", "") );
                		try {
							hi.InsertGroup( "null",s2 [i].replace("href=", "").replace("\"", ""),"null","null","null");
                			
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
                	}
                }
        	}
        }    

        // Always close files.
        bufferedReader.close();      
        
    }
    catch(FileNotFoundException ex) {
        System.out.println(
            "Unable to open file '" + 
            fileName + "'");                
    }
    catch(IOException ex) {
        System.out.println(
            "Error reading file '" 
            + fileName + "'");                   
        // Or we could just do this: 
        // ex.printStackTrace();
    }
    
    try{
		 
		File file = new File(fileName);

		if(file.delete()){
			System.out.println(file.getName() + " is deleted!");
		}else{
			System.out.println("Delete operation is failed.");
		}

	}catch(Exception e){

		e.printStackTrace();

	}
}
}
