class Main {
  public static void main(String[] args) {
    Human bittu = new Human("Bittu", 19);
    System.out.println(bittu);
    System.out.println(bittu.isAlive());
    bittu.dead();
    System.out.println(bittu.isAlive());
  }
}