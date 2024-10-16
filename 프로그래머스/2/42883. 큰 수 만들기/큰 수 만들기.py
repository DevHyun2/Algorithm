def solution(number, k):
    stack = []
    for num in number:
        # 스택의 마지막 값이 현재 값보다 작으면 제거하고 k를 줄임
        while k > 0 and stack and stack[-1] < num:
            stack.pop()
            k -= 1
        stack.append(num)  # 현재 숫자를 스택에 추가
    
    # 남은 k만큼 뒤에서부터 제거
    if k > 0:
        stack = stack[:-k]
    
    return ''.join(stack)