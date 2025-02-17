import java.util.*;

class DSAsolution{

    public static void FindPair(int arr[], int size, int idx, int target){

        int count = 0;
        if(idx+1 == size){
            if(count == 0){
                System.out.println("No pair found");
            }
            return;
        }
        int temp = arr[idx];
        for(int i = idx+1; i < size; i++){
            if ((temp + arr[i])==target){
                System.out.println("( "+temp+" , "+arr[i]+" )");
                count++;
            }
           
        }
        FindPair(arr, size, idx+1, target);

    }

    public static void checkSubarr(int arr[], int size, int idx){

        if(idx == size){
            return;
        }
        int temp = 0;
        for(int i = idx; i < size; i++){
            temp += arr[i];
            if(temp == 0){
                
                System.out.print("( ");
                for(int j = idx; j <= i; j++){
                    System.out.print(arr[j]+" ");
                }
                System.out.print(" )");
                System.out.println();

            }
        }
        checkSubarr(arr, size, idx+1);
       
    }

    public static void linearSort(int[] arr,int size, int idx){
        if(idx+1 == size ){
            for(int i = 0; i < size; i++){
                System.out.print(arr[i]+" ");
            }
            return;
        }
        for(int i = idx; i < size; i++){
            int temp = arr[idx];
           if(temp > arr[i]){
            arr[idx] = arr[i];
            arr[i] = temp;
           }
        }

        linearSort(arr, size, idx+1);
    }

    public static void checkDuplicate(int arr[], int size, int idx){
        if(idx+1 == size){
            System.out.println("No duplicate Element");
            return;
        }
        for(int i = idx+1; i < size; i++){
            if(arr[idx] == arr[i]){
                int dupli = arr[idx];
                System.out.print("The duplicate element is "+dupli);
                return;
            }
        }
        checkDuplicate(arr, size, idx+1);
    }

    public static void ConsSubArray(int arr[], int size, int idx, ArrayList<Integer> set1, ArrayList<Integer> set2){
        if(idx+1 == size){
            if(set1.size() > set2.size()){
                System.out.println(set1);
            }else{
                System.out.println(set2);
            }
            return;
        }
        for(int i = idx; i < size; i++){
            if(!set1.contains(arr[i])){
                set1.add(arr[i]);
            }else{
                break;
            }
        }
        for(int i = idx+1; i < size; i++){
            if(!set2.contains(arr[i])){
                set2.add(arr[i]);
            }else{
                break;
            }
        }
        if(set1.size() > set2.size()){ 
            set2.clear();
        }else{ 
            set1.clear();
        }
        ConsSubArray(arr, size, idx+1, set1, set2);
    }

    public static void Lengthsubarr(int arr[], int size, int idx, int target, ArrayList<Integer> list){
        if(idx == size){
            int length = 0;
            for(int i = 0; i < list.size(); i++){
                int temp = list.get(i);
                if(length < temp){
                    length = temp;
                }
            }
            System.out.println("Maximaum length: "+length);
            return;
        }
        int sum = 0;
        int count = 0;
        for(int i = idx; i < size; i++){
            sum += arr[i];
            if(sum == target){
                System.out.print("[ ");
                for(int j = idx; j <= i; j++){
                    System.out.print(arr[j]+" ");
                    count++;
                }
                System.out.print("]");
                System.out.println();
                list.add(count);
            }
        }
        
        Lengthsubarr(arr, size, idx+1, target, list);
    }

    public static void equal(int[] arr, int size, int idx,  ArrayList<Integer> list1){
        if(idx+1 == size){
            System.out.println(list1);
            return;
        }
        
        int count0 = 0;
        int count1 = 0;
        
        for(int i = idx; i < size; i++){
            if(arr[i] == 0){
                count0++;
            }else if(arr[i] == 1){
                count1++;
            }

            if(count0 == count1){
                int subarrayLength = i - idx + 1;

                if(subarrayLength > list1.size()){
                    list1.clear();
                    for(int j = idx; j <= i; j++){
                        list1.add(arr[j]);
                    }
                }
            }
        }

        equal(arr, size, idx+1, list1);
    }

    public static void DutchNati(int arr[], int size){
        if(size == 1){
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i]+" ");
            }
            return;
        }

        for(int i = 0; i < size-1; i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

       DutchNati(arr, size-1);

    }

    
    public static void merge(int arr1[], int arr2[], int sz1, int sz2, int size){
        for(int i = 0; i < sz1; i++){
            int y = arr1[i];
            for(int j = 0; j < sz2; j++){
                int x = arr2[j];
                if(y > x){
                    arr2[j] = y;
                    arr1[i] = x;
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args){

        //Question 1: Find a pair with the given sum in an array

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of inputs: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            System.out.print("Enter the " +(i+1)+ " value: ");
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the target: ");
        int target = sc.nextInt();

        FindPair(arr, size, 0, target);*/

        //Question 2: Check if a subarray with 0 sum exists or not

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++){
            System.out.print("Enter the "+(i+1)+" value: ");
            arr[i] = sc.nextInt();
        }

        checkSubarr(arr, size, 0);*/

        //Question 3: sort binary array in linear time

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            System.out.print("Enter the "+(i+1)+" value: ");
            arr[i] = sc.nextInt();
        }

        linearSort(arr, size, 0);*/

        //Question 4: Find the duplicate element in a limited range array

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i = 0; i < size; i++){
            System.out.print("Enter the "+(i+1)+" value: ");
            arr[i] = sc.nextInt();
        }

        checkDuplicate(arr, size, 0);*/

        //Question 5: Find the largest subarray formed by consecutive integers

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        ArrayList<Integer> set1 = new ArrayList<>();
        ArrayList<Integer> set2 = new ArrayList<>();

        for(int i = 0; i < size; i++){
            System.out.print("Enter the "+(i+1)+" value: ");
            arr[i] = sc.nextInt();
        }

        ConsSubArray(arr, size, 0, set1, set2);*/

        //Question 6: Find maximum length subarray having a given sum

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        System.out.print("Target: ");
        int target = sc.nextInt();
        int arr[] = new int[size];
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < size; i++){
            System.out.print("Enter the "+(i+1)+" value: ");
            arr[i] = sc.nextInt();
        }

        Lengthsubarr(arr, size, 0, target, list);*/

        //Question 7: Find the largest subarray having an equal number of 0’s and 1’s

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Binary array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
      
        for(int i = 0; i < size; i++){
            System.out.print("Enter the "+(i+1)+" value: ");
            arr[i] = sc.nextInt();
        }

        equal(arr, size, 0, list1);*/

        //Question 8: Sort an array of 0’s, 1’s, and 2’s 

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Total element in the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            System.out.print("Enter the "+(i+1)+" value: ");
            arr[i] = sc.nextInt();
        }

        DutchNati(arr, size);*/

        //Question 9: In-place merge two sorted arrays

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array 1: ");
        int sz1 = sc.nextInt();
        System.out.print("Enter the size of array 2: ");
        int sz2 = sc.nextInt();
        int arr1[] = new int[sz1];
        int arr2[] = new int[sz2];

        System.out.println("Enter first sorted array");
        for(int i = 0; i < sz1; i++){
            System.out.print("Enter the "+(i+1)+" values: ");
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter second sorted array");
        for(int i = 0; i < sz2; i++){
            System.out.print("Enter the "+(i+1)+" values: ");
            arr2[i] = sc.nextInt();
        }

       merge(arr1, arr2, sz1, sz2);

    }
}