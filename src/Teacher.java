public class Teacher extends Man{
    Lesson  lessons[];
    int work;
    Teacher(Lesson[] l,int w){
        lessons=l;
        work=w;
    }
    String toStr() {
        String key = this.getName() + "\n" + "Lessons: ";
        for (int i = 0; i < lessons.length; i++) {
            key += lessons[i] + " ";
        }
        key+="\nWorks "+work+" days";
        return key;
    }
    void  addMark(Schooler s, Mark m){
        Mark[] m2=new Mark[s.marks.length+1];
        for (int i = 0; i < s.marks.length; i++) {
            m2[i]=s.marks[i];
        }
        m2[s.marks.length]=m;
        s.marks=new Mark[s.marks.length+1];
        for (int i = 0; i < s.marks.length; i++) {
            s.marks[i]=m2[i];
        }
    }
}
