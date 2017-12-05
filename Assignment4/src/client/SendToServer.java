package client;

import operations.Operations;
import java.net.*;
import java.io.*;

public class SendToServer implements Runnable{

    private static final String user="client";

    private Socket socketClient=null;
    private PrintWriter printWriter;
    private BufferedReader input;

    public SendToServer(Socket socket) {
        this.socketClient = socket;
    }
    public void run() {
        try{
            Operations operations= new Operations();
            if ( socketClient.isConnected() ) {
                printWriter = new PrintWriter( new OutputStreamWriter ( this.socketClient.getOutputStream() ) );
                while (true) {
                    String message = null;
                    input = new BufferedReader(new InputStreamReader(System.in));
                    message = input.readLine();
                    printWriter.println(message);
                    if ( message.equals("bye") ) {
                        break;
                    }
                    switch(message) {
                        case "del": operations.display(user);
                                    operations.delete(user);
                                    break;

                        case "edit": operations.display(user);
                                     operations.edit(user);
                                     break;

                        default: operations.insert(user,message);
                                 break;
                    }
                    printWriter.flush();
                }
                socketClient.close();
                System.exit(0);
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

}