package server;

import java.net.*;
import java.io.*;

public class GetFromClient implements Runnable {
    Socket socket = null;
    BufferedReader bufferedReader = null;

    public GetFromClient(Socket clientSocket) {
        this.socket = clientSocket;
    }

    public void run() {
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
            String message;
            while ((message = bufferedReader.readLine()) != null) {
                if (message.equals("bye")) {
                    System.out.println("END OF CHAT");
                    closeSocket();
                    break;
                }
                System.out.println("Client: " + message);
            }
            System.exit(0);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void closeSocket(){
        try{
            this.socket.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
