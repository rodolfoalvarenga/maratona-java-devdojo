package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salário > 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 para o DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        String resultado;

//        if (salario > 5000) {
//            resultado = mensagemDoar;
//        } else {
//            resultado = mensagemNaoDoar;
//        }
//
//        System.out.println(resultado);

        // operador ternário (condicao) ? true : false
        // os resultados devem ser do mesmo tipo
        String resultadoTernario = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultadoTernario);

        // pode simplificar mais não precisando declarar as variáveis dos resultados
        String resultadoTernarioSimplificado = salario > 5000 ? "Eu vou doar 500 para o DevDojo" : "Ainda não tenho condições, mas vou ter!";
        System.out.println(resultadoTernarioSimplificado);
    }
}
