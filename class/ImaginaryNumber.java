class ImaginaryNumber {
  private int number;

  public ImaginaryNumber(int number) {
    this.number = number;
  }

  int value() {
    return this.number;
  }

  ImaginaryNumber add(ImaginaryNumber newNumber) {
    return new ImaginaryNumber(newNumber.value() + this.number);
  }

  ImaginaryNumber sub(ImaginaryNumber newNumber) {
    return new ImaginaryNumber(newNumber.value() - this.number);
  }

  private String getSign() {
    if(this.number < 0) return " - ";
    return " + ";
  }

  private int absNumber() {
    if(this.number < 0) return this.number * -1;
    return this.number;
  }

  public String toString() {
    return getSign() + absNumber() + "i";
  }
}