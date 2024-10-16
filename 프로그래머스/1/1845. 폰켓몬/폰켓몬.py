def solution(nums):
    answer = 0
    nums.sort()
    maxNum = len(nums)//2
    if len(list(set(nums))) > maxNum:
        return maxNum
    else:
        return len(list(set(nums)))
 