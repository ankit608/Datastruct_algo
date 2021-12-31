import java.util.Scanner;

public class GoldMine {

   public static int MAX_gold(int i, int j , int[][]arr , int[][]dp) {
	   
	  if(j==arr.length-1) {
		  
		  return arr[i][j];
		  
	  }
	   
	   if(dp[i][j]!=0) {
		   
		   return dp[i][j];
	   }
	   
	   int Max= Integer.MIN_VALUE;
	   
	   if(j<arr.length-1) {
	   int a =MAX_gold(i,j+1,arr,dp);
	     if(a>Max) {
	    	 Max =a;
	    	 
	     }
	   }
	   
	   if(i>0) {
	   int b = MAX_gold(i-1,j+1,arr,dp);
          if(b>Max) {
        	  
        	  Max=b;
          }
	   
	   }
	   
       if(i<arr.length-1) {
       int c = MAX_gold(i+1,j+1,arr,dp);
         if(c>Max) {
        	 
        	Max =c;
         }
       }
       
	   
	   dp[i][j] = Max+arr[i][j];
	   
	   return dp[i][j];
   }
	
	
      public static void main(String args[]) {
	
	 Scanner sc = new Scanner(System.in);
	  int Max= Integer.MIN_VALUE;  
	 int n = sc.nextInt() ;
	   int[][] arr = new int[n][n];
	   int[][] dp = new int[n][n];
	   
	   for(int i = 0 ;i<n; i++) {
		   
		   for(int j = 0 ;j<n ; j++) {
			      
			  arr[i][j] = sc.nextInt();     
			   
			   
		   }
		   
	   }
	   for(int i = 0 ; i<arr.length-1 ;i++) {
	   int value = MAX_gold(i,0, arr,dp);
	   
	   if(value>Max) {
		   Max = value;
	   }
	   
	   
	   }
	   
	   System.out.println(Max);
	   for(int i = 0; i <dp.length ; i++) {
		   
		   for(int j =0 ; j< dp.length ;j++)
		   {
			    System.out.println(dp[i][j]);
			   
		   }
		   
		   
		   
		   
		   
	   }
}
 	




}
