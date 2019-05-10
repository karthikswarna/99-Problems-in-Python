// Create a list containing all integers within a given range.

import core.List;
import static core.List.cons;
import static core.List.nil;

class P22 
{
    List<Integer> f0(int a, int b) 
    {
        int i = b;
        List<Integer> result = nil();
        while (i >= a) 
        {
            result = cons(i, result);
            i--;
        }

        return result;
    }
}
