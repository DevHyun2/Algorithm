def solution(brown, yellow):
    answer = []
    # w = 0
    # h = 0
    # sum_carpet = brown + yellow
    # #print(sum_carpet)
    # for i in range(1, sum_carpet):
    #     share = sum_carpet//i
    #     print(share)
    #     if i >= share:
    #         w += i
    #         h += share
    #         answer.append(w)
    #         answer.append(h)
    #         break
    i = 1 # 노란색 세로 길이를 저장할 변수를 생성하고 세로의 최소 길이인 1로 초기화
    while(True): # 원하는 지점에서 멈추기 위해 무한 반복
        if(yellow % i == 0): # 만약 세로의 길이로 노란색 카펫의 개수를 나누었을 때 나누어 떨어지면
            if(brown == (yellow // i*2) + (i*2)+4):
                # 노란색 카펫의 모양이 정해진 경우 주변으로 갈색 카펫을 배치하여 개수가 동일하면 됨
                # 따라서 노란색 카펫의 가로의 길이 *2와 노란색 카펫의 세로의 길이 *2를 더하고 모서리 4칸을 더해준 결과가
                # 갈색 카펫의 개수와 일치하면 if
                answer.append(yellow//i+2) # 전체 카펫의 가로의 길이를 추가하고
                answer.append(i+2) # 전체 카펫의 세로의 길이를 추가
                break # 전체 카펫의 가로 세로 길이를 구하면 종료
        i += 1 # 구하지 못했다면 노란색 카펫의 세로 길이를 1 증가 후 반복 진행
    return answer