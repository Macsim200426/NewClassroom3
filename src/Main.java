
import java.time.LocalDate;
import java.util.*;
public class Main {
    public static void main(String[] args) {

         final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_GREEN = "\u001B[32m";

        List<Student> students = new ArrayList<>();
        students.add(new Student("Virginia Hill","women", LocalDate.of(2006,8,5),"France","Hello","Advanced"));
        students.add(new Student("Jiang Chen","men",LocalDate.of(2006,7,4),"China","您好","Intermediate"));
        students.add(new Student("Aramaki Mitsuyuki","men",LocalDate.of(2006,1,8),"Japan","konichiwa","Intermediate"));
        students.add(new Student("Chloe Ferrer","women",LocalDate.of(2006,12,20),"Spain","¡Hola","Beginner"));
        students.add(new Student("Johan Anderson","men",LocalDate.of(2006,6,3),"Africa","Jambo","Advanced"));
        students.add(new Student("Frank Abel","men",LocalDate.of(2006,11,13),"Germany","Gruess dich","Beginner"));
        students.add(new Student("Josef Huber","men",LocalDate.of(2006,4,7),"Austria","Servus ","Intermediate"));
        students.add(new Student("Amanda Williams","women",LocalDate.of(2006,10,27),"Australia","G’day ","Advanced"));

        ArrayList<String> Advanced = new ArrayList<String>();
        ArrayList<String> Intermediate = new ArrayList<String>();
        ArrayList<String> Beginner = new ArrayList<String>();
        for (int i = 0; i < students.size(); i++)
        {
            if(students.get(i).getgender()=="men"){
                System.out.println("Студент: "+students.get(i).getfullName() + " - "+"приветствие: "+students.get(i).getwelcome());
            }else {
                System.out.println("Студентка: "+students.get(i).getfullName() + " - "+"приветствие: "+students.get(i).getwelcome());
            }
        }

        for (int i = 0; i < students.size(); i++)
        {
            switch (students.get(i).getlevelEnglish())
            {
                case "Advanced":
                    Advanced.add(students.get(i).getfullName());
                    break;
                case "Intermediate":
                    Intermediate.add(students.get(i).getfullName());
                    break;
                case "Beginner":
                    Beginner.add(students.get(i).getfullName());
                    break;
                default:
                    break;
            }
        }

        Collections.sort(Advanced);
        Collections.sort(Intermediate);
        Collections.sort(Beginner);

        System.out.println(ANSI_GREEN+"Advanced: "+ANSI_RESET);
        for (int i = 0; i < Advanced.size(); i++)
        {
            System.out.println(Advanced.get(i));
        }
        System.out.println(ANSI_YELLOW+"Intermediate: "+ANSI_RESET);

        for (int i = 0; i < Intermediate.size(); i++)
        {
            System.out.println(Intermediate.get(i));
        }
        System.out.println(ANSI_RED+"Beginner: "+ANSI_RESET);

        for (int i = 0; i < Beginner.size(); i++)
        {
            System.out.println(Beginner.get(i));
        }

        students.sort((x,y)->y.getdataofBirth().compareTo(x.getdataofBirth()));
        System.out.println(" ");
        System.out.println("Дежурный: "+students.get(0).getfullName() + " - "+students.get(0).getdataofBirth());
    }
}

class Student{
    private String fullName;
    private String gender;
    private LocalDate dataofBirth;
    private String country;
    private String welcome;
    private String levelEnglish;
    public String getfullName() {
        return fullName;
    }
    public String getgender() {
        return gender;
    }
    public LocalDate getdataofBirth() {
        return dataofBirth;
    }
    public String getcountry() {
        return country;
    }
    public String getwelcome() {
        return welcome;
    }
    public String getlevelEnglish() {
        return levelEnglish;
    }


    Student( String fullName,String gender,LocalDate dataofBirth,String country,String welcome,String levelEnglish) {
        this.fullName = fullName;
        this.gender = gender;
        this.dataofBirth = dataofBirth;
        this.country = country;
        this.welcome = welcome;
        this.levelEnglish = levelEnglish;
    }


}