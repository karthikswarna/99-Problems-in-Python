// Insert an element at a given position into a list.

import core.List;
import core.Pair;
import static core.List.*;

class P21 
{
    <T> List<T> f0(List<T> list, int n, T x) 
    {
        List<T> result = nil();
        int i = 0;
        for (T each : list) 
        {
            i++;
            result = i == 1 ? cons(x, cons(each, result)) : cons(each, result);
        }

        return result.reverse();
    }
}