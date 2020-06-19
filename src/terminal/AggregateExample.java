package terminal;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.function.DoubleConsumer;
import java.util.stream.IntStream;

import javax.swing.plaf.metal.MetalBorders.OptionDialogBorder;

public class AggregateExample {
	public static void main(String[] args) {
		int[] intAry = { 1, 2, 3, 4, 5 };
		IntStream iStream = Arrays.stream(intAry);
		OptionalDouble od = iStream.filter(n -> n > 5).average();
		double result;
		
		// 방법 3 (결과값이 있으면  출력 )
		od.ifPresent(new DoubleConsumer() {
			@Override
			public void accept(double value) {
				System.out.println("결과는 : " + value);
			}
		});
		
		
		// 방법 2 (결과값이 없으면  = 0.0)
//		result = od.orElse(0.0);
//		System.out.println(result);
		
	
		// 방법 1
//		if (od.isPresent()) {
//			result = od.getAsDouble();
//			System.out.println(result);
//		}
//		else {
//			System.out.println("값이 없습니다.");
//		}
	}
}
