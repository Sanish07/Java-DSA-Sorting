
package sorting;

public class Sort {
    
    
    public int[] insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int temp = arr[i];
            int j = i-1;
           while(j>=0 && arr[j] > temp){
               arr[j+1] = arr[j];
               j--;
           }
           arr[j+1] = temp;
        }
        return arr;
    }
    
    public int[] bubbleSort(int arr[]){
    
        for(int i=0; i<arr.length-1; i++){
           for(int j=i+1;j<arr.length;j++){
               if(arr[i]>arr[j]){
                 int temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
               }
           }
        }
        return arr;
    }
    
    public int[] selectionSort(int arr[]){
    
        for(int i=0;i<arr.length-1;i++){
        
            int minElement = arr[i];
            int minIndex = i;
            for(int j=i+1;j<arr.length;j++){
            
                if(arr[j]<minElement){
                    minElement = arr[j];
                    minIndex = j;
                }
            }
            
            if(minIndex !=i){
            arr[minIndex] = arr[i];
            arr[i] = minElement;
            }
            
        }
        return arr;
    }
}
