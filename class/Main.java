class Main {
  ComplexNumber c1;
  ComplexNumber c2;

  void createComplexNumbers() {
    final RealNumber r1 = new RealNumber(5);
    final RealNumber r2 = new RealNumber(6);
    final ImaginaryNumber i1 = new ImaginaryNumber(5);
    final ImaginaryNumber i2 = new ImaginaryNumber(-6);
    this.c1 = new ComplexNumber(r1, i1);
    this.c2 = new ComplexNumber(r2, i2);
  }

  void displayAdd() {
    ComplexNumber c3 = this.c1.add(this.c2);

    System.out.println("C1 + C2 = " + c3);
  }

  void displaySub() {
    ComplexNumber c4 = this.c1.sub(this.c2);
    ComplexNumber c5 = this.c2.sub(this.c1);

    System.out.println("C1 - C2 = " + c4);
    System.out.println("C2 - C1 = " + c5);
  }

  public static void main(String[] args) {
    Main main = new Main();
    main.createComplexNumbers();
    main.displayAdd();
    main.displaySub();
  }
}