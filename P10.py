def encode(alist):
    new_list = []
    i = 0

    while i < len(alist):
        sub_list = []

        if alist[i - 1] != alist[i]:
            sub_list.append(alist[i])

        else:
            if len(new_list) > 0:
                new_list.pop()
                sub_list.append(alist[i])
            while alist[i - 1] == alist[i]:
                sub_list.append(alist[i])
                if i == len(alist) - 1:
                    i += 1
                    break
                i += 1 
            i -= 1

        l = len(sub_list)
        e = sub_list[0]
        sub_list.clear()
        sub_list.append(l)
        sub_list.append(e)
        new_list.append(sub_list)
        i += 1

    return new_list


my_list = [1, 1, 1, 1, 1, 5, 5, 5, 5, 6, 6, 9, 9, 9, 9, 9, 9, 8, 3, 3, 3, 3 ,3, 3, 1]
new_list = encode(my_list)
print(new_list)