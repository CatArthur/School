public class Schooler extends Man {
    Mark[] marks;
    String toStr() {
        String key = this.getName() + "\n" + "Marks: ";
        for (int i = 0; i < marks.length; i++) {
            key += marks[i] + ", ";
        }
        return key;
    }
}
