package br.com.alura.test

import br.com.alura.model.Order

fun testCollectionMap() {
    val requests = mutableMapOf<Int, Double>(
        Pair(1, 50.0),
        Pair(2, 30.0),
        (3 to 45.5),
        (4 to 7.5)
    )

    println(requests)

    val requestPosition = requests[2]
    requestPosition?.let {
        println("Pedido: $it")
    }

    for (r in requests) {
        println("Key: ${r.key}")
        println("Value: ${r.value}")
    }

    requests[5] = 30.0
    println(requests)

    requests.put(5, 23.0)
    println(requests)

    requests.putIfAbsent(5, 66.0)
    println(requests)

    requests.putIfAbsent(6, 66.0)
    println(requests)
}

fun testCollectionMapFilter() {
    val requests = mutableMapOf<Int, Double>(
        Pair(1, 50.0),
        Pair(2, 30.0),
        (3 to 45.5),
        (4 to 7.5)
    )

    println(requests.getValue(4))
    println(requests.getOrElse(2, {
        "Não foi encontrado o valor"
    }))
    println(requests.getOrDefault(1, -1.0))

    println(requests.filter { (key, value) ->
        key % 2 == 0 && value >= 50.0
    })

    println(requests.filterKeys { key -> key % 2 == 0 })
    println(requests.filterValues { value -> value >= 50.0 })
}

fun testwriteMap() {
    val requests = mutableMapOf<Int, Double>(
        Pair(1, 50.0),
        Pair(2, 30.0),
        (3 to 45.5),
        (4 to 7.5)
    )

    println(requests + (5 to 15.5))
    println(requests - (4))

    requests += mapOf<Int, Double>(6 to 70.0, 7 to 90.0)
    println(requests)
    requests -= 7
    println(requests)

    requests.keys.remove(6)
    println(requests)

    requests.values.remove(45.5)
    println(requests)
}

fun testMapGrouping() {
    val orders = listOf(
        Order(1, 10.0),
        Order(2, 20.0),
        Order(3, 30.0),
        Order(4, 40.0),
        Order(5, 50.0)
    )

    val orderMap = orders.associateBy { order: Order ->
        order.numberOrder
    }

    println(orderMap)

    val orderAssociate = orders.associateWith { order: Order ->
        order.valueOrder >= 15.0
    }

    println(orderAssociate)

    val groupByOrders = orders.groupBy { order: Order ->
        order.valueOrder > 20
    }

    println(groupByOrders)
    println(groupByOrders[true])
    println(groupByOrders[false])

    val names = listOf<String>(
        "Gabriel",
        "Gabrielle",
        "Maria",
        "Marcos",
        "João",
        "Junior"
    )

    val groupByNames = names.groupBy { names ->
        names.first()
    }

    println(groupByNames)
    println(groupByNames['G'])
}