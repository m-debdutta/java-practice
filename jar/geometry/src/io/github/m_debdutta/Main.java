package io.github.m_debdutta;

import io.github.m_debdutta.shapes.Square;
import io.github.m_debdutta.printer.Printer;

public class Main {
  public static void main(String[] args) {
    Square squ = new Square(5);
    Printer p = new Printer();
    p.print(squ.draw());
  }
}