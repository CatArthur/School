public class Main {
    public static void main(String[] args) {
        Lesson L1=new Lesson(01.01.16, "Algebra");
        Lesson L2=new Lesson(01.01.16, "Geometry");
        Lesson L3=new Lesson(02.01.16, "Language");
        Lesson L4=new Lesson(02.01.16, "Biology");
        Lesson lesson[]={L1,L3};
        Teacher T1=new Teacher(lesson,2);
        Lesson lesson2[]={L2};
        Teacher T2=new Teacher(lesson2,2);
        Teacher teacher[]={T1};
        Admin A=new Admin(teacher)
    }
}
