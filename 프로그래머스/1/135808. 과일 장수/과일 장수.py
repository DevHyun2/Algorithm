def solution(k, m, score):
    score.sort(reverse = True)
    max_income = 0
    for i in range(0,len(score),m):
        apple_box = score[i:i+m]
        if len(apple_box) == m:
            max_income += min(apple_box) * m
    return max_income