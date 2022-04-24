public class MyClass {

    // Find the no. of triplets present in an array
    
    public static int triplets(int[] a, int element){
       int count=0; 
    for(int i=0; i<a.length; i++){
        
        if(a[i]==element){
        count ++;

        }
    }
    int b= count/3;
    
    return b;    
    }
    
    
    public static void main(String args[]) {
     
     int[] a={1, 1, 1, 1, 1, 1, 2, 2, 5 };
     int elem= 1;
     int number=triplets(a, 1 );

      System.out.println("no. of triplet: " +number );
      
    }
}