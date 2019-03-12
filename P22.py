def irange(f, l):
    new_list = []
    i = f
    while i < l:
        new_list.append(i)
        i += 1
    return new_list

new_lists = irange(5, 12)
print(new_lists)