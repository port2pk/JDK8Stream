package stream.create.primitive;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreationPrimitive {

	public static void main(String[] args) {
		/**
		 * IntStream for int
		 */
		
		/**
		 * LongStream for long
		 */
		
		/**
		 * DoubleStream for double
		 */
		
		/**
		 * Diff With Regular Streams:
		 * All the primitive Streams are similar to regular Stream with following differences.

			1.) It supports few terminal aggregate functions such sum(), average(), etc.
			2.) It accepts specialized function interface such as IntPredicate instead of Predicate,
			 IntConsumer instead of Consumer.
		 */
		int sum = Arrays.stream(new int[] {1,2,3})
                .sum();
			System.out.println(sum);
			/**
			 * Convert Stream to IntStream
			 * 
			 */
			Stream.of("10","20","30")
		      .mapToInt(Integer::parseInt)
		      .average()
		      .ifPresent(System.out::println);
		// Output
		// 20.0
			
			/**
			 * Convert IntStream to Stream
			 * You can use mapToObj() convert primitive Streams to regular Stream
			 */
			String collect = IntStream.of(10,20,30)
                    .mapToObj((i)->""+i)
                    .collect(Collectors.joining("-"));
			System.out.println(collect);
			//Output
			//10-20-30
			
			
	}

}
