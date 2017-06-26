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
//--------------------------------
  public int countPassengers() {
    int numberOfFolk = 0;
    for (Passenger banana : this.upstairs) {
      if (banana != null) {
        numberOfFolk++;
      }
    }
    return numberOfFolk;
  }

//---------------------------------
  public boolean isUpstairsFull() {
    return countPassengers() == this.upstairs.length;
  }

  public void pickUp(Passenger passenger) {
    if (isUpstairsFull()) return;
    int index = countPassengers();
    this.upstairs[index] = passenger;
  }
//-------------------------------
  
  
}