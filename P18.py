def slice(alist, f, l):
    return alist[f - 1:l]

my_list = [1, 1, 1, 5, 6, 6, 6, 6, 9, 8, 3, 1]
new_lists = slice(my_list, 3, 8)
print(new_lists)
