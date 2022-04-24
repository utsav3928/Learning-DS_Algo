public class MyClass {
    
    public static int triplets(int[] a){
      int count=0; 
      for (int element: a){
          
          for (int i=0; i<a.length; i++){
             if(a[i]==element)
             {
                 count++;
             }
          }
          return count;
      }
      return element;
    
    }
    int b=count/3;
    return b;
    

    
    public static void main(String args[]) {
     
     int[] a={1, 1, 1, 4, 2, 3, 1, 1, 1, 2, 2, 2, 3, 5, 5, 5 };
     int number=triplets(a);

      System.out.println("no of triplet: " +number );
      
    }
}
