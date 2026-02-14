def findSum(arr):
    sum = 0
    for element in arr:
        sum = sum + element
    return sum

def main():
    arr = [10, 20, 30, 40, 50]
    sum = findSum(arr)
    print(f"Sum = {sum}")

main()