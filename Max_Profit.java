import java.util.Scanner;
public class Main {
    static final int THEATRE_TIME = 5;
    static final int PUB_TIME = 4;
    static final int COMMERCIAL_PARK_TIME = 10;
    static final int THEATRE_EARNING = 1500;
    static final int PUB_EARNING = 1000;
    static final int COMMERCIAL_PARK_EARNING = 3000;
    public static void findBestDevelopmentMix(int time, int targetEarnings) {
        int remainingTheatre = time / THEATRE_TIME;
        int remainingPub = time / PUB_TIME;
        int remainingCommercial = time / COMMERCIAL_PARK_TIME;
        int totalEarnings = 0;
        if(remainingTheatre > 0){
            int count = 1;
            int dummy = remainingTheatre;
            while(remainingTheatre-- > 0) {
                totalEarnings += (time - THEATRE_TIME*count) * THEATRE_EARNING;
                if (totalEarnings == targetEarnings) {
                    System.out.println("T: " + dummy + " P: " + 0 + " C: " + 0);
                }
                count++;
            }
        }
        totalEarnings = 0;
        if(remainingPub > 0){
            int count = 0;
            int dummy = remainingPub;
            while(remainingPub-- > 0) {
                totalEarnings += (time - PUB_TIME*count) * PUB_EARNING;
                if (totalEarnings == targetEarnings) {
                    System.out.println("T: " + 0 + " P: " + dummy + " C: " + 0);
                }
                count++;
            }
        }
        totalEarnings = 0;
        if(remainingCommercial > 0){
            int count = 0;
            int dummy = remainingCommercial;
            while(remainingCommercial-- > 0) {
                totalEarnings += (time - COMMERCIAL_PARK_TIME*count) * COMMERCIAL_PARK_EARNING;
                if (totalEarnings == targetEarnings) {
                    System.out.println("T: " + 0 + " P: " + 0 + " C: " + dummy);
                }
                count++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the available time units: ");
        int time = scanner.nextInt();
        System.out.print("Enter the target earnings: ");
        int targetEarnings = scanner.nextInt();
        findBestDevelopmentMix(time, targetEarnings);
    }
}
