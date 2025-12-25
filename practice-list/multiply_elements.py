numbers = [2, 4, 6, 8, 10]
new_list = [0] * (len(numbers))

for index in range(len(numbers)):
	new_list[index] = numbers[index] * 2

highest = 10

for index_2 in range(len(new_list)):
	if new_list[index_2] > highest:
		new_list[index_2] = 99
print(new_list)
	
