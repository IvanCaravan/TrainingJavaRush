import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*task0();
        task1();
        task2();*/
        task3();
    }
    public static void task0() {
        String city = "Vologda"; /* As you can imagine, this city means a lot
        for
        me*/
        int a = 1, b = 2, c = 2;
        System.out.println(city);// and i want to share its name with you!
        System.out.println(a + "" + b);
    int q = 17;
    q++;
    q++;
    q--;
       int lastDigit = q % 10;
        System.out.println(lastDigit);
        String s1 = "Just";
        String s2 = "Do";
        String s3 = "It";
        String tagline = s1 + s2 + s3;
        System.out.println(tagline);

        int v = 4;
        String r = "2";
        String result = v + v + r + v;
        System.out.println(result); // The answer is...824!

        String na = "101";
        int numb = Integer.parseInt(na);
        System.out.println(numb + "2" + 3 + 2);
    }

    public static void task1() {
        int x = 2;
        int y = 4;
        int z = 0;
        String digits = x + y + "" + z; //напишите тут ваш код
        System.out.println(digits);

        String bigAmount = "500";
        String greatAmount = "10000";
        int hugeAmount = Integer.parseInt(bigAmount) + Integer.parseInt(greatAmount); /*сложение стринговых значений и складываем через Integer.parseInt */
        System.out.println(hugeAmount);

        String title = "Senior Lead Principal Software Engineer Data Architect";
        String degree = "In college, I Majored in Political Science and Minored in Religious Studies.";
        String career = "Experienced Team Leader with strong Organizational Skills and a Successful career in Management.";
        System.out.println("RESUME".toLowerCase());
        System.out.println(("TITLE: " + title).toLowerCase());
        System.out.println(("DEGREE: " + degree).toLowerCase());
        System.out.println(("CAREER: ".toLowerCase() + career));

        String caps = "if I type in caps ";
        String usa = "сша";
        System.out.println(usa.toUpperCase());
        System.out.println("Винни Пух".toUpperCase());
        System.out.println((caps + "they know I mean business").toUpperCase());
    }
    public static void task2() {
        Scanner scanner = new Scanner("Люблю тебя, Петра творенье,\n" +
                "Люблю твой строгий, стройный вид,\n" +
                "Невы державное теченье,\n" +
                "Береговой ее гранит");
        String s = scanner.nextLine();
        System.out.println(s);
    }
    public static void task3() {
         System.out.println(" Привет! Напиши своё имя и возраст.");
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        int age = console.nextInt();

        String swear = "везде побрито. Я с такими не общаюсь.";


        if (Objects.equals(name, "Никита"))
        {
            System.out.println(swear);
        }

        else {

            System.out.println("Привет, " + name + "! Я - Java Machine");
            System.out.println("Приятно познакомиться! Молодо выглядишь для своих " + age + ")");
            System.out.println("Ты - музыкант?");

            Scanner key = new Scanner(System.in);
            String harsh = "Ты кого тут надурить пытаешься? Говори на чём играешь, ЖИВО!";
            String cool = "Круто)) Как называется твой инструмент?";

            String answer = key.nextLine();
            if (Objects.equals(answer, "нет")) {
                System.out.println(harsh);
            } else {
                System.out.println(cool);
            }


            Scanner keyboard = new Scanner(System.in);
            String inst = keyboard.nextLine();
            System.out.println(" Хотел бы я услышать, как звучит " + inst + " , будь я человеком как ты...");

        }

    }
}