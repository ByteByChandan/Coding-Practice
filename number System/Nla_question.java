/*QUESTION: 66  GROUP: Coding  SECTION: Coding 2  Mark(s): 10

Daemon is a student of class 12 at Dream International School located in Bangalore. He studies 5 different subjects, namely Maths, Biology, English, Hindi and Social Studies. He has appeared for his final examination and the criteria to enroll in the new session is as given below:

If Daemon scores 90 or more than 90 in Maths, 70 or more than 70 in Biology and a percentage of more than 80, he will be eligible for "JEE".

If Daemon scores 90 or more than 90 in Biology and a percentage of more than 60, he will be eligible for "Medical".

If both of the above conditions are satisfied, he will be eligible for both "JEE" and "Medical".

If conditions (1) and (2) fail, it should print "Fail" (without quotes).

Write a program to represent the above scenario.

Notes:
i) Marks should be entered in the order of Maths, Biology, English, Hindi, Social studies respectively.
ii) Total marks of all the subjects is 500. The highest marks Daemon can score in each subject is 100.
iii) Percentage = ((Maths + Biology + English + Hindi + Social studies) / Total marks) × 100.
iv) If Daemon fails in any of the 5 subjects, print "Fail". The pass mark for each subject is 30.

Read the input from STDIN (standard input) and Print to STDOUT (standard output) with a trailing newline. You should not write arbitrary strings while reading the input and while printing as these contribute to the standard output.

Constraints:
Marks of Maths, Biology, English, Hindi, Social Studies can at most be 100 each.

Input Format:
The input contains five marks each separated by a single space.

Output Format:
The first line of the output contains the percentage corrected to one decimal point.
The second line of output contains either "JEE" or "Medical" or both "JEE" and "Medical" (printed as JEE,Medical separated by a comma ,) or "Fail".

Sample Input1:
78 90 84 92 95

Sample Output1:
87.8
Medical

Explanation1:
Marks are: Maths = 78, Biology = 90, English = 84, Hindi = 92, Social Studies = 95.
He passed in all the subjects.
Now, Percentage = ((78+90+84+92+95)/500) × 100 = 87.8
As he scored 90 in Biology and his percentage is more than 60, the output is "Medical".

Sample Input2:
92 94 97 99 90

Sample Output2:
94.4
JEE,Medical

Explanation:
Marks are: Maths = 92, Biology = 94, English = 97, Hindi = 99, Social Studies = 90.
He passed in all the subjects.
Now, Percentage = ((92+94+97+99+90)/500) × 100 = 94.4

As he scored more than 90 in Maths and more than 70 in Biology and his percentage is more than 80, the output is both "JEE" and "Medical".

Sample Input3:
92 27 65 57 80

Sample Output3:
64.2
Fail

Explanation2:
Marks are: Maths = 92, Biology = 27, English = 65, Hindi = 57, Social Studies = 80.
As he failed in Biology, the output is "Fail".*/
import java.util.Scanner;

class Cheakking {
    public void pass_or_fail(int M, int B, int E, int H, int SS) {
        if (M > 100 || B > 100 || E > 100 || H > 100 || SS > 100) {
            System.out.println("you can't enter your marks more than 100");
            return;
        }
        int marks = M + B + E + H + SS;
        double percentage = (marks / 500.0) * 100.0;

        if (M < 30 || B < 30 || E < 30 || H < 30 || SS < 30) {
            System.out.println("your Percentage is: " + percentage);
            System.out.println("Fail");
        } else if ((B >= 90 && percentage >= 60) && ((M >= 90 && B >= 70) && percentage >= 80)) {
            System.out.println("your Percentage is: " + percentage);
            System.out.println("JEE,MEDICAL");
        } else if ((M >= 90 && B >= 70) && percentage > 80) {
            System.out.println("your Percentage is: " + percentage);
            System.out.println("JEE");
        } else if (B >= 90 && percentage >= 60) {
            System.out.println("your Percentage is: " + percentage);
            System.out.println("MEDICAL");
        } else {
            System.out.println("Fail");
        }
    }
}

class Nla_question {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your Maths marks: ");
        int M=sc.nextInt();
        System.out.print("Enter your Biology marks: ");
        int B=sc.nextInt();
        System.out.print("Enter your English marks: ");
        int E=sc.nextInt();
        System.out.print("Enter your Hindi marks: ");
        int H=sc.nextInt();
        System.out.print("Enter your Social Science marks: ");
        int SS=sc.nextInt();
        Cheakking obj=new Cheakking();
        obj.pass_or_fail(M,B,E,H,SS);

    }
}
