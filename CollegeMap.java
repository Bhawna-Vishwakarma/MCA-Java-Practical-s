import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class College {
    private String collegeName;
    private String course;

    public College(String collegeName, String course) {
        this.collegeName = collegeName;
        this.course = course;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "College Name: " + collegeName + ", Course: " + course;
    }
}

public class CollegeMap {
    private Map<Integer, College> collegeMap;

    public CollegeMap() {
        collegeMap = new HashMap<>();
    }

    public void addCollege(int collegeId, College college) {
        collegeMap.put(collegeId, college);
        System.out.println("College added with ID: " + collegeId);
    }

    public College getCollege(int collegeId) {
        return collegeMap.get(collegeId);
    }

    public void displayColleges() {
        if (collegeMap.isEmpty()) {
            System.out.println("No colleges in the record.");
        } else {
            for (Map.Entry<Integer, College> entry : collegeMap.entrySet()) {
                System.out.println("College ID: " + entry.getKey() + ", " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        CollegeMap collegeMap = new CollegeMap();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nCollege Map Operations Menu:");
            System.out.println("1. Add College");
            System.out.println("2. Get College");
            System.out.println("3. Display All Colleges");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter College ID: ");
                    int collegeId = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter College Name: ");
                    String collegeName = scanner.nextLine();
                    System.out.print("Enter Course: ");
                    String course = scanner.nextLine();
                    College college = new College(collegeName, course);
                    collegeMap.addCollege(collegeId, college);
                    break;
                case 2:
                    System.out.print("Enter College ID to retrieve: ");
                    collegeId = scanner.nextInt();
                    College retrievedCollege = collegeMap.getCollege(collegeId);
                    if (retrievedCollege != null) {
                        System.out.println("Retrieved College: " + retrievedCollege);
                    } else {
                        System.out.println("College not found with ID: " + collegeId);
                    }
                    break;
                case 3:
                    collegeMap.displayColleges();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}
