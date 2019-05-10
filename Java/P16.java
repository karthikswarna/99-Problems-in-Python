// Drop every N'th element from a list.

import core.List;
import static core.List.*;

class P16 
{
    <T> List<T> f0(int n, List<T> list) 
    {
        List<T> acc = nil();
        int k = 1;
        for (T it : list) 
        {
            if (k < n) 
            {
                acc = cons(it, acc);
                k++;
            } 
            else 
            {
                k = 1;
            }
        }
        
        return acc.reverse();
    }
}
