def solution(participant, completion):
    # answer = ''
    # participant.sort()
    # completion.sort()
    # for p in participant:
    #     for c in range(len(completion)):
    #         if completion[c] == p:
    #             participant.remove(p)
    # print(participant)
    
    # 1. 두 리스트 sort
    participant.sort()
    completion.sort()
    
    # 2. completion list의 len만큼 particient를 찾아서 없는 사람을 찾기
    for i in range(len(completion)):
        if(participant[i] != completion[i]):
            return participant[i]
    # 3. 전부 다 돌아도 없을 경우에는 마지막 주자가 완주하지 못한 선수
    return participant[len(participant)-1]
    return answer