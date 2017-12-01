package client;

import java.io.*;
import java.net.*;

class MyClient{
	public static void main(String[] args) throws IOException{
		try{
			Socket socket = new Socket("localhost", 4500);
			System.out.println("----CLIENT----");
			System.out.println("Type bye to end the chat");
			SendToServer sendToServer = new SendToServer(socket);
			Thread thread1 = new Thread(sendToServer);
			thread1.start();
			GetFromServer getFromServer = new GetFromServer(socket);
			Thread thread2 = new Thread(getFromServer);
			thread2.start();
		}
		catch (Exception e){
			e.printStackTrace();
		}

	}
}  
