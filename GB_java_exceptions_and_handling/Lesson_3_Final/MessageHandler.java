public class MessageHandler {
    public static void processEnteredData(String[] userData) {
        int errorCount = 0;
        if (userData.length != 6) {
            System.out.println("You have entered more or fewer data than required, please enter the string again");
            errorCount++;
        } else {
            if (!userData[0].matches("[а-яА-Яa-zA-Z]+")) {
                System.out.println("Invalid last name entered, please enter the string again");
                errorCount++;
            }
            if (!userData[1].matches("[а-яА-Яa-zA-Z]+")) {
                System.out.println("Invalid first name entered, please enter the string again");
                errorCount++;
            }
            if (!userData[2].matches("[а-яА-Яa-zA-Z]+")) {
                System.out.println("Invalid middle name entered, please enter the string again");
                errorCount++;
            }
            DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
            try {
                df.parse(userData[3]);
            } catch (ParseException e) {
                System.out.println("Invalid date format, please enter the string again");
                errorCount++;
            }
            try {
                Long.parseLong(userData[4]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid phone number format, please enter the string again");
                errorCount++;
            }
            if (!userData[5].equalsIgnoreCase("f") && !userData[5].equalsIgnoreCase("m")) {
                System.out.println("Invalid gender entered, please enter the string again");
                errorCount++;
            }
        }
        if (errorCount == 0) {
            StringBuilder text = new StringBuilder();
            for (int i = 0; i < userData.length; i++) {
                if (i == userData.length - 1) {
                    text.append(userData[i]);
                } else {
                    text.append(userData[i]).append(" ");
                }
            }
            FileHandler.createFile(text.toString(), userData[0]);
        }
    }
}