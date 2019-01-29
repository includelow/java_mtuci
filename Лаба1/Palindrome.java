import java.util.Scanner;
public class Palindrome {
    public void start(){
        Scanner scan = new Scanner(System.in);
		System.out.println("Type the word");
        String s=scan.next();
        isPalindrome(s);
    }
    //На вход получаем строку, формируем новую строку, 
	//посимвольно копируем в обратном порядке строку s в строку r и возвращаем строку r
    private static String reverseString(String s){
        String r = "";
		 // берем символы исходной строки с конца строки до начала
         // и добавляем ее в начала строки-результата (переменная r)
        for (int i = s.length()-1; i >= 0; --i)
            r += s.charAt(i);
        return r;
    }
	//Для проверки равенства строк использум метод equals
    private static Boolean isPalindrome(String s) {
        if(s.equals(reverseString(s))){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
        return s.equals(reverseString(s));
    }
}
