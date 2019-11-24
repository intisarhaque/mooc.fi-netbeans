public class Student implements Comparable<Student> {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    @Override
    public int compareTo(Student s)
    {
        if (s.getName().compareToIgnoreCase(this.name)==0)
        {
            return 0;
        }
        if (s.getName().compareToIgnoreCase(this.name)>0)
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }

}
