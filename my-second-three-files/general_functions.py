def is_even(number):
	return number % 2 == 0

def print_max(number1, number2, number3):
	return max(number1, number2, number3)	
	

def is_palindrome(number):
	number = "121" 
	reversed = ""
	for char in number:
		reversed = char + reversed
	return number


def factorial(number):
	fact = 1
	while(count < number):
		fact += number - count * fact
		count =+ 1
	return number

print(factorial(5))