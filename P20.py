def deleteKthElement(alist, K):
    new_list = alist
    new_list.pop(K - 1)
    return new_list

my_list = [1, 5, 6, 6, 6, 6, 9, 8, 3, 1]
new_lists = deleteKthElement(my_list, 1)
print(new_lists)