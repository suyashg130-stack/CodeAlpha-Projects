
import java.util.*;

class Student
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number of students");
        int n = s.nextInt();

        String student[] = new String[n];
        float marks[][] = new float[n][5];

        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter name of student");
            student[i] = s.next();

            System.out.println("Enter marks of 5 Subjects");

            for(int j = 0; j < 5; j++)
            {
                marks[i][j] = s.nextFloat();
            }
        }
        System.out.println("Name of students and their marks:");

        for(int i = 0; i < n; i++)
        {
        	System.out.println("Name: " + student[i]);
        	float total = 0;
        	float highest = marks[i][0];
        	float lowest = marks[i][0];
        	for(int j = 0; j < 5; j++)
        	{
        		System.out.println("Marks: " + marks[i][j]);
        		total = total + marks[i][j];
        		if(marks[i][j] > highest)
        		{
        			highest = marks[i][j];
        		}
        		if(marks[i][j] < lowest)
        		{
        			lowest = marks[i][j];
        		}
        	}
		System.out.println();
        	float avg = total / 5;
        	System.out.println("Average: " + avg);
        	System.out.println("Highest marks: " + highest);
        	System.out.println("Lowest marks: " + lowest);
        }

        
    }
}
