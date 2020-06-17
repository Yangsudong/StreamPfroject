package basic;

import java.util.Random;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class FromIntRangeExample {
	public static void main(String[] args) {
		IntStream stream = IntStream.rangeClosed(11, 20);
		IntPredicate predicate = new IntPredicate() {
			@Override
			public boolean test(int value) {
				return value % 2 == 1;
			}
		};
//		stream.filter(predicate).forEach(s -> System.out.println(s));
		
		Random random = new Random();
		IntStream intStream = random.ints(20, 11, 100);	// 11~100 사이의 숫자를 20개 랜덤으로 뿌려라
		intStream.filter(t-> t >=50 && t < 60 ).forEach(s -> System.out.println(s));
		
	}
}
