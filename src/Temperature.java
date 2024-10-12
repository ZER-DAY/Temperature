public class Temperature {

    private double valueTempInCelsius; // قيمة درجة الحرارة، يتم تخزينها الآن كنسبة مئوية


    public double getTempInCelsius(){
        return valueTempInCelsius;
    }

    public double getTemperatureToKelvin(){
        return (valueTempInCelsius * (373.15 - 273.15)) / 100 + 273.15;
    }

    public double getTemperatureToFahrenheit(){
        return (valueTempInCelsius * (212 - 32)) / 100 + 32;
    }

    // المُنشئ الذي يأخذ قيمة درجة الحرارة بالنسبة المئوية
    private Temperature(double valvalueTempInCelsiusue) {
        // لا يوجد تحقق من الحدود هنا، القيم السالبة مقبولة الآن
        this.valueTempInCelsius = valvalueTempInCelsiusue;
    }

    public static Temperature temperatureToCelsius(double valueTempInCelsius){
        return new Temperature(valueTempInCelsius);
    }

    public static Temperature temperatureToKelvin(double valueTempInKelvin){
        return new Temperature(valueTempInKelvin - 273.15);
    }
    // تحويل القيمة المئوية إلى سلسيوس

    public static Temperature temperatureToFahrenheit(double valueTempInFahrenheit){
        return new Temperature((valueTempInFahrenheit - 32) * 5/9);
    }

    public Temperature convertToCelsius() {
        return new Temperature(this.valueTempInCelsius);
    }


    // تحويل القيمة المئوية إلى كلفن
    public Temperature convertToKelvin() {
        return new Temperature(this.valueTempInCelsius);
    }

    // تحويل القيمة المئوية إلى كلفن
    public Temperature convertToFahrenheit() {
        return new Temperature(this.valueTempInCelsius);
    }


    // مقارنة بين درجتي الحرارة حسب قيمتهما بالنسبة المئوية
    public int compare(Temperature other) {
        return Double.compare(this.valueTempInCelsius, other.valueTempInCelsius);
    }

    // طرح درجة حرارة أخرى (بالنسبة المئوية) من درجة الحرارة الحالية
    public double subtract(Temperature other) {
        return this.valueTempInCelsius - other.valueTempInCelsius;
    }

    // إنشاء درجة حرارة جديدة عن طريق إضافة قيمة إزاحة إلى القيمة الحالية بالنسبة المئوية
    public Temperature createNewTemperature(double offset) {
        double newValue = this.valueTempInCelsius + offset;
        return new Temperature(newValue);
    }

    // إعادة تعريف دالة toString لعرض درجة الحرارة كنسبة مئوية
    @Override
    public String toString() {
        return String.format("%.2f%%", valueTempInCelsius);
    }
}
