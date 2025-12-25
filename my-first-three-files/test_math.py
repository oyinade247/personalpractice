from unittest import TestCase

from math_functions import add, subtract ,multiply


class TestMathFunction(TestCase):

	def test_add(self):
		result = add(4 , 3)
		self.assertEqual(result, 7)
		

	def test_substract(self):
		result = subtract(5, 2)
		self.assertEqual(result, 3)

	def test_multiply(self):
		result = multiply(2,3)
		self.assertEqual(result, 6)