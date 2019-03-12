def reverse(alist):
    new_list = []
    new_list = alist.copy()
    new_list.reverse()
    return new_list
    
my_list = [1, 5, 6, 6, 9, 9, 8, 3, 3, 3]
new_list = reverse(my_list)
print(new_list)