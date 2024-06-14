

public class InterpretateIMC {
    public static String interpretator(double imc) {
        if (imc < 18.5) {
            return "Under weight";
        } else if (imc < 24.9) {
            return "Normal weight";
        } else if (imc < 29.9) {
            return "Over weight";
        } else {
            return "Obesity";
        }
    }
}