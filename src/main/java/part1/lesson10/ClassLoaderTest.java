package part1.lesson10;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ClassLoaderTest {


    public static void main(String[] args) throws Exception {

        Properties p = System.getProperties ();

        String sep = p.getProperty ( "file.separator" );

        String jrePath = p.getProperty ( "java.home" );

        int lastIndex = jrePath.lastIndexOf ( sep );
        String javac = jrePath.substring ( 0, lastIndex ) + sep + "bin" + sep + "javac";
        if (p.getProperty ( "sun.desktop" ).equals ( "windows" ))
            javac += ".exe";
        else javac += ".sh";

        File jc = new File ( javac );
        if (! jc.isFile ())
            throw new FileNotFoundException ( "Компилятор по адресу " + jc.getAbsolutePath () + " недоступен " );
        System.out.println ( "Компилируем " + jc.getAbsolutePath () + " " + jc.getAbsolutePath () );

        Process p1 = Runtime.getRuntime ().exec ( javac + " " + jc.getAbsolutePath () );

        System.out.println ( "Компиляция завершена" );

        int pointIndex = jc.getAbsolutePath ().lastIndexOf ( "." );
        String absulutePatch = jc.getAbsolutePath ().substring ( 0, pointIndex );

        MyClassLoader loader = new MyClassLoader ();

        Class cl = loader.findClass ( absulutePatch );
        System.out.println ( cl );

        Method method = cl.getMethod ( "m1", new Class[]{String.class, int.class} );
        System.out.println ( method );

        method.invoke ( cl.newInstance (), new Object[]{"Test", 8} );

        Method method2 = cl.getMethod ( "m2", new Class[]{String.class} );
        method2.invoke ( cl, "QWERRTY" );
    }

}
