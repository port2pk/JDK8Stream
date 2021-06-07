package parallel.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Parallel Streams
 * You can create Parallel Stream using .parallel() method on Stream object in java.
 * 
 *
 */
public class ParallelStream {

	public static void main(String[] args) {
		int[] array= {1,2,3,4,5};
		 
		System.out.println("=================================");
		System.out.println("Using Parallel Stream");
		System.out.println("=================================");
		IntStream intParallelStream=Arrays.stream(array).parallel();
		intParallelStream.forEach((s)->
		{
		    System.out.println(s+" "+Thread.currentThread().getName());
		}
		);
	}

}
