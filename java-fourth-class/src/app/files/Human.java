package app.files;
import app.files.LivingThing;

public class Human extends LivingThing {
  private String name;
  private int age;

  public Human(String name, int age) {
    super(name);
    this.name = name;
    this.age = age;
  }

  public String toString() {
    return String.valueOf(this.name + " is " + this.age + " years old.");
  }
}