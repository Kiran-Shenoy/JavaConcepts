package interfaces;
import java.util.*;
public class Sequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Map<Integer, Integer> freq = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        // First window of size k
        for (int i = 0; i < k; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }
        sb.append(freq.size());

        // Slide the window across the rest of the array
        for (int i = k; i < n; i++) {
            int outgoing = arr[i - k];
            int outCount = freq.get(outgoing);
            if (outCount == 1) {
                freq.remove(outgoing);
            } else {
                freq.put(outgoing, outCount - 1);
            }

            int incoming = arr[i];
            freq.put(incoming, freq.getOrDefault(incoming, 0) + 1);

            sb.append(" ").append(freq.size());
        }

        System.out.println(sb.toString());
    }

}
