package intermediate;

import java.util.function.Function;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MappingExample {
	public static void main(String[] args) {
//		Stream.of(1,2,3)
//				.flatMap((t) -> Stream.of(t, t * 2, t * t))
//				.forEach(s -> System.out.println(s));
	
//		Stream.of(1,2,3).flatMapToInt(new Function<Integer, IntStream>() {
//			@Override
//			public IntStream apply(Integer t) {
//				return IntStream.of(t * 2);
//			}
//		});
		double sum = Employee.persons().stream()
				.flatMapToDouble((t) -> DoubleStream.of(t.getIncome()))
				.sum();
		System.out.println("sum : "+ sum);
	
	}
}
