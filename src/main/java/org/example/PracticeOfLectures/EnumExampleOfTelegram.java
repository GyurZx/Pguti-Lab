package org.example.PracticeOfLectures;

public class EnumExampleOfTelegram {
    EnumDay day;

    public EnumExampleOfTelegram(EnumDay day) {
        this.day = day;
    }
    public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                System.out.println("Monday are bad:/");
            case FRIDAY:
                System.out.println("Friday are better!");
            case SATURDAY: case SUNDAY:
                System.out.println("Weekend are good!");
            default:
                System.out.println("Midweek days are so-so.");
        }
    }
    public static void main(String[] args) {
        EnumExampleOfTelegram firstDay = new EnumExampleOfTelegram(EnumDay.MONDAY);
        firstDay.tellItLikeItIs();
        EnumExampleOfTelegram thirdDay = new EnumExampleOfTelegram(EnumDay.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        EnumExampleOfTelegram fifthDay = new EnumExampleOfTelegram(EnumDay.FRIDAY);
        fifthDay.tellItLikeItIs();
        EnumExampleOfTelegram sixthDay = new EnumExampleOfTelegram(EnumDay.SUNDAY);
        sixthDay.tellItLikeItIs();
    }
}
