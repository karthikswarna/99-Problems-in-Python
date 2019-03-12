def decode(alist):
    new_list = []
    i = 0

    while i < len(alist):
        if type(alist[i]) == int:
            new_list.append(alist[i])
        
        elif type(alist[i]) == list:
            l = (alist[i])[0]
            e = (alist[i])[1]
            while l > 0:
                new_list.append(e)
                l -= 1

        i += 1
    return new_list

my_list = [[5, 1], [4, 5], 6, [2, 9], 8, [4, 3], 1]
new_list = decode(my_list)
print(new_list)