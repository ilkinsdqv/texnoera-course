package l03.variables.homework;

public class Task08MediumPermissionFlags {
    public static void main(String[] args) {
        final int READ = 1;
        final int WRITE = 2;
        final int EXPORT = 4;
        final int AUDIT = 8;

        int mask = READ | WRITE;
        System.out.println("At start : " + mask);
        boolean hasPermissionRead = (mask & READ) != 0;
        boolean hasPermissionWrite = (mask & WRITE) != 0;
        boolean hasPermissionExport = (mask & EXPORT) != 0;
        boolean hasPermissionAudit = (mask & AUDIT) != 0;

        System.out.println("hasPermissionRead: " + hasPermissionRead);
        System.out.println("hasPermissionWrite: " + hasPermissionWrite);
        System.out.println("hasPermissionExport: " + hasPermissionExport);
        System.out.println("hasPermissionAudit: " + hasPermissionAudit);

        mask |= EXPORT;
        System.out.println("After |= export : " + mask);
        mask &= ~WRITE;
        System.out.println("After &= write : " + mask);
        mask ^= AUDIT;
        System.out.println("After ^= audit : " + mask);

        System.out.println("Decimal form of final mask : " + mask);
        System.out.println("Binary form of final mask : " + Integer.toBinaryString(mask));

    }
}
