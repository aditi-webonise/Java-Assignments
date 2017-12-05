package server;

import java.net.*;
import java.io.*;


public class GetFromClient implements Runnable {

    private Socket socketServer = null;
    private BufferedReader bufferedReader ;

    public GetFromClient(Socket socket) {
        this.socketServer = socket;
    }

    public void run() {
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(this.socketServer.getInputStream()));
            String message;
            while ( (message = bufferedReader.readLine()) != null ) {
                if ( message.equals("bye") ) {
                    System.out.println("END OF CHAT");
                    break;
                }
                System.out.println("Client: " + message);
            }
            socketServer.close();
            System.exit(0);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
