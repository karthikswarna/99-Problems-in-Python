def pack(alist):
    new_list = []
    i = 1
    x = alist[0]
    new_list.append(x)

    while i < len(alist):

        if alist[i - 1] != alist[i]:
            new_list.append(alist[i])

        else:
            new_list.pop()
            sub_list = []
            reach_end = False
            sub_list.append(alist[i])

            while alist[i - 1] == alist[i]:
                sub_list.append(alist[i])

                if i == len(alist) - 1:
                    reach_end = True
                    break
                i += 1
            
            if(reach_end == False):
                i -= 1

            new_list.append(sub_list)

        i += 1
        
    return new_list


my_list = [1, 1, 5, 6, 6, 9, 9, 9, 9, 9, 9, 8, 8, 8, 3, 3, 3, 3, 3, 3]
new_list = pack(my_list)
print(new_list)