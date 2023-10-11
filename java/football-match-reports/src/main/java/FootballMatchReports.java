public class FootballMatchReports {

    public static String onField(int shirtNum) {
        // task 1: Output descriptions of payers based on their shirt //#

        if (shirtNum > 11 || shirtNum < 1) {
            throw new IllegalArgumentException("Your shirt number is out of range.");
        } else {
            // declare an empty string variable for our positionValue
            String positionValue = "";
            // given the shirtNum value, match it with the position value
            switch (shirtNum) {
                case 1:
                    positionValue = "goalie";
                    break;
                case 2:
                    positionValue = "left back";
                    break;
                case 3:
                case 4:
                    positionValue = "center back";
                    break;
                case 5:
                    positionValue = "right back";
                    break;
                case 6:
                case 7:
                case 8:
                    positionValue = "midfielder";
                    break;
                case 9:
                    positionValue = "left wing";
                    break;
                case 10:
                    positionValue = "striker";
                    break;
                case 11:
                    positionValue = "right wing";
                    break;
                default:
                    positionValue = "";
                    break;

            }

            return positionValue;
        }

        // throw new UnsupportedOperationException("Please implement the (static)
        // FootballMatchReports.onField() method");
    }
}
