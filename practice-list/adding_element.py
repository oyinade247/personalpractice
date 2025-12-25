numbers = [2, 4, 6, 8]
new_value = 10
new_list = [0] * (len(numbers) + 1)

for index in range(len(numbers)):
	new_list[index] = numbers[index]
	
new_list[len(numbers)] = new_value
print(new_list) 