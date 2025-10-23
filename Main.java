import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      System.out.println("Unsorted Array ---------------------------------------------------");
      ArrayList<Integer> integerList = Lab4.getList();
      Lab4.outputList(integerList);

      System.out.println("\n\nBubble sort results ----------------------------------------------");
      long startBubble = System.nanoTime();
      ArrayList<Integer> bubbleSortedList = Lab4.bubbleSort(integerList);
       long endBubble = System.nanoTime();
      Lab4.outputList(bubbleSortedList);
       System.out.println("\nBubble sort took: " + (endBubble - startBubble) / 1_000_000.0 + " ms");

     
      System.out.println("\n\nInsertion sort results -------------------------------------------");
      long startInsertion = System.nanoTime();
      ArrayList<Integer> insertionSortedList = Lab4.insertionSort(integerList);  
      long endInsertion = System.nanoTime();
      Lab4.outputList(insertionSortedList);
     System.out.println("\nInsertion sort took: " + (endInsertion - startInsertion) / 1_000_000.0 + " ms");
    
    
    }
}

class Lab4 {
  public static ArrayList<Integer> insertionSort(ArrayList<Integer> integerList) {
   ArrayList<Integer> sortedList = new ArrayList<>(integerList); 

    for (int i = 1; i < sortedList.size(); i++) {
        int key = sortedList.get(i);
        int j = i - 1;

        
        while (j >= 0 && sortedList.get(j) > key) {
            sortedList.set(j + 1, sortedList.get(j));
            j--;
        }
        sortedList.set(j + 1, key);
    }

    return sortedList;
}

    
  

  public static ArrayList<Integer> bubbleSort(ArrayList<Integer> integerList) {
    
    ArrayList<Integer> sortedList = new ArrayList<>(integerList); 
        int n = sortedList.size();

        
        for (int i = 0; i < n - 1; i++) {
            
            for (int j = 0; j < n - i - 1; j++) {
                if (sortedList.get(j) > sortedList.get(j + 1)) {
                    
                    int temp = sortedList.get(j);
                    sortedList.set(j, sortedList.get(j + 1));
                    sortedList.set(j + 1, temp);
                }
            }
        }

        return sortedList;
    }
    
  

  public static ArrayList<Integer> getList() {
    ArrayList<Integer> integerList = new ArrayList<>();
    String line;
    try (BufferedReader br = new BufferedReader(new FileReader("integers.txt"))) {
        while ((line = br.readLine()) != null) {
            integerList.add(Integer.parseInt(line));
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return integerList;
  }

  public static void outputList(ArrayList<Integer> integerList) {
    for (int i = 0; i < integerList.size(); i++) {
        System.out.print(integerList.get(i) + " ");
    }
  }
}