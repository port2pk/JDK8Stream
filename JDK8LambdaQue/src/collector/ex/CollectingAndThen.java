package collector.ex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectingAndThen {

	public static void main(String[] args) {
		List intList=Arrays.asList(10,20,30,40,50);
        // collectingAndThen
        int result1 = (int) intList.stream()
        		.collect(Collectors.collectingAndThen(Collectors.summingInt(v->(int)v),result->result/2));
        System.out.println(result1);
	}
	/**
	 * collectingAndThen: is used to get a Collector instance
	 *  and perform finishing function on top of it.
	 *  result = 10+20+30+40+50=150
	 *  then
	 *  150/2
	 *  =75 output
	 *  
	 *  
	 */

}
