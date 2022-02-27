package epm;

public abstract class Violation {
  private String[] blabla;

  public void print(String ahb) {
    System.out.println("print..." + this.blabla);
  }

  public void foo(String[] param) {
    int abc;
    System.out.println("asdf");
    // Don't do this, make a copy of the array at least
    this.blabla = param;

  }
}
