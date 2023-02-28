public class question3 {
    public static void main(String[] args) {

        // NoClassDefFoundError example
        try {
            // Try to create an instance of a non-existent class
            NonExistentClass obj = new NonExistentClass();
        } catch (NoClassDefFoundError e) {
            System.out.println("NoClassDefFoundError caught: " + e.getMessage());
        }

        // ClassNotFoundException example
        try {
            // Try to load a class that doesn't exist
            Class.forName("NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException caught: " + e.getMessage());
        }
    }
}
