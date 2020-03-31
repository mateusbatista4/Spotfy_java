package app;

public class App {
    public static void main(String[] args) throws Exception {
        String str1 = "A";
String str2 = "B";

int comp = str1.compareTo(str2);

if(comp < 0) {
  System.out.println("str1 menor que str2");
} else if(comp > 0) {
  System.out.println("str1 maior que str2");
} else {
  System.out.println("str1 e str2 são iguais");
}
    }
}