a, b = map(int, input().split())
a = (a % 10 * 100) + (a % 100 // 10) * 10 + (a // 100)
b = (b % 10 * 100) + (b % 100 // 10) * 10 + (b // 100)
print(a if a >= b else b)
