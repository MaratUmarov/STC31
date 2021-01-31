package part1.lesson11.NetMessenger;

import java.io.*;
import java.net.Socket;

public class EchoClientHandler extends Thread {
    private Socket clientSocket;

    public EchoClientHandler(Socket socket) {
        this.clientSocket = socket;
    }

    public void run() {
        try {
            PrintWriter out = new PrintWriter ( clientSocket.getOutputStream (), true );
            BufferedReader in = new BufferedReader (
                    new InputStreamReader ( clientSocket.getInputStream () ) );


            String inputLine;
            while (((inputLine = in.readLine ()) != null)) {


                if (".".equals ( inputLine )) {
                    out.println ( "bye" );
                    break;
                }
                out.println ( inputLine + "  " + clientSocket.getPort () );


            }
            in.close ();
            out.close ();
            clientSocket.close ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}


