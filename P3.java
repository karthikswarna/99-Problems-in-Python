// Find the Kth element of a list.

import core.List;
import static core.List.*;

class P03 
{
    <T> T f3(List<T> list, int n) 
    {
        return list.get(n - 1);
    }
}