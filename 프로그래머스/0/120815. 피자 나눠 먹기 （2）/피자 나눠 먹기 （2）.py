def solution(n):
    p=1
    while (p*6)%n!=0:
        p+=1
        print(p)
    if (p*6)%n==0:
        return p
