// Singleton Pattern

/* The Singleton pattern ensures that a class has only one instance and provides a global point of access to it.
 */
package Design_Patterns;

public class Ex_50 {
    private static Ex_50 instance;

    private Ex_50() {}

    public static Ex_50 getInstance() {
        if (instance == null)
        { instance = new Ex_50(); }
        return  instance;
    }

    public void showMessage()
    { System.out.println("Hello from Singleton!"); }

    public static void main(String[] args) {
        Ex_50 obj1 = Ex_50.getInstance();
        Ex_50 obj2 = Ex_50.getInstance();

        obj1.showMessage();

        if (obj1 == obj2)
        { System.out.println("Both object are the same instace."); }
        else
        { System.out.println("Object are diff. instances."); }
    }
}
