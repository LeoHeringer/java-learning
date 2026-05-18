numbers = [10, 20, 30, 40, 50]

print("First element:", numbers[0])
print("Second element:", numbers[1])

numbers.append(60)

numbers.remove(30)

print("\nAll elements in the vector:")
for number in numbers:
    print(number)

print("\nVector size:", len(numbers))
