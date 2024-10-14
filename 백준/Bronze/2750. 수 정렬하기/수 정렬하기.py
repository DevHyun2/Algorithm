N = int(input())
numlist = []

for i in range(N):
    numlist.append(int(input()))

numlist.sort()

for i in numlist:
    print(i)