def solution(people, limit):
    people.sort()  # 몸무게 오름차순 정렬
    left = 0
    right = len(people) - 1
    answer = 0

    while left <= right:
        # 가장 가벼운 사람과 가장 무거운 사람을 함께 태울 수 있는지 확인
        if people[left] + people[right] <= limit:
            left += 1  # 가벼운 사람도 태웠으니 left를 한 칸 이동
        # 무거운 사람을 태움
        right -= 1
        answer += 1  # 보트를 하나 사용했으므로 보트 수 증가

    return answer