package JAVA8;

@FunctionalInterface
public interface InnerLambda {
    void execute(TestCase testCase);
}

class TestCase {
    private String name;
    private int number;

    public TestCase(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void display() {
        System.out.println("TestCase name: " + name + ", TestCase number: " + number);
    }
}

public class Lambda {
    public static void main(String[] args) {
        TestCase t1 = new TestCase("test1", 1);
        TestCase t2 = new TestCase("test2", 2);
        TestCase t3 = new TestCase("test3", 3);

        InnerLambda highPriority = testCase -> {
            if (testCase.getNumber() == 1) {
                System.out.print("Executing high-priority: ");
                testCase.display();
            }
        };

        InnerLambda lowPriority = testCase -> {
            if (testCase.getNumber() > 1) {
                System.out.print("Executing low-priority: ");
                testCase.display();
            }
        };

        highPriority.execute(t1);
        lowPriority.execute(t2);
        lowPriority.execute(t3);
    }
}
