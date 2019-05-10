// Extract a slice from a list.

import core.List;
import static core.List.cons;
import static core.List.listOfChars;
import static core.List.nil;

class P18 
{
    <T> List<T> f0(List<T> list, int i, int k) 
    {
        return list.splitAt(k).getA().splitAt(i - 1).getB();
    }
}