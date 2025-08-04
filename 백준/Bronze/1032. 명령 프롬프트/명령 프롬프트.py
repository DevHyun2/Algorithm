n = int(input()) # 개수
inPut = list(input().rstrip()) # 문자열 리스트

for _ in range(n-1):
    qm = list(input().rstrip())
    for i in range(len(inPut)):
        if inPut[i] != qm[i]:
            inPut[i] = '?'

print(''.join(inPut))