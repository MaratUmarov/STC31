package part1.lesson11.NetMessenger;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {

    private ServerSocket serverSocket;

    public void start(int port) throws IOException {
        serverSocket = new ServerSocket ( port );
        while (true)
        { new EchoClientHandler ( serverSocket.accept () ).start ();
        if(EchoClientHandler.interrupted ())stop ();
    }}

    public void stop() throws IOException {
        serverSocket.close ();
    }


}
