class Vector {
  private int x;
  private int y;

  Vector() {
    this(0, 0);
  }

  Vector(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public String toString(){
    return "x: " + this.x + ", " + "y: " + this.y;
  }
}