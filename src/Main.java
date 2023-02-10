public class Main {
    public static void main(String[] args) {
        task0();
        task1();
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
}