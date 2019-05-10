import core.List;
import static core.List.*;
import java.util.NoSuchElementException;

class P01 
{
    <T> T f0(List<T> list) 
    {
        return list.last();
    }
}
