package mx.com.operaciones;

public interface Operaciones {
    double suma(double numero1, double numero2);
    double resta(double numero1, double numero2);
    double multiplicacion(double numero1, double numero2);
    double division(double numero1, double numero2);
    // Método adicionado para teste do jenkins
    double subtracion(double num1, double num2);
}
