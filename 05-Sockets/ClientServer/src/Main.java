import java.net.Socket;  
import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server ser = new Server();
		Client c1 = new Client();
		c1.connect();
		
		
		
		try{ 
			//client 1
			//Socket s1 = new Socket("localhost", 100);
			
			
			//DataInputStream din1 = new DataInputStream(s1.getInputStream()); 			
			//System.out.println(din1.readUTF());  
			
			//client 2
			//Socket s2 = new Socket("localhost", 6666);
			//DataInputStream din2 = new DataInputStream(s2.getInputStream()); 			
			//System.out.println(din2.readUTF());  
						  
			//s1.close();
			//s2.close();
		}catch(Exception e){
			System.out.println(e);
		}  
		
	}

}
