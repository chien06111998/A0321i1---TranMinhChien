package access_modifier_static_method_static_property.thuc_hanh.thuc_hanh.static_method;

public class Show {
    public static void main(String[] args) {
        Student.change();
        Student st = new Student(11, "Hoàng");
        Student st2 = new Student(22, "Chien");
        Student st3 = new Student(33, "Nàng");
        st.display();
        st2.display();
        st3.display();
    }
}
