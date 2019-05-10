// Duplicate the elements of a list.

import core.List;
import static core.List.*;

class P14 
{
    <T> List<T> f0(List<T> list) 
    {
        return list.isEmpty() ? List.<T>nil() : cons(list.head(), cons(list.head(), f1(list.tail())));
    }
}