package part1.lesson10;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.File;

public class ClassLoaderTest {
  public static void main(String[] args) throws Exception {

    JavaCompiler javaCompiler = ToolProvider.getSystemJavaCompiler();
    String srcJavaFilePath = new File("").getAbsolutePath() + "\\src\\tt\\WorkerImpl.java";
    File classFile = new File(srcJavaFilePath.replace(".java", ".class"));
    if (classFile.exists()) {
      classFile.delete();
    }

    javaCompiler.run(null, null, null, srcJavaFilePath);

    MyClassLoader<Worker> classLoader = new MyClassLoader();
    Worker loaded = classLoader.load(classFile.getAbsolutePath());
    loaded.work ();
  }

}
