package intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortExample {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
				new Student("Hong", 30),
				new Student("Park", 15),
				new Student("Hwang", 25),
				new Student("Choi", 16)
				);
		// sorted 는 compareTo 가 정의되어있어야만 실행된다.
		students.stream().sorted().forEach(s -> System.out.println(s));
		
		System.out.println("---------------");
		
		List<Person> person = Arrays.asList(
				new Person("Hong", 30),
				new Person("Park", 15),
				new Person("Hwang", 25),
				new Person("Choi", 16)
				);
		// 나이순
		person.stream().sorted(new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.age - o2.age;
			}}).forEach(System.out::println);
	
		// 이름순
		person.stream().sorted(new Comparator<Person>() {

			@Override
			public int compare(Person t1, Person t2) {
				return t1.name.compareTo(t2.name);
			}
		}).forEach(System.out::println);			
		
	}
}
