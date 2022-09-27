import java.text.DecimalFormat

fun main() {

    var employee1 = Employee("Jane Doe", PositionTitle.Administration, true, 27.00, 1)
    employee1.printAll()
    calculate(45.0, employee1)


    var employee2 = Employee("Larry Jackson", PositionTitle.Production, false, 22.00, 2)
    employee2.printAll()
    calculate(50.0, employee2)


    var employee3 = Employee("John Smith", PositionTitle.Maintenance, false, 21.00, 3)
    employee3.printAll()
    calculate(35.0, employee3)
}
fun getTitle(title:PositionTitle):String{
    when(title){
        PositionTitle.Production -> return "Production"
        PositionTitle.Administration -> return "Administration"
        PositionTitle.Maintenance -> return "Maintenance"
        PositionTitle.Sales -> return "Sales"
        PositionTitle.Secretarial -> return "Secretarial"
        PositionTitle.Technical -> return "Technical"
        else -> return "No Title Found"
    }
}
fun calculate(hoursIn:Double, employee: Employee){
    var totalPay:Double = 0.0
    val twoDecimal = DecimalFormat("$#,###.00")

    if(employee.Shift == 2){
        employee.PayRate += employee.PayRate*0.05
        if(employee.salary.equals(false) && hoursIn>40.0){
            var overTime:Double = hoursIn-40.0
            var newHoursIn = hoursIn
            newHoursIn -= overTime
            totalPay = employee.PayRate*newHoursIn + 1.5*employee.PayRate*overTime
        }
        else
            totalPay = employee.PayRate*hoursIn
    }
    else if(employee.Shift ==3){
        employee.PayRate += employee.PayRate*0.1
        if(employee.salary.equals(false) && hoursIn>40.0){
            var overTime:Double = hoursIn-40.0
            var newHoursIn = hoursIn
            newHoursIn -= overTime
            totalPay = employee.PayRate*newHoursIn + 1.5*employee.PayRate*overTime
        }
        else
            totalPay = employee.PayRate*hoursIn
    }
    else{
        if(employee.salary.equals(false) && hoursIn>40.0){
            var overTime:Double = hoursIn-40.0
            var newHoursIn = hoursIn
            newHoursIn -= overTime
            totalPay = employee.PayRate*newHoursIn + 1.5*employee.PayRate*overTime
        }
        else
            totalPay = employee.PayRate*hoursIn
    }

    println("The total pay is: ${twoDecimal.format(totalPay)}")


}