// Split a list into two parts; the length of the first part is given.

import core.List;
import core.Pair;
import static core.List.*;
import static core.Pair.pair;

class P17 
{
    <T> Pair<List<T>, List<T>> f0(int n, List<T> list) 
    {
        return list.splitAt(n);
    }
}