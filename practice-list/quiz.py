import random

# ----------------------------
# QUIZ DATA
# ----------------------------
quiz = {
    1: {
        "question": "What is the capital of France?",
        "options": ["London", "Berlin", "Paris", "Madrid"],
        "answer": "Paris"
    },

    2: {
        "question": "What is 5 + 7?",
        "options": ["10", "11", "12", "13"],
        "answer": "12"
    },

    3: {
        "question": "Who wrote 'Harry Potter'?",
        "options": ["J.R.R. Tolkien", "J.K. Rowling", "Mark Twain", "Stephen King"],
        "answer": "J.K. Rowling"
    },

    4: {
        "question": "What color is the sky on a clear day?",
        "options": ["Blue", "Red", "Green", "Yellow"],
        "answer": "Blue"
    }
}


# ----------------------------
# CREATE QUESTION NUMBER LIST
# ----------------------------
question_numbers = []

for i in quiz:
    question_numbers.append(i)
print( question_numbers)


# ----------------------------
# RANDOMIZE QUESTION ORDER
# ----------------------------
random.shuffle(question_numbers)


# ----------------------------
# QUIZ LOGIC
# ----------------------------
score = 0
total_questions = 0

for num in question_numbers:  # Loop through questions in random order
    total_questions += 1
    q = quiz[num]

    print("Q" + str(num) + ":", q["question"])
    print("-------------------------")

    # Randomize the options
    random.shuffle(q["options"])

    # Display options
    letters = ["A", "B", "C", "D"]
    i = 0

    while i < 4:
        print(letters[i] + ".", q["options"][i])
        i += 1

    # Get user input
    user_choice = input("Enter your option (A/B/C/D): ")

    # Map input to chosen option
    if user_choice == "A":
        chosen = q["options"][0]
    elif user_choice == "B":
        chosen = q["options"][1]
    elif user_choice == "C":
        chosen = q["options"][2]
    elif user_choice == "D":
        chosen = q["options"][3]
    else:
        chosen = ""

    # Check if answer is correct
    if chosen == q["answer"]:
        print("✅ Correct!\n")
        score += 1
    else:
        print("❌ Wrong! The correct answer is", q["answer"], "\n")


# ----------------------------
# FINAL SCORE
# ----------------------------
print("🎯 Your final score:", score, "/", total_questions)
