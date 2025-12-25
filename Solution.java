import java.util.Arrays;
public class Solution {

	public static void main(String [] args){
	int [] num = {1,2};
	int [] nums = {3, 6};
	int []number = findMedianSortedArrays(num, nums);
		System.out.print(Arrays.toString(number));

	}


    public static int[] findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] newArray = new int[nums1.length + nums2.length];
        for(int count = 0; count < nums1.length; count++){
            newArray[count] = nums1[count];
        }
        for(int counter = 0; counter < nums2.length; counter++){
            newArray[counter] = nums2[counter];
        }
        int [] sorted =  sortedArray(newArray);
        int [] median =  getMedian(sorted);
	int length = median.length;
	
	return median;

    }

        public static  int [] sortedArray(int [] numbers){
            for(int count = 0; count < numbers.length; count++){
                for(int counter = count + 1; counter < numbers.length;counter++){
                    if(numbers[count] < numbers[counter]){
                        int temp = numbers[count];
                        numbers[count] = numbers[counter];
                        numbers[counter] = temp;
                    }
                }
            }
            return numbers;
        }

        public static int[] getMedian(int [] numbers){
            int len = numbers.length;
	    int [] newArray;
         
                if(len % 2 == 0){
		newArray = new int[2];

                 newArray[0]=  numbers[len/ 2];
                 newArray[1]=  numbers[len/2 -1 ];
                }else{
			newArray = new int[1];

                  newArray[0]= numbers[len/2]; 
                }
		
            return newArray;


        }




               
        
    
}