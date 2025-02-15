public class FindNegative {
    public static int findNegative(int arr[]){
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,-2,5};
        int arr2[]={1,2,3,4,5};
        System.out.println("Negative number find at index "+findNegative(arr));
        System.out.println("Negative number find at index "+findNegative(arr2));
        
    }
}
