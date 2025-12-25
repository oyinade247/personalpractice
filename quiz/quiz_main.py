from quiz_functions import suggest_question,check_answer

def main_menu(all_questions, count):
	prompt = """
		WELCOME TO OYINADE QUIZ GAME
		
		1 => PLAY 

		2 => CHECK FOR SCORE

		3 => EXIT...

		
		""";
	print(prompt)
	option = input("Enter any key from above: ")
	match option:
		case "1" : 
			while len(all_questions) > 0:
				suggest = suggest_question(all_questions)
				all_questions.remove(suggest)
				print(suggest["question"])
				print(suggest["options"])
				user_input = input("enter your answer: ")

				if check_answer(suggest, user_input):
					count += 1
					print("correct")
				else:
					print("incorrect")
		
			main(count)
	

			

		case "2" : 
			print(f"Your current score is {count}")
			main_menu(all_questions, count)

		case "3" :
			print(f"Thanks for playing \n Exiting.........") 

		case default:
			print("invalid input")
			main_menu(all_questions, count)

			
			
			
			
			
											
				
				
				
				
				


			
			


def main(count):
	question1 = {
		"question": "What is the capital of lagos state",
		"options" : ["oyo","ibadan", "ikeja","ogun"],
		"answer"  : "ikeja"
		}

	question2 = {
		"question": "What is the president of Nigeria",
		"options" : ["Tinubu","buhari", "obasanjo","you"],
		"answer"  : "Tinubu"
		}

	question3 = {
		"question": "What is the color of the sky",
		"options" : ["red","blue", "yellow","purple"],
		"answer"  : "blue"
		}
	
	all_questions = [ question1, question2,question3]
	main_menu(all_questions, count)



main(0)



