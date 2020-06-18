package intermediate;

import java.util.List;
import java.util.function.Predicate;

public class FilterExample {
	public static void main(String[] args) {
		List<Employee> employees = Employee.persons();
		employees.stream()
			.filter((t) -> t.getIncome() > 3000)
			.filter((t) -> t.isMale())
			.peek(System.out::println)
			.forEach((Employee s) -> s.setIncome(s.getIncome() * 1.1));
		System.out.println("성과급 지급 후");
		employees.stream().forEach(System.out::println);
	}
}
