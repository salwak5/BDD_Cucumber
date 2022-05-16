$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/TechfiosLogin.feature");
formatter.feature({
  "line": 2,
  "name": "Techfios Login Functionality Validation",
  "description": "\r\nBackground Given User is on TechFios Login page",
  "id": "techfios-login-functionality-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@TF_loginFeature"
    },
    {
      "line": 1,
      "name": "@Testall"
    }
  ]
});
formatter.before({
  "duration": 2909876400,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "User should be able login with valid credentials",
  "description": "",
  "id": "techfios-login-functionality-validation;user-should-be-able-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@TF_Login2"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "User eneters username as \"demo@techfios.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "User eneters password as \"abc123\"",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "User clicks signin button",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "User should land on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 26
    }
  ],
  "location": "LoginstepDefinition.user_eneters_username_as(String)"
});
formatter.result({
  "duration": 5166751800,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@id\u003d\u0027username\u0027]\"}\n  (Session info: chrome\u003d100.0.4896.127)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027LAPTOP-ENTG8N4K\u0027, ip: \u0027192.168.233.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 100.0.4896.127, chrome: {chromedriverVersion: 100.0.4896.60 (6a5d10861ce8..., userDataDir: C:\\Users\\14697\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:53359}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 2f0944fbcf645098f0e044c5739c212a\n*** Element info: {Using\u003dxpath, value\u003d//input[@id\u003d\u0027username\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.sendKeys(Unknown Source)\r\n\tat Pages.LoginPage.insertUserName(LoginPage.java:27)\r\n\tat Steps.LoginstepDefinition.user_eneters_username_as(LoginstepDefinition.java:38)\r\n\tat ✽.When User eneters username as \"demo@techfios.com\"(Features/TechfiosLogin.feature:24)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 26
    }
  ],
  "location": "LoginstepDefinition.user_eneters_password_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginstepDefinition.user_clicks_signin_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginstepDefinition.user_should_land_on_dashboard_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 743602200,
  "status": "passed"
});
});