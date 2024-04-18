# 줄세우기
# 첫 번째 학생은 무조건 0번
# 두 번쨰 학생은 0 또는 1, 0이면 제자리 1이면 한칸앞
# 세 번쨰 학생은 0,1 또는 2 위와 동일
# 위 방식대로 학생 수만큼 반복

p = int(input())
c = list(map(int, input().split()))

arr = [] # 학생 뽑는 순서
for i in range(1,p+1):
    arr.append(i)

ans = [] # 학생들이 뽑은 줄
for j in range(p):
    ans.insert(j - c[j], j+1)

for k in ans:
    print(k,end=' ')