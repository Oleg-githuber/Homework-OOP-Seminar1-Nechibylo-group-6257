# ДОМАШНЯЯ РАБОТА
## Описание классов и интерфейсов
Создан абстрактный класс Product, от которого наследуется абстрактный класс SomeDrink, 
описывающий поведение "какого-то напитка". От этого класса наследуются два класса: 
BottleOfWater и HotDrink.

Создан интерфейс VendingMachine, от которого наследуется класс HotDrinkMachine.
## Описание класса Main
В методе main класса Main создаются экземпляры класса Product с вызовом. 
Поля инициализируются конструктором класса HotDrink. Создаётся экземпляр machine1 класса HotDrinkMachine.
Список напитков в автомате пополняется методом addProduct. Выполняется вывод в 
консоль списка всех напитков в автомате. Позже выполняется поиск напитка по названию; по 
названию и объёму; по названию, объёму и температуре.
После этого выполнен альтернативный способ формирования списка напитков в автомате, 
посредством метода initProducts с последующим выводом в консоль списка напитков.