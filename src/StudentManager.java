public class StudentManager extends UserManager{
    public void editToProfile(Student student) {
        System.out.println(student.getId()+"numaralı ögrenci " + student.getFirstName()+student.getLastName()+"  profilini düzenledi.");
    }

    public void disconnect(Student student) {
        System.out.println(student.getId()+"numaralı ögrenci " +student.getFirstName()+student.getLastName()+ " baglantısını kopardı.");
    }

    public void addToComment(Student student) {
        System.out.println(student.getId()+" numaralı ögrenci"+" "+ student.getFirstName()+" "+student.getLastName()+" yorum yaptı: "+student.getCommentText());
    }

    public void removeToComment(Student student) {
        System.out.println(student.getId()+" numaralı ögrenci "+ student.getFirstName()+student.getLastName()+student.getCommentText()+" yorumunu sildi");
    }

    public void updateToComment(Student student) {
        System.out.println(student.getId()+" numaralı ögrenci "+ student.getFirstName()+student.getLastName()+"yorumunu güncelledi: "+student.getCommentText());

    }
    public int completedToCourse(Student student) {
        return student.getCompleted();
    }
}
