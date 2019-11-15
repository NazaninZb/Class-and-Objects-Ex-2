import java.util.Scanner;
public class Student
{
    public Student(int courses)
    {
        Scanner scanner = new Scanner(System.in);
        this.course = courses;
        int i,sum=0;
        array= new int[this.course];
        for(i=0;i<this.course;i++)
        {
            System.out.println("Enter mark and units"+(i+1));
            String mark=scanner.nextLine();
            String unit=scanner.nextLine();
            unitSum+=Integer.parseInt(unit);
            array[i]= Integer.parseInt(mark)*Integer.parseInt(unit);

        }
    }
    public int course;
    public int[] array;
    public int unitSum;
    public float avg;
    public void average()
    {
        int i,sum=0;
        for(i=0;i<this.course;i++)
        {
            sum+=array[i];
        }
        System.out.println("Sum is:"+sum);
        avg=sum/unitSum;
        System.out.println("The average is:"+avg);
    }
    public void conditional()
    {

        if(this.avg>12)
        {
            System.out.println("The student is unconditional");
        }
        else if(this.avg<12)
        {
            System.out.println("The student is conditional");
        }
    }

}
