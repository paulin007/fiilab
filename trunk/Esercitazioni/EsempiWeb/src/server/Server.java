package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {

	public static void main(String[] args) {
		
		try {
			ServerSocket socket=new ServerSocket(4444);
		
			Socket clientSocket = socket.accept();
		
			BufferedReader in = new BufferedReader(
			    new InputStreamReader(clientSocket.getInputStream()));
		
		    String line=in.readLine();
		    
		    ArrayList<String> lines=new ArrayList<String>();
		    while(line!=null){
		    	lines.add(line);
		    	line=in.readLine();
		    	if(line.length()==0){
		    		line=null;
		    	}
		    }
		    
		    for (String string : lines) {
				System.err.println(string);
			}
		    
		    socket.close();
		    
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
