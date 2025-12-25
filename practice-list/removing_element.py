numbers = [10, 20, 30, 40, 50]

remove_digit = 3

new_list = [0] * (len(numbers) - 1)


for index in range(remove_digit):
	new_list[index] = numbers[index]
	

for index_two in range(remove_digit, len(numbers)):
	new_list[index_two - 1] = numbers[index_two]
print(new_list)