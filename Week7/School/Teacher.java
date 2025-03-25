public class Teacher extends Person{
	private String subject;
        private int teacherID;

        public Teacher(String name, int age, String subject, int teacherID) {
        	super(name, age);
        	this.subject = subject;
        	this.teacherID = teacherID;
        }
	
}