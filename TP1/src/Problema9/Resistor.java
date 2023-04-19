package Problema9;
public class Resistor {
    private String[] colorsTable;
    private double[] multiplierTable;
    private double[] toleranceTable;

    public Resistor() {
        colorsTable = new String[]{"black", "brown", "red", "orange", "yellow",
                "green", "blue", "violet", "gray", "white"};

        multiplierTable = new double[]{0.001, 0.01, 0.1, 1.0, 10.0, 100.0,
                1000.0, 10000.0, 100000.0, 1000000.0, 10000000.0};

        toleranceTable = new double[]{1.0, 2.0, 0.5, 0.25, 0.1, 0.05, 5.0, 10.0};
    }

    public double[] calculateResistorValue(String[] colors) {
        double[] valueAndTolerance = new double[2];

        int firstDigit = findIndex(colorsTable, colors[0]);
        int secondDigit = findIndex(colorsTable, colors[1]);
        double value = firstDigit * 10 + secondDigit;

        int multiplierIndex = findIndex(colorsTable, colors[2]);
        if (multiplierIndex >= 0 && multiplierIndex < multiplierTable.length) {
            double multiplier = multiplierTable[multiplierIndex];
            value *= multiplier;
        } else {

        }

        int toleranceIndex = findIndex(colorsTable, colors[3]);
        if (toleranceIndex >= 0 && toleranceIndex < toleranceTable.length) {
            double tolerance = toleranceTable[toleranceIndex];
            valueAndTolerance[1] = tolerance;
        } else {

        }

        valueAndTolerance[0] = value;
        return valueAndTolerance;
    }

    private int findIndex(String[] array, String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Resistor resistor = new Resistor();
        String[] colors = {"red", "violet", "green", "gold"};
        double[] resistanceAndTolerance = resistor.calculateResistorValue(colors);

        System.out.println("Resistance: " + resistanceAndTolerance[0] +
                " Ohms +-" + resistanceAndTolerance[1] + "%");
    }
}
