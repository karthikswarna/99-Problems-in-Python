def rotate(alist, N):
    return alist[N:] + alist[:N]

my_list = [1, 1, 1, 5, 6, 6, 6, 6, 9, 8, 3, 1]
new_lists = rotate(my_list, 3)
print(new_lists)