package collector.ex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AveragingInt {

	public static void main(String[] args) {
		List intList=Arrays.asList(10,20,30,40,50);
        // Averaging int
		Double result1 = (Double)intList.stream().collect(Collectors.averagingInt(v->v));
        System.out.println(result1);//(10+20+30+40+50/5)= 150/5 =30.0
 
        Double result2 = (Double) intList.stream().collect(Collectors.averagingInt(v->v*v));
        System.out.println(result2);//(10*10 + 20*20 + 30*30 + 40*40 + 50*50)/5=5500/5 = 1100.0 
	}

}
