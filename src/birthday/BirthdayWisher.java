package birthday;

import java.time.LocalDate;

public class BirthdayWisher {
	public static void sendBirthdayWish(String friendName, LocalDate friendBirthday) {
        // Get current date
        LocalDate currentDate = LocalDate.now();

        // Check if today is the friend's birthday
        if (currentDate.getMonth() == friendBirthday.getMonth() && 
            currentDate.getDayOfMonth() == friendBirthday.getDayOfMonth()) {
            System.out.println("Happy Birthday, " + friendName + "! 🎉🎂");
        } else {
            System.out.println("Today is not " + friendName + "'s birthday. 😊");
        }
    }

    public static void main(String[] args) {
        // Example usage:
        String friendName = "Nikhil";
        LocalDate friendBirthday = LocalDate.of(2024, 4, 23); // Example birthday (year, month, day)
        
        // Send birthday wish
        sendBirthdayWish(friendName, friendBirthday);
    }
}
