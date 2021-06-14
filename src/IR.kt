class IR(salaryMonth: Double) {
    private val yearMonths=12;
    private val amountNOPayIR=100000;

    private val amountPay15 = 200000.00;
    private val percentPay15 =(15.00/100);
    private val baseTaxPay15 =0.00;
    private val overExcessPay15= 100000.00;

    private val amountPay20 = 350000.00;
    private val percentPay20 =(20.00/100);
    private val baseTaxPay20 =15000.00;
    private val overExcessPay20= 200000.00;

    private val amountPay25 = 500000.00;
    private val percentPay25 =(25.00/100);
    private val baseTaxPay25 =45000.00;
    private val overExcessPay25= 350000.00;

    private val amountPay30 = amountPay25+0.1;
    private val percentPay30 =(30.00/100);
    private val baseTaxPay30 =82500.00;
    private val overExcessPay30= 500000.00;

    var annualSalary =0.00;
    val inssPercent=0.0625;
    var inssDeduction=0.00;
    var netSalary=0.00;
    var amountApplyIR=0.00;
    var annualIR=0.00;
    var monthlyIR=0.00;

    //declaramos funciones segun para calcular lo establecido
    private fun mustPay15Percent() = netSalary > amountNOPayIR &&netSalary <= amountPay15
    private fun mustPay20Percent() = netSalary > amountPay15 &&netSalary <= amountPay20
    private fun mustPay25Percent() = netSalary > amountPay20 &&netSalary <= amountPay25
    private fun mustPay30Percent() = netSalary >=  amountPay30

    fun docalculations( porcent:Double,  overExcess: Double,  taxBase:Double ){
        amountApplyIR=netSalary-overExcess;
        annualIR = (amountApplyIR*porcent)+taxBase;
        monthlyIR=annualIR/12.00;
    }

    private fun setAnnualSalary(){
        annualSalary = salaryMonth * yearMonths;
    }
    private fun setAnnualInss(){
        inssDeduction =(annualSalary * inssPercent);
    }
    private fun setNetAnnualSalary(){
        netSalary = annualSalary - inssDeduction;
    }

fun calculate(){
    setAnnualSalary();
    setAnnualInss();
    setNetAnnualSalary();
    if (mustPay15Percent()){
        docalculations(percentPay15,overExcessPay15,baseTaxPay15);
    } else if (mustPay20Percent()){
        docalculations(percentPay20,overExcessPay20,baseTaxPay20);
    }else if (mustPay25Percent()){
        docalculations(percentPay25,overExcessPay25,baseTaxPay25)
    }else if (mustPay30Percent()){
        docalculations(percentPay30,overExcessPay30,baseTaxPay30);

    }
}

}