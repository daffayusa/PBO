package implementasi.phone;

public class CellphoneMain {
    public static void main(String[] args) {
        Cellphone cp = new Cellphone("Vivo", "V19");
        cp.powerOn();
        cp.chargeBattery(50);
        cp.showInfo();
        cp.addContact("Naruto", "08896715512");
        cp.addContact("Sanji", "086455327334");
        cp.showContact();
        cp.topUpPulsa(35000);
        System.out.println("Sisa pulsa: " + cp.checkPulsa());
        cp.searchContact("Naruto");
        cp.searchContact("Sinji");
        cp.deleteContact("Naruto");
        cp.showContact();
        cp.powerOff();

    }
}
