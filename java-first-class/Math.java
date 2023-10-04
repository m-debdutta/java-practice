class Math {
  int add(int a, int b) {
    return a + b;
  }

  int sub(int a, int b) {
    return a - b;
  }

  float mul(float a, float b) {
    return a * b;
  }

  double div(double a, double b) {
    return a / b;
  }

  public static void main(String[] args) {
    final Math math = new Math();
    System.out.println("add(5, 5) => " + math.add(5, 5));
    System.out.println("sub(5, 5) => " + math.sub(5, 5));
    System.out.println("mul(5.4f, 5.53f) => " + math.mul(5.4f, 5.53f));
    System.out.println("div(5.4, 5.53) => " + math.div(5.4, 5.53));
  }
}