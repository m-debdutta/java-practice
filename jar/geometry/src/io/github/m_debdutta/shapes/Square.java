package io.github.m_debdutta.shapes;

public class Square {
  int side;

  public Square(int side) {
    this.side = side;
  }

  public String draw() {
    return String.format("Square ( side: %1$s )", this.side);
  }
}