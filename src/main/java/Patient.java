public class Patient {
    static public void main (String[]args) {

    }
        String givenName;
        String familyName;
        String hseNumber;
        int Age;


    public Patient(String givenName, String familyName, String hseNumber, int Age){
            this.givenName = givenName;
            this.familyName = familyName;
            this.hseNumber = hseNumber;
            this.Age = Age;

        }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getHseNumber() {
        return hseNumber;
    }

    public void setHseNumber(String hseNumber) {
        this.hseNumber = hseNumber;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}