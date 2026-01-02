public class P11 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Enter values in the command line argument itself");
            return;
        }
        int n = Integer.parseInt(args[0]);
        String l = "10";
        if (args.length >= 2)
            l= args[1];
        System.out.println("n is" + n);
        System.out.println("l is" + l);




        if (args.length == 0) {
            System.out.println("Please provide at least one argument.");
            return;
        }

        int num = Integer.parseInt(args[0]);
        int length;

        // If length is provided
        if (args.length >= 2) {
            length = Integer.parseInt(args[1]);
        } else {
            // Use default: num as length
            length = num;
        }

        // Display num for 'length' times
        for (int i = 1; i <= length; i++) {
            System.out.print(num + " ");
        }

        
    }
}
