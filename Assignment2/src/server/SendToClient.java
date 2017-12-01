package server;

import java.net.*;
import java.io.*;

public class SendToClient implements Runnable{
    PrintWriter printWriter;
    Socket socket = null;

    public SendToClient(Socket clientSocket){
        this.socket = clientSocket;
    }
    public void run(){
        try{
            if(socket.isConnected()){
                printWriter = new PrintWriter(new OutputStreamWriter(this.socket.getOutputStream()));
                while (true) {
                    String message = null;
                    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
                    message = input.readLine();
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
