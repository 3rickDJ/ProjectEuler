from functools import reduce
def main():
    numbers = []
    for number in range(1,1000):
        if number%3 or number%5:
            numbers.append(number)

    sumMultiplesOf3or5 = reduce(lambda number1, number2: number1 + number2, numbers)

    print(sumMultiplesOf3or5)

if __name__ == "__main__":
    main()
