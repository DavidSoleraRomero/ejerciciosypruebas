
public class CasoPrueba {
    public static void main(String[] args) {
        try {
            System.out.println(areEquals("   ", "   "));
            System.out.println(areEquals("Ho La", "hola"));
            System.out.println(areEquals("$%$%", "$%$%"));
            System.out.println(areEquals("@", "@"));
            System.out.println(areEquals("a\\@123", "A\\@123"));
            System.out.println(areEquals("Buenos días José", "bueNos DíaS José"));
            System.out.println(areEquals("Buenos días Jose", "bueNos DíaS JosE "));
            System.out.println(areEquals("hola\thola", "hola hola"));
            System.out.println(areEquals("hola\nhola", "hola hola"));
            System.out.println(areEquals("   ", ""));
            System.out.println(areEquals("🎁regALo", "🎁ReGaLo"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean areEquals(String cadena1, String cadena2) throws Exception {
        if (cadena1 == null | cadena2 == null) {
            throw new Exception("No se admiten valores nulos");
        }
        return (cadena1.toLowerCase().equals(cadena2.toLowerCase()));
    }
}