// Run-length encoding of a list.

import core.List;
import core.Pair;
import static core.List.*;
import static core.Pair.*;

class P10 
{
    <T> List<Pair<Integer, T>> f0(List<List<T>> list) 
    {
        List<Pair<Integer, T>> result = nil();
        
        for (List<T> each : list.reverse())
            result = cons(pair(each.length(), each.head()), result);

        return result;
    }
}