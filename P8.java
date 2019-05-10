// Remove consecutive duplicates of list elements.

import core.List;
import static core.List.*;

class P08
{
    <T> List<T> f2(List<T> list) 
    {
        List<T> result = nil();
        T previous = null;
        boolean first = true;
        for (T each : list) 
        {
            if (first) 
            {
                result = cons(each, result);
                first = false;
            } 
            else if (each != previous) 
            {
                result = cons(each, result);
            }
            previous = each;
        }

        return result.reverse();
    }
}