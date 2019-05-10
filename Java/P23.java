// Extract a given number of randomly selected elements from a list.

import core.List;
import core.Pair;
import java.util.Random;
import static core.List.*;
import static core.Pair.pair;

class P23 
{
    <T> List<T> f0(int n, List<T> list) 
    {
        List<T> acc = nil();

        while (n > 0) 
        {
            int i = random.nextInt(list.length());
            Pair<List<T>, T> p = removeAt(list, i);
            acc = cons(p.getB(), acc);
            list = p.getA();
            n--;
        }

        return acc;
    }

    private <T> Pair<List<T>, T> removeAt(List<T> list, int n) 
    {
        Pair<List<T>, List<T>> p = list.splitAt(n);
        List<T> a = p.getA();
        List<T> b = p.getB();
        return pair(concat(a, b.tail()), b.head());
    }
}