import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("現在の日付: " + date);
        System.out.println("現在の時刻: " + time);
        System.out.println("現在の日付と時刻: " + dateTime);

        DateTimeFormatter usFmt = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        String formatted = dateTime.format(usFmt);
        System.out.println("アメリカ式フォーマットの日付と時刻: " + formatted);
        LocalDateTime parsed = LocalDateTime.parse(formatted, usFmt);
        System.out.println("解析された日付と時刻: " + parsed);
        LocalDateTime twoDaysLater = parsed.plusDays(2);
        System.out.println("二日後の日付と時刻: " + twoDaysLater);

        ZonedDateTime zoned = ZonedDateTime.now();
        ZonedDateTime zonedRome = zoned.withZoneSameInstant(ZoneId.of("Europe/Rome"));
        System.out.println("現在のタイムゾーン付き日付と時刻: " + zoned);
        System.out.println("ローマのタイムゾーン付き日付と時刻: " + zonedRome);
    }
}
