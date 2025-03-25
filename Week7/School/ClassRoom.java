public class ClassRoom{
	private String className;
	private String classCode;
	private Teacher teacher;
	private Student students[] = new Student[5];

	public ClassRoom(String className, String classCode, Teacher teacher, Student students[]){
		this.className = className;
		this.classCode = classCode;
		this.teacher = teacher;
		this.students = students;
	}

	public void setClassName(String nName){
		className = nName;
	}

	public void setClassCode(String nCode){
		classCode = nCode;
	}

	public void setTeacher(Teacher nteacher){
		teacher = nteacher;
	}

	public void setStudents(Student nStudents[]){
		students = nStudents;
	}
		

}