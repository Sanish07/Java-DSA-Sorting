
package sorting;

public class Main {

    public static void main(String[] args) {
        int arr[] = new int[]{2,8,4,1,5,3,6,9};
        
        //Call for Insertion Sort
        var inSort = new Sort();
        int inSorted[] = inSort.insertionSort(arr);
        System.out.print("Insertion Sort : ");
        for(int i=0;i<inSorted.length;i++){
            System.out.print(inSorted[i]+" ");
        }
        
        System.out.println();
        
       //Call for Bubble Sort
        var bubSort = new Sort();
        int bubSorted[] = bubSort.bubbleSort(arr);
        System.out.print("Bubble Sort : ");
        for(int i=0;i<bubSorted.length;i++){
            System.out.print(bubSorted[i]+" ");
        }
        
        System.out.println();
        
        //Call for Selection Sort
        var selSort = new Sort();
        int selSorted[] = selSort.selectionSort(arr);
        System.out.print("Selection Sort : ");
        for(int i=0;i<selSorted.length;i++){
            System.out.print(selSorted[i]+" ");
        }
    }    
}
