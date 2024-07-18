// Basic print statement class
class HelloWorld {
    public void world() {
        System.out.println("Hello World!");
    }
}

// Custom Greetings class
class Welcome {
    // Creating function 
    public void greetings(String yourname) {
        // Print hello world with the provided name
        System.out.println("Hello World! " + yourname);
    }
}

// Main class with main method to run the program
class Main {
    public static void main(String[] args) {
        // Initiating HelloWorld class
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.world();

        // Initializing Welcome
        Welcome welcome = new Welcome();

        // Calling greetings function with a name
        welcome.greetings("Anuraaga");
    }
}