package assignment4;


public class Assignment4 {

	

	/**

	 * The deadline of assignment4 is 10/12/2018 23:59 PST.

	 * Please feel free to contact Zane and Amanda for any questions.

	 */

	

	/*

	 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

	 * s = "leetcode" return 0. 

	 * s = "loveleetcode" return 2.

	 */
	   static class GFG  
	    { 
	        static final int NO_OF_CHARS = 256; 
	        static char count[] = new char[NO_OF_CHARS]; 
	   
	        static void getCharCountArray(String s)  
	    { 
	        for (int i = 0; i < s.length();  i++) 
	             count[s.charAt(i)]++; 
	    } 
    public int firstUniqChar(String s) {

    		//TODO

        getCharCountArray(s); 
        int index = -1, i; 
       
        for (i = 0; i < s.length();  i++) 
        { 
            if (count[s.charAt(i)] == 1) 
            { 
                index = i; 
                break; 
            }    
        }   
        
      return index; 

     }
 

    

    /*

     *Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

     * Input: 38 Output: 2

     * Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

     */

    public int addDigits(int n) {

    		//TODO

    	{ 
            int sum = 0; 
      
            while (n > 0 || sum > 9)  
            { 
                if (n == 0) { 
                    n = sum; 
                    sum = 0; 
                } 
                sum = n % 10 + sum; 
                n = n/10; 
            } 
            return sum; 
        } 
    }

    

    /*

     *  Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

     *  Input: [0,1,0,3,12] Output: [1,3,12,0,0]

     */

    public void moveZeroes(int[] nums) {

    		//TODO 
    	    int n = nums.length;
            int count = 0;  
      
            for (int i = 0; i < n; i++) 
                if (nums[i] != 0) 
                    nums[count++] = nums[i]; 
            
            while (count < n) 
                nums[count++] = 0; 
        } 

     }

	

    /*

     * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

     * Input: "babad" Output: "bab" Note: "aba" is also a valid answer.

     */

	public String longestPalindrome(String s) {

		//TODO
		 int maxLength = 1; 
		  
	        int start = 0; 
	        int len = s.length(); 
	  
	        int low, high; 
	  
	   
	        for (int i = 1; i < len; ++i)  
	        { 
	        
	            low = i - 1; 
	            high = i; 
	            while (low >= 0 && high < len 
	                    && s.charAt(low) == s.charAt(high)) { 
	                if (high - low + 1 > maxLength) { 
	                    start = low; 
	                    maxLength = high - low + 1; 
	                } 
	                low=low-1; 
	                high=high+1; 
	            } 
	  
	       
	            low = i - 1; 
	            high = i + 1; 
	            while (low >= 0 && high < len 
	                    && s.charAt(low) == s.charAt(high)) { 
	                if (high - low + 1 > maxLength) { 
	                    start = low; 
	                    maxLength = high - low + 1; 
	                } 
	                low=low-1; 
	                high=high+1; 
	            } 
	        } 
	  
	        System.out.println(s.substring(low, high + 1));
	  
	     ;
	    } 

    

	

    /*

     * You are given an n x n 2D matrix representing an image. Rotate the image by 90 degrees (clockwise).

     * Given input matrix = [ [1,2,3],

  			      [4,5,6],

  			      [7,8,9] ],

     * rotate the input matrix in-place such that it becomes: [  [7,4,1],

  								 [8,5,2],

  								  [9,6,3] ],

     */

    public int[][] rotate(int[][] matrix) {

    		//TODO

    	int length = matrix.length;
    	
    	for (int i = 0; i <= (length)/2; i++) {
    	for (int j = i; j < length-i; j++) {

    	int temp = matrix[i][j];

    	matrix[i][j] = matrix[length-j-1][i];
    	matrix[length-j-1][i] = matrix[length-i-1][length-j-1];
    	matrix[length-i-1][length-j-1] = matrix[j][length-i-1];
    	matrix[j][length-i-1] = temp;
    	}
    	}
		return matrix;
   }

    

}

