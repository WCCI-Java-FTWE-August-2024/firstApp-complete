/**
 * The {@code App} class demonstrates a simple Java application 
 * that prints a greeting message and a status message to the console.
 */
public class App {

    /**
     * The name to be used in the greeting message.
     */
    private static String name = "Bob Smith";  // Stores the name to be displayed in the greeting

    /**
     * The status message to be printed.
     */
    private static String status = "Are we having fun?";  // Stores the status message to be printed

    /**
     * The main method that serves as the entry point for the Java application.
     *
     * @param args the command line arguments
     * @throws Exception if an exception occurs during the execution of the program
     */
    public static void main(String[] args) throws Exception {
        // Print the greeting message
        System.out.println("Hello from " + name);
        
        // Print a blank line for spacing
        System.out.println();
        
        // Print the status message
        System.out.println(status);
    }
}
