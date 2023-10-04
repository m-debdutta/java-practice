class Pattern {
  String repeat(int times, char character) {
    String line = "";
    for(int i = 0; i < times; i++) {
      line += character;
    }

    return line;
  }

  void createRectangle(int row, int col) {
    final Pattern pattern = new Pattern();
    for(int i = 0; i <= row; i++) {
      System.out.println(pattern.repeat(i, '*'));
    }
  }

  public static void main(String[] args) {
    final Pattern pattern = new Pattern();
    pattern.createRectangle(5, 5);
  }
}