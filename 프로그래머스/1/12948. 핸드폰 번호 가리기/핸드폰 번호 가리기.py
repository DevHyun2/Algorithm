def solution(phone_number):
    answer = ''
    x = len(phone_number) - 4
    return phone_number.replace(phone_number[0:-4],'*'*x)