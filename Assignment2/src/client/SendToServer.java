package client;

import java.net.*;
import java.io.*;

public class SendToServer implements Runnable{
    Socket socket=null;
    PrintWriter printWriter=null;
    BufferedReader bufferedReader=null;

    public SendToServer(Socket sock){
        this.socket = sock;
    }
    public void run(){
        try{
            if(socket.isConnected()){
                printWriter = new PrintWriter(socket.getOutputStream(),true);
                while(true){
                    String message=null;
                    bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                    message = bufferedReader.readLine();
                    printWriter.println(message);
                    printWriter.flush();
                    if(message.equals("bye")){
                        break;
                    }
                }
                socket.close();
                System.exit(0);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}