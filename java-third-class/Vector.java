class Vector {
  private int x;
  private int y;
  final static Vector origin = new Vector(0, 0);

  Vector(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public String toString(){
    return "x: " + this.x + ", " + "y: " + this.y;
  }

  Vector getOrigin() {
    return origin;
  }
}