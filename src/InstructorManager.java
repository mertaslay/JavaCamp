public class InstructorManager extends UserManager{
    public void addToHomework(Instructor instructor){
        System.out.println("Eğitmen "+instructor.getFirstName()+" "+instructor.getLastName()+" tarafından "+instructor.getHomeworkText()+" ödevi eklendi");
    }
}
