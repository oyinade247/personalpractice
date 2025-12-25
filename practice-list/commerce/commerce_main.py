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
				user_purchased = input("what did the user buy:")
				unit =  int(input("How many units: "))
				unit_price = int(input("How much per unit: "))
			
				total = unit * unit_price

				more = input("Add more items: ").lower()
	
				
				data = {
					"user_name": name,
					"products": user_purchased,
					"quantity": unit,
					"price": unit_price,
					"total" : total
				}
				receipt.append(data)
				print(receipt)
				
				if more == "no":
					main_menu(receipt)
					

		case "2": 
			date = datetime.now()
			invoice = f" SEMICOLON STORES \n MAIN BRANCH \n LOCATION: 312, HERBERT MACAULAY WAY, SABO, YABA, LAGOS \n DATE : {date}, \n Cashier : DIVINE \n CUSTOMER NAME: {receipt[0]["user_name"]} "
			print(invoice)
			print("                  ====================================")
			print(f"		ITEM     QTY 		PRICE		TOTAL(NGN)")
			item = f"		{receipt[0]["products"]}       {receipt[0]["quantity"]}           {receipt[0]["price"]}             {receipt[0]["total"]} "
			print(item)			


		
			
			
			








def main():
	receipt = []
	main_menu(receipt)

main()