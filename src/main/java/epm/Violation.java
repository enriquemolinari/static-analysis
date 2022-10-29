package epm;

public abstract class Violation {
  private String[] blabla;

  public void print(String ahb) {
    System.out.println("print..." + this.blabla);
  }

  public void Foo(String[] param) {
    int abc;
    this.blabla = param;
    // fixing above code
    // this.blabla = List.of(param).toArray(new String[param.length]);

  }
}
