package fsjava.apprentice.badge.scripts.virtual.method.invocation;

public class ExtendsA extends A {

  public String getName() {
    return "ExtendsA";
  }

  public static void main(String ... args) {
    final A classAObj = new ExtendsA();
    System.out.println(classAObj.getName());
  }
}
