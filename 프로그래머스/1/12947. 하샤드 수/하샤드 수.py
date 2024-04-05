def solution(x):
    t = sum(map(int,str(x)))
    if x%t == 0:
        return True
    else:
        return False