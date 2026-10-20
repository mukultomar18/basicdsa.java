public class arraymax {
    static void main(){
        int max=0;
        int arr[]={10,20,40,30};
        for(int i=0; i<4; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);

    }
}
