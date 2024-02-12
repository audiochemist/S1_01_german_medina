public class User implements Comparable<User> {

    final private String NAME;
    final private String SURNAME;

    final private String DNI;

    public User(String NAME, String SURNAME, String DNI) {
        this.NAME = NAME;
        this.SURNAME = SURNAME;
        this.DNI = DNI;
    }

    public String getNAME() {
        return NAME;
    }

    public String getSURNAME() {
        return SURNAME;
    }

    public String getDNI() {
        return DNI;
    }


    @Override
    public int compareTo(User otherUser) {
        int compareResult = 0;
        String first8Characters;
        String otherFirst8Characters;
        int dniAsInteger;
        int otherDniAsInteger;
        switch (App.toCompareOption) {

            case 1:
                compareResult = NAME.compareTo(otherUser.NAME);
                break;
            case 2:
                compareResult = otherUser.NAME.compareTo(NAME);
                break;
            case 3:
                compareResult = SURNAME.compareTo(otherUser.SURNAME);
                break;
            case 4:
                compareResult = otherUser.SURNAME.compareTo(SURNAME);
                break;
            case 5:
                first8Characters = DNI.substring(0, 8);
                dniAsInteger = Integer.parseInt(first8Characters);
                otherFirst8Characters = otherUser.DNI.substring(0, 8);
                otherDniAsInteger = Integer.parseInt(otherFirst8Characters);
                compareResult = Integer.compare(otherDniAsInteger, dniAsInteger);
                break;
            case 6:
                first8Characters = DNI.substring(0, 8);
                dniAsInteger = Integer.parseInt(first8Characters);
                otherFirst8Characters = otherUser.DNI.substring(0, 8);
                otherDniAsInteger = Integer.parseInt(otherFirst8Characters);
                compareResult = Integer.compare(dniAsInteger, otherDniAsInteger);
                break;
        }
        return compareResult;

    }

}
