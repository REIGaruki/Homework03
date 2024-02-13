public class Main {
    public static void main(String[] args) {
        int i = 100500;
        byte b = 17;
        short sh = 999;
        long l = 123456789L;
        float bottle = (float) 1.5;
        double pi = 3.14159265358979323846264338327950288419716939937510;
        System.out.println("Значение переменной "+"i"+" с типом "+"int"+" равно "+i);
        System.out.println("Значение переменной "+"b"+" с типом "+"byte"+" равно "+b);
        System.out.println("Значение переменной "+"sh"+" с типом "+"short"+" равно "+sh);
        System.out.println("Значение переменной "+"l"+" с типом "+"long"+" равно "+l);
        System.out.println("Значение переменной "+"botle"+" с типом "+"float"+" равно "+bottle);
        System.out.println("Значение переменной "+"pi"+" с типом "+"double"+" равно "+pi);

        float var1 = 27.12f;
        long var2 = 987678965549L;
        double var3 = 2.786;
        short var4 = 569;
        short var5 = -159;
        int var6 = 27897;
        byte var7 = 67;

        byte lyudmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short paperSum = 480;
        short paperForPupil = (short) (paperSum / (lyudmilaPavlovna + annaSergeevna + ekaterinaAndreevna));
        System.out.println("На каждого ученика рассчитано "+paperForPupil+" листов бумаги.");

        int bottleCount = 16;
        int progressTime = 2;
        byte bottlePerMinute = (byte) (bottleCount/progressTime);
        System.out.println("За две минуты машина производит "+bottleCount+" бутылок.");
        progressTime = 20;
        bottleCount = progressTime * bottlePerMinute;
        System.out.println("За двадцать минут машина произвела "+bottleCount+" бутылок.");
        progressTime = 60 * 24;
        bottleCount = progressTime * bottlePerMinute;
        System.out.println("За сутки машина произвела "+bottleCount+" бутылок.");
        progressTime = 60 * 24 * 3;
        bottleCount = progressTime * bottlePerMinute;
        System.out.println("За три дня машина произвела "+bottleCount+" бутылок.");
        progressTime = 60 * 24 * 31;
        bottleCount = progressTime * bottlePerMinute;
        System.out.println("За январь машина произвела "+bottleCount+" бутылок.");

        byte paintWhite = 2;
        byte paintBrown = 4;
        byte paintWholeSchool = 120;
        byte classRoomCount = (byte) (paintWholeSchool / (paintBrown + paintWhite));
        // тут я не понимаю
        // все переменные типа byte,
        // но IDEA требует ПРИСВОИТЬ для конечного результата операции тип byte
        // почему результату умножения\деления присваивается тип int?
        // или не int, а double?
        paintWhite = (byte) (classRoomCount * paintWhite);
        paintBrown = (byte) (classRoomCount * paintBrown);
        System.out.println("В школе где "+classRoomCount+" классов, нужно "+paintWhite+" банок белой краски и "
                +paintBrown+" банок коричневой краски");

        short bananaWeight = 80;
        float milkWeight = (float) 105 / 100;
        short iceCreamWeight = 100;
        short eggWeight = 70;
        float breakfastWeight = bananaWeight * 5 + milkWeight * 200 + iceCreamWeight * 2 + eggWeight * 4;
        System.out.println("Спортсмен съедает на завтрак " + (int) (breakfastWeight) + " грамм пищи");
        breakfastWeight = breakfastWeight / 1000;
        System.out.println("Спортсмен съедает на завтрак " + breakfastWeight + " килограмм пищи");



    }
}