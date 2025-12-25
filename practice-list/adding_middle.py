numbers = [1, 3, 5, 7]

new_digit = 4

new_list = [0] * (len(numbers) + 1)

for index in range(len(numbers)):
	new_list[index] = numbers[index]
	
new_list[len(numbers)] = new_digit
temp = new_list[2]
new_list[2] = new_list[4]
new_list[4] = temp



print(new_list)