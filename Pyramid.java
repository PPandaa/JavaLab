public class Pyramid {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String startLocation = args[1];

        for (int i=1;i<=n;i++) {
            if (startLocation.equals("right")) {
                for (int blankIndex=1;blankIndex<=n-i;blankIndex++) {
                    System.out.print(" ");
                }
                for (int startIndex=1;startIndex<=i;startIndex++) {
                    System.out.print("*");
                }
            } if (startLocation.equals("left")) {
                for (int startIndex=1;startIndex<=i;startIndex++) {
                    System.out.print("*");
                    
                }
            }
            System.out.print("\n");
        }
    }
}