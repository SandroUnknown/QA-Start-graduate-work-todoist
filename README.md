<a name="start"></a>
# <p align="center">Дипломный проект</br>по автоматизации тестировани</br>приложения [`«Todoist»`](https://todoist.com/ru)</p>
<a href="https://todoist.com/ru"><img src="readme/media/1.png" width="100%" alt="Todoist"/></a>  

> _<p align="justify"><sub><a href="https://todoist.com/ru"><img src="readme/media/logo1.png" width="128" alt="Todoist"/></a></sub></p>_
> _<p align="justify"> &emsp;&emsp;&emsp;&emsp; — **веб-сервис и набор программного обеспечения** для управления задачами.</p>_
> 
> _<p align="justify">Задачи могут содержать заметки с файлами любого типа. Задачи можно помещать в проекты, сортировать по фильтрам, присваивать им метки, редактировать и экспортировать.</p>_
> 
> _<p align="justify">Todoist поддерживает 13 компьютерных и мобильных платформ, включая Microsoft Windows, Apple Mac OS X, iOS, Android, Google Chrome, Firefox, Gmail, Microsoft Outlook, Thunderbird и Postbox, а также предлагает онлайн-синхронизацию и резервное сохранение.</p>_

</br>
</br>
</br>




<a name="table-of-contents"></a>
# Содержание

</br>


* [**О дипломном проекте**](#about)
  * [Для чего был создан дипломный проект](#for-what)
  * [Технологии и инструменты](#tools)
  * [Что делают тесты?](#tests)
* [**Запуск тестов из терминала**](#console)
  * [Параметры запуска](#console_params)
  * [Список возможных задач (TASK)](#console_tasks)
  * [Примеры запуска тестов](#console_example)
* [**Интеграции и примеры**](#integrations)
  * [Сборка в Jenkins](#jenkins)
  * [Интеграция с Allure Report](#allure-report)
  * [Интеграция с Allure TestOps](#allure-testops)
  * [Интеграция с Jira](#jira)
  * [Уведомление в Telegram при помощи бота](#telegram)
  * [Примеры видео выполнения тестов на Selenoid](#video)

</br>
</br>
</br>




<a name="about"></a>
# О дипломном проекте
<a><p align="right">[<sup>`Перейти к содержанию`</sup>](#table-of-contents)</p></a>


<a name="for-what"></a>
### Для чего был создан дипломный проект

> [!NOTE]
> _<p align="justify">Основная цель проекта — отработка навыков автоматизации тестирования, улучшение понимания процесса разработки тестов и повышение эффективности обеспечения качества программного обеспечения.</p>_
>
> _<p align="justify">Тестирование проводилось на уровне программного интерфейса `(API)`, пользовательского интерфейса web-сайта `(WEB UI)` и пользовательского интерфейса мобильного приложения `(Android)`, что позволило сосредоточиться на взаимодействии пользователя с системой на разных платформах.</p>_
>
> _<p align="justify">Проект является демонстрационным и включает в себя ряд тестов, охватывающих различные аспекты функциональности, обеспечивая надежность и стабильность работы веб-приложения.</p>_
 
</br>
</br>


<a name="tools"></a>
### Технологии и инструменты

> [!NOTE]
> 
> <details open>
> <summary>Список технологи и инструментов, которые использовались в проекте</summary>
> </br>
> <a href="https://www.jetbrains.com/idea"><img src="readme/media/icons/Intelij_IDEA.svg" width="5%" height="5%" alt="Intellij IDEA"/></a><a href="https://www.java.com"><img src="readme/media/icons/Java.svg" width="5%" height="5%" alt="Java"/></a>
> | Логотип                                                                                                                                    | Название               | Предназначение                                                                                                    |
> | :---:                                                                                                                                      | :---:                  | :---                                                                                                              |
> | <a href="https://www.jetbrains.com/idea"><img src="readme/media/icons/Intelij_IDEA.svg" width="64" height="64" alt="Intellij IDEA"/></a>   | `Intellij`</br>`IDEA`  | Среда разработки программного обеспечения                                                                         |
> | <a href="https://www.java.com"><img src="readme/media/icons/Java.svg" width="64" height="64" alt="Java"/></a>                              | `Java`                 | Язык программирования, на котором написаны тесты                                                                  |
> | <a href="https://junit.org/junit5"><img src="readme/media/icons/JUnit5.svg" width="64" height="64" alt="JUnit 5"/></a>                     | `JUnit 5`              | Фреймворк для модульного тестирования                                                                             |
> | <a href="https://gradle.org"><img src="readme/media/icons/Gradle.svg" width="64" height="64" alt="Gradle"/></a>                            | `Gradle`               | Система автоматической сборки                                                                                     |
> | <a href="https://selenide.org"><img src="readme/media/icons/Selenide.svg" width="64" height="64" alt="Selenide"/></a>                      | `Selenide`             | Фреймворк для автоматизированного тестирования веб-приложений                                                     |
> | <a href="https://rest-assured.io"><img src="readme/media/icons/Rest_Assured.svg" width="64" height="64" alt="REST Assured"/></a>           | `REST Assured`         | Библиотека Java, упрощающая тестирование и валидацию REST API                                                     |
> | <a href="https://appium.io"><img src="readme/media/icons/Appium.svg" width="64" height="64" alt="Appium"/></a>                             | `Appium`               | Кроссплатформенный инструмент автоматизации мобильных приложений                                                  |
> | <a href="https://www.jenkins.io"><img src="readme/media/icons/Jenkins.svg" width="64" height="64" alt="Jenkins"/></a>                      | `Jenkins`              | Программная система для обеспечения процесса непрерывной интеграции программного обеспечения                      |
> | <a href="https://aerokube.com/selenoid"><img src="readme/media/icons/Selenoid.svg" width="64" height="64" alt="Selenoid"/></a>             | `Selenoid`             | Сервер, который позволяет запускать браузеры в docker-контейнерах                                                 |
> | <a href="https://www.browserstack.com"><img src="readme/media/icons/Browserstack.svg" width="64" height="64" alt="Browserstack"/></a>      | `Browserstack`         | Облачная платформа web- и мобильного тестирования                                                                 |
> | <a href="https://developer.android.com"><img src="readme/media/icons/Android_Studio.svg" width="64" height="64" alt="Android Studio"/></a> | `Android Studio`       | Среда разработки и тестирования для Android-приложений                                                            |
> | <a href="https://allurereport.org"><img src="readme/media/icons/Allure.svg" width="64" height="64" alt="Allure Report"/></a>               | `Allure`</br>`Report`  | Инструмент для визуализации результатов тестового запуска                                                         |
> | <a href="https://qameta.io"><img src="readme/media/icons/AllureTestOps.svg" width="64" height="64" alt="Allure TestOps"/></a>              | `Allure`</br>`TestOps` | Инструмент для управления тестированием, который помогает автоматизировать и оптимизировать процессы тестирования |
> | <a href="https://www.atlassian.com/software/jira"><img src="readme/media/icons/Jira.svg" width="64" height="64" alt="Jira"/></a>           | `Jira`                 | Система отслеживания ошибок и управления проектами                                                                |
> | <a href="https://github.com"><img src="readme/media/icons/Github.svg" width="64" height="64" alt="Github"/></a>                            | `Github`               | Веб-сервис для хостинга и совместной разработки IT-проектов                                                       |
> | <a href="https://telegram.org/"><img src="readme/media/icons/Telegram.svg" width="64" height="64" alt="Telegram"/></a>                     | `Telegram`             | Кроссплатформенная система мгновенного обмена сообщениями (мессенджер)                                            |
> 
> </details>


</br>
</br>


<a name="tests"></a>
### Что делают тесты?

> [!NOTE]
> Тесты проверяют разные страницы сайта на работоспособность и корректность данных.</br></br>
>
> **Общие тесты для всех страниц:**
> - [x] Проверка наличия и корректности `телефона` и `email` в верхней части страницы `(header)`;
> - [x] Проверка наличия и корректности `контактных данных` в нижней части страницы `(footer)`;
> - [x] Проверка всех пунктов (и подпунктов) главного `меню` на предмет корректности ссылок и наименований;</br></br>
>  
> **Тесты для главной страницы:**
> - [x] Проверка содержимого страницы:
>    - [x] Проверка `слогана` компании;
>    - [x] Проверка `предоставляемых услуг`;</br></br>
>    
> **Тесты для страницы "партнеры":**
> - [x] Проверка всех `партнеров` (по городам) на корректность данных `[параметризированный тест]`;
> - [x] Проверка работы `поиска` партнера по имени `[параметризированный тест]`;
 
</br>
</br>
</br>




<a name="console"></a>
# Запуск тестов из терминала
<a><p align="right">[<sup>`Перейти к содержанию`</sup>](#table-of-contents)</p></a>


<a name="console_params"></a>
### Параметры запуска

> [!IMPORTANT]
> **Тесты можно запускать как с передачей параметров, так и без них**</br>
> (в этом случае тесты будут запущены с параметрами по умолчанию).
>
> | Параметр          | Описание                                                     | Значение по умолчанию                |
> | :---              | :---                                                         | :---                                 |
> | `TASK`            | Имя задачи в Gradle</br> _(указывает какие тесты выполнить)_ | test                                 |
> | `REMOTE_URL`      | Адрес удалённого сервера, где будут запускаться тесты        | (пустое значение ~ локальный запуск) |
> | `BASE_URL`        | Адрес сайта, где будут запускаться тесты                     | https://flat-soft.ru                 |
> | `BROWSER`         | Браузер, в котором будут выполняться тесты                   | chrome                               |
> | `BROWSER_VERSION` | Версия браузера, в которой будут выполняться тесты           | 125.0                                |
> | `BROWSER_SIZE`    | Размер окна браузера, в котором будут выполняться тесты      | 1920x1080                            |

</br>

> [!IMPORTANT]
> **Тесты можно запускать как с передачей параметров, так и без них**</br>
> (в этом случае тесты будут запущены с параметрами по умолчанию).
>
> | Параметр                     | Тип                                      | Описание                                                     | Значение по умолчанию |
> | :---                         | :---                                     | :---                                                         | :---                  |
> | `TASK` <a name="item-1"></a> | Обязательный <sup>[1](#footnote-1)</sup> | Имя задачи в Gradle</br> _(указывает какие тесты выполнить)_ | test                  |
> | `TASK` <a name="item-2"></a> | Обязательный <sup>[2](#footnote-2)</sup> | Имя задачи в Gradle</br> _(указывает какие тесты выполнить)_ | test                  |
> | `TASK` <a name="item-3"></a> | Обязательный <sup>[3](#footnote-3)</sup> | Имя задачи в Gradle</br> _(указывает какие тесты выполнить)_ | test                  |
> | `BASE_URL`                   | Опциональный                             | Адрес сайта, где будут запускаться тесты                     | https://flat-soft.ru  |
> | `BROWSER`                    | Опциональный                             | Браузер, в котором будут выполняться тесты                   | chrome                |
> | `BROWSER_VERSION`            | Опциональный                             | Версия браузера, в которой будут выполняться тесты           | 125.0                 |
> | `BROWSER_SIZE`               | Опциональный                             | Размер окна браузера, в котором будут выполняться тесты      | 1920x1080             |
>
> <a name="footnote-1"> [<sup>`1: При запуске на browserstack данный параметр является обязательным`</sup>](#item-1)</a><br>
> <a name="footnote-2"> [<sup>`2: При запуске на selenoid данный параметр является обязательным`</sup>](#item-2)</a><br>
> <a name="footnote-3"> [<sup>`3: При запуске на browserstack данный параметр является обязательным`</sup>](#item-3)</a><br>

</br>


<a name="console_tasks"></a>
### Список возможных задач (`TASK`)

> [!IMPORTANT]
> | Задача    | Описание                                                        |
> | :---      | :---                                                            |
> | `test`    | Запускает `все тесты` </br> _(является значением по умолчанию)_ |
> | `api`     | Запускает все `api-тесты`                                       |
> | `web`     | Запускает все `web-тесты`                                       |
> | `android` | Запускает все `android-тесты`                                   |

</br>


<a name="console_example"></a>
### Примеры запуска тестов

> [!IMPORTANT]
> **Локальный запуск** (без параметров)
> ```
> gradle clean test
> ```

> [!IMPORTANT]
> **Удаленный запуск** (с параметрами)
> ```
> clean
> -Dtask="${TASK}"
> -DremoteUrl="${REMOTE_URL}"
> -DbaseUrl="${BASE_URL}"
> -Dbrowser="${BROWSER}"
> -DbrowserVersion="${BROWSER_VERSION}"
> -DbrowserSize="${BROWSER_SIZE}"
> ```

</br>
</br>
</br>




<a name="integrations"></a>
# Интеграции и примеры
<a><p align="right">[<sup>`Перейти к содержанию`</sup>](#table-of-contents)</p></a>


<a name="jenkins"></a>
### Сборка в Jenkins

> [!TIP]
> Реализован запуск тестов с помощью [`Jenkins`](https://jenkins.autotests.cloud/job/C30-SandroUnknown-demo_project_for_Flat/) (требуется авторизация).</br>
> </br>
> Для запуска сборки необходимо: 
> 1. Перейти в раздел `▷ Build with Parameters`
> 2. Выбрать необходимые [параметры](#console_params)
> 3. Нажать кнопку `▷ Build`
>
> | ![jenkins_status](/readme/media/screenshots/jenkins_status.png) | ![jenkins_build](/media/screenshots/jenkins_build.png) |
> |-|-|
>
> После выполнения сборки в разделе `🔆 Build History` можно будет детально изучить прошедние тесты:
> * Посмотреть лог
> * Посмотреть &nbsp; [<img src="readme/media/icons/Allure.svg" width="16" height="16" alt="Allure Report"/>   Allure Report](#allure-report)
> * Посмотреть &nbsp; [<img src="readme/media/icons/AllureTestOps.svg" width="16" height="16" alt="Allure TestOps"/>   Allure TestOps](#allure-testops)

</br>


<a name="allure-report"></a>
### Allure Report

> [!TIP]
> После выполнения тестов формируется [`Allure Report`](https://jenkins.autotests.cloud/job/C30-SandroUnknown-demo_project_for_Flat/allure/#) (требуется авторизация).
> </br>
> </br>
>
> **Основная страница отчёта** `(Overview)`
>
> | ![allure report overview](/readme/media/screenshots/allure_report_overview.png) |
> |-|
> </br>
>
> **Тест-кейсы** `(Suites)`</br>
> _(с шагами и вложениями)_
> 
> | ![allure report suites](/readme/media/screenshots/allure_report_suites.png) |
> |-|
> </br>
>
> **Графики** `(Graphs)`
>
> | ![allure report graphs](/readme/media/screenshots/allure_report_graphs.png) |
> |-|

</br>


<a name="allure-testops"></a>
### Allure TestOps

> [!TIP]
> Выполнена интеграция сборки `Jenkins` с [`Allure TestOps`](https://allure.autotests.cloud/project/4485/dashboards) (требуется авторизация).
> </br>
> </br>
>
> **Один из запусков** `(Launches)`</br>
> _(с шагами пройденного теста)_
> 
> | ![allure testops launches](/readme/media/screenshots/allure_testops_launches.png) |
> |-|
> </br>
>
> **Список авто тестов**
> 
> | ![allure testops auto tests](/readme/media/screenshots/allure_testops_auto_tests.png) |
> |-|
> </br>
>
> **Список ручных тестов**
> 
> | ![allure testops manual test](/readme/media/screenshots/allure_testops_manual_test.png) |
> |-|

</br>


<a name="jira"></a>
### Интеграция с Jira

> [!TIP]
> Выполнена интеграция `Allure TestOps` с [`Jira`](https://jira.autotests.cloud/browse/HOMEWORK-1364) (требуется авторизация).
> </br>
> </br>
>
> **Основная страница `Jira`**</br>
> 
> | ![jira](/readme/media/screenshots/jira.png) |
> |-|

</br>


<a name="telegram"></a>
### Уведомление в Telegram при помощи бота

> [!TIP]
> Выполнена интеграция сборки `Jenkins` с `Telegram`.
> </br>
> </br>
>
> **После выполнения теста (при запуске на Jenkins) `Telegram-бот` пришлет оповещение в специальный Telegram-канал**</br>
> _(с краткой статистикой пройденных тестов)_
> 
> | ![telegram](/readme/media/screenshots/telegram_1.png) | ![telegram](/readme/media/screenshots/telegram_2.png) |
> |-|-|

</br>


<a name="video"></a>
### Примеры видео выполнения тестов на Selenoid

> [!TIP]
> Несколько примеров выполнения тестов.
> </br>
> </br>
>
> **Проверка меню на главной странице**</br>
> 
> | ![menu test](/readme/media/gif/menu_test.gif) |
> |-|
> </br>
>
> **Проверка партнеров из города Москва**
> 
> | ![check partner test](/readme/media/gif/check_partner_test.gif) |
> |-|
> </br>
>
> **Поиск партнера ЭМИТЭЛ**
> 
> | ![search test](/readme/media/gif/search_test.gif) |
> |-|

</br>
</br>


---

</br>

<a><p align="right">[`Petyukov Alexander © 2025`](https://github.com/SandroUnknown)</p></a>
