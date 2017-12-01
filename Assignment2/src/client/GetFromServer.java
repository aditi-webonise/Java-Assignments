package client;

import java.net.*;
import java.io.*;

public class GetFromServer implements Runnable{
    Socket socket=null;
    BufferedReader bufferedReader=null;

    public GetFromServer(Socket sock){
        this.socket = sock;
    }
    public void run(){
        try{
            String message = null;
            bufferedReader = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
            while((message = bufferedReader.readLine())!= null){
                if(message.equals("bye")){
                    System.out.println("END OF CHAT");
                    break;
                }
                System.out.println("Server: "+message);
            }
            socket.close();
            System.exit(0);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

