from unittest import TestCase
from general_functions import*

class TestgeneralFunctions(TestCase):
	def test_that_number_is_even(self):
		result = is_even(35)
		self.assertEqual(result, False)
		result = is_even(20)
		self.assertEqual(result, True)

	def test_that_number_is_largest_number(self):
		actual = print_max(2, 3, 5)
		expected = 5
		self.assertEqual(actual, expected)
	
	def test_that_number_is palindrome(self):
		actual = is_palindrome(121)
		expected = True
		self.assertEqual(actual, expected)
		