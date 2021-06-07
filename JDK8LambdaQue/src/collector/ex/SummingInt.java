package collector.ex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SummingInt {

	public static void main(String[] args) {
		List intList=Arrays.asList(10,20,30,40,50);
        // Averaging int
        int result1 = (int) intList.stream().collect(Collectors.summingInt(v->v));
        System.out.println(result1);
 
        int result2 = (int) intList.stream().collect(Collectors.summingInt(v->v*v));
        System.out.println(result2);
	}

}
