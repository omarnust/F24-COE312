import java.net.ServerSocket;
import java.net.Socket;
import java.io.OutputStreamWriter;
import java.io.DataOutputStream;
import java.io.InputStreamReader;


public class Server implements Runnable{
	private Thread t;
	ServerSocket myServer;
	
	Server(){
		t = new Thread(this);
		t.start();
	}
	
	public void run() {
		startServer();
	}
	
	
	public void startServer(){  
		
		try{  
			myServer = new ServerSocket(7777);  
			
			System.out.println("Listening for connection on 7777");
			
			while(true) {
				Socket s = myServer.accept();//establishes connection
				
				// create a new thread for communicating with this client
				System.out.println("Connection established");
		
				//DataOutputStream dout = new DataOutputStream(s.getOutputStream());
				//OutputStreamWriter dout = new OutputStreamWriter(s.getOutputStream());
				
				InputStreamReader din = new InputStreamReader(s.getInputStream());
				
				//dout.writeUTF("Welcome");
				//dout.write("Wed 9 Oct");
				
				// to read and print data 
	            int character;
	            while ((character = din.read()) != -1) {
	                 System.out.print((char) character);
	            }
	            s.close();
			}
			
		}catch(Exception e){
			System.out.println(e);
		}  
	}  
}