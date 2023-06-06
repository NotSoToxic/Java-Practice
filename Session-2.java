import java.util.Scanner;

class MiddleDigigitDivisibleby3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3 digit number: ");

          
            int num = sc.nextInt();
            int length= String.valueOf(num).length();
            int middleDigit = num / 10 % 10;
            if(length==3){
                boolean isDivisibleBy3 = middleDigit % 3 == 0;
                if (isDivisibleBy3) {
                    System.out.println("The middle digit of the number is divisible by 3.");
                } else {
                    System.out.println("The middle digit of the number is not divisible by 3.");
                }
            }
            else{
                System.out.printf("invalid digits");
            }

            }
            
    
           
        }
    }
    sc.close();
}
