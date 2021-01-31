package part1.lesson11.NetMessenger;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public void ClientBlockHead() throws IOException {
    System.out.println ( "Старт подключения" );

    Socket socket = new Socket ( "localhost", 25445 );
        if(socket.isConnected ()){
        System.out.println ("Connected");

    }
        try (
    BufferedReader br = new BufferedReader (
            new InputStreamReader (
                    socket.getInputStream ()
            ) ) ;
    PrintWriter out = new PrintWriter (
            new OutputStreamWriter (
                    socket.getOutputStream ()
            ), true
    ) ;
    Scanner console = new Scanner ( System.in )) {

        while (true) {
            final String line = console.nextLine ();
            if ("end".equals ( line ))
                break;

            out.println ( line );

            System.out.println ( "Ответ от сервера: " + br.readLine ());
        }
    }



    }

    @Override
    public String toString() {
        return "Client{}";
    }



}
