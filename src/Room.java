import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class Room {

  private InetAddress address;
  private final ArrayList<User> users;

  public Room(String address) throws UnknownHostException {
    setAddress(address);
    users = new ArrayList<>();
  }

  public void setAddress(String address) throws UnknownHostException {
    this.address = InetAddress.getByName(address);
  }

  public InetAddress getAddress() {
    return address;
  }

  public void join(User newUser) {
    users.add(newUser);
  }

  public void exit(User user) {
    users.remove(user);
  }

  public String listUsers() {
    if (users.size() != 0) {
      System.out.println("List of users: \n");
      return users.toString();
    } else return ("No users here!");
  }

  @Override
  public String toString() {
    return "Room: " + address;
  }
}
