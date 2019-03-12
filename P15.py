def dupli(alist, N):
    new_list = []
    i = 0

    while i < len(alist):
        n = N
        while n > 0:
            new_list.append(alist[i])
            n -= 1
        i += 1

    return new_list

my_list = [1, 5, 6, 9, 8, 3, 1]
new_list = dupli(my_list, 3)
print(new_list)