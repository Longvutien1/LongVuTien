package entity;

import java.time.LocalDate;

public class Student_Ex2 implements Comparable<Student_Ex2>{
	private int id;
	private String name;
	private String date;
	private int score;
	public static int COUNT =0;
	
//	contructer 0 tham số
	public Student_Ex2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
//	contructer có tham số
	
	public Student_Ex2( String name, String date, int score) {
		super();
		this.id = COUNT++;
		this.name = name;
		this.date = date;
		this.score = score;
	}



// sắp sếp theo tên
//	sắp sếp theo date tương tự vì cùng dùng String
//	@Override
//	public int compareTo(Student_Ex2 o) {
//		// TODO Auto-generated method stub
//		return this.name.compareTo(o.getName());
//	}

	@Override
	public int compareTo(Student_Ex2 o) {
		int flagCompare = this.name.compareTo(o.getName());
//		đk sắp sếp với số
		if (flagCompare == 0) {
			if (this.score > o.score) {
				return 1;
			}
			else if (this.score <o.score) {
				return -1;
			}
			else if (this.score == o.score) {
				return 0;
			}
		}
		else {
			return flagCompare;
		}
		return 0;
	}


//	setter and setter
	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getDate() {
		return date;
	}




	public void setDate(String date) {
		this.date = date;
	}




	public int getScore() {
		return score;
	}




	public void setScore(int score) {
		this.score = score;
	}




	@Override
	public String toString() {
		return "Student_Ex2 [id=" + id + ", name=" + name + ", date=" + date + ", score=" + score + "]";
	}

	




	
	
	
	
}
