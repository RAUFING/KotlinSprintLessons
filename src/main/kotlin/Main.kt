package org.example

class Order(val orderNumber: String, private var status: String = "Принят") {
    fun requestStatusChange(newStatus: String) {
        println("Заявка на изменение статуса заказа $orderNumber отправлена менеджеру")
        changeStatus(newStatus)
    }

    private fun changeStatus(newStatus: String) {
        status = newStatus
        println("Статус заказа $orderNumber изменён на: $status")
    }
}