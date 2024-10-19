public class Main {

    public static void main(String[] args) {


        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        // Задание 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задание 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задание 4
        var friend = 19;
        friend = (friend + 2) / 7;
        System.out.println(friend);

        //Задание 5
        var frog = 3.5;
        frog = (frog * 10) / 3.5 + 4;
        System.out.println(frog);

        //Задание 6
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var result = boxer1 + boxer2;
        System.out.println("boxer1 + boxer2 = " + result);
        var difference = boxer2 - boxer1;
        System.out.println("boxer1 - boxer2 = " + difference);

        //Задание 7
        var modulo = boxer2 % boxer1;
        System.out.println("boxer1 % boxer2 = " + modulo);

        //Задание 8
        var time = 640;
        var worktime = 8;
        var workers = time / worktime;
        System.out.println("Всего работников в компании — " + workers + " человек");

        var workers2 = workers + 94;
        var hours = time / workers2;
        System.out.println("Если в компании работает " + workers2 + " человек, то всего "+ hours + " часов работы может быть поделено между сотрудниками");

    }
}
