import javax.swing.JOptionPane;

public class CurrencyExchangeGUI {
    public static void main(String[] args) {
        // รับค่าจำนวนเงิน (รับเป็น String แล้วแปลงเป็น int)
        String moneyInput = JOptionPane.showInputDialog("Input your Money :");
        int money = Integer.parseInt(moneyInput);

        // รับค่าประเทศ
        String country = JOptionPane.showInputDialog("Input Country to Exchange:\nJapan (Type j) or Vietnam (Type v)");

        final double RATE_VIETNAM = 0.0012;
        final double RATE_JAPAN = 0.20;
        double resultThaiBaht;

        // ใช้ Switch แบบใหม่ (Java 14+)
        switch (country.toLowerCase()) { // ใช้ .toLowerCase() เพื่อให้รองรับทั้งตัวพิมพ์เล็ก/ใหญ่
            case "j" -> {
                resultThaiBaht = money * RATE_JAPAN;
                JOptionPane.showMessageDialog(null, money + " JPY = " + resultThaiBaht + " Baht");
            }
            case "v" -> {
                resultThaiBaht = money * RATE_VIETNAM;
                JOptionPane.showMessageDialog(null, money + " VND = " + resultThaiBaht + " Baht");
            }
            default -> JOptionPane.showMessageDialog(null, "You entered an incorrect country", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}