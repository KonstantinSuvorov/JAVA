/*
    Вычисление веса на Луне.
    Присвоить исходному файлу имя Moon.java.
*/
class Moon {
    public static void main(String args[]) {
    double earthweight; // Вес на Земле
    double moonweight; // Вес на Луне
    earthweight = 165;
    moonweight = earthweight * 0.17;
    System.out.println(earthweight + " earth-pounds is equivalent to " + moonweight + " moon-pounds.");
    }
}
