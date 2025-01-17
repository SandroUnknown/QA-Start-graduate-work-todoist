<a name="start"></a>
# <p align="center">Дипломный проект</br>по автоматизации тестирования</br>приложения [`«Todoist»`](https://todoist.com/ru)</p>
<a href="https://todoist.com/ru"><img src="readme/media/todoist/fb.png" width="100%" alt="Todoist"/></a>  

> _<p align="justify"><sub><a href="https://todoist.com/ru"><img src="readme/media/todoist/logo.png" width="128" alt="Todoist"/></a></sub></p>_
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
  * [Для чего предназначен дипломный проект](#for-what)
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
### Для чего предназначен дипломный проект

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
> <a href="https://www.jetbrains.com/idea"><img src="readme/media/icons/Intelij_IDEA.svg" width="5.7%" height="5.7%" alt="Intellij IDEA"/></a>
<a href="https://www.java.com"><img src="readme/media/icons/Java.svg" width="5.7%" height="5.7%" alt="Java"/></a>
<a href="https://junit.org/junit5"><img src="readme/media/icons/JUnit5.svg" width="5.7%" height="5.7%" alt="JUnit 5"/></a>
<a href="https://gradle.org"><img src="readme/media/icons/Gradle.svg" width="5.7%" height="5.7%" alt="Gradle"/></a>
<a href="https://selenide.org"><img src="readme/media/icons/Selenide.svg" width="5.7%" height="5.7%" alt="Selenide"/></a>
<a href="https://rest-assured.io"><img src="readme/media/icons/Rest_Assured.svg" width="5.7%" height="5.7%" alt="REST Assured"/></a>
<a href="https://appium.io"><img src="readme/media/icons/Appium.svg" width="5.7%" height="5.7%" alt="Appium"/></a>
<a href="https://www.jenkins.io"><img src="readme/media/icons/Jenkins.svg" width="5.7%" height="5.7%" alt="Jenkins"/></a>
<a href="https://aerokube.com/selenoid"><img src="readme/media/icons/Selenoid.svg" width="5.7%" height="5.7%" alt="Selenoid"/></a>
<a href="https://www.browserstack.com"><img src="readme/media/icons/Browserstack.svg" width="5.7%" height="5.7%" alt="Browserstack"/></a>
<a href="https://developer.android.com"><img src="readme/media/icons/Android_Studio.svg" width="5.7%" height="5.7%" alt="Android Studio"/></a>
<a href="https://allurereport.org"><img src="readme/media/icons/Allure.svg" width="5.7%" height="5.7%" alt="Allure Report"/></a>
<a href="https://qameta.io"><img src="readme/media/icons/AllureTestOps.svg" width="5.7%" height="5.7%" alt="Allure TestOps"/></a>
<a href="https://www.atlassian.com/software/jira"><img src="readme/media/icons/Jira.svg" width="5.7%" height="5.7%" alt="Jira"/></a>
<a href="https://github.com"><img src="readme/media/icons/Github.svg" width="5.7%" height="5.7%" alt="Github"/></a>
<a href="https://telegram.org/"><img src="readme/media/icons/Telegram.svg" width="5.7%" height="5.7%" alt="Telegram"/></a>
>
> <details>
> <summary>Подробнее</summary>
> </br>
> 
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
> <details>
> <summary>API-тесты</summary>
> 
> - Проверка меток:
>    - [x] Создание новой метки (с заполнением только имени);
>    - [x] Создание новой метки (с заполнением всех параметров);
>    - [x] Обновление метки по ID;
>    - [x] Получение метки по ID;
>    - [x] Получение всех меток пользователя;
>    - [x] Удаление метки по ID;</br></br>
> 
> - Проверка проектов:
>    - [x] Создание нового проекта (с заполнением имени, цвета и варианта отображения);
>    - [x] Создание нового вложенного проекта (с заполнением имени, цвета и варианта отображения);
>    - [x] Обновление проекта по ID;
>    - [x] Удаление проекта по ID;
>    - [x] Удаление всех проектов пользователя;</br></br>
> 
> - Проверка разделов:
>    - [x] Создание нового раздела;
>    - [x] Обновление раздела;
>    - [x] Получение всех разделов внутри проекта;
>    - [x] Получение всех разделов пользователя;
>    - [x] Удаление раздела по ID;
>    - [x] Удаление всех разделов в проекте;</br></br>
>
> - Проверка задач:
>    - [x] Создание новой задачи;
>    - [x] Обновление задачи по ID;
>    - [x] Получение задачи по ID;
>    - [x] Получение всех активных задач пользователя;
>    - [x] Получение всех активных задач пользователя (с применением фильтра `label`);
>    - [x] Закрытие задачи по ID;
>    - [x] Открытие (ранее закрытой) задачи по ID;
>    - [x] Удаление задачи по ID;</br></br>
>
> - Проверка комментариев:
>    - [x] Создание нового комментария в проекте;
>    - [x] Создание нового комментария в задаче;
>    - [x] Обновление комментария по ID;
>    - [x] Получение комментария по ID;
>    - [x] Получение всех комментариев в проекте;
>    - [x] Получение всех комментариев в задаче;
>    - [x] Удаление комментария по ID;</br></br>
>
> </details>
>
> <details>
> <summary>WEB-тесты</summary>
> 
> - Проверка проектов:
>    - [x] Создание нового проекта (с заполнением только имени);
>    - [x] Создание нового проекта (с заполнением имени, цвета, отметкой 'избранное' и варианта отображения);
>    - [x] Удаление проекта по ID;</br></br>
> 
> - Проверка разделов:
>    - [x] Создание нового раздела в пустом проекте </br> ` [Только для варианта отображения проекта - ДОСКА (BOARD)] `;
>    - [x] Создание нового раздела в конце списка (когда в проекте уже имеется минимум 1 созданный раздел) </br> ` [Только для варианта отображения проекта - ДОСКА (BOARD)] `;
>    - [x] Создание нового раздела между двумя ранее созданными разделами </br> ` [Только для варианта отображения проекта - ДОСКА (BOARD)] `;
>    - [x] Удаление раздела </br> ` [Только для варианта отображения проекта - ДОСКА (BOARD)] `;
>    - [ ] Перемещение раздела на новое место (Drag & Drop) </br> ` [Только для варианта отображения проекта - ДОСКА (BOARD)] `;</br></br>
>
> - Проверка задач:
>    - [x] Создание новой задачи в пустом разделе </br> ` [Только для варианта отображения проекта - ДОСКА (BOARD)] `;
>    - [ ] Перемещение задачи на новое место (Drag & Drop) </br> ` [Только для варианта отображения проекта - ДОСКА (BOARD)] `;</br></br>
>
> </details>
>
> <details>
> <summary>ANDROID-тесты</summary>
> 
> - Проверка проектов:
>    - [x] Создание нового проекта (с заполнением имени, цвета, отметкой 'избранное' и варианта отображения);</br></br>
> 
> - Проверка разделов:
>    - [x] Создание нового раздела в пустом проекте </br> ` [Только для варианта отображения проекта - ДОСКА (BOARD)] `;</br></br>
>
> - Проверка задач:
>    - [x] Создание новой задачи в пустом разделе </br> ` [Только для варианта отображения проекта - ДОСКА (BOARD)] `;</br></br>
>
> </details>
 
</br>
</br>
</br>




<a name="console"></a>
# Запуск тестов из терминала
<a><p align="right">[<sup>`Перейти к содержанию`</sup>](#table-of-contents)</p></a>


<a name="console_params"></a>
### Параметры запуска

> [!IMPORTANT]
> **Список параметров тестов представлен ниже.**</br>
> Для корректного запуска тестов необходимо передать параметры, отмеченные как `Обязательный`.</br>
> Все остальные параметры можно не передавать - для них будет взято `Значение по умолчанию`.
>
> | Параметр              | Тип                                             | Описание                                                       | Значение по умолчанию                                        |
> | :---                  | :---                                            | :---                                                           | :---                                                         |
> | `TASK`                | Обязательный для <br> `всех` тестов             | Имя задачи в Gradle </br> _(указывает какие тесты выполнить)_  | test                                                         |
> | `ENV`                 | Опциональный                                    | Окружение запуска: </br> _-`local` </br> -`remote`_            | local                                                        |
> | `BROWSER_NAME`        | Опциональный                                    | Браузер, в котором будут выполняться web-тесты                 | 1920x1080                                                    |
> | `BROWSER_VERSION`     | Опциональный                                    | Версия браузера, в которой будут выполняться web-тесты         | chrome                                                       |
> | `BROWSER_SIZE`        | Опциональный                                    | Размер окна браузера, в котором будут выполняться web-тесты    | 125.0                                                        |
> | `API_URI`             | Опциональный                                    | Адрес для отправки API-запросов                                | https://api.todoist.com/rest/v2/                             |
> | `WEB_URL`             | Опциональный                                    | Адрес тестируемого сайта                                       | https://app.todoist.com                                      |
> | `TODOIST_EMAIL`       | Обязательный для <br> `всех` тестов             | Email (логин) для входа в аккаунт (на тестируемом сайте)       | _`(нет значения по умолчанию)`_                              |
> | `TODOIST_PASSWORD`    | Обязательный для <br> `всех` тестов             | Пароль от аккаунта (на тестируемом сайте)                      | _`(нет значения по умолчанию)`_                              |
> | `TODOIST_TOKEN`       | Обязательный для <br> `всех` тестов             | API-токен от аккаунта (на тестируемом сайте)                   | _`(нет значения по умолчанию)`_                              |
> | `WEB_REMOTE_URL`      | Опциональный                                    | Адрес удалённого сервера (для запуска web-тестов)              | [selenoid.autotests.cloud](https://selenoid.autotests.cloud) |
> | `WEB_REMOTE_LOGIN`    | Обязательный для <br> ` remote-web ` тестов     | Логин от удалённого сервера (для запуска web-тестов)           | _`(нет значения по умолчанию)`_                              |
> | `WEB_REMOTE_PASSWORD` | Обязательный для <br> ` remote-web ` тестов     | Пароль от удалённого сервера (для запуска web-тестов)          | _`(нет значения по умолчанию)`_                              |
> | `BROWSERSTACK_URL`    | Опциональный                                    | Адрес `browserstack` (для удалённого запуска android-тестов)   | https://hub.browserstack.com/wd/hub                          |
> | `BROWSERSTACK_USER`   | Обязательный для <br> ` remote-android ` тестов | User от `browserstack` (для удалённого запуска android-тестов) | _`(нет значения по умолчанию)`_                              | 
> | `BROWSERSTACK_KEY`    | Обязательный для <br> ` remote-android ` тестов | Key от `browserstack` (для удалённого запуска android-тестов)  | _`(нет значения по умолчанию)`_                              |

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
> **Локальный запуск всех тестов** (без параметров, но они обязательно должны быть прописаны локально в property-файлах)
> ```
> gradle clean test
> ```

> [!IMPORTANT]
> **Удаленный запуск для всех тестов** (с минимально-необходимым набором параметров)
> ```
> gradle clean
> test
> -Denv="remote"
> -Dtodoist_email="sample@email.com"
> -Dtodoist_password="pass123"
> -Dtodoist_token="qW12Rty"
> -Dweb_remote_login="r_login123"
> -Dweb_remote_password="r_pass123"
> -Dbrowserstack_user="user_123"
> -Dbrowserstack_key="key123"
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
> Реализован запуск тестов с помощью [`Jenkins`](https://jenkins.autotests.cloud/job/C30-SandroUnknown-graduate-work-todoist/) (требуется авторизация).</br>
> </br>
> Для запуска сборки необходимо: 
> 1. Перейти в раздел `▷ Build with Parameters`
> 2. Выбрать необходимые [параметры](#console_params)
> 3. Нажать кнопку `▷ Build`
>
> | ![jenkins status](/readme/media/screenshots/jenkins_status.png) | ![jenkins build](/readme/media/screenshots/jenkins_build.png) |
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
> После выполнения тестов формируется [`Allure Report`](https://jenkins.autotests.cloud/job/C30-SandroUnknown-graduate-work-todoist/allure/#) (требуется авторизация).
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
> Выполнена интеграция сборки `Jenkins` с [`Allure TestOps`](https://allure.autotests.cloud/project/4569/dashboards) (требуется авторизация).
> </br>
> </br>
>
> **Дашборд** `(Dashboard)`</br>
> 
> | ![allure testops dashboard](/readme/media/screenshots/allure_testops_dashboard.png) |
> |-|
> </br>
>
> **Один из запусков** `(Launch)`</br>
> _(с шагами пройденного теста)_
> 
> | ![allure testops launch](/readme/media/screenshots/allure_testops_launch.png) |
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
> | ![allure testops manual tests](/readme/media/screenshots/allure_testops_manual_tests.png) |
> |-|

</br>


<a name="jira"></a>
### Интеграция с Jira

> [!TIP]
> Выполнена интеграция `Allure TestOps` с [`Jira`](https://jira.autotests.cloud/browse/HOMEWORK-1385) (требуется авторизация).
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
> | ![telegram](/readme/media/screenshots/telegram_1.jpg) | ![telegram](/readme/media/screenshots/telegram_2.jpg) |
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
