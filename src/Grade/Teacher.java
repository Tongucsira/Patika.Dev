package Grade;

/**
 * @author Tonguç Şira
 */
public class Teacher {
    String name;
    String mpno;
    String branch;

    public Teacher(String name, String branch, String mpno){
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }
     void print(){
        System.out.println("Adı \t: " + name);
        System.out.println("Mobil \t: " + mpno);
        System.out.println("Branşı \t: " + branch);
     }
}
