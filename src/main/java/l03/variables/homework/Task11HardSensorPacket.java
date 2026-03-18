package l03.variables.homework;

import java.math.BigDecimal;
import java.util.Scanner;

public class Task11HardSensorPacket {
    public static void main(String[] args) {
        int temperature = 45;//6
        int humidity = 100;//7
        int battery = 8;//4

        int packed = (temperature << (7+4)) | (humidity << 4) | battery;

        int unpackedBattery = packed & 0xF;
        int unpackedHumidity = (packed >> 4) & 0x7F;
        int unpackedTemperature = (packed >> 11) & 0x3F;

        System.out.printf("Original values : %n%20s : %d%n%20s : %d%n%20s : %d%n", "Temperature", temperature, "Humidity", humidity, "Battery", battery);

        System.out.println("Packed Integer:  " + packed);
        System.out.println("Binary representation of packed Integer: " + Integer.toBinaryString(packed));

        System.out.printf("Unpacked values : %n%20s : %d%n%20s : %d%n%20s : %d%n", "Unpacked Temperature", unpackedTemperature, "Unpacked Humidity", unpackedHumidity, "Unpacked Battery", unpackedBattery);

    }
}
