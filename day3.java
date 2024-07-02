import java.util.Scanner;
public class day3
{
    public static void main(String[] args) {
//EX1
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your role:"+" ");
        String roles = scan.nextLine().toLowerCase();

        //String role = "admin".equals(roles) ? "Welcome admin" : "Welcome user";
        if (roles.equalsIgnoreCase("admin")) {
            System.out.print("Welcome admin");
        } else if (roles.equalsIgnoreCase("superuser")) {
            System.out.print("Welcome superuser");
        } else {
            System.out.print("Welcome user");
        }
//other way
        Scanner roles = new Scanner(System.in);
        System.out.print("Choose your role (Admin, Superuser, or User)? ");
        String roleAdded = roles.nextLine();
        String message = roleAdded.equalsIgnoreCase("admin") ? "Welcome admin" :
                         roleAdded.equalsIgnoreCase("superuser") ? "Welcome superuser" :
                                 "Welcome user";
        System.out.println(message);

//EX2
        Scanner num = new Scanner(System.in);
        System.out.print("Input the 1st number:");
        int num1= num.nextInt();
        System.out.print("Input the 2nd number:");
        int num2= num.nextInt();
        System.out.print("Input the 3rd number:");
        int num3= num.nextInt();
        int greatestNum = Math.max(Math.max(num1, num2), num3);
        System.out.println("The greatest number is: " + greatestNum);



//EX3
        Random random = new Random();
        int Result = random.nextInt(7);
        System.out.println("Number:"+Result);
        switch(Result){

            case 1:
                System.out.print(" Sunday");
                break;
            case 2:
                System.out.print(" Monday");
                break;
            case 3:
                System.out.print(" Tuesday");
                break;
            case 4:
                System.out.print(" Wednesday");
                break;
            case 5:
                System.out.print(" Thursday");
                break;
            case 6:
                System.out.print(" Friday");
                break;
            case 7:
                System.out.print(" Saturday");
                break;


        }

//other solution takes input from the user
        System.out.print("Number:");
        Scanner sc = new Scanner(System.in);
        int nums=sc.nextInt();

        switch(nums){
            case 1:
                System.out.print(" Sunday");
                break;
            case 2:
                System.out.print(" Monday");
                break;
            case 3:
                System.out.print(" Tuesday");
                break;
            case 4:
                System.out.print(" Wednesday");
                break;
            case 5:
                System.out.print(" Thursday");
                break;
            case 6:
                System.out.print(" Friday");
                break;
            case 7:
                System.out.print(" Saturday");
                break;
            default:
                System.out.print("Enter a number to displays the name of weekday");

        }

//EX4
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your numeric score:");
        int grade = sc.nextInt();
        System.out.println("Numeric Score:"+ grade);
        if (grade>=90 && grade<=100){
            System.out.println("Letter Grade:A");
        }else if (grade<=89 && grade>=80){
            System.out.println("Letter Grade:B");}
        else if (grade<=79 && grade>=70){
            System.out.println("Letter Grade:C");}
        else if (grade<=69 && grade>=60){
            System.out.println("Letter Grade:D");}
        else if (grade<=59 && grade==0){
            System.out.println("Letter Grade:F");}
//EX5
        Scanner number = new Scanner(System.in);
        System.out.println("Please Enter your age: ");
        int age = number.nextInt();
        if(age < 13){System.out.print("You are a child");}
        else if(age >= 13 && age <= 19){System.out.print("You are a teenager");}
        else if (age >= 20){System.out.print("You are an adult");}





    }
}
