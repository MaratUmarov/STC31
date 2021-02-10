package part1.lesson10;

import java.io.*;

public class MyClassLoader<T> extends ClassLoader {
  @Override
  public Class findClass(String loadingClassname) throws ClassNotFoundException {
    byte[] b = loadClassFromFile(loadingClassname);
    loadingClassname = loadingClassname.substring(loadingClassname.lastIndexOf("\\") + 1);
    return defineClass(loadingClassname, b, 0, b.length);
  }
  private byte[] loadClassFromFile(String fileName) {
    File classFile = new File(fileName + ".class");

    InputStream inputStream = null;
    try {
      inputStream = new FileInputStream(classFile);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    byte[] buffer;
    ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
    int nextValue = 0;
    try {
      while ((nextValue = inputStream.read()) != -1) {
        byteStream.write(nextValue);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    buffer = byteStream.toByteArray();
    return buffer;
  }

  public T load(String loadingClassname) {
    loadingClassname = loadingClassname.replace(".class", "");
    try {
      return (T) findClass(loadingClassname).newInstance();
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    return null;
  }
}
