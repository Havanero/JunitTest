import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

/**
 * Created by cubanguy on 7/22/14.
 */
public class TestUnit {

    private static int x=1;
    private  HashMap<EmpName,EmpNo> myMaps = new HashMap<EmpName,EmpNo>();

    @Before
    public void Init(){

        System.out.println("set up");
        myMaps.put(new EmpName("Nelson"),new EmpNo(2));
        myMaps.put(new EmpName("Ausra"),new EmpNo(4));

    }


    @Test
    public void test(){
        x++;
        Set set =myMaps.entrySet();


        for (Object aSet : set) {
            Map.Entry me = (Map.Entry) aSet;


            EmpName keyValue = (EmpName) me.getKey();
            EmpNo value = (EmpNo) me.getValue();

            System.out.println(keyValue.EmpName() + " ==>>" + value.EmpNo());

            if (keyValue.EmpName().equals("Nelson")) {
                System.out.print("Found " + ((EmpName) me.getKey()).EmpName() + "==>>>");
                System.out.println(((EmpNo) me.getValue()).EmpNo());
            }

        }

        System.out.println("My size " + myMaps.size());
        System.out.print(myMaps.entrySet().iterator().next().getKey().EmpName());

        System.out.println(myMaps.entrySet().iterator().next().getValue().EmpNo());

    }

    @Test
    public void test1(){
        x=x+1;

        System.out.println("Testing " + x);
    }

    @After
    public void ended(){

        System.out.println("ended");
        myMaps.clear();

    }


}
