package server;

import java.net.*;
import java.io.*;

class MyServer{
	public static void main(String[] args) throws IOException{
		try{
			final int port = 4500;
			ServerSocket serverSocket = new ServerSocket(port);
			Socket clientSocket = serverSocket.accept();
			System.out.println("----SERVER----");
			System.out.println("Type bye to end the chat");
			GetFromClient getFromClient = new GetFromClient(clientSocket);
			Thread thread1 = new Thread(getFromClient);
			thread1.start();
			SendToClient sendToClient = new SendToClient(clientSocket);
			Thread thread2 = new Thread(sendToClient);
			thread2.start();
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}  
