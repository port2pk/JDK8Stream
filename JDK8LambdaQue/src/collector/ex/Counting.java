package collector.ex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Counting {

	public static void main(String[] args) {
		List intList=Arrays.asList(10,20,30,40,50);
        // Counting
        long  count =(Long) intList.stream().collect(Collectors.counting());
        System.out.println(count);
	}

}
