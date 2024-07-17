def solution(citations):
    answer = 0
    citations.sort()
    n = len(citations)
    for i in range(n):
        h = n-i
        if citations[i] >= h:
            answer = h
            break
    return answer