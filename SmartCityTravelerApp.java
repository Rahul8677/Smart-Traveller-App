import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class User {
    private String username;
    private String password;
    private String fullName;
    private String email;
    

    public User(String Rahul, String password, String fullName, String email) {
        this.username = Rahul;
        this.password = password;
        this.fullName = fullName;
        this.email = email;
    }

    

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

class City {
    private String name;
   

    public City(String name) {
        this.name = name;
    }

    
}

class Booking {
    private User user;
    private City city;
    

    public Booking(User user, City city) {
        this.user = user;
        this.city = city;
    }

    
}

public class SmartCityTravelerApp {
    private static Map<String, User> usersDatabase = new HashMap<>();
    private static ArrayList<City> cities = new ArrayList<>();
    private static ArrayList<Booking> bookings = new ArrayList<>();
    private static User loggedInUser;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Signup\n2. Login\n3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    signup(scanner);
                    break;
                case 2:
                    login(scanner);
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void signup(Scanner scanner) {
       
    }

    private static void login(Scanner scanner) {
        
    }

   
}
