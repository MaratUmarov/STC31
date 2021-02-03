package part1.lesson10;

import java.io.*;

public class MyClassLoader extends ClassLoader {
    private String name;

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        this.name = name;

        File f = new File ( name + ".class" );
        if (! f.isFile ())
            throw new ClassNotFoundException ( "Нет такого класса " + name );
        InputStream ins = null;
        try {

            ins = new BufferedInputStream ( new FileInputStream ( f ) );
            byte[] b = new byte[(int) f.length ()];
            ins.read ( b );

            Class c = defineClass ( "Hello", b, 0, b.length );
            return c;
        } catch (Exception e) {
            e.printStackTrace ();
            throw new ClassNotFoundException ( "Проблемы с байт кодом" );
        } finally {
            try {
                ins.close ();
            } catch (NullPointerException e) {
                e.printStackTrace ();
            } catch (IOException e) {
                e.printStackTrace ();
            }
        }
    }

}
