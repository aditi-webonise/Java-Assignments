package client;

import java.net.*;
import java.io.*;

public class GetFromServer implements Runnable {

    private Socket socketClient=null;
    private BufferedReader bufferedReader;

    public GetFromServer(Socket socket) {
        this.socketClient = socket;
    }
    public void run() {
        try{
            bufferedReader = new BufferedReader(new InputStreamReader(this.socketClient.getInputStream()));
            String message ;
            while ( (message = bufferedReader.readLine()) != null) {
                if( message.equals("bye") ) {
                    System.out.println("END OF CHAT");
                    break;
                }
                System.out.println("Server: "+message);
            }
            socketClient.close();
            System.exit(0);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}

