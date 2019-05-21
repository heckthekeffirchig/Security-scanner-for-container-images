# Security-scanner-for-container-images
Security scanner for container images jetbrains

Для запуска в консоли скомпилировать 
kotlinc secscan.kt  -include-runtime -d secscan.jar

И запустить полученный файл
java -jar secscan.jar 

В ходе работы предложит два раза вводить данные в первый раз вводится директории для поиска, во второй раз паттерны поиска.
!!Паттерны вводить по одному (записываются в массивы)
!!"null" завершить текущий ввод директории\паттерна 
