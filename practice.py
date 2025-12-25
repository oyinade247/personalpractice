"""
count = 1
sum = 0

while count <= 10 :
	sum += count 
	count += 1
print(sum)

for number in [2, 5, 8, 11, 14] :
	if number % 2 == 0 :
		print(number, "is even")
	else :
		print(number, "is odd")	

	


for column in range(1, 6) :
	for row in range(1, 6):
		print("*", end = '')
	print()



for column in range(1, 6) :
	for row in range (column) :
		print(" ", end = ' ')
	for row_two in range(6, 1, -1) :
		print("*", end = ' ')	

	print()

"""
for column in range(1, 6) :
	for row_one in range(column) :
		print(" 1", end = ' ')
	for row_two in range(1, -6) :
		print("*", end = ' ')

	print()	
	








