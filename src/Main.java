public class Main {

    public static void main(String[] args) {

        UserManager[] userManagers = new UserManager[]{new StudentManager(),new InstructorManager()};
        User user = new User();
        user.setId(1);
        Student student = new Student();
        student.setId(2);
        Instructor instructor = new Instructor();
        instructor.setId(3);

        for(UserManager userManager : userManagers){
            userManager.login(user);
            userManager.logOut(instructor);
            userManager.signUp(student);

        }

        StudentManager studentManager = new StudentManager();

                student.setId(2);
                student.setFirstName("İbrahim Mert");
                student.setLastName("Aslay");
                student.setEmail("mert_aslay@outlook.com");
                student.setPassword("mert24");
                student.setCommentText("Kurs çok faydalı ve güzel gidiyor");
                student.getCompleted();
                studentManager.addToComment(student);

        InstructorManager instructorManager = new InstructorManager();
        instructor.setId(3);
        instructor.setFirstName("Engin");
        instructor.setLastName("Demirog");
        instructor.setHomeworkText("Java kampı 3.Gün 2. ödevi yapıldı");
        instructorManager.addToHomework(instructor);

    }



}
