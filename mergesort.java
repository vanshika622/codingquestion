public class Solution {
  public static  void merge(int arr[], int low, int mid, int high) {

    int size1 = mid - low + 1;
    int size2 = high - mid;

    int temp1[] = new int[size1];
    int temp2[] = new int[size2];

    
    for (int i = 0; i < size1; i++)
      temp1[i] = arr[low + i];
    for (int j = 0; j < size2; j++)
      temp2[j] = arr[mid + 1 + j];

  
    int i, j, k;
    i = 0;
    j = 0;
    k = low;

    
    while (i < size1 && j < size2) {
      if (temp1[i] <= temp2[j]) {
        arr[k] = temp1[i];
        i++;
      } else {
        arr[k] = temp2[j];
        j++;
      }
      k++;
    }

    
    while (i < size1) {
      arr[k] = temp1[i];
      i++;
      k++;
    }

    while (j < size2) {
      arr[k] = temp2[j];
      j++;
      k++;
    }
  }

  
 public static void divide(int arr[], int n,int low, int high) {
    if (low < high) {

      
      int mid = (low + high) / 2;

      
      divide(arr, n,low, mid);
      divide(arr,n, mid + 1, high);

      
      merge(arr, low, mid, high);
    }
  }
	public static void mergeSort(int[] arr, int n) {
		divide(arr, n, 0, n-1);
	}
}
