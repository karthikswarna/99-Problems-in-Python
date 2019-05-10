// Decode a run-length encoded list.

import core.List;
import core.Pair;
import static core.List.*;
import static core.Pair.*;

class P12 
{
    List f0(List list) 
    {
        List acc = nil();

        for (Object each : list) 
        {
            if (each instanceof Pair) 
            {
                Pair<Integer, Object> pair = (Pair<Integer, Object>) each;
                acc = concat(List.replicate(pair.getA(), pair.getB()), acc);
            } 
            else 
            {
                acc = cons(each, acc);
            }
        }

        return acc.reverse();
    }
}