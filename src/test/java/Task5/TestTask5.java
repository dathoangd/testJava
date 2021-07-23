package Task5;

import Task.Task5;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;


public class TestTask5 {

    private Task5 task5 = new Task5();

    @Test
    public void removeAllNumbersGreaterThan10() {
        Set<Integer> s = task5.createSet();
        s.add(10);
        s.add(20);
        s.add(2);
        s.add(59);
        s.add(1);
        s.add(3);
        s.add(8);
        s.add(12);
        s.add(7);

        task5.removeAllNumbersGreaterThan10((HashSet<Integer>) s);
        assert s.contains(1);
      //  assert s.contains(12);


    }

}
