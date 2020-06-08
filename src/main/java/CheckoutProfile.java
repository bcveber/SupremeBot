public class CheckoutProfile {

    private String fullName;
    private String email;
    private String tel;
    private String address;
    private String zip;
    private String city;
    private String stateAbbrev;
    private String cardNum;
    private String monthExp;
    private String yearExp;
    private String cvv;

    public CheckoutProfile(String fullName, String email, String tel, String address, String zip, String city, String stateAbbrev, String cardNum, String monthExp, String yearExp, String cvv) {
        this.fullName = fullName;
        this.email = email;
        this.tel = tel;
        this.address = address;
        this.zip = zip;
        this.city = city;
        this.stateAbbrev = stateAbbrev;
        this.cardNum = cardNum;
        this.monthExp = monthExp;
        this.yearExp = yearExp;
        this.cvv = cvv;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateAbbrev() {
        return stateAbbrev;
    }

    public void setStateAbbrev(String stateAbbrev) {
        this.stateAbbrev = stateAbbrev;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getMonthExp() {
        return monthExp;
    }

    public void setMonthExp(String monthExp) {
        this.monthExp = monthExp;
    }

    public String getYearExp() {
        return yearExp;
    }

    public void setYearExp(String yearExp) {
        this.yearExp = yearExp;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
}
