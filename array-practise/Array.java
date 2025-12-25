import java.util.Arrays;
import java.util.Scanner;


/*public class Array{
	public static void main(String [] args){
	
	int [] sum = {10, 20, 30, 40, 50};

	int total = 0;
	for(int i = 1; i < sum.length; i++){
	 total += sum[i];
		
	}
	System.out.print(total);



	Scanner input = new Scanner(System.in);

	int [] num = new int [5];

	int total = 0;
	for(int i = 0; i < num.length; i++){

	System.out.print("Enter any number:");
	num[i] = input.nextInt();

	total += num[i];
	
	}
	System.out.print(total);


	int [] nums = {3, 6, 1, 8, 5, 10};

	int sum = 0;
	for(int i = 0; i < nums.length; i++){
		if(nums[i] % 2 == 0){
			sum += nums[i];
		
		}
	}
	System.out.print(sum);

	int [] num =  {5, 10, 15, 20, 25};

	int sumEven = 0;

	for(int count = 0; count < num.length; count += 2){
		if(num[count] % 2 == 0){
			sumEven += num[count];

		}
	}
	System.out.print(sumEven);


	int[] nums = {-3, 4, -1, 7, -5};

	int positive = 0;
	int negative = 0;
	for(int count = 0; count < num.length; count++){
		if(num[count] < 0){
			positive += num[count];
		}

		else{
			negative += num[count];
		}
	}
	System.out.println(positive);
	System.out.print(negative);



	int [] sum = {10, 20, 30, 40, 50};

	int total = 0;
	for(int i = 1; i < sum.length; i++){
	 total += sum[i];
		
	}
	int result = (total / sum.length);
	System.out.print(result);






	
	
	
	
	
	
	
}

}*/




public class Array{
	public static void main(String [] args){

	/*int [] highest = {1, 2, 3,5, 7, 6, 10,8};
	
	int max = highest[0];

	for(int i = 0; i < highest.length; i++){
		if(max < highest[i]){
			max = highest[i];
		}

	}
	System.out.print(max);


	int [] negative = {-3, -7, -2, -9};

	int max = negative [0];

	for(int i = 0; i < negative.length; i++){
		if (max > negative[i] && max < 0){
		max = negative[i];
		}

	}
	System.out.print(max);*/


	int [] numbers = {10, 20, 5, 8, 20};
	 
	int firstHighest = Integer.MIN_VALUE;
	int secondHighest = Integer.MIN_VALUE;

	for(int count = 0; count < number.length; count++){
		if(numbers[count] > firstHighest){
			secondHighest = firstHighest;
			firstHighest = numbers[count];
		}	
		else if(secondHighest > numbers[count] && secondHighest != firstHighest)
			secondHighest = numbers[count];
		}
		
	}
	System.out.print(secondHighest);

		






	/*int [] number = {3, 7, 2, 9, 5};
	int max = number[0];
	int index = 0;
	for(int i = 0; i < number.length; i++){
		if(number[i] > max){
		max = number[i];
		index = i;
		}
	}
		System.out.print(index);


	int guessNumber = 7;

	int []  numbers = {2, 6, 8, 1};

	for(int i = 0; i < numbers.length; i++){
	   if(numbers[i] > guessNumber){
		System.out.print(true);
	  }
	  else{
		System.out.print(false);

	}



	}



	int [] numb = {3, 8, 5, 12, 7};
	int max = number[0];
	for(int i = 0; i < numbers.length; i++){
		if(max > numbers[i] && number[i] % 2 == 0;){
			max = numbers[i];
		}
		else{
			(Go and slee)
		}
		
	
	}

		
Find the highest number that is divisible by 3.
👉 Example: [3, 10, 18, 5] → Output: 18

In an array of strings, find the string with the highest length.
👉 Example: ["cat", "elephant", "dog"] → Output: "elephant"

Given an array of student scores, find the highest score and the name of the student.
👉 Example:

names = ["Alice", "Bob", "Charlie"]
scores = [85, 92, 88]


→ Output: "Bob with score 92"

Find the highest sum of any two numbers in an array.
👉 Example: [4, 2, 9, 1] → Output: 13 (from 9 + 4)

Bonus: Would you like




	
	


	
	
	

	



	}
	
	
}












int[] numb = {3, 8, 5, 12, 7};
int maxEven = Integer.MIN_VALUE;

for(int i = 0; i < numb.length; i++){
    if(numb[i] % 2 == 0 && numb[i] > maxEven){
        maxEven = numb[i];
    }*/








