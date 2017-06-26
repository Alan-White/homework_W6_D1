import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class BusTest {
  Bus bus;
  Passenger passenger;

@Before
public void before() {
  bus = new Bus("Stagecoach");
  passenger = new Passenger();
}

@Test
public void hasName() {
  assertEquals("Stagecoach", bus.getName());
}

@Test
public void upstairsStartsEmpty() {
  assertEquals(0, bus.countPassengers());
}


}
