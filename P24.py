from random import sample 

def random_select(num, upper):
    new_list = sample(range(1, upper+1), num)
    return new_list

new_lists = random_select(5, 20)
print(new_lists)