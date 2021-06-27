def binary_search(a, start, end, x):
	if start > end:
		return -1
	
	if (a[(start + end) // 2] == x):
		return (start + end) // 2

	if (a[(start + end) // 2] < x):
		return binary_search(a, (start + end) // 2 + 1, end, x)
	
	if (a[(start + end) // 2] > x):
		return binary_search(a, start, (start + end) // 2 - 1, x)

print(binary_search([0, 1, 2, 3, 5, 7, 9, 10, 11], 0, 8, 10))
print(binary_search([0, 1, 2, 3, 5, 7, 9, 10, 11], 0, 8, 6))
