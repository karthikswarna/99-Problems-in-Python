def dupli(alist):
    new_list = []
    i = 0

    while i < len(alist):
        new_list.append(alist[i])
        new_list.append(alist[i])
        i += 1

    return new_list

my_list = [1, 5, 6, 9, 8, 3, 1]
new_list = dupli(my_list)
print(new_list)