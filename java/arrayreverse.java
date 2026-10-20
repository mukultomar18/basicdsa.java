public class arrayreverse {
    static void main(){
        int arr[] = {10,20,30,40,50};
    int start = 0, end = arr.length - 1;
while (start < end) {
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
    start++;
    end--;
}
 for(int i=0; i<5; i++){
    System.out.print(arr[i] + " ");
 }
}
}