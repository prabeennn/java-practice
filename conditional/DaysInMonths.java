class DaysInMonths 
{
    public static void main(String[] args) {
        int year = 2024;
        int month = 2;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                System.out.println("31 days in this month");
            }
            break;

            case 4:
            case 6:
            case 9:
            case 11: {
                System.out.println("30 days in this month");
            }
            break;

            case 2: {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                    System.out.println("29 days in this month");
                else
                    System.out.println("28 days in this month");
            }
            break;

            default:
                System.out.println("enter valid month");
        }
    }
}
