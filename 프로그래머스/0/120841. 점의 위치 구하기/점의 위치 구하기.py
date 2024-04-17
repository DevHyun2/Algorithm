def solution(dot):
    answer = 0
    if dot[0]>0 and dot[1]>0:
        return 1
    elif dot[0]<0 and dot[1]>0:
        return 2
    elif dot[0]<0 and dot[1]<0:
        return 3
    else:
        return 4
    return answer