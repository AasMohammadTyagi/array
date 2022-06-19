package Assignment;

public class FindUnique {
    public static int findUniique(int arr[]){
     int n= arr.length;
     int element=0;
     for(int i=0;i<n;i++){
         element^=arr[i];

     }
     return element;
    }
    public static void main(String[] args) {
        int array[]={2,3,1,6,3,6,2};
        int n= array.length;
        int element =findUniique(array);
        System.out.println(element);
    }
}
