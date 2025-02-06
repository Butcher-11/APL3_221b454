public class Main implements Testable {
    public void display() {
        System.out.println("Displaying from Test class");
    }
    public static void main(String[] args) {
        Main test = new Main();
        test.display();
        
        AbsTest absTest = new AbsTest() {
            public void display() {
                System.out.println("Displaying from anonymous AbsTest class");
            }
        };
        absTest.display();
    }
}