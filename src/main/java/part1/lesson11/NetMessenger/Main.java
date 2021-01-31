package part1.lesson11.NetMessenger;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Server server=new Server ();
        server.start ( 25445 );


    }
}
