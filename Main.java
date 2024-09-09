import java.util.*;
class Main {
  public static void main(String[] args) {
    System.out.println("UTSA - FALL 2022 - CS1083 - Section 001 - Project I - RowdyNCalculator - written by David Findlator");
     int Num1;
        int Num2;
        double db1;
        double db2;
       
        String choIce;
        int input;
        int n;
        double sum = 0;
       
        int ansInt;
        double ansDb;
         
        char data;
        char operator;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, input the number of calculations you want to perform = ");
            input = sc.nextInt();
            
         for(n=1; n<= input; n++){//loops for the number inputed
                System.out.println("Operation number " + n); 
                System.out.print("Please select your choice of Datatype of operation (i- integer, d- double) = ");
                data = sc.next().charAt(0);
            if ((data == 'i') || (data == 'd')){
            if (data == 'i'){  choIce = "integer";//chossing the data type 
              System.out.print("Please input the first " + choIce + " value: ");
              Num1 = sc.nextInt();
              System.out.print("Please input the character of the operation (+, -, *, /, %)");
              operator = sc.next().charAt(0);
              System.out.print("Please input the second " + choIce + " value: ");
              Num2 = sc.nextInt();
               
  
             if (operator == '+'){ 
               ansInt = Num1 + Num2;
               System.out.print("The result of addition operation of " + Num1 + " by " + Num2 + " is = ");
               System.out.print(ansInt);
               sum = sum + ansInt;
               System.out.println();}

             else if (operator == '-'){
               ansInt = Num1 - Num2;   
               System.out.print("The result of subtraction operation of " + Num1 + " by " + Num2 + " is = ");
               System.out.print(ansInt);
               sum = sum + ansInt;
               System.out.println();
             }
             else if (operator == '*'){
               ansInt = Num1 * Num2;
               System.out.print("The result of multiplication operation of " + Num1 + " by " + Num2 + " is = ");
               System.out.print(ansInt);
               sum = sum + ansInt;
               System.out.println();
             }
                  else if (operator == '/'){
                    ansInt = Num1 / Num2;
                    System.out.print("The result of division operation of " + Num1 + " by " + Num2 + " is = ");
                    System.out.print(ansInt);
                    sum = sum + ansInt;
                    System.out.println();
                  }
                  else if (operator == '%'){
                    ansInt = Num1 % Num2;
                    System.out.print("The result of modulo operation of " + Num1 + " by " + Num2 + " is = ");
                    System.out.print(ansInt);
                    sum = sum + ansInt;
                    System.out.println();
                  }
                  else{ 
                     System.out.println ("Wrong operator");}//choosing problem method for integer if they choose something not there wrong operator prints 
                  
                     
                         }else {  choIce = "double";
                            System.out.print("Please input the first " + choIce + " value = ");
                              db1 = sc.nextDouble();
                          System.out.print("Please input the character of the operation (+, -, *, /, %)");
                          operator = sc.next().charAt(0);
                           System.out.print("Please input the second " + choIce + " value = ");
                         db2 = sc.nextDouble();
                         
                         
                         
                   if (operator == '+'){ 
                    ansDb = db1 + db2;
                    System.out.print("The result of addition operation of " + db1 + " by " + db2 + " is = ");
                     System.out.printf("%.3f",ansDb);
                     sum = sum + ansDb;
                   System.out.println();
                         }
                   
                   else if (operator == '-'){
                    ansDb = db1 - db2;
                    System.out.print("The result of subtraction operation of " + db1 + " by " + db2 + " is = ");
                     System.out.printf("%.3f",ansDb);
                     sum = sum + ansDb;
                   System.out.println();
                        }
                   
                   else if (operator == '*'){
                    ansDb = db1 * db2;
                    System.out.print("The result of multiplication operation of " + db1 + " by " + db2 + " is: ");
                     System.out.printf("%.3f",ansDb);
                     sum = sum + ansDb;
                   System.out.println();
                        }
                   
                   else if (operator == '/'){
                    ansDb = db1 / db2;
                    System.out.print("The result of division operation of " + db1 + " by " + db2 + "is = ");
                     System.out.printf("%.3f",ansDb);
                     sum = sum + ansDb;
                   System.out.println();
                        }
                   
                   else if (operator == '%'){
                    ansDb = db1 % db2;
                    System.out.print("The result of modulo operation of " + db1 + " by " + db2 + " is = ");
                     System.out.printf("%.3f",ansDb);
                     sum = sum + ansDb;
                   System.out.println();
                        }
                   
                   else{ 
                     System.out.println ("Wrong operator");//same thing but for doubles 
                            } 
                         }
                            
                    }else { 
                            System.out.println ("Wrong datatype");
                        }
              
                    }
         System.out.println("Thank you for using the RowdyNCalculator");
         System.out.print("The sum of the result of all " + input + " operations is = ");
         System.out.printf("%.3f",sum);
         System.out.println();
                    }
}