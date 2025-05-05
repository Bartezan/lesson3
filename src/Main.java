public class Main {
    public static void main(String[] args) {
        //task 1
        byte catMini = 6;
        int cat = 8;
        short catSmall = 9;
        long catBig = 100;
        float dog = 10.9f;
        double dogBig = 100.232d;
        System.out.println("Значение переменной catMini с типом Byte равно "+catMini);
        System.out.println("Значение переменной catSmall с типом Short равно "+catSmall);
        System.out.println("Значение переменной cat с типом int равно "+cat);
        System.out.println("Значение переменной catBig с типом long равно "+catBig);
        System.out.println("Значение переменной dog с типом float равно "+dog);
        System.out.println("Значение переменной dogBig с типом double равно "+dogBig);
        //task 2
        float sample1 =27.12f;
        long sample2 =987_678_965_549L;
        float sample3 =2.786f;
        short sample4 =569;
        short sample5 =-159;
        short sample6 =27897;
        short sample7 =67;
        //task 3
        byte lpClass =23;
        byte asClass =27;
        byte eaClass =30;
        short list =480;
        int result1;
        result1 = list/(lpClass+asClass+eaClass);
        System.out.println("На каждого ученика расчитано "+result1+" листов бумаги");
        //task 4
        byte twoMinBottle = 16;
        int twentyMinBottle = twoMinBottle*10;
        int dayBottle = 24*60*(twoMinBottle/2);
        int day3Bottle =dayBottle*3;
        int monthBottle =dayBottle*30;
        System.out.println("За 20 минут машина произвела "+twentyMinBottle+" штук бутылок");
        System.out.println("За сутки машина произвела "+dayBottle+" штук бутылок");
        System.out.println("За 3 дня машина произвела "+day3Bottle+" штук бутылок");
        System.out.println("За месяц машина произвела "+monthBottle+" штук бутылок");
        //task 5
        byte canPaint = 120;
        int canWhite;
        int canBrown;
        byte canWhiteOnClass = 2;
        byte canBrownOnClass = 4;
        int canOnClass = canBrownOnClass+canWhiteOnClass;
        canWhite = canPaint/canOnClass*canWhiteOnClass;
        canBrown = canPaint/canOnClass*canBrownOnClass;
        int numberOfClasses;
        numberOfClasses=canPaint/canOnClass;
        System.out.println("В школе, где "+numberOfClasses+" классов, нужно "+canWhite+" ,банок белой краски и "+canBrown+" банок коричневой краски");
        //task 6
        byte numberBanan = 5;
        byte weghtBanan =80;
        int numberMilk=2;
        byte weight100Milk = 105;
        byte numberIceCream = 2;
        byte weightIceCream =100;
        byte numberEgg = 4;
        byte weightEgg=70;
        int resultGramm;
        float resultKgramm;
        resultGramm=numberBanan*weghtBanan+numberMilk*weight100Milk+numberIceCream*weightIceCream+numberEgg*weightEgg;
        resultKgramm =resultGramm/1000;
        System.out.println("Вес завтрака в граммах "+resultGramm);
        System.out.println("Вес завтрака в килограммах "+resultKgramm);
        //task7
        int mass1 = 7000;
        int mass2 = 250;
        int mass3 = 500;
        int avgMass = (mass2+mass3)/2;
        int day1 = mass1/mass2;
        int day2 = mass1/mass3;
        int dayAvg =mass1/avgMass;
        System.out.println("При потере 250 грамм в день понадобится "+day1+" дней");
        System.out.println("При потере 500 грамм в день понадобится "+day2+" дней");
        System.out.println("При потере в среднем "+avgMass+" грамм в день понадобится "+dayAvg+" дней");
        //task8
        int mPay =67760;
        int dPay =83690;
        int kPay =76230;
        float mNewPay = mPay*1.1f;
        float dNewPay = dPay*1.1f;
        float kNewPay = kPay*1.1f;
        int mYearPay =mPay*12;
        int dYearPay =dPay*12;
        int kYearPay =kPay*12;
        float mYearNewPay=mNewPay*12;
        float dYearNewPay=dNewPay*12;
        float kYearNewPay=kNewPay*12;
        float mDiffPay=mYearNewPay-mYearPay;
        float dDiffPay=dYearNewPay-dYearPay;
        float kDiffPay=kYearNewPay-kYearPay;
        System.out.println("Маша теперь получает "+mNewPay+" рублей. Годовой доход вырос на "+mDiffPay+" рублей");
        System.out.println("Денис теперь получает "+dNewPay+" рублей. Годовой доход вырос на "+dDiffPay+" рублей");
        System.out.println("Кристина теперь получает "+kNewPay+" рублей. Годовой доход вырос на "+kDiffPay+" рублей");
    }
}