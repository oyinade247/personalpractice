numbers = [5, 10, 15, 20, 25]

new_element = 12

loop = 2

highest = 30

new_list = [0] * (len(numbers))

for index in range(loop):
	new_list[index] = numbers[index] 

for index_2 in range(loop, len(numbers)):
	new_list[index + 1] = new_element * 2
	
for index_3 in range(loop, (len(numbers)-1)):
	new_list[index_3 + 1] = numbers[index_3] 
	
for index_4 in range(loop, (len(numbers)-1)):
	new_list[index_4 + 1] = numbers[index_4] * 2
	if new_list[index_4 + 1] >=  highest:
		new_list[index_4 + 1] = 99
		print(new_list)





		



