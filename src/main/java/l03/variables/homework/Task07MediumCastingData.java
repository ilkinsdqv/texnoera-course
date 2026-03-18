package l03.variables.homework;

public class Task07MediumCastingData {
    public static void main(String[] args) {
        double d = 127.85;
        int i = (int) d;
        System.out.println("127.85 casted to int : " + i);
        int a = 130;
        byte b = (byte) a;
        System.out.println("130 casted to byte : " + b);
        byte sensor1 = 60;
        byte sensor2 = 70;
        int sensorSum = sensor1 + sensor2;
        System.out.println("Sum stored in int : " + sensorSum);
        byte sensorSumWithByte = (byte) (sensor1 + sensor2);
        System.out.println("Sum casted to byte : " + sensorSumWithByte);

    }
}
