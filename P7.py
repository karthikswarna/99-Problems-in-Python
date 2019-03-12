def flatten(alist):
    new = []

    for i in alist:
        if(type(i) == list):
            for k in i:
                new.append(k)
        else:
            new.append(i)
    return new



sample = [1, 2, 3, [3, 4], 6, 5, [1, 4, 5]]
new = flatten(sample)
print(new)