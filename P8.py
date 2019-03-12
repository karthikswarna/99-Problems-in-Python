def del_consecutive(alist):
    i = 0
    while i < len(alist):
        if i > 0 and alist[i - 1] == alist[i]:
            alist.pop(i)
            i -= 1
        i += 1

    return alist


my_list = [1, 1, 5, 6, 6, 9, 9, 9, 9, 9, 9, 8, 3, 3, 3]
new_list = del_consecutive(my_list)
print(new_list)