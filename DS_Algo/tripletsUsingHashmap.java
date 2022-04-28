package com.learning.Ds_Algo;
import java.util.HashMap;
import java.util.Map;

public class Find_Triplet {
	
	 public static Map<Integer, Integer> triplets(int[] arr){
		 int value=0;
		 
		 HashMap <Integer, Integer> trip = new HashMap<>();
		 for(int i=0; i<arr.length; i++){
			 
			int count=1;
			 for(int j=i+1; j<arr.length; j++) {
		        
		        if(arr[i]==arr[j] && arr[i]!=Integer.MIN_VALUE){
		        count +=1;
		        arr[j]=Integer.MIN_VALUE; //for minimum value of integer
		        }  
			 }
			 value= count/3;
			 trip.put(arr[i], value);
		    }
		 
		 return trip; 
	    }

public static void main(String[] args) {
	int[] a={1, 1, 1, 4, 3, 2, 2, 2, 3, 1, 5, 5, 5 };
	Map<Integer, Integer> triplet=triplets(a);
	System.out.println("No. of triplet:" +triplet);

	for (Map.Entry<Integer, Integer> map : triplet.entrySet()) {
	System.out.println(" Original number : "+ map.getKey()+", " +"No. of triplet : "+map.getValue());
		 
	 }
	}

}
