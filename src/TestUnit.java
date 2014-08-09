import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

/**
 * Created by cubanguy on 7/22/14.
 */
public class TestUnit {

    private static int x=1;
    private  HashMap<EmpName,EmpNo> myMaps = new HashMap();
    private EmpNo no;
    private EmpName empName;

    @Before
    public void Init(){

        System.out.println("set up");
        myMaps.put(new EmpName("Nelson"),new EmpNo(2));
        myMaps.put(new EmpName("Ausra"),new EmpNo(4));
        
    }


    @Test
    public void test(){
        x++;
       // System.out.print("Testing1 " + x);
        //myMaps.put("Caleb","Carvalho");

        Set set =myMaps.entrySet();
        Iterator iterator = set.iterator();



        while(iterator.hasNext()){
           Map.Entry me = (Map.Entry)iterator.next();


           EmpName keyValue = (EmpName) me.getKey();
           EmpNo value = (EmpNo) me.getValue();

           System.out.print(keyValue.EmpName());

           System.out.print(value.EmpNo());

          // if (keyValue.EmpName().equals("Nelson")){


               //System.out.print(((EmpName)me.getKey()).EmpName() );
               //System.out.println(((EmpNo)me.getValue()).EmpNo());
           //}




        }




        myMaps.put(new EmpName("Nelson"),new EmpNo(6));

       
       /* EmpName keyValue = (EmpName) me.getKey();
        EmpNo value = (EmpNo) me.getValue();

        System.out.print(keyValue.EmpName());

        System.out.print(value.EmpNo());*/

       //int names = myMaps.get(("Nelson")).EmpNo();
       //System.out.println(myMaps.get("Nelson"));
        
             // EmpName locobj = myMaps.get("Nelson");
       // System.out.println(locobj.EmpName().indexOf("Nelson"));

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
