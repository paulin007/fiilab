package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		
		try {
			URL url=new URL("http://robot.unipv.it/robolab-website/");
			
			Socket clientSocket=new Socket(url.getHost(),80);
			
			PrintWriter out =
				    new PrintWriter(clientSocket.getOutputStream(), true);
			
			out.write("GET /robolab-website/ HTTP/1.0\r\n");
			out.write("Accept: text/plain, text/html, text/*\r\n");
			out.write("\r\n");
			out.flush();
			
			BufferedReader in = new BufferedReader(
				    new InputStreamReader(clientSocket.getInputStream()));

			String line=in.readLine();

			while(line!=null){
				System.out.println(line);
				line=in.readLine();
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
