import java.util.Scanner;

public class SimpleNumbers{
    public  void start() {
        getAllPrimes();       
    }   

    //метод проверки числа на простое
    public static boolean isPrime(int num) {
        for (int j = 2; j < num; j++) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    } 
   //получить все простые числа
    public void getAllPrimes(){
	    int n = getNum();
        if (n < 2) {
            System.out.println("The input number must be greater than 2!");
        }
        else {
            for (int i = 2; i <= n; i++) {
                if (isPrime(i)) {
					printNum(i);
                }
            }
        }
    }
//Ввод
    public static int getNum() {
		System.out.print("Enter the number: ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
//Вывод
	public static void printNum(int n) {
		System.out.println(n);
	}
}