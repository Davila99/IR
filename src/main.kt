
var name ="";
var salaryMonth=0.0;
var salida:String="";

fun main(){

    do {

        println("------------------------Calcular IR-----------------------------")
    println("Ingresa tu nombre");
    name = readLine().toString();

    println("Ingresa tu salario Mensual");
    salaryMonth = readLine()!!.toDouble();

    println("");
    var ir=IR(salaryMonth);
    ir.calculate();
    showResults(ir);
    continuar();

    }while (salida=="S" ||salida =="s")
}

fun continuar(){
    println("Desea Continuar S/N");
    salida = readLine().toString();
}

fun showResults(ir: IR){
    println("$name Tu salario anual bruto es de: ${ir.annualSalary} ");
    println("$name Tu pago de INSS es de: ${ir.inssDeduction}");
    println("$name Tu salario anual neto es de: ${ir.netSalary}");
    println("$name El Monto a aplicar IR es de: ${ir.amountApplyIR}");
    println("$name El IR anual es: ${ir.annualIR}");
    println("$name El IR mensual es: ${ir.monthlyIR}");

}