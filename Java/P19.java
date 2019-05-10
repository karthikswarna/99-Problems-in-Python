// Rotate a list N places to the left.

import core.List;
import core.Pair;
import static core.List.*;

class P19 
{
    <T> List<T> f0(List<T> list, int n) 
    {
        int l = list.length();
        int i = list.nonEmpty() ? n % l : 0;
        Pair<List<T>, List<T>> p = list.splitAt(i < 0 ? l + i : i);
        return concat(p.getB(), p.getA());
    }
}