from random import sample 

def random_permute(alist):
    new_list = sample(alist, len(alist))
    return new_list

my_list = [1, 5, 6, 6, 9, 8, 3, 1]
new_lists = random_permute(my_list)
print(new_lists)