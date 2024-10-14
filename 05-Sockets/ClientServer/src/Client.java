import java.io.OutputStreamWriter;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket; 

public class Client {
	public void connect() {
		
		try{
			Socket s1 = new Socket("localhost", 8888);
			InputStream input = s1.getInputStream();
            InputStreamReader reader = new InputStreamReader(input);
 
            // to read and print data 
            //int character;
            //while ((character = reader.read()) != -1) {
            //     System.out.print((char) character);
           // }
            
            OutputStreamWriter dout = new OutputStreamWriter(s1.getOutputStream());
            dout.write("Omar");
            
            s1.close();
            
 
		}catch(Exception e){
			System.out.println(e);
		}
		
	}
}
