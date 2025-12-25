#from commerce_functions import display_invoice
from datetime import datetime

def main_menu(receipt):
	prompt = """
		1 => Enter customer details
		
		2 => display customers charges

		3 => display recipts
		""";
	print(prompt)
	menu = input("Enter any number from above :")
	more = " "
	total = 0
	match menu:
		case "1":
			name = input("What is the customer's Name: ")
			while more != "no":
				user_purchased = input("what did the user buy:").split(",")
				unit =  (input("How many units: ")).split(",")
				unit_price = (input("How much per unit: ")).split(",")
			
				int_unit = list(map(int, unit))
				int_unit_price = list(map(int, unit_price))

				def multiply(a, b):
					return a * b
				total = list(map( multiply, int_unit, int_unit_price))

				more = input("Add more items: ").lower()
	
				
				data = {
					"user_name": name,
					"products": user_purchased,
					"quantity": int_unit,
					"price": int_unit_price,
					"total" : total
				}
				receipt.append(data)
				print(receipt)
				
				if more == "no":
					main_menu(receipt)
					

		case "2": 
			date = datetime.now()
			print(receipt)
			invoice = f" SEMICOLON STORES \n MAIN BRANCH \n LOCATION: 312, HERBERT MACAULAY WAY, SABO, YABA, LAGOS \n DATE : {date}, \n Cashier : DIVINE \n CUSTOMER NAME: {receipt[0]["user_name"]} "
			print(invoice)
			print("                  ====================================")
			print(f"		ITEM     QTY 		PRICE		TOTAL(NGN)")
			item = f"{receipt[0]["products"][0]} {receipt[0]["quantity"][0]} {receipt[0]["price"][0]} {receipt[0]["total"][0]} \n {receipt[0]["products"][1]} {receipt[0]["quantity"][1]}  {receipt[0]["price"][1]} {receipt[0]["total"][1]}"
			print(item)
			
			
			
			main_menu(receipt)
		
			
			
			








def main():
	receipt = []
	main_menu(receipt)

main()