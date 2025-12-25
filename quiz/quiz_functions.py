import random

def suggest_question(all_questions):
	index = random.randint(0, len(all_questions)- 1)
	suggest = all_questions[index]
	return suggest


def check_answer(all_questions, user_input):
	if user_input not in all_questions["options"]:
		raise Exception("invalid input")
	if user_input == all_questions["answer"]:
		return True
	return False






	



















































	
	