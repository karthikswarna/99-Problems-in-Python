// Remove the K'th element from a list.

import core.List;
import core.Pair;
import static core.List.*;
import static core.Pair.pair;

class P20 
{
    <T> Pair<List<T>, T> f0(List<T> list, int n) 
    {
        List<T> xs = nil();
        T x = null;
        int i = 0;
        for (T each : list) 
        {
            i++;
            if (i == n)
                x = each;
            else
                xs = cons(each, xs);
        }

        return pair(xs.reverse(), x);
    }
}