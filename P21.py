def InsertElement(alist, pos, e):
    new_list = alist
    new_list.insert(pos - 1, e)
    return new_list

my_list = [1, 5, 6, 6, 9, 8, 3, 1]
new_lists = InsertElement(my_list, 5, 9875)
print(new_lists)