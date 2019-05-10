import core.List;
import java.util.NoSuchElementException;
import static core.List.*;

class P02 
{
    <T> T f4(List<T> list) 
    {
        return list.reverse().get(1);
    }
}