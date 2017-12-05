package server;

import operations.Operations;
import java.net.*;
import java.io.*;

public class SendToClient implements Runnable{

    private static final String user="server";

    private Socket socketServer = null;
    private PrintWriter printWriter;
    private BufferedReader input;

    public SendToClient(Socket socket) {
        this.socketServer = socket;
    }

    public void run() {
        try {
            Operations operations= new Operations();
            if ( socketServer.isConnected() ) {
                printWriter = new PrintWriter(new OutputStreamWriter(this.socketServer.getOutputStream()));
                while (true) {
                    String message;
                    input = new BufferedReader(new InputStreamReader(System.in));
                    message = input.readLine();
                    printWriter.println(message);
                    if ( message.equals("bye") ) {
                        break;
                    }
                    switch (message) {
                        case "del" : operations.display(user);
                                     operations.delete(user);
                                     break;
                        case "edit" : operations.display(user);
                                      operations.edit(user);
                                      operations.display(user);
                                      break;
                        default: operations.insert(user,message);
                                 break;
                    }
                    printWriter.flush();
                }
                socketServer.close();
                System.exit(0);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
