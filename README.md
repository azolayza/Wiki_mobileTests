# Автотесты для мобильного андроид приложения Wikipedia 
> Файл apk взят из открытого источника. https://github.com/wikimedia/apps-android-wikipedia/releases/tag/latest
## :rocket: Технологии и инструменты

<p  align="center">

<code><img width="5%" title="Java" src="img/logo/java-logo.svg"></code>
<code><img width="5%" title="Gradle" src="img/logo/gradle-logo.svg "></code>
<code><img width="5%" title="JUnit5" src="img/logo/junit5-logo.svg"></code>
<code><img width="5%" title="Selenide" src="img/logo/selenide-logo.svg"></code>
<code><img width="5%" title="REST-Assured" src="img/logo/rest-assured-logo.svg"></code>
<code><img width="5%" title="Jenkins" src="img/logo/jenkins-logo.svg"></code>
<code><img width="5%" title="Selenoid" src="img/logo/selenoid-logo.svg"></code>
<code><img width="5%" title="Allure TestOps" src="img/logo/allure-testops-logo.svg"></code>
<code><img width="5%" title="Allure Report" src="img/logo/allure-report-logo.svg"></code>
<code><img width="5%" title="Jira" src="img/logo/jira-logo.svg"></code>
<code><img width="5%" title="Telegram" src="img/logo/telegram-logo.svg"></code>
<code><img width="5%" title="Jira" src="img/logo/jira-logo.svg"></code>
<code><img width="5%" title="Telegram" src="img/logo/telegram-logo.svg"></code>
</p>


## :rocket: Список проверок
- [x] Тест на проверку поиска статьи по запросу "Appium"
- [x] Тест на проверку экранов getting started при запуске приложения

#### Особенности реализации тестового проекта
Для описания шагов тест-кейсов в java-коде использован степовой подход.<br/></br>
Реализована возможность настройки параметров запуска через соответствующие файлы конфигурации
- browserstack.properties
- selenoid.properties
- local.properties

## <img width="4%" title="Jenkins" src="img/logo/jenkins-logo.svg"> Запуск тестов в [Jenkins](https://jenkins.autotests.cloud/job/010-Azovtseva-MobileTestForWiki/)

### Видео-отчет о прохождении теста из Selenoid:
![Selenoid](./img/video.gif)

## <img width="4%" title="Allure Report" src="img/logo/allure-report-logo.svg"> Отчет о результатах тестирования в [Allure Report](https://jenkins.autotests.cloud/job/010-Azovtseva-MobileTestForWiki/10/allure)
