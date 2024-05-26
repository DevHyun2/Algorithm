def solution(my_string):
    answer = []
    x = list(map(str,my_string))
    for i in x:
        if '1'in i:
            answer.append(int(i))
        elif '2' in i:
            answer.append(int(i))
        elif '3' in i:
            answer.append(int(i))
        elif '4' in i:
            answer.append(int(i))
        elif '5' in i:
            answer.append(int(i))
        elif '6' in i:
            answer.append(int(i))
        elif '7' in i:
            answer.append(int(i))
        elif '8' in i:
            answer.append(int(i))
        elif '9' in i:
            answer.append(int(i))
    return sum(answer)
#     for i in x:
#         if i == int(i):
#             answer.append(i)
#             #answer += i
#     return sum(answer)
        