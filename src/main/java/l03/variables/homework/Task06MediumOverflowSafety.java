package l03.variables.homework;

public class Task06MediumOverflowSafety {
    public static void main(String[] args) {
        int packageCounter = Integer.MAX_VALUE - 2;
        System.out.println("Start value : " + packageCounter);
        packageCounter +=1;
        System.out.println("First Add : packageCounter + 1 = " + packageCounter);
        packageCounter +=1;
        System.out.println("Second Add : packageCounter + 1 = " + packageCounter);
        //Overflow bas verir amma xeta vermeden menfi edede kecid edir
        packageCounter +=1;
        System.out.println("Third Add : packageCounter + 1 = " + packageCounter);
        int withAddExact = Integer.MAX_VALUE - 2;
        System.out.println("Start value : " + withAddExact);
        withAddExact = Math.addExact(withAddExact, 1);
        System.out.println("First Add with addExact : withAddExact + 1 = " + withAddExact);
        withAddExact = Math.addExact(withAddExact, 1);
        System.out.println("Second Add with addExact : withAddExact + 1 = " + withAddExact);
        //Overflow bas verir ve xeta mesaji gosterir
        withAddExact = Math.addExact(withAddExact, 1);
        System.out.println("Third Add with addExact : withAddExact + 1 = " + withAddExact);
    }
}
