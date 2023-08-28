public class Arrays14 {
    public static void main(String[] args) {
        String[] students = new String[4];
        students[0] = "Can";
        students[1] = "Esra";
        students[2] = "Elif";
        students[3] = "Selen";

        for (int i = 0;  i< students.length; i++){
            System.out.println(students[i]);
        }
        System.out.println("------------");
        for(String student:students){
            System.out.println(student);
        }
    }
}
