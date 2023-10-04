class ComplexNumber {
  private RealNumber real;
  private ImaginaryNumber imaginary;

  public ComplexNumber(RealNumber real, ImaginaryNumber imaginary) {
    this.real = real;
    this.imaginary = imaginary;
  }

  RealNumber realPart() {
    return this.real;
  }

  ImaginaryNumber imaginaryPart() {
    return this.imaginary;
  }

  ComplexNumber add(ComplexNumber newComplexNumber) {
    RealNumber sumOfRealPart = this.real.add(newComplexNumber.realPart());
    ImaginaryNumber sumOfImaginaryPart = this.imaginary.add(newComplexNumber.imaginaryPart());
    return new ComplexNumber(sumOfRealPart, sumOfImaginaryPart);
  }

  ComplexNumber sub(ComplexNumber newComplexNumber) {
    RealNumber sumOfRealPart = this.real.sub(newComplexNumber.realPart());
    ImaginaryNumber sumOfImaginaryPart = this.imaginary.sub(newComplexNumber.imaginaryPart());
    return new ComplexNumber(sumOfRealPart, sumOfImaginaryPart);
  }

  public String toString() {
    return this.real.toString() + this.imaginary.toString();
  }
}