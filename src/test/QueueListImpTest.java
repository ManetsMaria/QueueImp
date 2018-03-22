package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import datastructure.QueueListImp;

public class QueueListImpTest {

    @Test
    public void commonTest(){
        QueueListImp <String> queueListImp = new QueueListImp<>();
        queueListImp.add("1");
        queueListImp.add("2");
        queueListImp.add("3");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(queueListImp.poll());
        stringBuilder.append(" ");
        stringBuilder.append(queueListImp.poll());
        stringBuilder.append(" ");
        stringBuilder.append(queueListImp.peek());
        stringBuilder.append(" ");
        stringBuilder.append(queueListImp.isEmpty());
        Assert.assertEquals(stringBuilder.toString(), "1 2 3 false");
    }
}
