class RealNumber {
  private int number;

  public RealNumber(int number) {
    this.number = number;
  }

  int value() {
    return this.number;
  }

  RealNumber add(RealNumber newNumber) {
    return new RealNumber(newNumber.value() + this.number);
  }

  RealNumber sub(RealNumber newNumber) {
    return new RealNumber(newNumber.value() - this.number);
  }

  public String toString() {
    return String.valueOf(this.number);
  }
}