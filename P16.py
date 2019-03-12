def drop(alist, N):
    new_list = alist.copy()
    i = 1

    while i < len(new_list):
        new_list.pop(i)
        i -= 1
        i += N

    return new_list 

my_list = [1, 1, 1, 5, 6, 6, 6, 6, 9, 8, 3, 1]
new_list = drop(my_list, 2)
print(new_list)