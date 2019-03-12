def split(alist, N):
    return alist[:N], alist[N:]

my_list = [1, 1, 1, 5, 6, 6, 6, 6, 9, 8, 3, 1]
new_lists = split(my_list, 5)
print(new_lists)
