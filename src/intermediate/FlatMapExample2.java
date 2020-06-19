package intermediate;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMapExample2 {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1, 2, 3);
		
//		stream.flatMap(new Function<Integer, Stream<Integer>>() {
//			@Override
//			public Stream<Integer> apply(Integer t) {
//				return Stream.of(t * 2);
//			}
//		}).filter(new Predicate<Integer>() {
//			@Override
//			public boolean test(Integer t) {
//				return t > 3;
//			}
//		}).forEach(s-> System.out.println(s));
		
		// 위를 람다식으로 표현
		stream.flatMap(t -> Stream.of(t * 2))
			  .filter(t -> t > 3)
			  .forEach(s -> System.out.println(s));
	
		stream = Stream.of(1, 2, 3);
		// int type 합
		int sum = stream.flatMapToInt(t -> IntStream.of(t * 2)) 		
						.sum();
		System.out.println("sum : " + sum);
		
		List<Employee> employees = Employee.persons();
		employees.stream()
//			.flatMapToDouble(new Function<Employee, DoubleStream>(){
//				@Override
//				public DoubleStream apply(Employee t) {
//					return DoubleStream.of(t.getIncome());
//				}
//		}).forEach(s -> System.out.println(s));
		// 람다식 으로 
		.flatMapToDouble((t) -> DoubleStream.of(t.getIncome()))
		.forEach(s -> System.out.println(s));

	}
}
