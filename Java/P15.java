// Replicate the elements of a list a given number of times.

import core.List;
import static core.List.*;

class P15 
{
    <T> List<T> f0(int n, List<T> list) 
    {
        List<T> acc = nil();
        for (T each : list)
            for (int i = 0; i < n; i++)
                acc = cons(each, acc);
        return acc.reverse();
    }
}