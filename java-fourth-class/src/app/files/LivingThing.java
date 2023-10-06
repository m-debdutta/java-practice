package app.files;

public class LivingThing {
  private boolean alive;
  private boolean dead;
  private String name;

  public LivingThing(String name) {
    this.name = name;
    this.alive = true;
    this.dead = false;
  }

  public String isAlive() {
    String liveStatus = this.alive ? "alive" : "dead";
    return String.format("%1$s is %2$s", this.name, liveStatus);
  }

  public void dead() {
    System.out.println(String.format("Killing %1$s...", this.name));
    this.alive = false;
    this.dead = true;
  }
}