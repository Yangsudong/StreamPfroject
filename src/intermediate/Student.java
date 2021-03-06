package intermediate;

public class Student implements Comparable<Student> {
	private String name;
	private int score;
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode() + this.score;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		Student std = (Student) obj;
		boolean stdBool = this.name.equals(std.name);
		boolean scoreBool = this.score == std.score;
		return stdBool && scoreBool;
	}

	@Override
	public String toString() {
		String str = String.format("%s %s", name, score);
		return str;
	}

	@Override
	public int compareTo(Student o) {
		// -1(음수) 오름차순
		//  1(양수) 내림찬순
		//  0  
		
//		return this.score - o.score; 	// 점수기준
		return this.name.compareTo(o.name); // 이름기준
	}
	
	
	
	
}
