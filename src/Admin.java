public class Admin extends Man {
    Admin(Teacher[] t){
        teachers=t;
    }
    Teacher[] teachers;
    String toStr(){
        String key = this.getName() + "\n" + "Teachers: ";
        for (int i = 0; i < teachers.length; i++) {
            key += teachers[i] + ", ";
        }
        return key;
    }
    void  addLesson(Teacher s, Lesson m){
        Lesson[] m2=new Lesson[s.lessons.length+1];
        for (int i = 0; i < s.lessons.length; i++) {
            m2[i]=s.lessons[i];
        }
        m2[s.lessons.length]=m;
        s.lessons=new Lesson[s.lessons.length+1];
        for (int i = 0; i < s.lessons.length; i++) {
            s.lessons[i]=m2[i];
        }
    }
}
