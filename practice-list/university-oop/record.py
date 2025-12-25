class Record:
	def __init__(self):
		self.students = []

	def add_student(self, student):
		self.students.append(student)

	def remove_student(self, student):
		self.students.remove(student)

	def find_student(self, name):
		for student in self.students:
			if student.get_name() == name:
				return student
		return None





	

	

