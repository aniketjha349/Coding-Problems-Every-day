public class selection_sort {
    public static void main(String args[]){

        int arr[] ={1,4,3,5,2,5,7};
        int size = arr.length;
        int temp =0;
        for (int i =0; i<size;i++){
            int min_idx= i;
            for(int j = i+1; j<size;j++){
                if( arr[j]<arr[min_idx]){
                    min_idx = j;
                }
                
            }
            temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0; i < size; ++i)
            System.out.print(arr[i] + " ");


    }
}