// Find out whether a list is a palindrome.

import core.List;
import static core.List.*;

class P06 
{
    <T> boolean f1(List<T> list) 
    {
        return list.equals(list.reverse());
    }
}