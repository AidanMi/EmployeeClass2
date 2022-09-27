class Employee constructor(var name:String, var position:PositionTitle, var salary:Boolean,
                           var PayRate:Double, var Shift:Int) {

    init{

    }
    fun printAll(){
        println("Name: $name\n" +
                "Position: $position\n" +
                "On Salary: $salary\n" +
                "Pay Rate: $PayRate\n" +
                "Shift: $Shift")
    }

    }