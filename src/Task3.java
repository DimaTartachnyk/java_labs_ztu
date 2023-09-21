public class Task3 {
    public static void main(String[] args) {
        String[] myArray = { "2", "3", "5", "8" };
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]);
            if (i < myArray.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
