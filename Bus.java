public class Bus {
  private String name;
  private Passenger[] upstairs;

  public Bus(String name) {
    this.name = name;
    this.upstairs = new Passenger[23];
  }

  public String getName() {
    return this.name;
  }

}