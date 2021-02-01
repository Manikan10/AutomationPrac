$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/WebPageTests.feature");
formatter.feature({
  "line": 1,
  "name": "Login validation",
  "description": "",
  "id": "login-validation",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11945086500,
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
  "duration": 227563000,
  "status": "passed"
});
formatter.match({
  "location": "webTestsSuite.go_to_cart()"
});
formatter.result({
  "duration": 991246200,
  "status": "passed"
});
formatter.match({
  "location": "webTestsSuite.no_item_is_displayed_in_cart()"
});
formatter.result({
  "duration": 77600,
  "status": "passed"
});
formatter.after({
  "duration": 690744000,
  "status": "passed"
});
formatter.uri("Features/WebPageTests2.feature");
formatter.feature({
  "line": 1,
  "name": "Login validation 2",
  "description": "",
  "id": "login-validation-2",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7803781700,
  "status": "passed"
});
formatter.scenario({
  "line": 42,
  "name": "Check the Cart is empty when no items added",
  "description": "",
  "id": "login-validation-2;check-the-cart-is-empty-when-no-items-added",
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
  "duration": 6565300,
  "status": "passed"
});
formatter.match({
  "location": "webTestsSuite.go_to_cart()"
});
formatter.result({
  "duration": 1155497700,
  "status": "passed"
});
formatter.match({
  "location": "webTestsSuite.no_item_is_displayed_in_cart()"
});
formatter.result({
  "duration": 72600,
  "status": "passed"
});
formatter.after({
  "duration": 703311800,
  "status": "passed"
});
});