#using Hashmap

def TwoSum():
    
    List = [2,7,11,15]
    target = 9
    PrevMAP = {}
    
    for i, n in enumerate(List):
        diff = target - n
        if diff in PrevMAP:
            return [PrevMAP[diff], i]
        PrevMAP[n] = i
    return

print(TwoSum())