package intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMapExample {
	public static void main(String[] args) {
		List<String> inputList1 = Arrays.asList("java8 lambda", "stream mapping");
		Stream<String> stream = inputList1.stream();
		inputList1.stream()
			.flatMap(data -> Arrays.stream(data.split(" ")))
			.forEach(word -> System.out.println(word));
		
		System.out.println();
		
		List<String> inputList2 = Arrays.asList("10, 20, 30", "40, 50, 60");
		inputList2.stream().flatMapToInt(new Function<String, IntStream>() {
			@Override
			public IntStream apply(String t) {
				String[] strArr = t.split(",");
				int[] intArr = new int[strArr.length];
				for(int i=0; i<strArr.length; i++) {
					intArr[i] = Integer.parseInt(strArr[i].trim());
				}
				return Arrays.stream(intArr);
			}
		}).forEach((s) -> System.out.println(s)); 
//		{
//			@Override
//			public void accept(int value) {
//				System.out.println(value);
//			}
//		});;
	}
}
