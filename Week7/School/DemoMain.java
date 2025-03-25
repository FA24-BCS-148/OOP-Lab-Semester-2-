public class DemoMain {
        public static void main(String[] args) {
        	Principal principal = new Principal("Mr. Johnson", 50, 25);
        	School school = new School("Beaconhouse School System", "Garden Town, Lahore", principal);

        	Teacher teacher1 = new Teacher("Ms Nawal", 30, "English", 101);
        	Teacher teacher2 = new Teacher("Sir Haseeb", 36, "Computer Science", 102);

        	Student student1 = new Student("Haseeb", 15, "001");
        	Student student2 = new Student("Ali", 14, "002");
        	Student student3 = new Student("Abdullah", 15, "003");
        	Student student4 = new Student("Subhan", 14, "004");
        	Student student5 = new Student("Mustafa", 16, "005");

        	Student[] studentsClass1 = {student1, student2, student3, student4, student5};
        	ClassRoom class1 = new ClassRoom("Grade 10", "G10", teacher1, studentsClass1);

        	school.setClasses(new ClassRoom[]{class1});

        	System.out.println(school);
	}

}