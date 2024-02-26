class CountingLoops {
    public static void main(String[] args) {
        // This program uses the i++ operation execute the i=i+i equation multiple times, starting at 0 and ending at 30
        System.out.println("Task 1:");
        for (int i = 0; i <= 30; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        /* This println creates a gap between each task */
        // This program uses the i-- operation, which is the inverse of the i++ operation to count down from 30 and end at 0
        System.out.println("Task 2:");
        for (int i = 30; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        /* This program uses the i+=3 operation in order to do i=i+3 instead of i=i+1 */
        System.out.println("Task 3:");
        for (int i = 0; i <= 18; i += 3) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        /* This program uses the i-=2 operation in order to do i=i-2 instead of i=i-1 */
        System.out.println("Task 4:");
        for (int i = 10; i >= 0; i -= 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }
}