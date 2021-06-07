package stream.create.object;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamCreation {

	public static void main(String[] args) {
		/**
		 * Empty Stream - empty() method can be used to create an empty stream.
		 */
		Stream m= Stream.empty();
		m.forEach(System.out::println);
		
		
		/**
		 * Collection Stream - Stream can be created from Collection
		 *  by calling .stream() or .parallelStream()
		 */
		List<String> stringList=Arrays.asList("Andy","Peter","Amy","Mary");
		 
		stringList.stream()
		.map((s) -> s.toUpperCase())
		.forEach(System.out::println);
		
		/**
		 * Stream.of - You don’t need to create collection to get a Stream. 
		 * You can also use .of()
		 */
		
		Stream.of("X","Y","Z")
				.map((p) -> p.toLowerCase())
				.forEach(System.out::println);
		
		/**
		 * Stream.generate() - generate() method accepts Supplier for element generation.
		 *  It creates infinite Stream and you can limit it by calling limit() function.
		 */
		Stream<Integer> intStream=Stream.generate(() -> 1).limit(5);
		intStream.forEach(System.out::println);
		
		/**
		 * Stream.iterate() - Stream.iterate() can also be used to generate infinite stream.
		 */
		Stream<Integer> integerStream = Stream.iterate(100 , n -> n+1).limit(5);
		integerStream.forEach(System.out::println);
		// Output
		// 100
		// 101
		// 102
		// 103
		// 104
		
		
		/**
		 * Lazy evaluation - Streams are lazy; intermediate operation are not executed 
		 * until terminal operation is encounterd.
		 * 
		 * Each intermediate operation generates a new stream, stores the provided 
		 * operation or function. When terminal operation is invoked, stream pipeline 
		 * execution starts and all the intermediate operations are executed one by one.
		 */
		Stream<String> nameStream = Stream.of("mohan","john","vaibhav","amit");
		Stream<String> nameStartJ = nameStream.map(String::toUpperCase)
		                                    .peek( e -> System.out.println(e))
		                                  .filter(s -> s.startsWith("J"));
		 
		System.out.println("Calling terminal operation: count");
		long count = nameStartJ.count();
		System.out.println("Count: "+ count);
		// Output
		// Calling terminal operation: count
		// MOHAN
		// JOHN
		// VAIBHAV
		// AMIT
		// Count: 1
		
		/**
		 * Order of operations - Let’s see how stream processes the order of operations.
		 */
		
		Stream<String> namesStream = Stream.of("mohan","john","vaibhav","amit");
		Stream<String> namesStartJ = nameStream.map(
		        (s) ->
		        {
		            System.out.println("Map: "+s);
		            return s.toUpperCase();
		 
		        })
		        .filter(
		        (s) ->
		        {
		             System.out.println("Filter: "+s);
		             return s.startsWith("J");
		        } 
		    );
		 
		Optional<String> findAny = namesStartJ.findAny();
		System.out.println("Final output: "+findAny.get());
		//OUTPUT:
		//Map: mohan
		//Filter: MOHAN
		//Map: john
		//Filter: JOHN
		//JOHN
	}

}
