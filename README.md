Цель задания
Научиться работать со множеством TreeSet.



Что нужно сделать
Задание выполняйте в классе

src/main/java/practice/EmailList.java

Напишите программу, в которой будет храниться перечень адресов электронной почты. Адреса можно добавлять через консоль командой ADD и печатать весь список командой LIST.

Программа должна проверять корректность вводимых email и печатать сообщение об ошибке при необходимости.

Для работы с данными списка дел в проекте находится класс EmailList, который должен отвечать за хранение и работу с электронными адресами. Реализуйте все методы и проверьте класс с помощью существующих тестов. Вы можете добавлять дополнительные методы в класс.

Принцип работы команд

LIST — выводит список электронных адресов.

ADD — проверяет и, если формат адреса верный, добавляет в множество.



Примеры команд

LIST

ADD hello@skillbox.ru

Команды вводятся одной строкой пользователем в консоль.



 

Примеры работы со списком электронных адресов (жирным шрифтом выделен ввод пользователя)

ADD mail@mail.ru

ADD hello@skillbox.ru

ADD hello@skillbox

ADD hello@skillbox.ru

LIST

hello@skillbox.ru

mail@mail.ru
