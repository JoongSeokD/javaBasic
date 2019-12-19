package generic;

import java.util.Arrays;

public class WildCardExample {
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " ������ : " + 
				Arrays.toString(course.getStudents()));
	}
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " ������ : " + 
				Arrays.toString(course.getStudents()));
	}
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " ������ : " + 
				Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("�Ϲ��ΰ���", 5);
		personCourse.add(new Person("�Ϲ���"));
		personCourse.add(new Worker("������"));
		personCourse.add(new Student("�л�"));
		personCourse.add(new HighStudent("����л�"));
		
		Course<Worker> workerCourse = new Course<Worker>("�����ΰ���", 5);
		workerCourse.add(new Worker("������"));
		
		Course<Student> studentCourse = new Course<Student>("�л�����", 5);
		studentCourse.add(new Student("�л�"));
		studentCourse.add(new HighStudent("����л�"));
		
		Course<HighStudent> highStudentCourse = new Course<HighStudent>("����л�����", 5);
		studentCourse.add(new Student("�л�"));
		studentCourse.add(new HighStudent("����л�"));
		
		// ��� ���� ��ϰ���
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		System.out.println();
		
		// �л������� ����
		// registerCourseStudent(personCourse); 
		// registerCourseStudent(workerCourse);
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);
		System.out.println();
		
		// �����ΰ� �Ϲ��� ������ ��ϰ���
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
		//registerCourseWorker(studentCourse);
		//registerCourseWorker(highStudentCourse);
	}
	
	
}

class Person{
	String name;
	public Person() {}
	public Person(String name) {this.name = name;}
	@Override
	public String toString() {return name;}
	
}
class Student extends Person{
	String name;
	public Student() {	}
	public Student(String name) {this.name = name;}
	@Override
	public String toString() {return name;}
}
class Worker extends Person{
	String name;
	public Worker() {	}
	public Worker(String name) {this.name = name;}
	@Override
	public String toString() {return name;}
}
class HighStudent extends Student{
	String name;
	public HighStudent(String name) {this.name = name;	}
	@Override
	public String toString() {return name;}
}
