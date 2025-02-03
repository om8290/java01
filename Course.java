import java.util.Scanner;
public class Course {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      
        System.out.print("Enter  year ");
        int year = sc.nextInt();       
        System.out.print("Enter  branch ");
        String branch = sc.next().trim();      
        switch (year) {
            case 3:
                System.out.println("Elective courses: Advanced English, Algebra");
                break;
            case 4:
                switch (branch) {
                    case "CSE":
                    case "IT":
                        System.out.println("Elective courses: Machine Learning, Big Data");
                        break;
                    case "ECE":
                        System.out.println("Elective courses: Antenna Engineering");
                        break;
                    default:
                        System.out.println("Elective courses: Optimization");
                        break;
                }                break;
            default:
                System.out.println("Not Eligible for Elective courses");
                break;
        }

        sc.close();
    }
}
