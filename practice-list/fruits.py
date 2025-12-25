fruits = ["apple", "banana", "cherry", "date"]
new_list = [0] * len(fruits)
new_fruit = "Blue_berry"
add = 2

for fruit in range(add):
	new_list[fruit] = fruits[fruit].upper()
	
new_list[2] = new_fruit.upper()


for fruit_1 in range(add, (len(fruits)-1)):
	new_list[fruit_1 + 1] = fruits[fruit_1].upper()

for fruit_2 in range((len(fruits)-1)):
	if len([fruit_1 + 1]) >= 5:
		new_list[fruit_1 + 1] = "LONG"
print(new_list)













fruits = ["apple", "banana", "cherry", "date"]
new_fruit = "Blue_berry"
insert_index = 2

# Step 1: Create a new list with space for the new fruit
new_list = [0] * (len(fruits) + 1)

# Step 2: Copy elements before insertion, convert to uppercase manually
for i in range(insert_index):
    word = fruits[i]
    upper_word = ""                # we’ll build uppercase manually
    for char in word:
        if 'a' <= char <= 'z':     # convert lowercase to uppercase manually
            upper_word += chr(ord(char) - 32)
        else:
            upper_word += char
    new_list[i] = upper_word

# Step 3: Insert the new fruit (also uppercase manually)
upper_new = ""
for char in new_fruit:
    if 'a' <= char <= 'z':
        upper_new += chr(ord(char) - 32)
    else:
        upper_new += char
new_list[insert_index] = upper_new

# Step 4: Copy the remaining fruits shifted by 1, also uppercase manually
for i in range(insert_index, len(fruits)):
    word = fruits[i]
    upper_word = ""
    for char in word:
        if 'a' <= char <= 'z':
            upper_word += chr(ord(char) - 32)
        else:
            upper_word += char
    new_list[i + 1] = upper_word

# Step 5: Replace any string with length > 5 with "LONG"
for i in range(len(new_list)):
    if len(new_list[i]) > 5:
        new_list[i] = "LONG"

# Step 6: Print the final list
print(new_list)


		
		
		

