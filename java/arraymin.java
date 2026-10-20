public class arraymin {
    static void main(){
        int arr[]={10,20,4,30};
        int min = arr[0];
        for(int i=0; i<4; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
