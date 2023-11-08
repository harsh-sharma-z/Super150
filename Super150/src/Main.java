import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numSequences = sc.nextInt();
        int numDevices = sc.nextInt();
        int[][] seqArr = new int[numSequences][numDevices];

        for (int i = 0; i < numSequences; i++) {
            for (int j = 0; j < numDevices; j++) {
                seqArr[i][j] = sc.nextInt();
            }
        }

        int[] maxCounts = new int[numDevices];
        for (int i = 0; i < numSequences; i++) {
            for (int j = 0; j < numDevices; j++) {
                maxCounts[j] = Math.max(maxCounts[j], seqArr[i][j]);
            }
        }

        int selectedSequence = -1;
        int maxDevices = 0;
        int maxAverage = 0;

        for (int i = 0; i < numSequences; i++) {
            int countDevices = 0;
            int countMessages = 0;
            for (int j = 0; j < numDevices; j++) {
                if (seqArr[i][j] == maxCounts[j]) {
                    countDevices++;
                    countMessages += maxCounts[j];
                }
            }

            if (countDevices > maxDevices || (countDevices == maxDevices && countMessages > maxAverage)) {
                selectedSequence = i;
                maxDevices = countDevices;
                maxAverage = countMessages;
            }
        }
        System.out.println(selectedSequence + " " + maxDevices);
    }
}
