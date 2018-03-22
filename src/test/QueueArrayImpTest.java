package test;

import datastructure.QueueArrayImp;
import org.testng.Assert;
import org.testng.annotations.Test;

public class QueueArrayImpTest {

    @Test
    public void commonTest(){
        StringBuilder stringBuilder = new StringBuilder();
        QueueArrayImp<String> queueArrayImp = new QueueArrayImp<>();
        queueArrayImp.add("1");
        queueArrayImp.add("2");
        queueArrayImp.add("3");
        stringBuilder.append(queueArrayImp.poll());
        stringBuilder.append(" ");
        stringBuilder.append(queueArrayImp.poll());
        stringBuilder.append(" ");
        stringBuilder.append(queueArrayImp.peek());
        stringBuilder.append(" ");
        stringBuilder.append(queueArrayImp.isEmpty());
        stringBuilder.append(" ");
        queueArrayImp.add("4");
        queueArrayImp.add("5");
        queueArrayImp.add("6");
        stringBuilder.append(queueArrayImp.poll());
        stringBuilder.append(" ");
        stringBuilder.append(queueArrayImp.poll());
        stringBuilder.append(" ");
        queueArrayImp.add("7");
        while (!queueArrayImp.isEmpty()){
            stringBuilder.append(queueArrayImp.poll());
            stringBuilder.append(" ");
        }
        Assert.assertEquals(stringBuilder.toString(), "1 2 3 false 3 4 5 6 7 ");
    }
}
