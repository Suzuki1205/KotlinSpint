fun main() {

    val permanentEmployees = 50
    val permanentSalary = 30000

    val interns = 30
    val internSalary = 20000

    val permanentEmployeeExpenses = permanentEmployees * permanentSalary

    val internExpenses = interns * internSalary

    val totalExpenses = permanentEmployeeExpenses + internExpenses

    val totalEmployees = permanentEmployees + interns
    val averageSalary = totalExpenses / totalEmployees

    println("Расходы на постоянных сотрудников: $permanentEmployeeExpenses рублей")
    println("Общие расходы по ЗП: $totalExpenses рублей")
    println("Средняя ЗП сотрудника: $averageSalary рублей")
}