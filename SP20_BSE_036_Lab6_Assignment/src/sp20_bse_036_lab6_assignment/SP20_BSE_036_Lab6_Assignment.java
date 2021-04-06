package sp20_bse_036_lab6_assignment;
import java.util.Scanner;
public class SP20_BSE_036_Lab6_Assignment {
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in); 
       System.out.println("Select following number to do calculator operations"+ "\n"+
               "1: Select 1 to do Addition"+"\n"+
               "2: Select 2 to do Multiplication"+"\n"+
               "3: Select 3 to do division"+ "\n"+
               "4: Select 4 to find sin value "+ "\n"+
               "5: Select 5 to find cos value "+ "\n"+
               "6: Select 6 to find modulus "+"\n"+
               "please enter your selection");
       int  choice=input.nextInt();
       
        switch (choice) {
            case 1:                {
                    System.out.println("enter the first number");
                    int num1=input.nextInt();
                    System.out.println("enter the second number");
                    int num2=input.nextInt();
                    Calculator.sum(num1, num2);
                    System.out.println(num1+"+"+num2+ "="+Calculator.sum);
                    break;
                }
            case 2:              {
                    System.out.println("enter the first number");
                    int num1=input.nextInt();
                    System.out.println("enter the second number");
                    int num2=input.nextInt();
                    Calculator.multiply(num1, num2);
                    System.out.println(num1+"*"+num2+ "="+Calculator.multiply);
                    break;
                }
            case 3:              {
                    System.out.println("enter the first number");
                    int num1=input.nextInt();
                    System.out.println("enter the second number");
                    int num2=input.nextInt();
                    Calculator.divide(num1, num2);
                    System.out.println(num1+"/"+num2+ "="+Calculator.division);
                    break;
                }
            case 4:               {
                    System.out.println("enter the number in degree");
                    int num1=input.nextInt();
                    Calculator.sin(num1);
                    System.out.println("Sin"+num1+"="+Calculator.sin_value);
                    break;
                }
            case 5 :              {
                    System.out.println("enter the number in degree");
                    int num1=input.nextInt();
                    Calculator.cos(num1);
                    System.out.println("Cos"+num1+"="+Calculator.cos_value);
                    break;
                }
            
            case 6:{
                     System.out.println("enter the first number");
                    int num1=input.nextInt();
                    System.out.println("enter the second number");
                    int num2=input.nextInt();
                    Calculator.modulus(num1, num2);
                    System.out.println(num1+"%"+num2+ "="+Calculator.modulus);
                    break;
            }
            default:
                System.out.println("OOPS!! Wrong Choice");
                break;
            }
        }
       }
          
        
    
    
