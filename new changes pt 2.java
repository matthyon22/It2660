public class Main {
  public static void main(String[] args) {
    String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    
    // Best-case: the pattern matches immediately at the start of 'text'
    String bestCase = "A";

    // Initialize startTime before calling match() for the best-case scenario
    long startTime = System.nanoTime();
    int index = match(text, bestCase);
    // Initialize endTime right after match() is called
    long endTime = System.nanoTime();
    // Calculate elapsedTime for best-case
    long elapsedTime = endTime - startTime;

    if (index >= 0)
      System.out.println("best-case input matched at index " + index);
    else
      System.out.println("best-case input unmatched");

    System.out.println("Elapsed time for best-case: " + elapsedTime + " nanoseconds\n");

    // Worst-case: the pattern is not found in 'text', so the algorithm checks every position
    String worstCase = "ZZ";

    // Initialize startTime before calling match() for the worst-case scenario
    startTime = System.nanoTime();
    index = match(text, worstCase);
    // Initialize endTime right after match() is called
    endTime = System.nanoTime();
    // Calculate elapsedTime for worst-case
    elapsedTime = endTime - startTime;

    if (index >= 0)
      System.out.println("worst-case input matched at index " + index);
    else
      System.out.println("worst-case input unmatched");

    System.out.println("Elapsed time for worst-case: " + elapsedTime + " nanoseconds");
  }

  // Return the index of the first match. -1 otherwise.
  public static int match(String text, String pattern) {
    for (int i = 0; i < text.length() - pattern.length() + 1; i++) {
      if (isMatched(i, text, pattern))
        return i;
    }
    return -1;
  }

  // Test if pattern matches text starting at index i
  private static boolean isMatched(int i, String text, String pattern) {
    for (int k = 0; k < pattern.length(); k++) {
      if (pattern.charAt(k) != text.charAt(i + k)) {
        return false;
      }
    }
    return true;
  }
}
