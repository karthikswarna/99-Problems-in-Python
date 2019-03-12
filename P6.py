def reverse(alist):
    new_list = []
    new_list = alist.copy()
    new_list.reverse()
    return new_list

def isPalindrome(alist):
    new_list = reverse(alist)
    
    if new_list == alist:
        return True
    else:
        return False


my_list = [1, 1, 5, 6, 6, 9, 9, 6, 6, 5, 1, 1]
new_list = isPalindrome(my_list)
print(new_list)