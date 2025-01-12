public class BinarySearch {
    public static int binarySearch(int arr[], int key){
        int first=0;
        int last=arr.length-1;
        while (first<=last){
            int mid=(first+last)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                last=mid-1;
            }else {
                first=mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={12,15,25,27,26,74,78,88};
        int key=12;
        System.out.println(binarySearch(arr,key));
    }
}

