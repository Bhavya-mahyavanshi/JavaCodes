import java.util.*;

public class ArrayAndStrings{
    public static void main(String[] args) {
        //Find the largest element in an array.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Start Entering the elements: ");
        System.out.println("----------------------------");
        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter the " + (i+1) + " Element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("----------------------------");
        int temp = 0;
        for(int i = 0; i < arr.length; i++){
            temp = arr[i];
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] > temp){
                    temp = arr[j];
                }
            }
        }
        System.out.println("The largest element is: "+ temp);


        //Reverse an array.
        System.out.println("----------------------------");
        System.out.println("The original array is: ");
        for(int i = 0; i <arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("The reversed array is: ");
        for(int i = 0; i < arr.length/2; i++){
            temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        for(int i = 0; i <arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("-----------------------------");
        //Find the second largest and second smallest element.
        Arrays.sort(arr); //Inbuilt function
        System.out.println("Second largest element: "+ arr[arr.length-2]);
        System.out.println("Smallest element: " + arr[0]);
        System.out.println("-------------------------");
        //Check if an array is sorted.
        int flg = 0;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                flg = 1;
            }else{
                flg = 0;
            }
        }
        if(flg == 1){
            System.out.println("Array is Sorted");
        }else{
            System.out.println("Array is not Sorted");
        }

        //Move all zeros to the end of an array.
        System.out.println("-------------------------");
        System.out.println("The original array is: ");
        for(int i = 0; i <arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Moving all Zero to one End");
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                temp = arr[i];
                for(int j = i+1; j < arr.length; j++){
                    if(arr[j] != 0){
                        arr[i] = arr[j];
                        arr[j] = temp;
                        i++; //Moving to next Index after shifting
                    }
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("-------------------------");
        /*Find the union and intersection of two sorted arrays.

        NOTE: Union = combination of all unique elements from both arrays
              Intersection = Combination of all common elements from both arrays*/

        System.out.print("Enter the size of the array: ");
        int n1 = sc.nextInt();
        int[] arr2 = new int[n1];
        System.out.println("Start Entering the elements: ");
        System.out.println("----------------------------");
        for(int i = 0; i < arr2.length; i++){
            System.out.print("Enter the " + (i+1) + " Element: ");
            arr2[i] = sc.nextInt();
        }
        
        HashSet<Integer> UnionSet = new HashSet<>();
        for(int num : arr){
            UnionSet.add(num);
        }
        for(int num : arr2){
            UnionSet.add(num);
        }

        HashSet<Integer> IntersectionSet = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();
        for(int num : arr){
            set1.add(num);
        }
        for(int num : arr2){
            if(set1.contains(num)){
                IntersectionSet.add(num);
            }
        }

        System.out.println("Union Set: " + UnionSet);
        System.out.println("Intersection Set: " + IntersectionSet);

        //Rotate an array by K positions (cyclically).
        System.out.println("--------------------------------");
        System.out.println("Original Array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Enter the index: ");
        int idx = sc.nextInt();
        if(arr.length % 2 == 0){
            for(int i = 0; i <= idx - 1; i++){
                temp = arr[i];
                arr[i] = arr[arr.length - 1 -i];
                arr[arr.length -i -1] = temp;
            }
        }else{
            for(int i = 0; i < idx - 1; i++){
                temp = arr[i];
                arr[i] = arr[arr.length - i - 1];
                arr[arr.length -i -1] = temp;
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("------------------------");
        // Find the maximum sum sub-Array (Kadane’s Algorithm).
        Arrays.sort(arr);
        System.out.println("Our Original Array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        int MaxSoFar = 0;
        int maxEndingHere = 0;

        for(int i = 0; i < arr.length; i++){
            maxEndingHere += arr[i];
            if(MaxSoFar < maxEndingHere){
                MaxSoFar = maxEndingHere;
            }
            if(maxEndingHere < 0){
                maxEndingHere = 0;
            }
        }
        System.out.print("\nMaximum sum of Sub-Array: " + MaxSoFar);
        System.out.println();
        System.out.println("-----------------------------------------");
        //Find all pairs in an array that sum to a given number.
        System.out.print("Enter the Number: ");
        int num1 = sc.nextInt();
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] + arr[j] == num1){
                    System.out.println("[" + arr[i] + ", " + arr[j] + "]");
                }
            }
        }
        System.out.print("---------------------------------\n");
        // Implement the KMP (Knuth-Morris-Pratt) Algorithm for pattern matching in strings.
        System.out.print("Enter the Sentence (Without Spaces): ");
        String text = sc.next();
        System.out.print("Enter the Pattern: ");
        String pattern = sc.next();

        int[] pi = new int[pattern.length()];
        int j = 0;
        for (int i = 1; i < pattern.length(); i++) {
            while (j > 0 && pattern.charAt(i) != pattern.charAt(j)) {
                j = pi[j - 1]; 
            }
            if (pattern.charAt(i) == pattern.charAt(j)) {
                j++;
            }
            pi[i] = j;
        }
        int i = 0; //for txt
        j = 0; //for pattern

        while(i < text.length()){
            if(pattern.charAt(j) == text.charAt(i)){
                i++;
                j++;
            }

            if(j == pattern.length()){
                System.out.print("Pattern found at index: " + (i-j));
                j = pi[j-1]; //Move to the next possible match
            }else if(i < text.length() && pattern.charAt(j) != text.charAt(i)){
                if(j != 0){
                    j = pi[j-1];
                }else{
                    i++;
                }
            }
        }
        sc.close();
    }
}