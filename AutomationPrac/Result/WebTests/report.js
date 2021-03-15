$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Features/WebPageTests.feature");
formatter.feature({
  "line": 1,
  "name": "Login validation",
  "description": "",
  "id": "login-validation",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9804384400,
  "status": "passed"
});
formatter.scenario({
  "line": 42,
  "name": "Check the Cart is empty when no items added",
  "description": "",
  "id": "login-validation;check-the-cart-is-empty-when-no-items-added",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 41,
      "name": "@RegressionTest"
    },
    {
      "line": 41,
      "name": "@Test3"
    }
  ]
});
formatter.step({
  "line": 43,
  "name": "Load the Website",
  "keyword": "Given "
});
formatter.step({
  "line": 44,
  "name": "Go to Cart",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "No item is displayed in Cart",
  "keyword": "Then "
});
formatter.match({
  "location": "webTestsSuite.load_the_website()"
});
formatter.result({
  "duration": 254318100,
  "status": "passed"
});
formatter.match({
  "location": "webTestsSuite.go_to_cart()"
});
formatter.result({
  "duration": 1442976900,
  "status": "passed"
});
formatter.match({
  "location": "webTestsSuite.no_item_is_displayed_in_cart()"
});
formatter.result({
  "duration": 141900,
  "status": "passed"
});
formatter.after({
  "duration": 649550500,
  "status": "passed"
});
});