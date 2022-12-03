//    Уважаемые слушатели!
//    В рамках задания вам необходимо проделать работу с классам
//    Инструкция:
//    Шаг 1. Открыть среду разработки Android Studio
//    Шаг 2. Создать новый проект
//    Шаг 3. Создать классы для травоядных и плотоядных животных
//    Шаг 4. Каждому присвоить некоторые уникальные поля
//    Шаг 5. Поместить 2 травоядных и 2 плотоядных в список
//    Шаг 6. Вывести список на экран
//    Шаг 7. Загрузить исходный код в репозиторий на платформе GitHub
//    Шаг 8. Выложить ссылку в Odin

fun main(args: Array<String>) {
    val predator1 = Predator("Cobra", "small",  "solo",  "poised")
    val predator2 = Predator( "lion",  "medium", "pride", "fangs and claws"  )
    val herbivores1 = Herbivores( "Rhinoceros", "big",  "no",  "thick skin, horns")
    val herbivores2 = Herbivores("Rabbit",  "small",  "coat change",  "speed" )

    var list = mutableListOf<Animals>()
        list.add(predator1)
        list.add(predator2)
        list.add(herbivores1)
        list.add(herbivores2)
    println(list)





    }