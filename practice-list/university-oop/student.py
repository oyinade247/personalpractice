class Student:
	def __init__(self, name, age, courses, address):
		self.name = name
		self.age = age
		self.courses = courses
		self.address = address
	
	def get_name(self):
		return self.name

	def get_age(self):
		return self.age

	def get_courses(self):
		return self.courses

	def get_address(self):
		return self.address
	
	def get_student_details(self):
		return f"{self.name}\n {self.age} \n {self.courses}\n {self.address}"

	


	

	