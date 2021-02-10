import part1.lesson10.Worker;

import java.io.*;

public class WorkerImpl implements Worker {
    @Override
    public void work() {
        try {
            BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) );
            String line;
            while ((line = br.readLine ()) != null) {
                if ("end".equals ( line )) {
                    break;
                }
                System.out.println ( line );
            }
            br.close ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}