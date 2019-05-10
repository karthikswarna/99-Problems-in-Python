// Modified run-length encoding.

import core.List;
import core.Pair;
import static core.List.*;
import static core.Pair.*;

class P11 
{
    <T> List f0(List<Pair<Integer, T>> list) 
    {
        List acc = nil();
        for (Pair<Integer, T> each : list)
            acc = cons(each.getA().equals(1) ? each.getB() : each, acc);
        return acc.reverse();
    }
}