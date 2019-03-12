from random import sample 

def random_select(alist, N):
    new_list = sample(alist, N)
    return new_list

my_list = [1, 5, 6, 6, 9, 8, 3, 1]
new_lists = random_select(my_list, 3)
print(new_lists)