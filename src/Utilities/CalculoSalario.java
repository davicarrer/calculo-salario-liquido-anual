package Utilities;

public class CalculoSalario {
    public static Double calculaSalario(Double salarioBruto){
        double salarioDescontadoINSS;
        if(salarioBruto > 0 && salarioBruto <= 1212.0){
            salarioDescontadoINSS = salarioBruto*(0.925);
        } else if (salarioBruto <=2427.35){
            salarioDescontadoINSS = salarioBruto*0.91;
        } else if (salarioBruto <= 3641.03) {
            salarioDescontadoINSS = salarioBruto*0.88;
        } else if (salarioBruto <= 7087.22) {
            salarioDescontadoINSS = salarioBruto*0.86;
        } else {
            salarioDescontadoINSS = salarioBruto - 900; //teto
        }
        return (salarioDescontadoINSS*13); //11 meses trabalho + 1 mes ferias + 13 com desconto de INSS
    }

}
